package com.octo.vmware.entities;

import java.util.List;

import vim2.ManagedObjectReference;

public class VmInfo {

	private String name;
	private String uuid;
	
	private int ram;
	private int cpu;
	
	private String status;
	
	private String guestHostname;
	private String guestIp;
	private String guestFullName;
	private String guestToolsStatus;
	
	private List<String> datastores;
	private List<String> networks;
	
	private ManagedObjectReference managedObjectReference;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGuestHostname() {
		return guestHostname;
	}

	public void setGuestHostname(String guestHostname) {
		this.guestHostname = guestHostname;
	}

	public String getGuestIp() {
		return guestIp;
	}

	public void setGuestIp(String guestIp) {
		this.guestIp = guestIp;
	}

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getGuestToolsStatus() {
		return guestToolsStatus;
	}

	public void setGuestToolsStatus(String guestToolsStatus) {
		this.guestToolsStatus = guestToolsStatus;
	}

	public List<String> getDatastores() {
		return datastores;
	}

	public void setDatastores(List<String> datastores) {
		this.datastores = datastores;
	}

	public List<String> getNetworks() {
		return networks;
	}

	public void setNetworks(List<String> networks) {
		this.networks = networks;
	}

	public ManagedObjectReference getManagedObjectReference() {
		return managedObjectReference;
	}

	public void setManagedObjectReference(ManagedObjectReference managedObjectReference) {
		this.managedObjectReference = managedObjectReference;
	}
	
}