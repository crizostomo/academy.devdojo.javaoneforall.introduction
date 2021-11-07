package academy.devdojo.javaoneforall.javacore.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studio;


    public Anime(String name, String type, int episodes, String status){
//        System.out.println("inside constructor");
        this();
//      this(); needs to be the first statement in a construction
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
    }

    public Anime(String name, String type, int episodes, String status, String studio){
        this(name, type, episodes, status);
        this.studio = studio;
    }

    public Anime(){
        System.out.println("Inside no args constructor");
    }

//    public void init(String name, String type, int episodes){
//        this.name = name;
//        this.type = type;
//        this.episodes = episodes;
//    }
//
//    public void init(String name, String type, int episodes, String status){
//        this.init(name, type, episodes);
//        this.status = status;
//    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.status);
        System.out.println(this.studio);

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    public int getEpisodes(){
        return this.episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
