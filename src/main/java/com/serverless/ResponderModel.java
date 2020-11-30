package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "devco";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }
        else{
            Matcher sumMatcher1 = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
            if (sumMatcher1.matches()) {
                return String.valueOf(Integer.parseInt(sumMatcher1.group(1)) + Integer.parseInt(sumMatcher1.group(2)));
            }
            else{
                Matcher sumMatcher2 = Pattern.compile(".*which of the following numbers is both a square and a cube: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
                if (sumMatcher2.matches()) {
                    int valor1=Integer.parseInt(sumMatcher2.group(1));
                    int valor2=Integer.parseInt(sumMatcher2.group(2));
                    int valor3=Integer.parseInt(sumMatcher2.group(3));
                    int valor4=Integer.parseInt(sumMatcher2.group(3));
                    if(valor1>valor2){
                        if(valor1>valor3){
                            if(valor1>valor4){
                                return String.valueOf(valor1);
                            }
                            else{
                                return String.valueOf(valor4);
                            }
                        }
                        else{
                            if(valor3>valor4){
                                return String.valueOf(valor3);
                            }
                            else{
                                return String.valueOf(valor4);
                            }
                        }
                    }
                    else{
                        if(valor2>valor3){
                            if(valor2>valor4){
                                return String.valueOf(valor2);
                            }
                            else{
                                return String.valueOf(valor4);
                            }
                        }
                        else{
                            if(valor3>valor4){
                                return String.valueOf(valor3);
                            }
                            else{
                                return String.valueOf(valor4);
                            }
                        }
                    }
                }
                    else{
                        Matcher sumMatcher3 = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
                        if (sumMatcher3.matches()) {
                            int valor1=Integer.parseInt(sumMatcher3.group(1));
                            int valor2=Integer.parseInt(sumMatcher3.group(2));
                            int valor3=Integer.parseInt(sumMatcher3.group(3));
                            int valor4=Integer.parseInt(sumMatcher3.group(3));
                            if(valor1>valor2){
                                if(valor1>valor3){
                                    if(valor1>valor4){
                                        return String.valueOf(valor1);
                                    }
                                    else{
                                        return String.valueOf(valor4);
                                    }
                                }
                                else{
                                    if(valor3>valor4){
                                        return String.valueOf(valor3);
                                    }
                                    else{
                                        return String.valueOf(valor4);
                                    }
                                }
                            }
                            else{
                                if(valor2>valor3){
                                    if(valor2>valor4){
                                        return String.valueOf(valor2);
                                    }
                                    else{
                                        return String.valueOf(valor4);
                                    }
                                }
                                else{
                                    if(valor3>valor4){
                                        return String.valueOf(valor3);
                                    }
                                    else{
                                        return String.valueOf(valor4);
                                    }
                                }
                            }
                    }
                        else{
                            Matcher sumMatcher4 = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);
                            if (sumMatcher4.matches()) {
                                return String.valueOf(Integer.parseInt(sumMatcher4.group(1)) * Integer.parseInt(sumMatcher4.group(2)));
                            }
                        }
                }
            }

        }
        
        return teamName;
    }

}