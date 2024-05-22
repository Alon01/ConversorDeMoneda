package com.hectoresquivel.conversor.modelos;


public class MenuConversion {

    public String menuUno (int option){
        if (option == 1 || option == 3 || option == 5){
            return "USD";
        } else if (option == 2) {
            return "MXN";
        } else if (option == 4) {
            return "BRL";
        } else  {
            return "COP";
        }
    }

    public String menudos (int option){
        if (option == 2 || option == 4 || option == 6){
            return "USD";
        } else if (option == 1) {
            return "MXN";
        } else if (option == 3) {
            return "BRL";
        } else  {
            return "COP";
        }
    }



}
