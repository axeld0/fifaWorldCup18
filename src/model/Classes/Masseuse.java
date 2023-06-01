package model.Classes;

import model.Interfaces.I_Assists;

import java.util.Objects;

public class Masseuse extends NationalTeamMember implements I_Assists {
    private String title;
    private int yearsOfExperience;

    public Masseuse(String name, String surname, int age, String title, int yearsOfExperience) {
        super(name, surname, age);
        this.title = title;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Masseuse(String name, String surname, int age) {
        super(name, surname, age);
        title = "none";
        yearsOfExperience = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Masseuse masseuse = (Masseuse) o;

        if (yearsOfExperience != masseuse.yearsOfExperience) return false;
        return Objects.equals(title, masseuse.title);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + yearsOfExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Masseuse{" +
                "title='" + title + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                "} " + super.toString();
    }


    @Override
    public String assist()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("I'm helping!");
        return sb.toString();
    }

}
