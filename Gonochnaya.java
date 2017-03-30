/**
 * Created by USER on 29.01.2017.
 */
public class Gonochnaya extends Legkovaya {
//    переопределение метода двигателя - сигнатура не изменена
    public void dvigatel(){
        System.out.println("moschni dvigatel gonochnoy ");

    }
//    перегрузка метода автоелектрика - изменение сигнатуры метода(ввели новую переменную int y)
    public void autoelektrika(int y){
        System.out.println("мощная автоелектрика от гоночной " + y + "прожектора "  );
    }

}
