import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import observables.Observable;
import observables.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TestObserver {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setEtat(90);
        System.out.println("----------------");
        observable.setEtat(60);
        System.out.println("************");
        observable.unSubscribe(observer2);
        observable.setEtat(239);
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                int etat=((ObservableImpl)observable).getEtat();
                System.out.println("Observateur anonym 1 =>"+etat);
            }
        });
        observable.subscribe((obs)->{
            int etat=((ObservableImpl)obs).getEtat();
            System.out.println("Observateur anonym 2 =>"+etat);
        });
    /*    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
        observable.setEtat(304);
        System.out.println("************");
        Button button= new Button();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("*********");
            }
        });
        button.setOnAction((event -> {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        }));
        ObservateurButton observateurButton= new ObservateurButton();
        button.setOnAction(observateurButton);

        JButton jButton=new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("àààààààààààààààààààà");
            }
        });


        java.awt.Button button1=new java.awt.Button();
        button1.addActionListener((evt)->{
            System.out.println("***************");
        });*/
    }
}
/*
class ObservateurButton implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("-------------------------");
    }
}
*/
