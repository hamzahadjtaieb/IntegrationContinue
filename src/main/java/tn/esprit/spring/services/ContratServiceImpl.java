package tn.esprit.spring.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Log4j.AffichageLog;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {

	private static final Logger l = Logger.getLogger(AffichageLog.class);

	@Autowired
	ContratRepository contratRepository;

	public List<Contrat> getAllContrats() {
		l.info("Getting the list of contrats");
		return (List<Contrat>) contratRepository.findAll();
	}

}
