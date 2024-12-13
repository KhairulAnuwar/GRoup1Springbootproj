package sg.edu.ntu.ftbsolutionscrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.ntu.ftbsolutionscrm.entity.ResaleHdb;
import sg.edu.ntu.ftbsolutionscrm.repository.ResaleHDBRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ResaleHDBService {

    @Autowired
    private ResaleHDBRepository resaleHDBRepository;

    public List<ResaleHdb> getAllResaleHDB() {
        return resaleHDBRepository.findAll();
    }

    public Optional<ResaleHdb> getResaleHDBById(Long id) {
        return resaleHDBRepository.findById(id);
    }

    public ResaleHdb updatResaleHDB(Long id, ResaleHdb resaleHDB) {
        ResaleHdb resaleHDBToUpdate = resaleHDBRepository.findById(id).get();
        resaleHDBToUpdate.setId(id);
        resaleHDBToUpdate.setBlock(resaleHDB.getBlock());
        resaleHDBToUpdate.setFlatModel(resaleHDB.getFlatModel());
        resaleHDBToUpdate.setFlatType(resaleHDB.getFlatType());
        resaleHDBToUpdate.setFloorAreaSqm(resaleHDB.getFloorAreaSqm());
        resaleHDBToUpdate.setLeaseCommenceDate(resaleHDB.getLeaseCommenceDate());
        resaleHDBToUpdate.setMonth(resaleHDB.getMonth());
        resaleHDBToUpdate.setRemainingLease(resaleHDB.getRemainingLease());
        resaleHDBToUpdate.setResalePrice(resaleHDB.getResalePrice());
        resaleHDBToUpdate.setStoreyRange(resaleHDB.getStoreyRange());
        resaleHDBToUpdate.setStreetName(resaleHDB.getStreetName());
        resaleHDBToUpdate.setTown(resaleHDB.getTown());
        return resaleHDBRepository.save(resaleHDBToUpdate);
    }

    public ResaleHdb saveResaleHDB(ResaleHdb resaleHDB) {
        return resaleHDBRepository.save(resaleHDB);
    }

    public void deleteResaleHDB(Long id) {
        resaleHDBRepository.deleteById(id);
    }
}
