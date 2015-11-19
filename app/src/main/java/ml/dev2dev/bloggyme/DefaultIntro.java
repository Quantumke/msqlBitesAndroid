package ml.dev2dev.bloggyme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.github.paolorotolo.appintro.AppIntro;

import ml.dev2dev.bloggyme.Slides.FirstSlide;
import ml.dev2dev.bloggyme.Slides.SecondSlide;
import ml.dev2dev.bloggyme.Slides.ThirdSlide;
import ml.dev2dev.bloggyme.Slides.FourthSlide;
import ml.dev2dev.bloggyme.Slides2.Login;




public class DefaultIntro extends AppIntro  {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro));
        addSlide(SampleSlide.newInstance(R.layout.intro2));
        addSlide(SampleSlide.newInstance(R.layout.intro3));
        addSlide(SampleSlide.newInstance(R.layout.intro4));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();

    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
      Toast.makeText(getApplicationContext(),"HELLO",Toast.LENGTH_SHORT).show();
    }

    public void getStarted(View v){
        loadMainActivity();

    }
}
