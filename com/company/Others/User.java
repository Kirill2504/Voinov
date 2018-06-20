package com.company.Others;


public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public class Query{
        public void printToLog(){
            System.out.printf("Пользователь %s с паролем %password делает запрос",login,password);
        }
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    public static void main(){
        User user1= new User("login","password");
        user1.createQuery();
    }
}
