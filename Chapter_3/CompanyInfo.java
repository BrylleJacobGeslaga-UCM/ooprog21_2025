class CompanyInfo {
   public static void main(String[] a) {
      System.out.println("Smart Electronics");
      displayHours();
   }
   
   public static void displayHours() {
      
      String hours = "Monday - Friday 8 am to 6 pm" +
                     "\nSaturday        8 am to noon" +
                     "\nSunday          closed";
      System.out.println(hours);
   }
}