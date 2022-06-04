public class TableBuilder {

    InputManager inputManager = new InputManager();
    OutputManager outputManager = new OutputManager();

    private int[] table;

    public int[] getTable() {
        return table;
    }

    void getTableFromUser() {
        createTable();
        inputValues();
        printTableBeforeShift();
    }

    private void createTable() {
        System.out.println("How many numbers would you like to use for moving?");
            int tabSize = inputManager.getInput();
            table = new int[tabSize];
    }

    private void inputValues() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Input " + (i+1) + ": ");
            table[i] = inputManager.getInput();
        }
    }

    private void printTableBeforeShift() {
        System.out.print("A table before shifting: ");
        outputManager.getFilledTable(table);
    }

}
