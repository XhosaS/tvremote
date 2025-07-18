package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlq {
    public final hlr a;
    public final WebView b;
    public hhv c;

    public hlq(LayoutInflater layoutInflater, WebView webView) {
        hlr hlrVar = new hlr(layoutInflater.getContext());
        this.a = hlrVar;
        hlrVar.setDescendantFocusability(262144);
        hlrVar.setId(R.id.fragment_view_wrapper);
        hlrVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        hlrVar.c = false;
        layoutInflater.inflate(R.layout.motion_web_view_progress, (ViewGroup) hlrVar, true);
        this.b = webView;
        hlrVar.d = webView;
        hlrVar.addView(webView);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }
}
