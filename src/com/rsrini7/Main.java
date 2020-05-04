package com.rsrini7;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        IrisFile irisFile = new IrisFile("iris.txt");

        List<Iris> irisDataset =  irisFile.getIrisDataList();

        Knn irisKnn = new Knn();

        Iris newIris = new Iris(4.5,2.3,1.3,0.3,null);

        //Iris newIris = new Iris(5.9,3.0,4.2,1.0,null);

        //Iris newIris = new Iris(1.9,4.0,4.9,1.2,null);

        newIris.setIrisType(irisKnn.getIrisType(3, irisDataset, newIris));

        System.out.println(newIris.toString());

    }
}
