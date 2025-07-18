package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rtv implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ rtw a;
    private final AtomicReference b;

    public rtv(rtw rtwVar, View view) {
        this.a = rtwVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler handlerA = sjl.a();
            rtw rtwVar = this.a;
            handlerA.postAtFrontOfQueue(new rtr(rtwVar, 4));
            sjl.e(new rtr(rtwVar, 5));
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }
}
