package example;

public class Shouter {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void allCaps() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter();
        shouter.setMessage("I love COMP2511!");
        System.out.println(shouter.getMessage());
        shouter.allCaps();
    }
}
