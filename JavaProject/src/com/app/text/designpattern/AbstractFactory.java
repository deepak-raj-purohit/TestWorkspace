package com.app.text.designpattern;

public class AbstractFactory {

	public static void main(String[] args) {
		Computer computer = new Computer(createComputerFactory(1));
	}
	
	public static CPUFactory createComputerFactory(int i){
		CPUFactory cPUFactory = null;
		if(i==0) {
			cPUFactory = new AmdFactory();
		} else if(i==1){
			cPUFactory = new IntelFactory();
		}
		return cPUFactory;
	}
	
}

class Computer {
	CPU cpu;
	
	public Computer(CPUFactory cpuFactory) {
		cpu = cpuFactory.getCPU();
		cpu.process();
	}
	
}

interface CPUFactory {
	public CPU getCPU();
}


class AmdFactory implements CPUFactory{
	public CPU getCPU() {
		return new AmdCPU(); 
	}
}

class IntelFactory implements CPUFactory{
	public CPU getCPU() {
		return new IntelCPU(); 
	}
}

interface CPU {
	public void process();
}

class AmdCPU implements CPU {
	public void process() {
		System.out.println("Amd is processing");
	}
	
}

class IntelCPU implements CPU {
	public void process() {
		System.out.println("Intel is processing");
	}
}
