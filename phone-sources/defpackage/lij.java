package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lij implements yfo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lij(Application application, lfn lfnVar, lie lieVar, int i) {
        this.d = i;
        this.a = application;
        this.c = lfnVar;
        this.b = lieVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rvy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, lfn] */
    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        int i = this.d;
        if (i == 0) {
            return new tdz(new uoo((lfn) this.a, (rvy) this.b, (lie) this.c));
        }
        if (i != 1) {
            int i2 = rtd.e;
            return ((Boolean) this.c.b()).booleanValue() ? (rsq) this.a.get() : this.b.b();
        }
        tst tstVarI = tst.i(false);
        Context context = (Context) this.a;
        rwd rwdVar = new rwd(context, tstVarI, new rwb(context.getPackageName()), new ClearcutMetricSnapshotTransmitter());
        ?? r3 = this.c;
        trk trkVar = trk.a;
        return new rmw(new lii(new lij((lfn) r3, rwdVar, (lie) this.b, 0), 8), trkVar, tst.i(new lii(r3, 0)), tst.i(new lii(r3, 2)), tst.i(new lii(r3, 3)), trkVar, trkVar, tst.i(new lii(r3, 4)), tst.i(new lii(r3, 5)), tst.i(new lii(r3, 7)), trkVar, trkVar, trkVar, tst.i(new lii(r3, 6)), trkVar);
    }

    public /* synthetic */ lij(lfn lfnVar, rvy rvyVar, lie lieVar, int i) {
        this.d = i;
        this.a = lfnVar;
        this.b = rvyVar;
        this.c = lieVar;
    }

    public /* synthetic */ lij(yfo yfoVar, ttm ttmVar, yfo yfoVar2, int i) {
        this.d = i;
        this.c = yfoVar;
        this.a = ttmVar;
        this.b = yfoVar2;
    }
}
