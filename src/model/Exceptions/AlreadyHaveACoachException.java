package model.Exceptions;

import model.Classes.Player;

public class AlreadyHaveACoachException extends Exception{

    public AlreadyHaveACoachException(String info)
    {
        super(info);
    }
}
