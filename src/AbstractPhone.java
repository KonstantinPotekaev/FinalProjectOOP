import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class AbstractPhone {
    String number;
    HashMap<AbstractPhone, List<String>> messages = new HashMap<>();
    public AbstractPhone(String number) {
        if (number.charAt(0) != '+') {
            throw new NumberFormatException();
        }
        this.number = number;
    }
    public void call(AbstractPhone phone) {
        System.out.println("Вызываю номер: " + phone.number);
    }


    public void ring() {
        System.out.println("Динь-динь");
    }
}
