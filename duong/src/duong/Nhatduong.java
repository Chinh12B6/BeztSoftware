public void nhap(Scanner sc) {
        System.out.print("Enter real value first number: ");
        s1 = sc.nextDouble();
        System.out.print("Enter imaginary value first number  ");
        s2 = sc.nextDouble();
        System.out.print("Enter real value second number: ");
        s3 = sc.nextDouble();
        System.out.print("Enter imaginary value second number  ");
        s4 = sc.nextDouble();
    }
   int sum1 = s1+s3; int sum2 = s2+s4;
   if (sum2<0) {System.out.print("Sum:"+sum1+"-"+sum2+"i");}
   else System.out.print("Sum:"+sum1+"+"+sum2+"i");}
   int difference1 = s1-s3; int difference2 = s2-s4;
   if (difference2<0) {System.out.print("Difference:"+difference1+"-"+difference2+"i");}
   else {System.out.print("Difference:"+difference1+"+"+difference2+"i");}
   

