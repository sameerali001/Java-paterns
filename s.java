public class s {
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

}
