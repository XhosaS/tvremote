package defpackage;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hai extends WebViewClient {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/webkit/CommonWebViewClient");
    private final String b;

    public hai(String str) {
        this.b = str;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        if (renderProcessGoneDetail.didCrash()) {
            ((zdv) ((zdv) a.c()).o(zfi.a, this.b).q("com/google/android/apps/tvsearch/platform/webkit/CommonWebViewClient", "onRenderProcessGone", 23, "CommonWebViewClient.kt")).I("Render process crashed: priority %d, original URL \"%s\", current URL \"%s\"", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), webView.getOriginalUrl(), webView.getUrl());
        } else {
            ((zdv) ((zdv) a.b()).o(zfi.a, this.b).q("com/google/android/apps/tvsearch/platform/webkit/CommonWebViewClient", "onRenderProcessGone", 33, "CommonWebViewClient.kt")).I("Render process killed: priority %d, original URL \"%s\", current URL \"%s\"", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), webView.getOriginalUrl(), webView.getUrl());
        }
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }
}
