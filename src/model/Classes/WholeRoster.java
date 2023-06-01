package model.Classes;

import model.Exceptions.AlreadyHaveACoachException;
import model.Exceptions.TooManyPlayers;

import java.util.HashSet;

public class WholeRoster {

    private HashSet < NationalTeamMember> team;

    public WholeRoster() {
        team = new HashSet<>();
    }

    public HashSet<NationalTeamMember> getTeam() {
        return team;
    }

    public boolean addMember(NationalTeamMember member) throws TooManyPlayers, AlreadyHaveACoachException {
        boolean added = false;
        int players = checkPlayerCount();
        if (member instanceof Player) {
            if(players == 23) {
                throw new TooManyPlayers("Sorry, error.");
            }
            else
            {
                team.add(member);
                added = true;
                }
            }
        else if (member instanceof Coach)
        {
            if(checkCoach())
            {
                throw new AlreadyHaveACoachException ("Sorry, we already have an coach.");
            }
            else
            {
                team.add(member);
                added = true;
            }
        }
        else if (member instanceof Masseuse) {
            if (checkMassause()) {
                throw new AlreadyHaveACoachException("Sorry, we already have a masseuse.");
            } else {
                team.add(member);
                added = true;
            }
        }
        else if (member instanceof FieldAssistantCoach) {
            if (checkAssistant()) {
                throw new AlreadyHaveACoachException("Sorry, we already have an field Assistant Coach.");
            } else {
                team.add(member);
                added = true;
            }
        }
        return added;
    }

    public boolean removeMember (NationalTeamMember member) throws NoSuchFieldException
    {
        boolean removed = false;
       if( team.contains(member) == false)
       {
           throw new NoSuchFieldException("Sorry, not found");
       }
       else
       {
           team.remove(member);
       }
        return removed;
    }




    public int checkPlayerCount() {

       int amountOfPlayers = 0;
       for(NationalTeamMember m : team)
       {
           if(m instanceof Player)
           {
               amountOfPlayers++;
           }
       }
        return  amountOfPlayers;
    }

    public boolean checkCoach ()
    {
        boolean coach = false;
        for(NationalTeamMember m : team)
        {
            if(m instanceof Coach)
            {
                coach = true;
            }
        }
        return  coach;
    }

    public boolean checkAssistant()
    {
        boolean assistant = false;
        for(NationalTeamMember m : team)
        {
            if (m instanceof FieldAssistantCoach)
            {
                assistant = true;
            }
        }
        return assistant;
    }
    public boolean checkMassause()
    {
        boolean massause = false;
        for(NationalTeamMember m : team)
        {
            if (m instanceof Masseuse)
            {
              massause = true;
            }
        }
        return massause;
    }

    public String showList()
    {
        StringBuilder sb = new StringBuilder();
        for(NationalTeamMember m : team)
        {
            sb.append(m.toString());
        }
        return sb.toString();
    }

}