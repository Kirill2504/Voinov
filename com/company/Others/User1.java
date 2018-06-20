package com.company.Others;


public class User1 {
    private static String login="login1", password="password1";

    public static void initializeData(String login,String password){
        User1.login=login;
        User1.password=password;
    }

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User1() {
    }

    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем %password делает запрос", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public String toString(){
        return "User()";
    }

    public static void main() {
        User user1 = new User("login", "password");
        user1.createQuery();
    }
}
