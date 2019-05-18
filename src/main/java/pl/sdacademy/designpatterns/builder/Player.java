package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {

    private int health;
    private int mana;
    private String nick;
    private List<String> friends;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public static class Builder {
        private int health;
        private int mana;
        private String nick;
        private List<String> friends;


        public Builder withHealth(final int health){
            this.health = health;
            return this;
        }

        public Builder withMana(final int mana){
            this.mana = mana;
            return this;
        }

        public Builder withNick(final String nick){
            this.nick = nick;
            return this;
        }

        public Builder withFriends(final List<String> friends){
            this.friends = friends;
            return this;
        }

// coś nie tak !
//        public Player build() {
//            return new Player(health, mana, nick, friends);
//        }

    } // class Builder



} // class Player
