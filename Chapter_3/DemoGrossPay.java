class DemoGrossPay {
   static double hrRate = 22.75;
   public static void main(String[] a) {
      calculateGross(10.0);
      calculateGross(25.0);
      calculateGross(37.5);
   }
   
   public static void calculateGross(double calculateGross) {
      double grossOutput = calculateGross * hrRate;
      String display = calculateGross + " hours at $" + hrRate + " per hour is $" + grossOutput;
      
      System.out.println(display);
   }
}