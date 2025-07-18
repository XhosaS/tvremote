package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rtu implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ rtw a;
    private final AtomicReference c;

    public rtu(rtw rtwVar, View view) {
        this.a = rtwVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte[] bArr = null;
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler handlerA = sjl.a();
                rtw rtwVar = this.a;
                handlerA.postAtFrontOfQueue(new rtr(rtwVar, 2));
                sjl.e(new rtr(rtwVar, 3));
                sjl.e(new rmz(this, view, 5, bArr));
            } catch (RuntimeException unused) {
            }
        }
    }
}
