package com.example.a236333_hw3.Compiler.Command;
import com.example.a236333_hw3.Compiler.QREnums;

public class RCIfBoxColorCommand {
    private QREnums color;      // can only be VAR_COLOR_...

    public QREnums getColor() {
        return color;
    }

    public void setColor(QREnums color) {
        this.color = color;
    }
}
