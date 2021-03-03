package Generics;

public class Main {
    public static void main(String[] args) {
        BaseballPlayer john = new BaseballPlayer("John");
        BaseballPlayer vasea = new BaseballPlayer("Vasea");
        BaseballPlayer tony = new BaseballPlayer("Tony");
        BaseballPlayer billi = new BaseballPlayer("Billi");

        FootballPlayer fosea = new FootballPlayer("Fosea");
        FootballPlayer gosha = new FootballPlayer("Gosha");
        FootballPlayer hoko = new FootballPlayer("Hoko");
        FootballPlayer bim = new FootballPlayer("Bim");

        SocketPlayer luis = new SocketPlayer("Luis");
        SocketPlayer kon = new SocketPlayer("Kon");
        SocketPlayer nom = new SocketPlayer("Nom");
        SocketPlayer moisa = new SocketPlayer("Moisa");

        Team<BaseballPlayer> winners = new Team<>("Winners");
        winners.addPlayer(john);
        winners.addPlayer(vasea);

        Team<BaseballPlayer> royalBase = new Team<>("Royal Base");
        royalBase.addPlayer(tony);
        royalBase.addPlayer(tony);
        royalBase.addPlayer(billi);

        Team<SocketPlayer> golden = new Team<>("Golden");
        golden.addPlayer(luis);
        golden.addPlayer(kon);

        Team<SocketPlayer> tallish = new Team<>("Tallish");
        tallish.addPlayer(nom);
        tallish.addPlayer(moisa);

        Team<FootballPlayer> ladders = new Team<>("Ladders");
        ladders.addPlayer(fosea);
        ladders.addPlayer(gosha);

        Team<FootballPlayer> unstoppable = new Team<>("Unstoppable");
        unstoppable.addPlayer(hoko);
        unstoppable.addPlayer(bim);

        League<FootballPlayer> footballPlayerLeague = new League<>("Football League");
        footballPlayerLeague.add(ladders);
        footballPlayerLeague.add(unstoppable);

        League<SocketPlayer> socketLeague = new League<>("Socket League");
        socketLeague.add(golden);
        socketLeague.add(tallish);

        League<BaseballPlayer> baseballPlayerLeague  = new League<>("Baseball League");
        baseballPlayerLeague.add(winners);
        baseballPlayerLeague.add(royalBase);

        winners.matchResult(royalBase, 4, 5);

        baseballPlayerLeague.print();



    }
}
