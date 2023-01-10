package service;

import java.util.List;

public class PatientEKGS {
    private String cpr;
    private List<List<Double>> samples;

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public List<List<Double>> getSamples() {
        return samples;
    }

    public void setSamples(List<List<Double>> samples) {
        this.samples = samples;
    }


}
