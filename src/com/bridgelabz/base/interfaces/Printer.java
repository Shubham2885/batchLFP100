package com.bridgelabz.base.interfaces;

public class Printer implements IPhotos, IDocument {

	@Override
	public void print(String photos) {
		for(int i=0;i<maxPhotos;i++) {
			System.out.println("Print = "+photos);
		}
	}

	@Override
	public void print(Integer xlxs) {
		System.out.println("Print xlxs = "+xlxs);
	}

	@Override
	public void printPdf(String pdf) {
		System.out.println("Print = "+pdf);
	}

	@Override
	public void printAnyDoc(Object object) {
		System.out.println("Print  = "+object);
	}

}
