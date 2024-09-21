public class StarNameSameer {
    public static void main(String[] args) {
        String name = "SAMEER";
        int height = 7; // Height of the letters
        int width = 5;  // Width of the letters

        // Print each letter with stars in the word SAMEER
        printS(height, width);
        System.out.println();
        printA(height, width);
        System.out.println();
        printM(height, width);
        System.out.println();
        printE(height, width);
        System.out.println();
        printE(height, width);
        System.out.println();
        printR(height, width);
    }

    // Function to print 'S'
    public static void printS(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height / 2 || i == height - 1) {
                    System.out.print("*");
                } else if (i < height / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > height / 2 && j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function to print 'A'
    public static void printA(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height / 2 || j == 0 || j == width - 1) {
                    if (!(i == 0 && (j == 0 || j == width - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function to print 'M'
    public static void printM(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || (i == j && j <= width / 2) || (i + j == width - 1 && j >= width / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function to print 'E'
    public static void printE(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height / 2 || i == height - 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function to print 'R'
    public static void printR(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == 0 || i == height / 2) && j < width - 1 || (j == width - 1 && i != 0 && i < height / 2) || (i == j && i >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
