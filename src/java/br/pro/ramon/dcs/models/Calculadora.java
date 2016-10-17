package br.pro.ramon.dcs.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calculadora {

    private double n1, n2;
    private String op;

    protected Calculadora() {
    }

    public Calculadora(double n1, double n2, String op) {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
    }

    public double calcula() {
        switch (op) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                throw new IllegalArgumentException(op);
        }
    }

    @XmlAttribute
    public double getN1() {
        return n1;
    }

    @XmlAttribute
    public double getN2() {
        return n2;
    }

    @XmlAttribute
    public String getOp() {
        return op;
    }

    @XmlElement
    public double getResultado() {
        return calcula();
    }

}
