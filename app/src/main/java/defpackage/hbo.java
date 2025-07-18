package defpackage;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hbo extends hai {
    final /* synthetic */ hbp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbo(hbp hbpVar) {
        super("UdcDisplayActivity");
        this.a = hbpVar;
    }

    @Override // defpackage.hai, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ((zdv) ((zdv) hbp.a.c()).q("com/google/android/apps/tvsearch/preferences/udcdisplay/UdcDisplayActivityPeer$1", "onRenderProcessGone", 56, "UdcDisplayActivityPeer.java")).J("Render process (priority %d) %s: original URL \"%s\", current URL \"%s\"", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), true != renderProcessGoneDetail.didCrash() ? "killed" : "crashed", webView.getOriginalUrl(), webView.getUrl());
        ((ViewGroup) webView.getParent()).removeView(webView);
        webView.destroy();
        this.a.c.finish();
        return true;
    }
}
