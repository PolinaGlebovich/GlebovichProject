package homework.homework14;
       @FunctionalInterface
        interface StringInterface {
            String test(String str1, String str2);

        }
        public class Task4 {
            public static void main(String[] args) {

            StringInterface stringInterface = Task4::comparator;
                System.out.println(stringInterface.test("34432", "heofkfp"));

            }
            private static String comparator(String firstString, String secondString) {
                if(firstString.length() > secondString.length()){
                    return firstString;
                } else {
                    return secondString;
                }
            }
        }
