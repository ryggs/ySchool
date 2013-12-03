package org.yarlithub.yschool.analytics.core;

import org.primefaces.model.chart.CartesianChartModel;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kana
 * Date: 11/30/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class OLSubjectPrediction {
    private ClassroomSubject olSubject;
    private List<String> predictedGrade = new ArrayList<String>();
    private List<Double> termMarks = new ArrayList<Double>();
    private List<Integer> termMarksLower = new ArrayList<Integer>();
    private List<Integer> termMarksUpper = new ArrayList<Integer>();
    private CartesianChartModel linearModelTermMarks;

    public CartesianChartModel getLinearModelTermMarks() {
        return linearModelTermMarks;
    }

    public void setLinearModelTermMarks(CartesianChartModel linearModelTermMarks) {
        this.linearModelTermMarks = linearModelTermMarks;
    }

    public List<Integer> getTermMarksLower() {
        return termMarksLower;
    }

    public void setTermMarksLower(List<Integer> termMarksLower) {
        this.termMarksLower = termMarksLower;
    }

    public List<Integer> getTermMarksUpper() {
        return termMarksUpper;
    }

    public void setTermMarksUpper(List<Integer> termMarksUpper) {
        this.termMarksUpper = termMarksUpper;
    }

    public ClassroomSubject getOlSubject() {
        return olSubject;
    }

    public void setOlSubject(ClassroomSubject olSubject) {
        this.olSubject = olSubject;
    }

    public List<String> getPredictedGrade() {
        return predictedGrade;
    }

    public void setPredictedGrade(List<String> predictedGrade) {
        this.predictedGrade = predictedGrade;
    }

    public List<Double> getTermMarks() {
        return termMarks;
    }

    public void setTermMarks(List<Double> termMarks) {
        this.termMarks = termMarks;
    }



}