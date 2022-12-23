public class PushButtonPhone extends AbstractPhone implements MessageService{
    public PushButtonPhone(String number){
        super(number);
    }

    @Override
    public void sendMessage(AbstractPhone phone, String message) {
        if (phone instanceof CellPhone || phone instanceof PushButtonPhone){
            System.out.printf("На телефон %s отправленно сообщение: %s ", phone.number, message);
            phone.messages.get(phone).add(message);
        }
        else{
            System.out.printf("Телефон не может принимать сообщения!");
        }
    }

    @Override
    public void deleteMessage(String number, Integer index) {
        for (var i : this.messages.keySet()){
            if (i.number == number){
                this.messages.get(i).remove(index);
            }
        }
    }

    @Override
    public void viewMessage() {
        if (!this.messages.isEmpty()) {
            System.out.println("Номер            Сообщения");
            for (var i : this.messages.keySet()) {
                System.out.printf(i.number, "            ");
                var index = 1;
                for (var j : this.messages.get(i)) {
                    System.out.println(index + ". " + j);
                    System.out.printf("            ");
                }
            }
        }
    }
}
