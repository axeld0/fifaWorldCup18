package model.Classes;

import java.util.Date;

public class NationalFootballFederation {

    private String name;
    private Date fundationDate;
    private int worldCupTitles;
    private WholeRoster roster;


    public NationalFootballFederation(String name, Date fundationDate, int worldCupTitles, WholeRoster roster) {
        this.name = name;
        this.fundationDate = fundationDate;
        this.worldCupTitles = worldCupTitles;
        this.roster = roster;
    }

    public NationalFootballFederation ()
    {
        name = "";
        fundationDate = new Date();
        worldCupTitles = 0;
        roster = new WholeRoster();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFundationDate() {
        return fundationDate;
    }

    public void setFundationDate(Date fundationDate) {
        this.fundationDate = fundationDate;
    }

    public int getWorldCupTitles() {
        return worldCupTitles;
    }

    public void setWorldCupTitles(int worldCupTitles) {
        this.worldCupTitles = worldCupTitles;
    }

    public WholeRoster getRoster() {
        return roster;
    }

    public void setRoster(WholeRoster roster) {
        this.roster = roster;
    }

    public void addToRoster(NationalTeamMember member)
    {
        try {
            roster.addMember(member);
        }
        catch (Exception e)
        {
            System.out.println("Error in adding the player");
        }


    }


    @Override
    public String toString() {
        return "NationalFootballFederation{" +
                "name='" + name + '\'' +
                ", fundationDate=" + fundationDate +
                ", worldCupTitles=" + worldCupTitles +
                ", roster=" + roster +
                '}';
    }
}
