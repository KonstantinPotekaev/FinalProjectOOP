public class CheckPhoneService {
    public static boolean checkPhone(String number){
        if(number.charAt(0) == '+' && number.length()>5){
            return true;
        }
        return false;
    }
}
