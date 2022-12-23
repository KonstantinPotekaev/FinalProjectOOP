public class Main {
    public static void main(String[] args) {

        var a = new CellPhone("+79859385941");
        var b = new PushButtonPhone("+7912378124");

        a.call(b);
    }
}