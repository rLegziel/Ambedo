package com.example.android.ambedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Recommendation> recommendations = new ArrayList<Recommendation>();
        recommendations.add(new Recommendation("Arctic Monkeys","505 \nWanna Be Yours \nFluorescent Adolescent \nDo me a Favour",R.drawable.arcticm));
        recommendations.add(new Recommendation("Beach House","Space Song \nMyth \nOn The Sea \nSomewhere Tonight",R.drawable.beachy));
        recommendations.add(new Recommendation("Black Keys","Little Black Submarines \nTighten Up \nNext Girl \nI'm Not The One  \nLonely Boy \nFever",R.drawable.blackk));
        recommendations.add(new Recommendation("Dire Straits","Brothers In Arms \nMoney For Nothing \nSultans Of Swing \nPrivate Investigations \nRomeo and Juliet",R.drawable.dires));
        recommendations.add(new Recommendation("Incubus","Drive \nPardon Me \nAre You In?  \nNowhere Fast  ",R.drawable.incub));
        recommendations.add(new Recommendation("Julien Baker","Everybody Does \nSomething \nSprained Ankle \nTurn Out The Lights",R.drawable.julienb));
        recommendations.add(new Recommendation("Led Zeppelin","Thank You \nHeartbreaker \nWhole Lotta Love \nCommunication Breakdown \nBlack Dog \nGoing to California",R.drawable.ledz));
        recommendations.add(new Recommendation("Pink Floyd","Time \nWish You Were Here \nHey You \nMother \nShine On You Crazy Diamond",R.drawable.pinkf));
        recommendations.add(new Recommendation("Radiohead", "There There \nYou And Whose Army?  \nFake Plastic Trees \nParanoid Android \n2+2=5  \nPyramid Song", R.drawable.radioh));
        recommendations.add(new Recommendation("Tame Impala","Cause Im a Man \nElephant \nFeels Like We Only Go Backwards \nYes Im Changing \nLet It Happen",R.drawable.tamei));
        recommendations.add(new Recommendation("The Killers","Mr Brightside \nSam's Town \nHuman \nRead My Mind \nAll These Things That I've Done \nWhen You Were Young",R.drawable.thek));
        recommendations.add(new Recommendation("The Movielife","Mercy Is Asleep At The Wheel \nHand Grenade \nLake Superior  \nWalking on Glass ",R.drawable.them));
        recommendations.add(new Recommendation("Mac Demarco","This Old Dog \nMy Kind Of Woman \nDreamin  \nOde To Viceroy  \nFreakin Out The Neighborhood",R.drawable.macd));
        recommendations.add(new Recommendation("Into It. Over It","No EQ \nOld Lace and Ivory  \nOpen Casket  \nThe Shaking Of Leaves  \nSpinning Thread",R.drawable.intoioi));
        recommendations.add(new Recommendation("Porcupine Tree","Blackest Eyes \nTrains  \nPure Narcotic  \nThe Rest Will Flow \nWhere We Would Be \nHeartattack In A Layby",R.drawable.porcupinet));


        ReccomendationAdapter adapter = new ReccomendationAdapter(this, recommendations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
