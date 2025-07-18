package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugq implements ufv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ugq(tqt tqtVar, ufv ufvVar, int i) {
        this.c = i;
        this.b = tqtVar;
        this.a = ufvVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ufv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, tqt] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ufv] */
    @Override // defpackage.ufv
    public final uhp a() {
        if (this.c == 0) {
            return !((ugs) this.a).compareAndSet(ugr.NOT_RUN, ugr.STARTED) ? sfy.A() : this.b.a();
        }
        ?? r0 = this.b;
        yau yauVarD = tqg.d();
        tqt tqtVarE = tqg.e(yauVarD, r0);
        try {
            uhp uhpVarA = this.a.a();
            tqg.e(yauVarD, tqtVarE);
            uhpVarA.getClass();
            return uhpVarA;
        } finally {
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public ugq(ugs ugsVar, ufv ufvVar, int i) {
        this.c = i;
        this.a = ugsVar;
        this.b = ufvVar;
    }
}
