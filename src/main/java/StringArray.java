
public class StringArray {
    public String compareString(String[] str1,String[] str2) {
        String res = "";

        if (str1.length == str2.length) {
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] == str2[i]) {
                    res = "equal";
                } else {
                    res = "not equal";
                    break;
                }
            }

        } else {
            res = "not equal";
        }

        return res;
    }
  /*  public static String[] removeDuplicateElements(String[] s1) {
        int n = s1.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (s1[i] == s1[j])
                    break;
            if (j == i)
                s1[index++] = s1[i];
        }

        return s1;
    }*/
        public String removeDuplicateElements(String[] x)
        {
            String res="";
            for(int i=0;i<x.length;i++)
            {
                for(int j=1;j<x.length;j++)
                {
                    if(x[i]==x[j]){
                        res="duplicates found";

                        break;

                    }
                    else{

                        res="no duplicates";
                    }
                }
            }

            return res;
        }


        public String[] isAppen(String[] x,String[] y)
        {
            String[] res=new String[x.length+1];
            for(int i=0;i<x.length;i++)
            {
                res[i]=x[i];

            }
            res[res.length-1]=y[0];

            return res;
        }


        public String[] isPrepen(String[] x,String[] y)
        {
            String[] res=new String[x.length+1];
            String temp=y[y.length/2];
            for(int i=0,j=1;i<x.length&&j<res.length;i++,j++)
            {

                res[j]=x[i];

            }

            res[0]=temp;

            return res;
        }




    }







