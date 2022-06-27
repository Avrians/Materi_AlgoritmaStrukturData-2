package model;

import java.util.ArrayList;


public class modelIG {
    public String profile;
    public String Username;
    public String postingan;
    public String Caption;
    public int like;
    public ArrayList komentar = new ArrayList<>();

    public modelIG(){

    }

    public modelIG(String pp, String uname, String postng ,String capt ,int suka, ArrayList komen){
        this.profile = pp;
        this.Username = uname;
        this.postingan = postng;
        this.Caption=capt;
        this.like = suka;
        this.komentar = komen;
    }
    public void printpost(){
        System.out.println(
                "Gambar Profile :"+ this.profile+"\n"+
                "Username : " + this.Username+"\n"+
                "Postingan : " + this.postingan+"\n"+
                "Caption : " + this.Caption+"\n"+
                "Like : " + this.like + "\n");
    }

    public void postKonten() {

    }

    public void LikePostingan(int i) {
    }

    public void IsiKomentar(String komentar) {
        System.out.println("Caption : " + this.Caption+ "\n");
    }

    public void ShowComment() {
    }

    public void postingan() {
    }
}