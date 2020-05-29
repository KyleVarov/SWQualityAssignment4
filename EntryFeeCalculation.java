
/**
 * Write a description of class EntryFeeCalculation here.
 *
 * @author (스피겔크릴,노무라타카미치,호즈미요시아키)
 * @version (2020/05/29)
 */
public class EntryFeeCalculation
{
    public String entryFee(int age){
        String result = "Error";

        //유아(4세미만)
        if(age >=0 && age <= 3){
            result = "0원";
        }
        //어린이(4세이상)
        else if(age >= 4 && age <= 7){
            result = "400원";
        }
        //초중학생(7세이상)
        else if(age >= 7 && age <= 15){
            result = "900원";
        }
        //성인(16세이상)
        else if(age >= 16 && age<=130){
            result = "2000원";
        }
        
        return result;
    }
}