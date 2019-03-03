package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    Label info;
    @FXML
    ChoiceBox choice;

    private final Case[] cases = {
            new Case("Варя", "совковое имя -> кто дает имена? -> родители, значит родители как минимум немного совковые и вообще поехи -> яблоня яблоко -> значит она похожа на них -> значит под подушкой у нее есть Капитал -> все твое станет нашим\nапасно\n:sova:\n"),
            new Case("Настя","Насти от случая зависят но обычно  ними удобно :sova:\nно я бы не выбирал такую\nони вроде удобные а у самих заточка за спиной :sova:"),
            new Case("Даша","Даши все дерзкие :whyyy:"),
            new Case("Вика","Код красный, повторяю код красный, уходим\nне будет :peka: но у меня была вика это более чем 3 светофора перед ней надо ставить :vsrato:"),
            new Case("Лера","Лера :vsrato:"),
            new Case("Полина","А вот, полины еще :fire:\nЯ же говорю что топич :peka:"),
            new Case("Ксюша","100% вин\nищи таких :peka:"),
            new Case("Рита","100% вин\nищи таких :peka:"),
            new Case("Кристина","Шл\n а что подробнее, как картинка так и есть, не встречал исключений еще gru\n:grumpy:"),
            new Case("Лена","Сталкерша :ploho:"),
            new Case("Оля","а если серьезно то я бы не ходил с какой-нибудь леной-олей :grumpy:")
    };

    void init() {
        choice.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldIndex, Number newIndex) {
                if(oldIndex!=newIndex){
                    info.setText(cases[newIndex.intValue()].getINFO());
                }
            }
        });
    }
}
