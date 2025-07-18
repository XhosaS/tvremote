package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlr extends hle {
    private static final zdy g = zdy.h("com/google/android/apps/tvsearch/results/motion/MotionWebViewFrame");

    public hlr(Context context) {
        super(context);
    }

    @Override // defpackage.hle
    public final void c(int i) {
        View viewFindViewById;
        super.c(i);
        if (i <= 0 || (viewFindViewById = findViewById(R.id.progress)) == null) {
            return;
        }
        int height = viewFindViewById.getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        if (i > height) {
            int i2 = i - height;
            int i3 = i2 / 2;
            marginLayoutParams.setMargins(0, i3, 0, i2 - i3);
        }
        if (viewFindViewById.getVisibility() == 8) {
            viewFindViewById.setVisibility(4);
        }
    }

    @Override // defpackage.hle
    public final void e() {
        View fragmentView = getFragmentView();
        if (fragmentView instanceof WebView) {
            ((WebView) fragmentView).setWebViewClient(new hai("MotionWebViewFrame"));
        }
        super.e();
    }

    @Override // defpackage.hle
    public final void f() {
        super.f();
        WebView webView = (WebView) getFragmentView();
        if (webView == null || webView.getHeight() != 0) {
            return;
        }
        ((zdv) ((zdv) g.d()).q("com/google/android/apps/tvsearch/results/motion/MotionWebViewFrame", "stopMonitoringView", 63, "MotionWebViewFrame.java")).u("webView had zero height");
    }

    @JavascriptInterface
    public void setWebViewHeight(float f) {
        final int iRound = (int) (Math.round(f) * getResources().getDisplayMetrics().density);
        if (iRound > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hlo
                @Override // java.lang.Runnable
                public final void run() {
                    hlr hlrVar = this.a;
                    WebView webView = (WebView) hlrVar.getFragmentView();
                    if (webView != null) {
                        webView.getLayoutParams().height = iRound;
                        hlrVar.requestLayout();
                    }
                }
            });
        }
    }
}
