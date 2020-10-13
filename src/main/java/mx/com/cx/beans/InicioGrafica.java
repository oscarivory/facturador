package mx.com.cx.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import javax.inject.Named;
import mx.com.cx.util.Faces;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@Named(value = "inicioG")
@ViewScoped
public class InicioGrafica extends Faces implements Serializable {

    private LineChartModel dateModel;
    HorizontalBarChartModel horizontalBarModel;

    @PostConstruct
    public void init() {
        createDateModel();
        createHorizontalBarModel();
    }

    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    private void createDateModel() {
        dateModel = new LineChartModel();
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Costo");

        series1.set("2019-01-01", 51);
        series1.set("2019-01-06", 22);
        series1.set("2019-01-12", 65);
        series1.set("2019-01-18", 74);
        series1.set("2019-01-24", 24);
        series1.set("2019-01-30", 51);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Facturado");

        series2.set("2019-01-01", 32);
        series2.set("2019-01-06", 73);
        series2.set("2019-01-12", 24);
        series2.set("2019-01-18", 12);
        series2.set("2019-01-24", 74);
        series2.set("2019-01-30", 62);

        dateModel.addSeries(series1);
        dateModel.addSeries(series2);

        dateModel.setTitle("% de Distribución por filial");
        dateModel.setZoom(true);
        dateModel.setAnimate(true);
        dateModel.setLegendPosition("se");
        DateAxis axis = new DateAxis("");
        axis.setTickAngle(-50);
        axis.setMax("2019-02-01");
        axis.setTickFormat("%b %#d, %y");

        dateModel.getAxes().put(AxisType.X, axis);
        dateModel.setSeriesColors("AA3939,2B4B6F");
    }

    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Conexion Directa");
        boys.set("100", 50);
        boys.set("90", 96);
        boys.set("50", 44);
        boys.set("40", 55);
        boys.set("30", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("OffNet");
        girls.set("50", 52);
        girls.set("30", 60);
        girls.set("80", 82);
        girls.set("10", 35);
        girls.set("100", 120);
 
        ChartSeries sys = new ChartSeries();
        sys.setLabel("OnNet");
        sys.set("100", 52);
        sys.set("80", 60);
        sys.set("10", 82);
        sys.set("90", 35);
        sys.set("50", 120);
        
        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);
        horizontalBarModel.addSeries(sys);
 
        horizontalBarModel.setTitle("% Participación Tráfico");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setAnimate(true);
        horizontalBarModel.setZoom(true);
        horizontalBarModel.setStacked(true);
 
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(200);
 
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel(" % ");
        
        horizontalBarModel.setSeriesColors("AA3939,2B4B6F,609732");
    }

    public LineChartModel getDateModel() {
        return dateModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }

}
