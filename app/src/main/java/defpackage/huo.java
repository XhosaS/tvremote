package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huo extends hui implements hmx {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/web/webview/WebViewFragment");
    few a;

    public static void aB(few fewVar, String str) {
        fewVar.h(new hum(str));
        fewVar.f();
    }

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (s() == null) {
            ((zdv) ((zdv) b.c()).q("com/google/android/apps/tvsearch/results/web/webview/WebViewFragment", "onCreateView", 83, "WebViewFragment.java")).u("#onCreateView called without Context");
            return null;
        }
        WebView webView = new WebView(s());
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return webView;
    }

    @Override // defpackage.hmx
    public final boolean aF() {
        return true;
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        String string = hkb.b(this).getString("page_url", "");
        if (TextUtils.isEmpty(string)) {
            ((zdv) ((zdv) b.c()).q("com/google/android/apps/tvsearch/results/web/webview/WebViewFragment", "onViewCreated", 103, "WebViewFragment.java")).u("Web Url argument is empty. Aborting url loading");
            return;
        }
        WebView webView = (WebView) view;
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.requestFocus();
        webView.setWebViewClient(new hun(this));
        webView.setOnKeyListener(new View.OnKeyListener() { // from class: hul
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                WebView webView2 = (WebView) view2;
                if (keyEvent.getAction() != 0 || !webView2.canGoBack()) {
                    return false;
                }
                huo huoVar = this.a;
                webView2.goBack();
                few fewVar = huoVar.a;
                if (fewVar == null) {
                    return true;
                }
                fewVar.f();
                return true;
            }
        });
        webView.loadUrl(string);
    }

    @Override // defpackage.bq
    public final void er() {
        this.P = true;
        this.a = null;
    }

    @Override // defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        if (ep() instanceof few) {
            this.a = (few) ep();
        }
    }

    @Override // defpackage.hmx
    public final /* synthetic */ void aD(bq bqVar) {
    }
}
