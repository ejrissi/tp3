

public class MaDate {
    private int jour;
    private int mois;
    private int annee;

    void ToString() {
        System.out.println(this.jour + " / " + this.mois + " / " + this.annee);
    }

    int getjour() {
        return this.jour;
    }

    int getannee() {
        return this.annee;
    }

    int getmois() {
        return this.mois;
    }

    void setjour(int a) {
        this.jour = a;
    }

    void setmois(int a) {
        this.mois = a;
    }

    void setannee(int a) {
        this.annee = a;
    }

    MaDate(int jour, int mois, int annee) {
        this.mois = mois;
        this.annee = annee;
        this.mois = mois;

    }

    MaDate(int annee) {

        this.mois=1;
        this.jour=1;
        this.annee = annee;

    }
    boolean bissextile(int a)
    {
       return  a%4==0 && a%100==0 || a%400==0;

    }


    void AjouterUnJour()
    {
        jour++;
        if (jour > nb_jour(mois, annee)) {
            jour = 1;
            mois++;
            if (mois > 12) {
                mois = 1;
                annee++;
            }
        }

       


    }

    void ajouterPluseursJours(int n)
    {
        for (int i = 0; i <n; i++) {
            
            AjouterUnJour();
        }
    }

    void ajouterUnMoi()
    {
        if (this.mois<12)
        {
            this.mois+=1;

        }
        else
        {
            this.mois=1;
            this.annee+=1;
        }

    }

    void ajouterUnAnn()
    {
        this.annee+=1;

    }


    int nb_jour(int mois, int annee) {
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(bissextile(annee)) 
                {
                    return 29;
                }
                else
                {
                    return 28;
                }
            default:
                return 0;
        }
    }

}
