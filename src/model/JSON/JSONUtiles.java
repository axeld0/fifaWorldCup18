package model.JSON;

import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class JSONUtiles {

    public static void save (JSONArray jsonArray , String archivo)
    {
        try {
            FileWriter file = new FileWriter(archivo + ".json");
            file.write(jsonArray.toString());
            file.flush();
            file.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
