package com.bossturban.webviewmarker;

import android.webkit.JavascriptInterface;

public class TextSelectionController {
	public static final String TAG = "TextSelectionController";
	public static final String INTERFACE_NAME = "TextSelection";
	
	private TextSelectionControlListener mListener;
	
	public TextSelectionController(TextSelectionControlListener listener) {
		mListener = listener;
	}
	
	@JavascriptInterface
	public void jsError(String error) {
		if (mListener != null) {
			mListener.jsError(error);
		}
	}
	@JavascriptInterface
	public void jsLog(String message) {
		if (mListener != null) {
			mListener.jsLog(message);
		}
	}
	@JavascriptInterface
	public void startSelectionMode() {
		if (mListener != null) {
			mListener.startSelectionMode();
		}
	}
	@JavascriptInterface
	public void endSelectionMode() {
		if (mListener != null) {
			mListener.endSelectionMode();
		}
	}
	@JavascriptInterface
	public void selectionChanged(String range, String text, String handleBounds) {
		if (mListener != null) {
			mListener.selectionChanged(range, text, handleBounds);
		}
	}
	@JavascriptInterface
	public void setContentWidth(float contentWidth) {
		if (mListener != null) {
			mListener.setContentWidth(contentWidth);
		}
	}
}