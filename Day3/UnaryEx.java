class UnaryEx {
    static int b = 20;

    public static void main(String[] args) {
        int a = 10;
        boolean k = true;
        System.out.println();
        System.out.println();
        System.out.println();
        /*
         * System.out.println(a++);//(1)print(a),(2)(a=a+1;a=10+1;a=11);//10
         * System.out.println(a++);
         * System.out.println(a);
         */

        /*
         * a = 333;
         * System.out.println(a++);//333
         * System.out.println(a++);//334
         * System.out.println(a);//335
         * System.out.println(a++);//335
         * System.out.println(a);//336
         * System.out.println(a);//336
         * System.out.println(a++);//336
         * System.out.println(a++);//337
         */

        /*
         * a=21;
         * System.out.println(a);
         * System.out.println(a--);//print(a),a=a-1;
         * System.out.println(a);
         * 
         * 
         * a=333;
         * System.out.println(a--);//333
         * System.out.println(a--);//332
         * System.out.println(a);//331
         * System.out.println(a--);//331
         * System.out.println(a--);//330
         * System.out.println(a);//329
         * System.out.println(a);//329
         * System.out.println(a--);//329
         * System.out.println(a--);//328
         */

        /*
         * a = 999;
         * System.out.println(a++);
         * System.out.println(a--);
         * System.out.println(a);
         * System.out.println(a--);
         * System.out.println(a--);
         * System.out.println(a++);
         * System.out.println(a++);
         * System.out.println(a--);
         * System.out.println(a--);
         * System.out.println(a++);
         * System.out.println(a);
         * System.out.println(a--);
         * System.out.println(a++);
         * System.out.println(a);
         */

        /*
         * a = 55;
         * System.out.println(++a);//a=a+1,print(a)
         * System.out.println(++a);
         * System.out.println(--a);
         * System.out.println(--a);
         */

        /*
         * a = 9279;
         * 
         * System.out.println(a++);//9279
         * System.out.println(++a);//9281
         * System.out.println(++a);//9282
         * System.out.println(a--);//9283//9282
         * System.out.println(a--);//9282//9281
         * System.out.println(a);//9280
         * System.out.println(++a);//9281//9281
         * System.out.println(--a);//9282//9280
         * System.out.println(a++);//9281//9280
         * System.out.println(--a);//9282//9280
         * System.out.println(--a);//9281//9279
         * System.out.println(a++);//9280//9279
         * System.out.println(a);//9281//9280
         * System.out.println(a++);//9281//9280
         * System.out.println(a);//9281//9281
         */

        /*
         * a=5533;
         * 
         * System.out.println(a++);//5533
         * System.out.println(++a);//5535
         * System.out.println(++a);//5536
         * System.out.println(a--);//5536
         * System.out.println(++a);//5536
         * System.out.println(--a);//5535
         * System.out.println(--a);//5534
         * System.out.println(--a);//5533
         * System.out.println(a++);//5533
         * System.out.println(a++);//5534
         * System.out.println(a--);//5535
         * System.out.println(a);//5534
         * System.out.println(a);//5534
         * System.out.println(a++);//5534
         * System.out.println(a);//5535
         * 
         * System.out.println(b);
         */

        System.out.println(!k);

        System.out.println(~-50);

        a = 10;//12//13//14//15//14//13
        System.out.println(++a + a++ + (++a + a++) + a++ - a-- + --a * 2);
        //11+11+(13+13)+14-15+(13*2)
        //(11+11+26+14)-15+26
        //(62-15)+26 = 73





        /*
         * 
         * Given `a = 10`, let's break down the expression step by step:
         * 
         * ```java
         * System.out.println(++a + a++ + (++a + a++) + a++ - a-- + --a * 2);
         * ```
         * 
         * 1. **First part: `++a`**
         * - `++a` increments `a` before using it.
         * - `a` becomes 11.
         * - Value used in expression: 11.
         * 
         * 2. **Second part: `a++`**
         * - `a++` uses the current value of `a` then increments it.
         * - Value used in expression: 11.
         * - `a` becomes 12.
         * 
         * 3. **Third part: `(++a + a++)`**
         * - `++a` increments `a` before using it.
         * - `a` becomes 13.
         * - Value used in expression: 13.
         * - `a++` uses the current value of `a` then increments it.
         * - Value used in expression: 13.
         * - `a` becomes 14.
         * - Sum: 13 + 13 = 26.
         * 
         * 4. **Fourth part: `a++`**
         * - `a++` uses the current value of `a` then increments it.
         * - Value used in expression: 14.
         * - `a` becomes 15.
         * 
         * 5. **Fifth part: `a--`**
         * - `a--` uses the current value of `a` then decrements it.
         * - Value used in expression: 15.
         * - `a` becomes 14.
         * 
         * 6. **Sixth part: `--a`**
         * - `--a` decrements `a` before using it.
         * - `a` becomes 13.
         * - Value used in expression: 13.
         * - `--a * 2`: 13 * 2 = 26.
         * 
         * Now, combine all parts:
         * ```
         * 11 + 11 + 26 + 14 - 15 + 26
         * ```
         * 
         * Finally, calculate the sum:
         * ```
         * 11 + 11 = 22
         * 22 + 26 = 48
         * 48 + 14 = 62
         * 62 - 15 = 47
         * 47 + 26 = 73
         * ```
         * 
         * The output of the statement will be:
         * ```java
         * System.out.println(73);
         * ```
         * 
         * 
         * 
         * 
         */

    }
}