public class Main {

    public static void main(String[] args) {

        TableBuilder tableBuilder = new TableBuilder();
        tableBuilder.getTableFromUser();

        TableShifter tableShifter = new TableShifter(tableBuilder);
        tableShifter.getShiftingBody();
    }

}
