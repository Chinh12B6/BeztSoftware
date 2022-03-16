 public tinh() {
        a = 1;
        b = 1;
    }
    public tinh(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void nhapso(Scanner sc) {
        System.out.print("\nEnter First Number: ");
        a = sc.nextDouble();
        System.out.print("\nEnter Second Number: ");
        b = sc.nextDouble();
    }
    System.out.print("\nSum:"+(a+b));
    System.out.print("\nDifference:"+(a-b));
    System.out.print("\nProduct:"+(a*b));
    System.out.print("\nQuotient:"+(a/b));