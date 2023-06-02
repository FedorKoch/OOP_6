package dp;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private List<ReportItem> items;	// Отчетные данные
    private ReportOutput reportOutput;

    public Report(ReportOutput reportOutput) {
        this.reportOutput = reportOutput;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output() {
        reportOutput.output(items);
    }

}