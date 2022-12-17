public class Human {
    private String name;
    private String city;
    private  int yearOfBirth;
    private String job;

    Human (String name, String city, int yearOfBirth, String job){
        this.name = name;
        this.city = city;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null || name == "") {
            this.name = "\"Информация не указана\"";
        }
        if (city == null || city == "") {
            this.city = "\"Информация не указана\"";
        }
        if (job == null || job == "") {
            this.job = "\"Информация не указана\"";
        }
    }

    @Override
    public String toString(){
        return "Привет! Меня зовут " + name + ". Я из города " + city
                + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ".";
    }
}
