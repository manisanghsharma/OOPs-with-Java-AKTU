class test {
    public static void main(String[] args) {
            String str1 = "123";
            String str2 = "456";
            long a = Long.valueOf(str1);
            long b = Long.valueOf(str2);
            long c = a + b;
            String d = String.valueOf(c);
            System.out.println(d);
        }
    }
    