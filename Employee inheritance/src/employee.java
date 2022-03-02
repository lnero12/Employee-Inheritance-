
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class employee {
   //private Number id;
   private String Name;
   //private String lastName;
   private Long Number;
   private GregorianCalendar HireDate;

   public void Employee (String name ,int Number, char numClass,int year, int month, int day) {

   }

   public Long getNumber() {
      return Number;
   }
   public void setNumber(Long Number, char numClass) {
      this.Number = Number;
   }
   public String getName() {
      return Name;
   }
   public void setName(String Name) {
      this.Name = Name;
   }
   public void getHireDate(){
      GregorianCalendar HireStuff = new GregorianCalendar(2021, Calendar.MARCH,22);
      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
      String s = sdf.format(HireStuff.getTime());
      System.out.println(s);

   }
   public void setHireDate( int year, int month, int day ) {
this.getHireDate();
   }
   private void isValidNumber(int NumID, char numClass) {
while (true);
   }
   @Override
   public String toString() {
      return "Employee [ Name:" + Name + "id:" + Number + "HireDate:" + HireDate + "]";
   }
}




