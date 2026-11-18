public class Card {
    private int[][] numbers;
    private boolean[][] cheked;


    public Card(CardsGenerator generator) {
        numbers = new int[3][5];
        cheked = new boolean[3][5];
        for (int row = 0; row < numbers.length; row++) {
            numbers[row] = generator.getNumbersInRow();
        }
        for (int row = 0; row < cheked.length; row++) {
            for (int col = 0; col < cheked[0].length; col++) {
                cheked[row][col] = false;
            }
        }
    }

    public void markNumber(int numero) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numero == numbers[i][j]){
                    cheked[i][j] = true;
                }
            }
        }
    }

    public void isLine(boolean line){
        for (int i = 0; i < numbers.length; i++) {
            if (cheked[i] = true){
                line = true;
            }
        }
    }

    public void isBingo(boolean bingo){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (cheked[i][j] = true) {
                    bingo = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < numbers.length; i++) {
            boolean first = true;
            for (int j = 0; j < numbers[0].length; j++) {
                 if (first){
                     s += numbers[i][j];
                     first = false;
                 }else{
                     s += ", " + numbers[i][j];
                 }
            }
            s += "\n";
        }
        return s;
    }
}

