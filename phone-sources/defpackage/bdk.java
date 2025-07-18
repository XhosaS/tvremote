package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdk extends bjm {
    public float a;

    public bdk(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return c(bjb.b().v());
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        this.a = ((bdk) bjmVar).a;
    }

    @Override // defpackage.bjm
    public final bjm c(long j) {
        return new bdk(j, this.a);
    }
}
