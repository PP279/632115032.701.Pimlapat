package Week6;

public class main {
  public static void main(String[] args) {
      //632115032 Pimlapat Pimsarn
    Artist art = new Artist("Ball",20);

    art.genre = "hiphop";
    art.gender = "M";
    art.introduce();
    art.playMusic();

    enginee engi = new enginee("Mary",25);
    engi.gender = "F";
    engi.job = "enginee";
    engi.introduce();
    engi.enginee();

    doctor doc = new doctor("Nicha", 32);
    doc.gender = "F";
    doc.hour = 10;
    doc.introduce();
    doc.docter();

    Writer wri = new Writer("Pal", 18);
    wri.gender = "M";
    wri.Letters = 2300;
    wri.introduce();
    wri.Writer();

    Student stu = new Student("Wa", 15);
    stu.gender = "F";
    stu.time = 8;
    stu.Student();

    teacher th = new teacher("Suda", 32);
    th.gender = "F";
    th.time = "9";
    th.teach();

  }  
}
