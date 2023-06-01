package model.JSON;

import model.Classes.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;

public class JSONControler {

    public static void ArrayToJSON (WholeRoster roster) throws JSONException
    {
        try {
            JSONArray jsonArray = new JSONArray();
            for(NationalTeamMember m : (roster.getTeam()))
            {
                JSONObject jsonObject =  new JSONObject();
                jsonObject.put("name",m.getName());
                jsonObject.put("surname", m.getSurname());
                jsonObject.put("age", m.getAge());
                if(m instanceof Player)
                {
                   jsonObject.put("number", ((Player) m).getNumber());
                   jsonObject.put("position", ((Player) m).getPosition());
                }
                else if (m instanceof Coach)
                {
                   jsonObject.put("System", ((Coach) m).getSystem());
                   jsonObject.put("Style", ((Coach) m).getStyle());
                }
                else if(m instanceof FieldAssistantCoach)
                {
                    jsonObject.put("method", ((FieldAssistantCoach) m).getMethod());

                }
                else if(m instanceof Masseuse)
                {
                    jsonObject.put("title", ((Masseuse) m).getTitle());
                    jsonObject.put("years of experience", ((Masseuse) m).getYearsOfExperience());
                }
                jsonArray.put(jsonObject);
                JSONUtiles.save(jsonArray, "Selesión");
            }

        }
        catch(JSONException e )
        {
            System.out.println("error");
        }
    }
}
