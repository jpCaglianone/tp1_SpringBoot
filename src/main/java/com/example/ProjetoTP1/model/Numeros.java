package com.example.ProjetoTP1.model;


public class Numeros {

    private float numA;

    private float numB;

    public float getNumA(){
        return this.numA;
    }

    public float getNumB(){
        return this.numB;
    }

    public float soma(){
        return getNumA() + getNumB();
    }
    public float subtracao(){
        return getNumA() - getNumB();
    }
    public float multiplicacao(){
        return getNumA() * getNumB();
    }
    public float divisao(){
        return getNumA() / getNumB();
    }
    public float exponenciacao(){
        return (float) Math.pow(getNumA(), getNumB());
    }
}
