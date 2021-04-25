package com.opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class Example {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		VideoCapture cap = new VideoCapture(-1);
		Mat image = new Mat();
		if(cap.isOpened()) {
			cap.read(image);
			Imgcodecs.imwrite("kerem.png", image);
			cap.release();
		}
	}
}
