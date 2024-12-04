package syeda;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class inClassExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 ints: ");

        try (PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("ints.txt")))) {
            for (int i = 0; i < 3; i++) {
                out.println(in.nextInt());
            }
            System.out.println("Done");
        } catch (IOException e){
            System.err.println("Error writing to file");
        }

        System.out.println("Enter 3 doubles: ");
        try (PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("doubles.bin")))) {
            for (int i = 0; i < 3; i++) {
                out.println(in.nextDouble());
            }
            System.out.println("Done");
        } catch (IOException e){
            System.err.println("Error writing to file");
        }

        int sum = 0;
        try (Scanner read = new Scanner(Files.newInputStream(Path.of("ints.txt")))) {
            while (read.hasNextLine()) {
                sum += Integer.parseInt(read.nextLine());
            }
            System.out.println("Sum: " + sum);
            System.out.println("Done");
        } catch (IOException e) {
            System.err.println("Error writing to file");
        }


//        for (int i = 0; i < 3; i++) {
////            writeBytes(Path.of("ints.txt"), true, in.nextInt());
//            writeInts("ints.txt", in.nextInt());
//        }
//        System.out.println("Enter 3 doubles: ");
//        for (int i = 0; i < 3; i++) {
//            writeDoubles("doubles.txt", in.nextDouble());
//        }

    }

//    public static void writeBytes(Path path, boolean append, int input) {
//        OpenOption openOption = append ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
//        try (OutputStream out = Files.newOutputStream(path, openOption)) {
//            out.write(input);
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//            System.err.println(e.getMessage());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }

//    public static void writeInts(String filename, int value) {
//        try (PrintWriter out = new PrintWriter(filename)) {
//            out.println(value);
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//            System.err.println(e.getMessage());
//        }
//    }

//    public static void writeDoubles (String filename, double value) {
//        try (PrintWriter out = new PrintWriter(filename)) {
//            out.println(value);
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//            System.err.println(e.getMessage());
//        }
//    }
}
