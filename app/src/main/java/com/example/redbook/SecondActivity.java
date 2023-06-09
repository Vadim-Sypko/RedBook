package com.example.redbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.AbstractList;

public class SecondActivity extends AppCompatActivity {

    //создаем контейнер для объектов класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitiaData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView =  findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this,animals);

        // на recycleView подадим адаптер
        recyclerView.setAdapter(adapter);
    }
    // метод -устанавливает начальный набор данных (а именно  изображения из папки res/drawables)
    private void setInitiaData(){
        //добавление в контейнер animals объектов сущности Animal
        animals.add(new Animal("Выдра","Относится к позвоночным, отряд у нее – хищники, а семейство – куньи.",
                R.drawable.vydra,"В самом Краснодарском крае сейчас обитает где-то 260 особей, большая часть приходится на Кавказский заповедник."));
        animals.add(new Animal("Рысь кавказская","Рысь – опасный хищник семейства кошачьих. Виду грозит вымирание. Вес кошки составляет до 14 кг. Цвет коричнево-рыжий или рыжий с пятнами.",
                R.drawable.rs, " В Краснодарском крае распространяется в государственных заказниках. Численность – около 45 особей."));
        animals.add(new Animal("Переднеазиатский леопард", "Самый крупный представитель семейства кошачьих в Краснодарском крае.Хищник питается парнокопытными животными и относится к вымирающим животным.",
                R.drawable.lprd,"Подвид давно занесет в Красную книгу, так как находится на гране исчезновения. Всего насчитывается около тысячи особей в мире. Отнесен к первой категории вымирающих животных."));
        animals.add(new Animal("Кавказская серна", "Уникальный высокогорный вид, представители которого могут развивать скорость до 50 километров в час! " +
                "Питаются листьями кустарников, тонкими веточками деревьев и молодой травой. Зимой объедают мох и едят опавшую листву. Становятся добычей для сильных хищников: волков, медведей, рысей. ",
                R.drawable.srn,"Кавказская серна отмечена в Красной книге Российской Федерации, как уязвимая популяция. На северо-западе Кавказе числится 2100 особей."));
        animals.add(new Animal("Кавказский лесной кот", "Живет в лесах Краснодарского края. Это крупная кошка с густым, красивым мехом. В Красной книге находится в категории редких животных. Наибольшую активность проявляет ночью.",
                R.drawable.lsnkt, "Численность на данный момент стабильна, немного снижаясь к зимнему периоду и восстанавливая баланс летом."));
        animals.add(new Animal("Горный зубр", "Зубр находится в категории «Восстановленные животные». Это самое крупное млекопитающее Европы.",
                R.drawable.zubr,"В мире насчитывается около 4000 особей."));
        animals.add(new Animal("Хорь-перевязка", "Хорь-перевязка очень похож на простого хорька. Хищник принадлежит к семейству куньих.",
                R.drawable.hrprvzk, "Частота распространения по Кубани – не более 0,01-0,02 особи на 1000 га."));




    }
}