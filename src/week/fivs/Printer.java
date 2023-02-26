package week.fivs;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) this.tonerLevel = -1;
        else this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + tonerLevel > 100) return -1;
            else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (int) Math.ceil(pagesToPrint / 2.0);
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }
}
