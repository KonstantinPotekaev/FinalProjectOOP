public interface MessageService  {

    void sendMessage(AbstractPhone phone, String message) ;

    void deleteMessage(String number, Integer index);

    void viewMessage();

}
