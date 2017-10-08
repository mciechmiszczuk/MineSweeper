
public class HintField extends MineField{

    private HintField[][] hintFields;

    public HintField(int m, int n, MineField[][] mineFields, HintField[][] hintFields) {
        super(m, n, mineFields);
        this.hintFields = new HintField[m][n];
    }

}
