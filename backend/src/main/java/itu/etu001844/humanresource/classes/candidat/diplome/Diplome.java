package itu.etu001844.humanresource.classes.candidat.diplome;

import java.util.UUID;

import itu.etu001844.humanresource.classes.candidat.Candidat;
import itu.etu001844.humanresource.expections.notfounds.CandidatNotFoundException;
import itu.etu001844.humanresource.expections.notfounds.DiplomeTypeNotFoundException;
import itu.etu001844.humanresource.expections.notfounds.EcoleNotFoundException;
import itu.etu001844.humanresource.expections.notfounds.SpecialiteNotFoundException;
import itu.etu001844.humanresource.repositories.candidat.CandidatRepository;
import itu.etu001844.humanresource.repositories.candidat.diplome.DiplomeTypeRepository;
import itu.etu001844.humanresource.repositories.candidat.diplome.EcoleRepository;
import itu.etu001844.humanresource.repositories.candidat.diplome.SpecialiteRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID ownerID;
    private UUID originID;
    private UUID diplomeTypeID;
    private UUID speciliteID;
    private String file;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOriginID() {
        return originID;
    }

    public void setOriginID(UUID originID) {
        this.originID = originID;
    }

    public UUID getDiplomeTypeID() {
        return diplomeTypeID;
    }

    public void setDiplomeTypeID(UUID diplomeTypeID) {
        this.diplomeTypeID = diplomeTypeID;
    }

    public UUID getSpeciliteID() {
        return speciliteID;
    }

    public void setSpeciliteID(UUID speciliteID) {
        this.speciliteID = speciliteID;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Diplome() {
    }

    public Diplome(UUID ownerID, UUID originID, UUID diplomeTypeID, UUID speciliteID, String file) {
        this.ownerID = ownerID;
        this.originID = originID;
        this.diplomeTypeID = diplomeTypeID;
        this.speciliteID = speciliteID;
        this.file = file;
    }

    public Ecole getOrigin(EcoleRepository repository) throws EcoleNotFoundException{
        return repository.findById(this.getOriginID()).orElseThrow(() -> new EcoleNotFoundException(this.getOriginID()));    
    }

    public DiplomeType getDiplomeType(DiplomeTypeRepository repository) throws DiplomeTypeNotFoundException {
        return repository.findById(this.getDiplomeTypeID()).orElseThrow(() -> new DiplomeTypeNotFoundException(this.getDiplomeTypeID()));
    }

    public Specialite getSpecialite(SpecialiteRepository repository) throws SpecialiteNotFoundException{
        return repository.findById(this.getSpeciliteID()).orElseThrow(() -> new SpecialiteNotFoundException(this.getSpeciliteID()));
    }

    public UUID getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(UUID ownerID) {
        this.ownerID = ownerID;
    }

    public Candidat getOwner(CandidatRepository repository) throws CandidatNotFoundException{
        return repository.findById(this.getOwnerID()).orElseThrow(() -> new CandidatNotFoundException(this.getOwnerID()));
    }
}
