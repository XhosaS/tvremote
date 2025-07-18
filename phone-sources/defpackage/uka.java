package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uka {
    public final Object a;
    public final /* synthetic */ Object b;
    public final Object c;

    public uka(ukb ukbVar, ukd ukdVar) {
        this.b = ukbVar;
        this.c = new kwy((byte[]) null, (byte[]) null);
        this.a = ukdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a() {
        Object obj = this.b;
        synchronized (((ukb) obj).b) {
            a.ab(((ukb) obj).c == 0);
            ((ukb) obj).c = 1;
        }
        ?? r0 = this.b;
        ((ukb) r0).a.t(new ujz(this)).m(r0, new ofn(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        ((Handler) this.c).removeCallbacks(this.a);
    }

    public uka(mje mjeVar) {
        this.b = mjeVar;
        this.c = new Handler(Looper.getMainLooper());
        a.aD(true, "timeout must be strictly positive");
        this.a = new ljl(this, 20, null);
    }
}
