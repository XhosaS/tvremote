package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdm extends bjm {
    public int a;

    public bdm(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return c(bjb.b().v());
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        this.a = ((bdm) bjmVar).a;
    }

    @Override // defpackage.bjm
    public final bjm c(long j) {
        return new bdm(j, this.a);
    }
}
