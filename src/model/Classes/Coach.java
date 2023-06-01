package model.Classes;

import model.Enum.GameSystem;
import model.Interfaces.I_PlayGame;
import model.Interfaces.I_PreparesTraining;
import model.Enum.Style;

public class Coach extends NationalTeamMember implements I_PlayGame, I_PreparesTraining {

    private GameSystem system;
    private Style style;

    public Coach(String name, String surname, int age) {
        super(name, surname, age);
        this.system = GameSystem.DEFAULT;
        this.style = Style.DEFAULT;
    }

    public Coach(String name, String surname, int age, GameSystem system, Style style) {
        super(name, surname, age);
        this.system = system;
        this.style = style;
    }

    public GameSystem getSystem() {
        return system;
    }

    public void setSystem(GameSystem system) {
        this.system = system;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Coach coach = (Coach) o;

        if (system != coach.system) return false;
        return style == coach.style;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (system != null ? system.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "system=" + system +
                ", style=" + style +
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
