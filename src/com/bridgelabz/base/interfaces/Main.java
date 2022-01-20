package com.bridgelabz.base.interfaces;

public class Main {

	public static void main(String[] args) {
		IPhotos photos = new Printer();
		photos.print("my photos");
		IDocument document = new Printer();
		document.printPdf("my pdf");
		document.print(3);
		
		photos.printAnyDoc("something");
		document.printAnyDoc(1234);
		
		Printer printer = new Printer();
	}
}
