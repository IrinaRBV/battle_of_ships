package com.battleship.ship;

import java.util.Arrays;

/// TODO: 13.04.2021 переименовать класс в поле, здесь у нас хранятся поля по каждому игроку +
public class Field {
    //todo сделать поля private и не константными, сделать для них геттеры и сеттеры +
    //todo желательно еще переопределить hashCode(), equals(Object obj) и toString() +



    private String[][] firstFields = new String[10][10];
    private String[][] secondFields = new String[10][10];

    public String[][] getFirstFields() {
        return firstFields;
    }

    public void setFirstFields(String[][] firstFields) {
        this.firstFields = firstFields;
    }

    public String[][] getSecondFields() {
        return secondFields;
    }

    public void setSecondFields(String[][] secondFields) {
        this.secondFields = secondFields;
    }

    @Override
    public String toString() {
        return "Field{" +
                "firstFields=" + Arrays.toString(firstFields) +
                ", secondFields=" + Arrays.toString(secondFields) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Arrays.equals(firstFields, field.firstFields) && Arrays.equals(secondFields, field.secondFields);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(firstFields);
        result = 31 * result + Arrays.hashCode(secondFields);
        return result;
    }
}
