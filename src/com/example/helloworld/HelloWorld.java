package com.example.helloworld;

import java.math.BigDecimal;

public class HelloWorld {
   public static void main(String[] args) {
        //System.out.println("Hello Vistula");
       double netDouble = 9.99;
       double VatRate = 0.23;
       double grossDouble = netDouble * (1 + VatRate);
       double totalGrossDouble = grossDouble * 10000;
       double totalNetFromGrossDouble = totalGrossDouble / (1 + VatRate);

       System.out.println("Using double");
       System.out.println("Net price: " + netDouble);
       System.out.println("Gross price: " + grossDouble);
       System.out.println("Total gross (10,000 pcs): " + totalGrossDouble);
       System.out.println("Total net from gross: " + totalNetFromGrossDouble);
       System.out.println();


       BigDecimal netBD = new BigDecimal("9.99");
       BigDecimal vatRateBD = new BigDecimal("0.23");
       BigDecimal grossBD = netBD.multiply(BigDecimal.ONE.add(vatRateBD));
       BigDecimal totalGrossBD = grossBD.multiply(new BigDecimal("10000"));
       BigDecimal totalNetFromGrossBD = totalGrossBD.divide(BigDecimal.ONE.add(vatRateBD), 2);

       System.out.println("Using BigDecimal");
       System.out.println("Net price: " + netBD);
       System.out.println("Gross price: " + grossBD);
       System.out.println("Total gross (10,000 pcs): " + totalGrossBD);
       System.out.println("Total net from gross: " + totalNetFromGrossBD);





    }
}
