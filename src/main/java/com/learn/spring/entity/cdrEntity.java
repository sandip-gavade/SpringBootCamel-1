package com.learn.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CDR_TBL")
public class cdrEntity {

//	<ANUM>006596312794</ANUM>
//	<BNUM></BNUM>
//	<ServiceType>3</ServiceType>
//	<CallCategory>2</CallCategory>
//	<SubscriberType>1</SubscriberType>
//	<StartDatetime>20210708141050</StartDatetime>
//	<UsedAmount>3000</UsedAmount>

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "anum")
	private Long anum;
	
	@Column(name = "bnum")
	private Long bnum;
	
	@Column(name = "serviceType")
	private Integer serviceType;
	
	@Column(name = "callCategory")
	private Integer callCategory;
	
	@Column(name = "subType")
	private Integer subType;
	
	@Column(name = "startDateTime")
	private String startDateTime;
	
	@Column(name = "usedAmount")
	private Integer usedAmount;

}
