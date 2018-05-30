package com.company.Interface;

/**
 * Created by Student on 30.05.2018.
 */
public class Magazine implements Printable
        private String name;

        public Magazine(String name) {
            this.name = name;
        }


        @Override
        public void print() {
        System.out.println("");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
