package model.Classes;

import model.Interfaces.I_PlayGame;
import model.Enum.Position;

public class Player extends NationalTeamMember implements I_PlayGame {
    private int number;
    private Position position;


    public Player(String name, String surname, int age, int number, Position position) {
        super(name, surname, age);
        this.number = number;
        this.position = position;
    }

    public Player(String name, String surname, int age) {
        super(name, surname, age);
        number = 0;
        position = Position.DEFAULT;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Player player = (Player) o;

        if (number != player.number) return false;
        return position == player.position;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Player{" +
                "number=" + number +
                ", position=" + position +
                "} ";
    }


    @Override
    public String playGame()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Playing game");
        return sb.toString();
    }

}
