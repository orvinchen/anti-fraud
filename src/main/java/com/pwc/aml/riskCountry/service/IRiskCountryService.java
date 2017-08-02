package com.pwc.aml.riskCountry.service;

import com.pwc.aml.riskCountry.entity.RiskCountry;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface IRiskCountryService {
    List<RiskCountry> getAllRiskCountry();
    RiskCountry findSingleCountry(int ID);
    void deleteCountry(RiskCountry riskCountry);
    void importCsvData(MultipartFile file) throws IOException, ParseException;
    void removeAll();
}

