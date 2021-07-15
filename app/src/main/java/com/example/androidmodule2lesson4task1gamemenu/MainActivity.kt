package com.example.androidmodule2lesson4task1gamemenu
/*
ДЗ. Задание 1. Легкое
Создать меню из TextView (да, им тоже можно добавить OnClickListener), в котором: шрифт 24,
жирный, цвет белый, бэкграунд черный, все паддинги по 8dp, нижний марджин 16dp,
layout:gravity: center.
Названия пунктов меню: “New game”, “Continue”, “Options”, “About”.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}