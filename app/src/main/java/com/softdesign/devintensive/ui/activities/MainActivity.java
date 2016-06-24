package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected static final String TAG = ConstantManager.TAG_Prefix+"Main Activity";


    /**
     * метод вызывается при создании активити (после изменения конфигурации/возврата к текущей
     * активности после его уничтожения.
     *
     * в данном методе инициализируются/производится:
     * - UI пользовательский интерфейс (статика)
     * - инициализация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     *
     * Не запускать длительные операции по работе с данными в onCreate() !!!
     *
     * @param savedInstanceState - объект со значениями сохраненными в Bundle - состоянии UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        if (savedInstanceState == null) {
            //активити запускается впервые
        } else {
            //активити уже создавалось
        }

    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происходит регистрация подписки на события остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * метод вызывается когда активити становится доступна юзеру для взаимодействия
     * в данном методе как правило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики/запуск выполнения потоков и т.п.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * метод вызывается когда текущая активити теряет фокус но остается невидимой (всплытие
     * диалогового окна/частичное перекрытие других активити/ и т.д.)
     * в данном методе реализует сохранение легковесных UI данных/анимаций/аудио/видео и т.д.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя
     * в данном методе происходит отписка от событий, остановка сложных анимаций, сложные операции
     * по сохранению данных/прерывание запущенных потоков/и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызова
     * метода finish()
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активит/возобновлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логика которая должна быть реализована именно
     * при рестарте активности - например запрос к серверу который необходимо вызвать при возвращении
     * из другой активити (обновление данных, подписка на определенное событие пронициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
