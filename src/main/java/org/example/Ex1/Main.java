package org.example.Ex1;

import org.example.Ex1.EnglishAndRussian;
import org.example.Ex1.GermanAndEnglish;
import org.example.Ex1.RussianAndGerman;
import org.example.Ex1.Translator;

/* 1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
Например с английского на русский, с русского на немецки и т.п.
Продумайте какова архитектура наследования будет в данном приложении.
*/

public class Main {
    public static void main(String[] args) {
        Translator russian = new RussianAndGerman("Саша", 25, 'm');
        russian.translates();

        Translator german = new GermanAndEnglish("Толя", 30, 'm');
        german.translates();

        Translator english = new EnglishAndRussian("Катя", 45, 'w');
        english.translates();
    }
}