package mx.com.cx.dto;

public class InicioCtrl {
 
    private boolean panelGridUno;
    private boolean panelGridDos;
    private boolean panelGridTres;
    private boolean panelGridCuatro ;
    private boolean panelGridCinco;
    private boolean panelGridSeis ;

    public InicioCtrl() {
    }

    public InicioCtrl(  boolean panelGridUno, 
                        boolean panelGridDos, 
                        boolean panelGridTres,
                        boolean panelGridCuatro, 
                        boolean panelGridCinco, 
                        boolean panelGridSeis) {
        this.panelGridUno = panelGridUno;
        this.panelGridDos = panelGridDos;
        this.panelGridTres = panelGridTres;
        this.panelGridCuatro = panelGridTres;
        this.panelGridCinco = panelGridTres;
        this.panelGridSeis = panelGridTres;
    }
    
    public boolean isPanelGridUno() {
        return panelGridUno;
    }

    public void setPanelGridUno(boolean panelGridUno) {
        this.panelGridUno = panelGridUno;
    }

    public boolean isPanelGridDos() {
        return panelGridDos;
    }

    public void setPanelGridDos(boolean panelGridDos) {
        this.panelGridDos = panelGridDos;
    }

    public boolean isPanelGridTres() {
        return panelGridTres;
    }

    public void setPanelGridTres(boolean panelGridTres) {
        this.panelGridTres = panelGridTres;
    }

    /**
     * @return the panelGridCuatro
     */
    public boolean isPanelGridCuatro() {
        return panelGridCuatro;
    }

    /**
     * @param panelGridCuatro the panelGridCuatro to set
     */
    public void setPanelGridCuatro(boolean panelGridCuatro) {
        this.panelGridCuatro = panelGridCuatro;
    }

    /**
     * @return the panelGridCinco
     */
    public boolean isPanelGridCinco() {
        return panelGridCinco;
    }

    /**
     * @param panelGridCinco the panelGridCinco to set
     */
    public void setPanelGridCinco(boolean panelGridCinco) {
        this.panelGridCinco = panelGridCinco;
    }

    /**
     * @param panelGridSeis the panelGridSeis to set
     */
    public void setPanelGridSeis(boolean panelGridSeis) {
        this.panelGridSeis = panelGridSeis;
    }

    /**
     * @return the panelGridSeis
     */
    public boolean isPanelGridSeis() {
        return panelGridSeis;
    }
   
}