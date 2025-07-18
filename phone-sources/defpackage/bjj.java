package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjj extends bjm {
    public bgf a;
    public int b;
    public int c;

    public bjj(long j, bgf bgfVar) {
        super(j);
        this.a = bgfVar;
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return c(bjb.b().v());
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        synchronized (bjf.a) {
            bjmVar.getClass();
            bjj bjjVar = (bjj) bjmVar;
            this.a = bjjVar.a;
            this.b = bjjVar.b;
            this.c = bjjVar.c;
        }
    }

    @Override // defpackage.bjm
    public final bjm c(long j) {
        return new bjj(j, this.a);
    }
}
