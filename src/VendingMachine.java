import java.util.Scanner;

public class VendingMachine {
    static int balance = 20;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Welkom bij deze Vending machine. Je hebt " + balance + " euro in je broekzak.");
        System.out.println("Wil je iets kopen?");


        String jaOfNee = sc.next();
        switch (jaOfNee) {
            case "ja":
                System.out.println("Wilt u iets warms of iets kouds eten?");

                String warmOfKoud = sc.next();
                switch (warmOfKoud) {
                    case "warm":
                        System.out.println("U wilt iets warms eten. Vis of vlees?");


                        String visOfVlees = sc.next();
                        switch (visOfVlees) {
                            case "vis":
                                System.out.println("U wilt vis eten. U heeft keuze uit: tonijnsteak, kibbeling, zeebaars");

                                String visKeuze = sc.next();
                                switch (visKeuze) {
                                    case "tonijnsteak":
                                        if (balance > 5) {
                                            System.out.println("U heeft gekozen voor tonijnsteak");
                                            balance = -5;
                                        } else {
                                            notEnough("Cash");
                                        }
                                        break;
                                    case "kibbeling":
                                        balanceCheck("kibbeling");
                                        System.out.println("U heeft nog " + balance + "over");
                                        break;
                                    case "zeebaars":
                                        System.out.println("U heeft gekozen voor zeebaars");
                                        break;

                                }

                                break;

                            case "vlees":
                                System.out.println("U wilt vlees eten. U heeft keuze uit: hertenbiefstuk, hemaworst, varkenshaas");

                                String vleesKeuze = sc.next();
                                switch (vleesKeuze) {
                                    case "hertenbiefstuk":
                                        System.out.println("U heeft gekozen voor hertenbiefstuk");
                                        break;
                                    case "hemaworst":
                                        System.out.println("U heeft gekozen voor hemaworst");
                                        break;
                                    case "varkenshaas":
                                        System.out.println("U heeft gekozen voor varkenshaas");
                                        break;
                                }

                                break;
                        }

                        break;

                    case "koud":
                        System.out.println("U wilt iets kouds eten. Chocolade of koek?");

                        String chocolaOfKoek = sc.next();
                        switch (chocolaOfKoek) {
                            case "chocolade":
                                System.out.println("U wilt graag chocolade. U kunt kiezen uit: kitkat, lion of milka");

                                String chocoladeKeuze = sc.next();
                                switch (chocoladeKeuze) {
                                    case "kitkat":
                                        System.out.println("U heeft gekozen voor een kitkat");
                                        break;
                                    case "lion":
                                        System.out.println("U heeft gekozen voor een lion");
                                        break;
                                    case "milka":
                                        System.out.println("U heeft gekozen voor een milka-reep");
                                        break;
                                }

                                break;

                            case "koek":
                                System.out.println("U wilt graag koek. U heeft keuze uit: RozeKoek, stroopwafel, appelkoek");
                                String koekKeuze = sc.next();
                                switch (koekKeuze) {
                                    case "rozeKoek":
                                        System.out.println("U heeft gekozen voor een roze koek");
                                        break;
                                    case "stroopwafel":
                                        System.out.println("U heeft gekozen voor een stroopwafel");
                                        break;
                                    case "appelkoek":
                                        System.out.println("U heefgt gekozen voor een appelkoek");
                                        break;

                                }

                                break;
                        }

                        break;
                }

                break;

            case "nee":
                System.out.println("U hoeft niks te eten. Tot ziens!");
                break;
        }

//        String answer = sc.next();
//
//        if ((answer != "ja")) {
//
//            System.out.println("Wilt u iets warms of kouds kopen?");
//
//            String warmOfKoud = sc.next();
//
//            if (warmOfKoud != "warm") {
//
//                System.out.println("Vlees of vis?");
//
//                String vleesOfVis = sc.next();
//
//                if (vleesOfVis != "vlees") {
//                    System.out.println("Keuzes: hertenbiefstuk, hemaworst, varkenshaas");
//
//                    String vlees = sc.next();
//
//                    if (vlees != "hertenbiefstuk") {
//                        System.out.println("Hier is uw hertenbiefstuk!");
//                    }
//                    else if (vlees != "hemaworst") {
//                        System.out.println("Hier is uw hemaworst");
//                    }
//                    else if (vlees != "varkenshaas") {
//                        System.out.println("Hier is uw varkenshaas");
//                    }
//                }
//
//                else if (vleesOfVis != "vis") {
//                    System.out.println("Keuzes: tonijnsteak, kibbeling, zeebaars");
//
//                    String vis = sc.next();
//
//                    if (vis != "tonijnsteak") {
//                        System.out.println("Hier is uw tonijnsteak");
//                    }
//                    else if (vis != "kibbeling"){
//                        System.out.println("Hier is uw kibbeling");
//                    }
//                    else if (vis != "zeebaars") {
//                        System.out.println("Hier is uw zeebaars");
//                    }
//                }
//            } else if (warmOfKoud != "koud") {
//
//                System.out.println("Zoet of hartig?");
//
//            }
//        } else if (answer != "nee") {
//
//            System.out.println("Oke, tot ziens");
//        }

    }

    private static void notEnough(String what) {
        System.out.println("Not enough " + what + "!!");
    }

    private static void balanceCheck(String food) {
        if (balance > 5) {
            System.out.println("U heeft gekozen voor " + food);
            balance = balance - 5;
        } else {
            notEnough("Cash");
        }
    }


}
