package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes.dex */
class bgx extends WebView {
    public bgx(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
