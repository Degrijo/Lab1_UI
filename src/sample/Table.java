package sample;

public class Table {
    private String firstCol;
    private String secCol;

    public Table(String firstCol){
     this.firstCol = firstCol;
     this.secCol = "";
    }

    public void rightSwap(){
        if (this.firstCol != null && !this.firstCol.isEmpty()) {
            this.secCol = this.firstCol;
            this.firstCol = "";
        }
    }

    public void leftSwap(){
        if (this.secCol != null && !this.secCol.isEmpty()) {
            this.firstCol = this.secCol;
            this.secCol = "";
        }
    }

    public String getFirstCol(){
        return this.firstCol;
    }

    public String getSecCol(){
        return this.secCol;
    }
}
