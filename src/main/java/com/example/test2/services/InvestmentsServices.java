package com.example.test2.services;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.test2.dto.InvestmentsDTO;
import com.example.test2.pojo.Investments;
public interface InvestmentsServices {
	public String addInvestments(@RequestBody InvestmentsDTO objInvestments);
    public InvestmentsDTO getInvestments(@PathVariable("userId") int userId);
    public List<Investments> getinvestment(@PathVariable("userId") int userid);
    public String removeInvestments(@PathVariable("investmentid") int investmentid);

}
