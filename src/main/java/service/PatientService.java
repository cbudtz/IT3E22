package service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Path("patients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PatientService {

    @GET
    public List<Patient> getPatient(){
        //TODO Dummy data - replace!
        ArrayList<Patient> patients = new ArrayList<>();
        Patient patient = new Patient();
        patient.cpr="1110109996";
        patient.name="Juliane Test Jørgensen";
        patients.add(patient);
        //---
        return patients;
    }

    /**
     * Verdens dummeste navne converter!
     * @param patient
     * @return
     */
    @POST
    public Patient postPatient(Patient patient){
        String navn = patient.getName();
        navn = "Fru. " + navn;
        patient.setName(navn);
        return patient;
    }

}
