package de.baumann.browser.browser;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import de.baumann.browser.view.NinjaWebView;

public class NinjaClickHandler extends Handler {
    private final NinjaWebView webView;

    public NinjaClickHandler(NinjaWebView webView) {
        super(Looper.getMainLooper());
        this.webView = webView;
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public void handleMessage(Message message) {
        super.handleMessage(message);
        webView.getBrowserController().onLongPress(message.getData().getString("url"));
    }
}
