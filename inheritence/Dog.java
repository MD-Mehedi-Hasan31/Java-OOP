package com.pondit.inheritence;

public class Dog  {

        private String color="";

        public String getColor() {

            return color;
        }

        public void setColor(String color) {

            this.color=color;
        }

        public void setSuperColor(String color) {
            this.setColor(color);
        }
    }

