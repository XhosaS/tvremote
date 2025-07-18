package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlp extends hai {
    final /* synthetic */ View a;
    final /* synthetic */ hlq b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlp(hlq hlqVar, View view) {
        super("MotionWebViewFrame");
        this.a = view;
        this.b = hlqVar;
        this.c = 0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            hhv hhvVar = this.b.c;
            if (hhvVar != null) {
                hhw hhwVar = hhvVar.a;
                hhwVar.ao.c(rpm.eL(), abqb.OK, null, null);
                hhwVar.aq.m(gmc.Q);
            }
            View view = this.a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hhv hhvVar;
        if (this.c == 0 && (hhvVar = this.b.c) != null) {
            hhw hhwVar = hhvVar.a;
            hhwVar.ao.b(rpm.dJ(), null, null);
            hhwVar.aq.l(gmc.Q);
        }
        this.c = Math.max(this.c, 1);
        webView.getLayoutParams().height = 0;
        View view = this.a;
        if (view == null || view.getVisibility() != 4) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.c++;
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
