
package exemplodatas;

    import java.time.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos {
    
/*  1.-Como metemos a data de alta e visualizarla
    2.-Tempo entre as duas datas.
    3.-Anos de antigüedade ata hoxe.
*/
    
/**** TRABALLADOR DATE ****/
    TraballadorDate obx=new TraballadorDate("Jose",new Date(115,03,02),new Date()); //new Date(1900+el numero que le ponga yo,mes,dia)

    private TraballadorDate tra;
    public void compararDatas(){
//        System.out.println(obx.getDataAlta().compareTo(obx.getDataBaixa()));

        int diferenza=(int) ((obx.getDataAlta().getTime()-obx.getDataBaixa().getTime())/(10000*3600*24*365));
//        int anos=diferenza/(1000*3600*24*365);
        System.out.println(diferenza);
    }
    
    public void añosAntiguedad(){
        System.out.println("Años de antigüedad: "+(obx.getDataBaixa().getYear()-obx.getDataAlta().getYear()));
    }
    

/**** CLASETIME ****/
    
    ClaseTime obx1=new ClaseTime();//"Jose",new Time(12,30,30),new Time(20,15,12));
    
    public void visu(){
        obx1.setDataAlta(LocalDate.of(2015, Month.JANUARY, 21));
        obx1.setDataBaixa(LocalDate.now());//->fecha sistema
        System.out.println(obx1.getDataAlta());
        System.out.println(obx1.getDataBaixa());
    }
    
    public void compara(){
        Period dif=obx1.getDataAlta().until(obx1.getDataBaixa());
        System.out.println("Días: "+dif.getDays()+", meses: "+dif.getMonths()+", años: "+dif.getYears());
    }
    
    public void añosAntiguedad2(){
        int dif=(int) (obx1.getDataBaixa().compareTo(obx1.getDataAlta()));//-obx1.getDataBaixa().getDayOfYear());
        System.out.println("Años difetencia "+dif);
    }
    
    
    
}
