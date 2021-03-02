package Conversor;

public class OperConversor {
    public double result;
    
    //longitud
    public void kilmilla(double n1){
        result = n1 * 0.62;
    }
    public void killyard (double n1){
        result = n1 * 1093.61;
    }
    public void killpie (double n1){
        result = n1 * 3280.84;
    }
    public void killpulga (double n1){
        result = n1 * 39370.08;
    }
    
    public void metmilla (double n1){
        result = n1 * Math.pow(0.000621371, 2);
    }
    public void metyard (double n1){
        result = n1 * 1.09361;
    }
    public void metpie (double n1){
        result = n1 * 3.28084;
    }
    public void metpulga (double n1){
        result = n1 * 39.3701;
    }
    
    public void centmilla (double n1){
        result = n1 * 0.00000621371;
    }
    public void centyard (double n1){
        result = n1 * 10.9361;
    }
    public void centpie (double n1){
        result = n1 * 0.0328084;
    }
    public void centpulga (double n1){
        result = n1 * 0.393701;
    }
    
    public void milmilla (double n1){
        result = n1 * 0.00000062137;
    }
    public void milyard (double n1){
        result = n1 * 0.00109361;
    }
    public void milpie (double n1){
        result = n1 * 0.00328084;
    }
    public void milpulga (double n1){
        result = n1 * 0.0393701;
    }
    
    //superficie
    public void kmctomilla(double n1){
        result = n1 * 0.386102;
    }
    public void kmctoacres(double n1){
        result = n1 * 247.1027206;
    }
    public void kmctopie (double n1){
        result = n1 * 10764262.648009;
    }
    public void kmctopulga(double n1){
        result = n1 * 1550003100.0062;
    }
    
    public void hectomilla (double n1){
        result = n1 * 0.0038612334;
    }
    public void hectoacre (double n1) {
        result = n1 * 2.471027;
    }
    public void hectopie (double n1) {
        result = n1 * 107642.62;
    }
    public void hectopulga (double n1) {
        result = n1 * 15500031.000062;
    }
    
    public void metctomilla (double n1){
        result = n1 * 0.00000038612334;
    }
    public void metctoacre (double n1) {
        result = n1 * 0.0002471;
    }
    public void metctopie (double n1) {
        result = n1 * 10.764262;
    }
    public void metctopulga (double n1) {
        result = n1 * 1550.003;
    }
    
    //Volumen
    //Metro cubico, Litro, Centimetro cubico, Mililitro
    //Barril, Galon, Pinta, Onza liquida
    public void metcubbarr (double n1) {
        result = n1 * 6.11;
    }
    public void metcubgal (double n1) {
        result = n1 * 219.97;
    }
    public void metcubpinta (double n1) {
        result = n1 * 1759.75;
    }
    public void metcubonza (double n1) {
        result = n1 * 35195.01;
    }
    
    public void litbarr (double n1) {
        result = n1 * 0.01;
    }
    public void litgal (double n1) {
        result = n1 * 0.22;
    }
    public void litpinta (double n1) {
        result = n1 *1.76;
    }
    public void litbonza (double n1) {
        result = n1 * 35.02;
    }
    
    public void cm3barr (double n1){
        result = n1 * 0.00000611;
    }
    public void cm3gal (double n1){
        result = n1 * 0.00022;
    }
    public void cm3pinta(double n1){
        result = n1 * 0.00176;
    }
    public void cm3onza(double n1){
        result = n1 * 0.04;
    }
    
    public void milibarr(double n1){
        result = n1 * 0.00000611;
    }
    public void miligal(double n1){
        result = n1 * 0.00022;
    }
    public void milipinta(double n1){
        result = n1 * 0.00176;
    }
    public void milionza(double n1){
        result = n1 * 0.04;
    }
    
    //Peso
    //Tonelada, Kiligramo, Gramo
    //Tonelada corta, Libra, Onza
    public void toneladacorta(double n1){
        result = n1 * 1.1;
    }
    public void tonlibra(double n1){
        result = n1 * 2204.62;
    }
    public void tononza(double n1){
        result = n1 * 35273.96;
    }
    
    public void kgcorta(double n1){
        result = n1 * 0.0011;
    }
    public void kglibra(double n1){
        result = n1 * 2.2;
    }
    public void kgonza(double n1){
        result = n1 * 35.27;
    }
    
    public void grcorta(double n1){
        result = n1 * 0.0000011;
    }
    public void grlibra(double n1){
        result = n1 * 0.0022;
    }
    public void gronza(double n1){
        result = n1 * 0.04;
    }

    
    //Velocidad
    //Km/s, m/s, Km/hr
    //Milla/s, Milla/h, Pies/h, Nudo
    
    public void kmAmillas(double n1){
        result = n1 * 0.62;
    }
    public void kmAmillah(double n1){
        result = n1 * 2236.94;
    }
    public void kmApies(double n1){
        result = n1 * 3280.84;
    }
    public void kmAnudo(double n1){
        result = n1 * 1943.84;
    }
    
    public void msAmillas(double n1){
        result = n1 * 0.000621;
    }
    public void msAmillah(double n1){
        result = n1 * 2.24;
    }
    public void msApies(double n1){
        result = n1 * 3.28;
    }
    public void msAnudos(double n1){
        result = n1 * 1.94;
    }
    
    public void kmhAmillas(double n1){
        result = n1 * 0.000173;
    }
    public void kmhAmillah(double n1){
        result = n1 * 0.62;
    }
    public void kmhApies(double n1){
        result = n1 * 0.91;
    }
    public void kmhAnudo(double n1){
        result = n1 * 0.54;
    }
    
    //Temperatura
    //Celcius, Fahrenheit, Kelvin
    
    public void celfar(double n1){
        result = n1 *9/5+32;
    }
    public void celev(double n1){
        result = n1 + 273.15 ;
    }
    
    public void farcel(double n1){
        result = (n1 - 32) * 5 / 9;
    }
    public void farkev(double n1){
        result = (n1 - 32) * 5 / 9 + 273.15 ;
    }
    
    public void kevcel(double n1){
        result = n1 - 273.15 ;
    }
    public void kevfar(double n1){
        result = (n1 - 273.15) * 9/5 +32;
    }
}
