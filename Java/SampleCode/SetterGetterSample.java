//セッターとゲッターのサンプル

public class Character {
private String name;

public void setName(String name) {
this.name = name;
}

public String getName() {
return this.name;
}

}


public class Main {
public static void main(String[] args) {
Character hero = new Character();
hero.setName("Hero");
System.out.println(hero.getName());
}
}


