package Hq1;
class Commission{
        double sales;
        Commission(double sales) {
            this.sales = sales;
        }
        public double getCommission(){
        if (sales<0) {
            System.out.println("Invalid Input");
            return 0;
        }
        else if (sales < 100)
            return 0.02 * sales;
        else if (sales < 5000)
            return 0.05 * sales;
        else
            return 0.08 * sales;
    }
}