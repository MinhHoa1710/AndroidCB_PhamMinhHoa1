package com.example.thirdprogram;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgXX;
    Button btnRoll;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initControl();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
        private void initControl () {
            btnRoll = findViewById(R.id.btnRoll);
            imgXX = findViewById(R.id.imgXX);
            btnRoll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rollDice();
                }
            });
        }
            private void rollDice () {
                int randomNumber = random.nextInt(6) + 1;
                int drawableResource;

                switch (randomNumber) {
                    case 1:
                        drawableResource = R.drawable.xx1;
                        break;
                    case 2:
                        drawableResource = R.drawable.xx2;
                        break;
                    case 3:
                        drawableResource = R.drawable.xx3;
                        break;
                    case 4:
                        drawableResource = R.drawable.xx4;
                        break;
                    case 5:
                        drawableResource = R.drawable.xx5;
                        break;
                    case 6:
                        drawableResource = R.drawable.xx6;
                        break;
                    default:
                        drawableResource = R.drawable.xx6;
                }

                imgXX.setImageResource(drawableResource);
            }
    }
