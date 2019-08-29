//Grant Robertson
//Comp 3500
//Assignment 2
    public class Finder {
        public Finder() {}

        //Returns and the max integer in the array or null
        public Integer findMax(int[] intArray) {
            if (intArray == null) {
                return null;
            } else if (intArray.length == 0) {
                return null;
            } else {
                int max = intArray[0];
                for (int i = 1; i < intArray.length; i ++ ) {
                    int currentNum = intArray[i];
                    if (currentNum > max) {
                        max = currentNum;
                    }

                }
                Integer returnVal = max;
                return returnVal;
            }

        }

        public Integer findMin(int[] intArray) {
            if (intArray == null) {
                return null;
            }
            else if (intArray.length == 0) {
                return null;
            }
            else {
                int min = intArray[0];
                for (int i = 1; i < intArray.length; i++) {
                    int current = intArray[i];
                    if (current < min) {
                        min = current;
                    }
                }
                Integer returnVal = min;
                return returnVal;
            }
        }
    }
