package org.example;


import java.io.*;
import java.nio.file.Files;

public class FileBackup {
    public static final String DIR = ".";
    public static final String FOLDER_TO_BACKUP = "backup";
    public static void main(String[] args) {
        try {
            File sourceDir = new File(DIR);
            File backupDir = new File(FOLDER_TO_BACKUP);

            if (!backupDir.exists()) {
                backupDir.mkdir();
            }

            for (File file : sourceDir.listFiles()) {
                if (file.isFile()) {
                    Files.copy(file.toPath(), new File(backupDir.getAbsolutePath() + "/" + file.getName()).toPath());
                } else if (file.isDirectory() && !file.getName().contains(FOLDER_TO_BACKUP)) {
                    backupDirectory(file, new File(backupDir.getAbsolutePath() + "/" + file.getName()));
                }
            }

            System.out.println("Бэкап выполнен успешно!");
        } catch (IOException e) {
            System.out.println("Во время резервного копирования произошла ошибка: " + e.getMessage());
        }
    }

    private static void backupDirectory(File sourceDir, File backupDir) throws IOException {
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        for (File file : sourceDir.listFiles()) {
            if (file.isFile()) {
                Files.copy(file.toPath(), new File(backupDir.getAbsolutePath() + "/" + file.getName()).toPath());
            } else if (file.isDirectory() && !file.getName().contains(FOLDER_TO_BACKUP)) {
                backupDirectory(file, new File(backupDir.getAbsolutePath() + "/" + file.getName()));
            }
        }
    }
}