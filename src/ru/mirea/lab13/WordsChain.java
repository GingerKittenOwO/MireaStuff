package ru.mirea.lab13;

import java.io.*;
import java.util.*;

public class FileName {

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

    public static String getLine(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        // Создаем список для работы
        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        // Пытаемся построить цепочку, начиная с каждого слова
        for (int i = 0; i < wordList.size(); i++) {
            List<String> result = new ArrayList<>();
            List<String> remaining = new ArrayList<>(wordList);

            // Начинаем с текущего слова
            String currentWord = remaining.remove(i);
            result.add(currentWord);

            // Пытаемся построить цепочку
            if (buildChain(result, remaining)) {
                return String.join(" ", result);
            }
        }

        // Если не удалось построить цепочку
        return "Не удалось построить цепочку";
    }

    private static boolean buildChain(List<String> result, List<String> remaining) {
        if (remaining.isEmpty()) {
            return true;
        }

        // Получаем последнюю букву последнего слова в цепочке
        char lastChar = result.get(result.size() - 1).toLowerCase().charAt(result.get(result.size() - 1).length() - 1);

        // Пробуем добавить каждое подходящее слово
        for (int i = 0; i < remaining.size(); i++) {
            String candidate = remaining.get(i);
            char firstChar = candidate.toLowerCase().charAt(0);

            // Проверяем совпадение букв (игнорируя регистр)
            if (lastChar == firstChar) {
                // Пробуем добавить это слово
                result.add(candidate);
                remaining.remove(i);

                // Рекурсивно продолжаем построение
                if (buildChain(result, remaining)) {
                    return true;
                }

                // Не получилось, возвращаемся назад
                remaining.add(i, result.remove(result.size() - 1));
            }
        }

        return false;
    }
}
