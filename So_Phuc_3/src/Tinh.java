 public tinh() {
        a = 0;
        b = 0;
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
}