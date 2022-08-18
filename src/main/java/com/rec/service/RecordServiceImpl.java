package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService { 
	
	//Dummy list of records
	
	List <Record> list= List.of(
			
			new Record(1L, "Tata@gmail.com","Tata Motors",1311L),
			new Record(2L, "BPl@gmail.com","BPL",1312L),
			new Record(3L, "JBL@gmail.com","JBL",1312L),
			new Record(4L, "Axis@gmail.com","Axis",1313L),
			new Record(5L, "REdMI@gmail.com","REDMI",1314L),
			new Record(6L, "Phonix@gmail.com","Phonix",1315L),
			new Record(7L, "Apple@gmail.com","Apple",1316L),
			new Record(8L, "Wipro@gmail.com","Wipro",1316L)
			);
	
	@Override
	public List <Record> getRecordOfEmployee(Long eId) {
		// TODO Auto Generated methods stub
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
		
		
	}
	
	

}
