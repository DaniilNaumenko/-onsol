package by.naumenka.reverse;

public class Reverse {
        public static void main(String[] args) {
            String str = "Java SE 7";
            String reverse = new StringBuffer(str).reverse().toString();
            System.out.println("String after reverse: " + reverse);
        }
    }


