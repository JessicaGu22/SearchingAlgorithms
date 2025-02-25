public class SequentialSearcher {

    // Finds the index of the first occurrence of the value in the array.
    // Returns -1 if the value is not found.
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the index if the value is found.
            }
        }
        return -1; // Return -1 if the value is not found.
    }

    // Counts the number of occurrences of a specified value in the array.
    public static int count(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++; // Increment count each time the value is found.
            }
        }
        return count; // Return the total count of value occurrences.
    }

    // Finds and returns the largest element in the array.
    // If the array is empty, it returns Integer.MIN_VALUE.
    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


     // Calculates and returns the sum of all elements in the array.
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Add each element to the sum.
        }
        return sum; // Return the sum of the array elements.
    }

    // Finds and returns the smallest odd element in the array.
    // If no odd element is found, it returns -1.
    public static int minOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        for (int num : array) {
            if (num % 2 != 0 && num < minOdd) {
                minOdd = num; // Update minOdd if a smaller odd value is found.
            }
        }
        return minOdd == Integer.MAX_VALUE ? -1 : minOdd; // Return -1 if no odd number is found.
    }

    // Checks if the array contains any duplicate values.
    // Returns true if there are duplicates, otherwise false.
    public static boolean containsDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true; // Return true if any duplicate is found.
                }
            }
        }
        return false; // Return false if no duplicates are found.
    }

    // Returns a new array containing only the even elements from the original array.
    public static int[] even(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++; // Count the even elements.
            }
        }

        int[] evenArray = new int[count]; // Create a new array for even numbers.
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index++] = num; // Add even numbers to the new array.
            }
        }
        return evenArray; // Return the new array of even numbers.
    }

    // Checks if the array is sorted in ascending order.
    // Returns true if sorted in ascending order, false otherwise.
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Return false if the array is not sorted in ascending order.
            }
        }
        return true; // Return true if the array is sorted in ascending order.
    }

    // Determines the sorting order of the array.
    // Returns 1 if sorted in ascending order, -1 if descending, and 0 if unsorted.
    public static int sortOrder(int[] array) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                ascending = false; // Set ascending to false if array is not in ascending order.
            }
            if (array[i] > array[i - 1]) {
                descending = false; // Set descending to false if array is not in descending order.
            }
        }

        if (ascending) {
            return 1; // Return 1 if the array is sorted in ascending order.
        } else if (descending) {
            return -1; // Return -1 if the array is sorted in descending order.
        }
        return 0; // Return  0 if the array  is unsorted.
    }

     // Main method for testing the functionality of the met ds
    public static void main(String[] args) { 
        int[] testArray = {3, 1, 4, 1, 5, 9};

        // Testing find method 
        System.out.println("Find 4: " + find(testArray, 4));  // Output: 2
        System.out.println("Find 7: " + find(testArray, 7));  // Output: -1
 
        // Testing count method
        System.out.println("Count of 1: " + count(testArray, 1));  // Output: 2
 
        // Testing max method
        System.out.println("Max value: " + max(testArray));  // Output: 9
 
        // Testing sum method
        System.out.println("Sum: " + sum(testArray));  // Output: 23
 
        // Testing minOdd method
        System.out.println("Smallest odd: " + minOdd(testArray));  // Output: 1

        // Testing containsDuplicate method
        System.out.println("Contains duplicate: " + containsDuplicate(testArray));  // Output: true
 
        // Testing even method
        int[] evenArray = even(testArray);
        System.out.print("Even numbers: ");
        for (int num : evenArray) {
            System.out.print(num + " ");  // Output: 4 
        }
        System.out.println();
 
        // Testing isSorted method
        System.out.println("Is sorted: " + isSorted(testArray));  // Output: false

        // Testing sortOrder method
        System.out.println("Sort order: " + sortOrder(testArray));  // Output: 0
    }
}
