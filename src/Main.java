public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", -2000, "менеджера");
        System.out.println(maxim);

        Human anna = new Human("", null, 2001, "");
        System.out.println(anna);

        Human kata = new Human("Катя", "Сочи", 2002, "менеджера");
        System.out.println(kata);

        Human artem = new Human("Артём", "Тула", 2003, "консультанта");
        System.out.println(artem);
    }
}