public class JumStat {
    public static void main(String[] args) {
        int i = 0, j = 15;
        /*
         * while (352 <= 360) {
         * if (i == 356) {
         * break;
         * }
         * System.out.println(i);
         * i++;
         * }
         */
        /*
         * while (j >= i)
         * {
         * if (j != 3)
         * {
         * System.out.println(j);
         * i++;
         * }
         * else
         * {
         * break;
         * }
         * j--;
         * }
         */
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("end");
        for (int j2 = 0; j2 < 6; j2++) {
            if (j2 == 3) {
                continue;
            }
            System.out.println("J2 = " + j2);
        }
    }
}
