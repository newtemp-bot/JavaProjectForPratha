class OddEvenPro {
    public static void main(String[] args) {

        for (int i = 1; i < ((args.length >= 1) ? Integer.parseInt(args[0]) : 10); i++) {

            if (args.length >= 2) {
                if (args[1].equals("odd")) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            } else if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("Code End");
    }
}
