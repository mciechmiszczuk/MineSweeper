
public class MineField {

    int M = 2; //number items in line
    int N = 2; //number of lines
    final static String mine = "*";
    final static String noMine = ".";
    final static String separator = "\n";

    private MineField[][] mineFields;


    public void setM(int m) {
        M = m;
    }

    public void setN(int n) {
        N = n;
    }

    public void setMineFields(MineField[][] mineFields) {
        this.mineFields = mineFields;
    }

    public MineField(int m, int n, MineField[][] mineFields) {
        M = m;
        N = n;
        this.mineFields = new MineField[M][N];

    }
}
