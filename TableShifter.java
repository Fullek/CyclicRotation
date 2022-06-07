public class TableShifter {

    TableBuilder tableBuilder;
    private int n;

    private final int[] shiftedTable;

    public TableShifter(TableBuilder tableBuilder) {
        this.tableBuilder = tableBuilder;
        this.shiftedTable = tableBuilder.getTable();
    }

    void getShiftingBody() {
        getNumberOfShifts();
        shiftTable(n);
        printTableAfterShift();
    }

    private void getNumberOfShifts() {
        System.out.println("How many times to shift array numbers to the right?");
        n = tableBuilder.inputManager.getInput();
    }

    private void shiftTable(int n) {

        for (int i = 0; i < n; i++) {
            int j;
            int last = shiftedTable[shiftedTable.length-1];
            for (j = shiftedTable.length-1; j > 0; j--) {
                shiftedTable[j] = shiftedTable[j-1];
            }
            shiftedTable[0] = last;
        }
    }

    private void printTableAfterShift() {
        System.out.print("An array after shifting: ");
        tableBuilder.outputManager.getFilledTable(shiftedTable);
    }

}
