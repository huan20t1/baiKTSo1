package com.example.kiemtraso1;

public class singer {
    private  String name;
    private  String nickname;
    private  String quocgia;
    private String sao;
    private int avatar;
    private int hinhsao;

    public singer(String name, String nickname, String quocgia, String sao, int avatar, int hinhsao) {
        this.name = name;
        this.nickname = nickname;
        this.quocgia = quocgia;
        this.sao = sao;
        this.avatar = avatar;
        this.hinhsao = hinhsao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getHinhsao() {
        return hinhsao;
    }

    public void setHinhsao(int hinhsao) {
        this.hinhsao = hinhsao;
    }
}
