package model.Enum;

public enum GameSystem  {

    DEFAULT("none"), CUATROTRESTRES("4-3-3"),CUATROCUATRODOS ("4-4-2"), CUATRODOSTRESUNO("4-2-3-1");

    private String tactic;

    private  GameSystem(String tactic)
    {
        this.tactic = tactic;
    }

    public String getTactic() {
        return tactic.toString();
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }
}
