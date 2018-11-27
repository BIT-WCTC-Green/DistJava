package us.mattgreen.thanks.controllers;

public class Thanks {
    private String what;
    private int howMuch;  //1 to 5

    public Thanks(String what, int howMuch) {
        this.what = what;
        this.howMuch = howMuch;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int getHowMuch() {
        return howMuch;
    }

    public void setHowMuch(int howMuch) {
        this.howMuch = howMuch;
    }
}
