package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cid implements chs {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cid(bxk bxkVar, chs chsVar, int i) {
        this.c = i;
        this.b = bxkVar;
        this.a = chsVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [chs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bxk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [chs, java.lang.Object] */
    @Override // defpackage.chs
    public final cja a() {
        if (this.c == 0) {
            return !((cif) this.a).compareAndSet(cie.NOT_RUN, cie.STARTED) ? qm.J() : this.b.a();
        }
        ?? r0 = this.b;
        bxj bxjVarA = bwv.a();
        bxk bxkVarC = bwv.c(bxjVarA, r0);
        try {
            cja cjaVarA = this.a.a();
            bwv.c(bxjVarA, bxkVarC);
            cjaVarA.getClass();
            return cjaVarA;
        } finally {
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public cid(cif cifVar, chs chsVar, int i) {
        this.c = i;
        this.a = cifVar;
        this.b = chsVar;
    }
}
