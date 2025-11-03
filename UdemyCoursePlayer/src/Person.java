public abstract class Person {
    private String name;
    private String userName;
    private String introductionText;

    public Person(String name, String userName, String introductionText) {
        this.name = name;
        this.userName = userName;
        this.introductionText = introductionText;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getIntroductionText() {
        return introductionText;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", introductionText='" + introductionText + '\'' +
                '}';
    }
}
