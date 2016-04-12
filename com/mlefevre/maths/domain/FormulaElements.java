package com.mlefevre.maths.domain;

import java.util.ArrayList;
import java.util.List;

public class FormulaElements {

    private int currentIndex = 0;

    private List<FormulaElement> elements = new ArrayList<FormulaElement>();


    public synchronized boolean hasNextElement() {
        return currentIndex < elements.size();
    }

    public synchronized FormulaElement next() {
        if(!hasNextElement()) {
            return null;
        }
        FormulaElement currentElement = elements.get(currentIndex);
        currentIndex++;
        return currentElement;
    }


    public synchronized boolean hasElements() {
        return !elements.isEmpty();
    }

    public synchronized void addElement(FormulaElement element) {
        elements.add(element);
    }

}
