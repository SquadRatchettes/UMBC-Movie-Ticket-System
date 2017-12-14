package com.company;

    public class Cost extends Main {
        public static final double RMOVIES = 12.00;

        public Cost(int selectMovie, int personAge) {

            super();

            double Gmovies = 10.00;
            String kidsstrg = " The cost of this child's ticket is ";
            String strg = " The cost of the ticket is ";

            //Switch statement for ticket prices based on whatever movie the user picks
            switch (selectMovie) {
                case 1:
                    System.out.println(strg + "$"+ RMOVIES);
                    break;

                case 2:
                    System.out.println(strg + "$"+ RMOVIES);
                    break;

                case 3:

                    if (personAge < 18) {
                        System.out.println(kidsstrg + "$"+ Kidprice(Gmovies));
                    }

                    else{
                    System.out.println(strg + "$"+ Gmovies);
                    }
                    break;

                case 4:

                    if (personAge < 18) {
                        System.out.println(kidsstrg +"$"+ Kidprice(Gmovies));
                    }

                    else{
                    System.out.println(strg + "$"+ Gmovies);
                    }
                    break;
            }
        }

        // Method overload #1 for Kid Ticket Prices
        public double Kidprice(double KidApproveMovies){
                double Kidcost1 = KidApproveMovies / 2;
            return Kidcost1;
        }
        
        // Method overload #2 for Kid Ticket Prices
        public int Kidprice(int KidApproveMovies) {
            int Kidcost2 = KidApproveMovies / 2;
            return Kidcost2;
        }

    }
