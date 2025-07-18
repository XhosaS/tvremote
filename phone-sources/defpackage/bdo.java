package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdo extends bjm {
    public long a;

    public bdo(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return c(bjb.b().v());
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        this.a = ((bdo) bjmVar).a;
    }

    @Override // defpackage.bjm
    public final bjm c(long j) {
        return new bdo(j, this.a);
    }
}
