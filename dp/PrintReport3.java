package dp;
import java.util.List;

public class PrintReport3 implements ReportOutput{

    public void saveToFile(List<ReportItem> items) {

    }

    @Override
    public void output(List<ReportItem> items) {
        saveToFile(items);
    }

}