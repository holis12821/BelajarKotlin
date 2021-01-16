package com.dicoding.javafundamental.collection.Diagnosa;

public class Rules_FC {
    private String kaidahrules1;
    private boolean rules1;
    private boolean rules2;
    private boolean rules3;
    private boolean rules4;

    /*Define CF user*/


    public void setRules1(boolean rules1) {
        this.rules1 = rules1;
    }

    public void setRules2(boolean rules2) {
        this.rules2 = rules2;
    }
    public void setRules3(boolean rules3){
        this.rules3 = rules3;
    }

    public boolean isRules1(){
        return rules1;
    }

    public boolean isRules2() {
        return rules2;
    }

    public boolean isRules3() {
        return rules3;
    }

    public void setRules1() {
        if (kaidahrules1.equals("rules1")) {
            if (this.isRules1() && this.isRules2() && this.isRules3()) {
                final double bobotCFPakar1 = 0.8;
                final double bobotCFPakar2 = 0.2;
                final double bobotCFPakar3 = 0.4;

                final double bobotCFUser1 = 0.2;
                final double bobotCFUser2 = 0.4;
                final double bobotCFUser3 = 0.6;
                final double bobotCFUser4 = 0.8;
                final double bobotCFUser5 = 1.0;

                /*menghitung cf pakar dan cf user*/

                /*kaidah 1*/
                double CF1 = bobotCFPakar1 * bobotCFUser1;
                double CF2 = bobotCFPakar2 * bobotCFUser2;
                double CF3 = bobotCFPakar3 * bobotCFUser3;
                 

                System.out.println("");
            }

        }
    }

}
