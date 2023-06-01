import model.Classes.*;
import model.Enum.GameSystem;
import model.Enum.Position;
import model.Enum.Style;
import model.JSON.JSONControler;
import org.json.JSONException;

public class Main {
    public static void main(String[] args) {

        NationalFootballFederation afa = new NationalFootballFederation();
        WholeRoster roster = new WholeRoster();
        JSONControler cont;
        cont = new JSONControler();
        NationalTeamMember messi = new Player("Lionel", "Messi", 35, 10, Position.FORWARD);
        NationalTeamMember scaloni = new Coach("Lionel", "Scaloni", 43,GameSystem.CUATRODOSTRESUNO, Style.MENOTISMO);
        try {
            afa.addToRoster(messi);
            afa.addToRoster(scaloni);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            cont.ArrayToJSON(afa.getRoster());
        }
        catch (JSONException e )
        {
            System.out.println("ouch.");
        }
        System.out.println(afa.getRoster().getTeam().toString());
    }
}