
/**
 * Write a description of class EntryFeeCalculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EntryFeeCalculation
{
    public String entryFee(int age){
        String result = "Error";
            
        if(age >=0 && age <= 3){
            result = "0원";
        }
        else if(age >= 4 && age <= 7){
            result = "400원";
        }else if(age >= 7 && age <= 15){
            result = "900원";
        }else if(age >= 16 && age<=130){
            result = "2000원";
        }
            
        return result;
    }
}
