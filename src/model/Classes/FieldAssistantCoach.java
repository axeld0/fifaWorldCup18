package model.Classes;

import model.Interfaces.I_PlayGame;
import model.Interfaces.I_PreparesTraining;
import model.Enum.Methodology;

public class FieldAssistantCoach extends NationalTeamMember implements I_PlayGame, I_PreparesTraining {
    private Methodology method;


    public FieldAssistantCoach(String name, String surname, int age) {
        super(name, surname, age);
        this.method = Methodology.DEFAULT;
    }
    public FieldAssistantCoach(String name, String surname, int age, Methodology method) {
        super(name, surname, age);
        this.method = method;
    }


    public Methodology getMethod() {
        return method;
    }

    public void setMethod(Methodology method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FieldAssistantCoach that = (FieldAssistantCoach) o;

        return method == that.method;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (method != null ? method.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FieldAssistantCoach{" +
                "method=" + method +
                "} " + super.toString();
    }
    @Override
    public String playGame()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Playing game");
        return sb.toString();
    }

    @Override
    public String trains()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("training ready");
        return sb.toString();
    }


}
