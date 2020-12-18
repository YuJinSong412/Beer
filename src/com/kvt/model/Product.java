package com.kvt.model;


public class Product {

  public String getContext(String text) {

    String result = "";

    if (text.equals("Terra")) {
      result = "terra";
    } else if (text.equals("Cass")) {
      result = "cass";
    } else if (text.equals("Hite")) {
      result = "hite";
    } else if (text.contentEquals("Pale Lager")) {
      result = "palge lager";
    } else {
      result = "else~~";
    }

    return result;
  }

}

