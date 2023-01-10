package service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("ekgs")
@Produces(MediaType.APPLICATION_JSON)
public class EKGService {
    @GET
    @Path("{cpr}")
    public List<PatientEKGS> getEKGs(@PathParam("cpr") String cpr){
        //Making some Dummy Data
        List<Double> sample1 = new ArrayList<>();
        sample1.add(0.0); //First item on list is time - Starts at 0 ms
        sample1.add(10.0); //Second item on list is voltage - 10 mV e.g.
        List<Double> sample2 = new ArrayList<>();
        sample2.add(2.5); //
        sample2.add(100.0); //

        List<List<Double>> samples = new ArrayList<>(); //List of Samples making up the ekg
        samples.add(sample1);
        samples.add(sample2);

        //Now creating a PatientEkgs object (This patient only has one EKG in the db
        PatientEKGS patientEKGS = new PatientEKGS();
        patientEKGS.setSamples( samples);
        patientEKGS.setCpr(cpr); //Faking that we found the patient in the db

        //Making a list of PatientsEkgs
        List<PatientEKGS> ekgList = new ArrayList<>();
        ekgList.add(patientEKGS);
        return ekgList;

    }
}
