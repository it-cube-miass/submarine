package com.example.submarine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    /*
     * блок настройки
     * */
    int shots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        initGame();
        drawGrid();
    }

    /*
     * блок выбора случайного положения лодки
     * */
    void initGame() {
        Log.d("test", "initGame");
        shots = 0;
    }

    /*
     * блок отрисовки сетки
     * */
    void drawGrid() {
        Log.d("test", "drawGrid");
        Log.d("test", "renderShots: " + shots);
    }

    /*
     * отработка нажатия
     * */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("test", "onTouchEvent");
        onHit();
        return true;
//        return super.onTouchEvent(event);

    }
    /*
     *
     * */
    void onHit() {
        shots++;
        Log.d("test","onHit");
        if (Math.random() > .7f) {
            boom();
        } else {
            drawGrid();
        }
    }

    /*
     * блок показа Boom!
     * */
    void boom() {
        Log.d("test", "Boom!");
        initGame();
    }
}
