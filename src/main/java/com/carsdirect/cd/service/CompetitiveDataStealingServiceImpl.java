package com.carsdirect.cd.service;

public class CompetitiveDataStealingServiceImpl implements CompetitiveDataStealingService {

	/*
	 * Interfaces are referenced in the Dependency Injection beans.xml files
	 * but are set to instances of the Impl classes with Spring autowire
	 */
	
	/*
	 * 1. All Config data managed by business pulled from 
	 * the VendorConfigData was loaded into memory via
	 * hash maps and collections.
	 * 
	 * A combination of zipcodes, make, model, year
	 * for each competitor VendorID
	 * 
	 * DB Logs were started for each combination.
	 * 
	 * 2. All Vendor IDs (ie. ChromeTrimID for TrueCar)
	 * was pulled for that make/model/year, using 
	 * detection avoidance, anonymous proxies
	 * 
	 * 3. All Competitor Data was pulled for each 
	 * region according to each mmy configuration, using 
	 * detection avoidance, anonymous proxies. All 
	 * authentication mechanisms were bypassed.
	 * 
	 * 4. Raw log collection data and XML/JSON parsed 
	 * collected data was stored in Oracle. In this 
	 * case MySQL.
	 */
	
}
