public class OddEven {
    public static String[] oddEven(int a[]) {
        int size = a.length;
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                str[i] = "even";
            } else {
                str[i] = "odd";
            }
        }
        return str;

    }

    public static int[] reverse(int a[]) {
        int size = a.length;
        int j = 0;
        int[] b = new int[a.length];
        for (int i = size - 1; i >= 0; --i) {
            b[j] = a[i];
            ++j;
        }
        return b;
    }

  /*  public static int[] primeChecking1(int a[]) {
        int size = a.length;
        int[] tmp = new int[size];
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    tmp[i] = a[i];
                    break;
                }
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                continue;
            } else {
                temp[i] = tmp[i];

            }
        }
        return temp;
    }*/
    public int[] primeChecking(int n[])
    {
        int count=0;
        for (int i=0;i<n.length;i++) {

            for (int j = 2; j <= n[i] / 2; j++) {
                if (n[i] % j == 0) {

                    count++;
                    break;
                }

            }
        }

        int[] s = new int[count];

        int x=0,j;
        for (int i=0;i<n.length;i++) {

            for (j = 2; j <= n[i] / 2; j++) {
                if ((n[i] % j) == 0) {

                    s[x]=n[i];
                    x++;
                    break;
                }

            }
        }
        return s;
    }
}


