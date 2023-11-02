// Hollow Rectangle pattern 
// public class patterns {
//     public static void hollowRec(int totrows, int totcols) {
//         for (int i = 1; i <= totrows; i++) {
//             for (int j = 1; j <= totcols; j++) {
//                 if (i == 1 || i == totrows || j == 1 || j == totcols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }


//     public static void inverted_halfpyramid(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void inverted_halfpyramid_num(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void floydtriangle(int n) {
//         int counter = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(counter);
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

//     public static void zeronetriangle(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print(1);
//                 } else {
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     }

    // public static void main(String args[]) {
    //     hollowRec(8, 9);
        // inverted_halfpyramid(4);
        // inverted_halfpyramid_num(5);
        // floydtriangle(5);
        // zeronetriangle(6);
//     }
// }
