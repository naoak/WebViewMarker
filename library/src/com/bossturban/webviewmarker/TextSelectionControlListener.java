package com.bossturban.webviewmarker;

public interface TextSelectionControlListener {
	void jsError(String error);
	void jsLog(String message);
	void startSelectionMode();
	void endSelectionMode();
	
	/**
	 * Tells the listener to show the context menu for the given range and selected text.
	 * The bounds parameter contains a json string representing the selection bounds in the form 
	 * { 'left': leftPoint, 'top': topPoint, 'right': rightPoint, 'bottom': bottomPoint }
	 * @param range
	 * @param text
	 * @param handleBounds
	 * @param isReallyChanged
	 */
	void selectionChanged(String range, String text, String handleBounds, boolean isReallyChanged);
	
	void setContentWidth(float contentWidth);
}
