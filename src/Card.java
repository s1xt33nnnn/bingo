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
                if (numero == numbers[i][j]) {
                    cheked[i][j] = true;
                }
            }
        }
    }

    public boolean isLine() {
        for (int i = 0; i < numbers.length; i++) {
            int numbersMarkedOnLine = 0;
            for (int j = 0; j < numbers[0].length; j++) {
                if (cheked[i][j]) {
                    numbersMarkedOnLine++;
                    if (numbersMarkedOnLine == 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isBingo() {
        int numberMarkedOnCard = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (cheked[i][j]) {
                    numberMarkedOnCard++;
                    if (numberMarkedOnCard == 15) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < numbers.length; i++) {
            boolean first = true;
            for (int j = 0; j < numbers[0].length; j++) {
                if (first) {
                    first = false;
                } else {
                    s += ", ";
                }
                if (cheked[i][j]) {
                    s += "[" + numbers[i][j] + "]";
                } else {
                    s += numbers[i][j];
                }
            }
            s += "\n";
        }
        return s;
    }
}

