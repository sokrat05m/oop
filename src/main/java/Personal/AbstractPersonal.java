package Personal;

public abstract class AbstractPersonal {
    protected String fullName;
    protected int experienceYears;

    public AbstractPersonal(String fullName, int experienceYears) {
        this.fullName = fullName;
        this.experienceYears = experienceYears;
    }

    public AbstractPersonal() {
        this("Работник", 5);
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return String.format("Имя работника: %s, стаж работы: %d лет", fullName, experienceYears);
    }
}
