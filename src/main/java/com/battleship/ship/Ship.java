package com.battleship.ship;

/// TODO: 13.04.2021 переименовать класс в поле, здесь у нас хранятся поля по каждому игроку
public class Ship {
    //todo сделать поля private и не константными, сделать для них геттеры и сеттеры
    //todo желательно еще переопределить hashCode(), equals(Object obj) и toString()

    public static final String[][] firstShipsFields = new String[10][10];
    public static final String[][] secondShipsFields = new String[10][10];

    public String[][] getFirstShipsFields() {
        return firstShipsFields;
    }

    public String[][] getSecondShipsFields() {
        return secondShipsFields;
    }
}
