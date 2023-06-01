package model.Classes;

import model.Interfaces.I_TravelAndConcentrate;

import java.util.Objects;

public class NationalTeamMember implements I_TravelAndConcentrate {
    private String name;
    private String surname;
    private int age ;


    public NationalTeamMember(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public NationalTeamMember() {
        name = "";
        surname = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NationalTeamMember that = (NationalTeamMember) o;

        if (age != that.age) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


    @Override
    public String travelAndConcentrate()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Getting there to play ball.");
        return sb.toString();
    }

}
