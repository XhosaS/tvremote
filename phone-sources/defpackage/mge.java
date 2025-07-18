package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mge implements cxf {
    public Object a;
    private final View b;
    private final long c = SystemClock.elapsedRealtime();
    private rin d;

    public mge(View view) {
        this.b = view;
    }

    protected abstract Bitmap a(Bitmap bitmap);

    public void b(lwq lwqVar, idf idfVar, Executor executor) {
        tju tjuVar = lwqVar.e;
        if (tjuVar == null || !tjuVar.equals(this.a)) {
            this.a = tjuVar;
            byte[] bArr = null;
            e(null);
            if (tjuVar != null) {
                mjo.e(new krn(this, lwqVar, 10, bArr), new iei(idfVar, tjuVar), executor);
            }
        }
    }

    protected abstract void c(Bitmap bitmap);

    public void d() {
        this.a = null;
        e(null);
    }

    public final void e(rin rinVar) {
        if (rin.o(this.d, rinVar)) {
            return;
        }
        rin rinVar2 = this.d;
        this.d = rinVar;
        Bitmap bitmapM = rin.m(rinVar);
        if (bitmapM != null) {
            bitmapM = a(bitmapM);
        }
        c(bitmapM);
        View view = this.b;
        view.setVisibility(0);
        if (SystemClock.elapsedRealtime() - this.c > 1000) {
            view.setAlpha(0.0f);
            cxe cxeVarD = cww.d(view);
            cxeVarD.d(300L);
            cxeVarD.c(1.0f);
            cxeVarD.e(this);
        }
        rin.n(rinVar2);
    }

    @Override // defpackage.cxf
    public final void onAnimationCancel(View view) {
        this.b.setAlpha(1.0f);
    }

    @Override // defpackage.cxf
    public final void onAnimationEnd(View view) {
    }

    @Override // defpackage.cxf
    public final void onAnimationStart(View view) {
    }
}
