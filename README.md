Cloned from the original to fix a couple of errors. See commit notes. - gregko.

WebViewMarker
=============

Text selection support library for Android WebView. The core logic is the same as [BTAndroidWebViewSelection](https://github.com/btate/BTAndroidWebViewSelection).

## What's the difference?
- More modular (not inherit webview)
- Not depend quick action lib (for actionbar support)
- Mimic ICS native text selection handlers
- Smart tap selection for CJK characters

## Requirement
Tested on API 8-19 (Android 2.2-4.4.2).

## How to use
See `samples/demos` directory.

## Libraries
This project uses the following libraries.
- [rangy](https://github.com/timdown/rangy) by Tim Down
- [drag and drop](https://blahti.wordpress.com/2011/01/17/moving-views-part-2/) library by Bill Lahti

## License
MIT License.
