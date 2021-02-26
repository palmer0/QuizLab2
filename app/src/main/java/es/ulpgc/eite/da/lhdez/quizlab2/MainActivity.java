  package es.ulpgc.eite.da.lhdez.quizlab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


  private Button cheatButton, nextButton, trueButton, falseButton;
  private TextView questionText, replyText;
  private String[] questionArray;
  private int[] replyArray;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    questionArray = getResources().getStringArray(R.array.question_array);
    replyArray= getResources().getIntArray(R.array.reply_array);

    replyText=findViewById(R.id.replyText);
    questionText=findViewById(R.id.questionText);

    cheatButton=findViewById(R.id.cheatButton);
    nextButton=findViewById(R.id.nextButton);
    trueButton=findViewById(R.id.trueButton);
    falseButton=findViewById(R.id.falseButton);

    /*
    trueButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        trueButtonCliecked( view);
      }
    });

    falseButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        falseButtonCliecked( view);
      }
    });
    */

    questionText.setText(questionArray[0]);

  }

  public void trueButtonCliecked(View view) {

  }

  public void falseButtonCliecked(View view) {

  }

  public void cheatButtonCliecked(View view) {

  }

  public void nextButtonCliecked(View view) {

  }
}