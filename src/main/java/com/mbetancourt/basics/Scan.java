package com.mbetancourt.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Scan {
	
    static Logger logger = LogManager.getLogger(Scan.class);


	public static void main(String[] args) {
//		String dataFromConsole = System.console().readLine();
//		logger.info("data: "+ dataFromConsole);
		// Using Scanner for Getting Input from User
		Circulo circulo1 = new Circulo();
		Cuadrado cuadrado1 = new Cuadrado();
		Rectangulo rectangulo1 = new Rectangulo();
		
		Scanner in = new Scanner(System.in);
		
        logger.info("Ingrese el radio del círculo");
        double var1 = in.nextDouble();
        circulo1.setRadio(var1);
        logger.info("Ingresaste el valor " + var1 + " como radio del círculo");
        
        logger.info("Ingrese la base del rectángulo");
        var1 = in.nextDouble();
        rectangulo1.setBase(var1);
        logger.info("Ingresaste el valor " + var1 + " como base del rectángulo");
        
        logger.info("Ingrese la altura del rectángulo");
        var1 = in.nextDouble();
        rectangulo1.setAltura(var1);
        logger.info("Ingresaste el valor " + var1 + " como altura del rectángulo");
        
        logger.info("Ingrese el lado del cuadrado");
        var1 = in.nextDouble();
        cuadrado1.setLado(var1);
        logger.info("Ingresaste el valor " + var1 + " como el lado del cuadrado");
        
        List<FiguraGeometrica> lista1 = new ArrayList<FiguraGeometrica>();
        lista1.add(circulo1);
        lista1.add(cuadrado1);
        lista1.add(rectangulo1);
        
        Calculadora calcu1 = new Calculadora();
        double res = calcu1.sumarAreas(lista1);
        logger.info("La suma de las áreas de tus figuras es: " + res);
        
   
          // closing scanner
          in.close();
	}

}
