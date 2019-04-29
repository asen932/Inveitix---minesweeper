public class Cell {

    public final static String mine = "X";
    public final static String unopened = "[]";
    public static String blank = " ";

    public void setStatus(String newStatus){
    }

    public void setUnopened(){
        this.setStatus(unopened);
    }

    public void setMine(){
        this.setStatus(mine);
    }

    public void setBlank(){
        this.setStatus(blank);
    }

    public String getMine() {
        return mine;
    }

    public String getUnopened() {
        return unopened;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        Cell.blank = blank;
    }
}
