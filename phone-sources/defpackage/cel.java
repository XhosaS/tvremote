package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cel implements ScrollCaptureCallback {
    public final cff a;
    public final cep b;
    public final cvw c;
    private final cmg d;
    private final View e;
    private final yow f;

    public cel(cff cffVar, cmg cmgVar, yow yowVar, cvw cvwVar, View view) {
        this.a = cffVar;
        this.d = cmgVar;
        this.c = cvwVar;
        this.e = view;
        this.f = new ywq(((ywq) yowVar).a.plus(cen.b));
        this.b = new cep(cmgVar.a(), new cek(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r11, defpackage.cmg r12, defpackage.yih r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cel.a(android.view.ScrollCaptureSession, cmg, yih):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ykr.q(this.f, yqr.a, 0, new aoa(this, runnable, (yih) null, 19), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        yqe yqeVarQ = ykr.q(this.f, null, 0, new ajo(this, scrollCaptureSession, rect, consumer, (yih) null, 5), 3);
        yqeVarQ.r(new cbq(cancellationSignal, 6));
        cancellationSignal.setOnCancelListener(new cem(yqeVarQ, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(bnj.n(this.d));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = 0.0f;
        this.c.l(true);
        runnable.run();
    }
}
