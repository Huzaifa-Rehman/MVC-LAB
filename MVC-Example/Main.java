package mvc.example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {
public static void main(String[] args) {
Model model = new Model();
View view = new View();
Controller controller = new Controller (model, view);
controller.setData("Hello, MVC!");
controller.updateView();
}
}