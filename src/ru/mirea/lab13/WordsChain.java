package ru.mirea.lab13;

import java.io.*;
import java.util.*;

public class WordsChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try {
            // Чтение файла
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            reader.close();

            if (line == null || line.trim().isEmpty()) {
                System.out.println("Файл пуст или содержит только пробелы");
                return;
            }

            // Разделение слов по пробелам
            String[] words = line.trim().split("\\s+");

            // Получение цепочки
            String result = getLine(words);
            System.out.println("Результат: " + result);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        for (int i = 0; i < wordList.size(); i++) {
            StringBuilder chain = new StringBuilder();
            List<String> remaining = new ArrayList<>(wordList);

            String currentWord = remaining.remove(i);
            chain.append(currentWord);

            if (buildChain(chain, remaining)) {
                return chain.toString();
            }
        }

        return "Не удалось построить цепочку";
    }

    private static boolean buildChain(StringBuilder chain, List<String> remaining) {
        if (remaining.isEmpty()) {
            return true;
        }

        char lastChar = chain.charAt(chain.length() - 1);
        lastChar = Character.toLowerCase(lastChar);

        for (int i = 0; i < remaining.size(); i++) {
            String candidate = remaining.get(i);
            char firstChar = Character.toLowerCase(candidate.charAt(0));

            if (lastChar == firstChar) {
                // Сохраняем состояние перед изменением
                int originalLength = chain.length();

                chain.append(" ").append(candidate);
                remaining.remove(i);

                if (buildChain(chain, remaining)) {
                    return true;
                }

                // Backtracking: восстанавливаем состояние
                chain.setLength(originalLength);
                remaining.add(i, candidate);
            }
        }

        return false;
    }
}
