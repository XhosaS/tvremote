package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkx implements diz {
    public djh a = djh.b;
    public duf b;
    public duf c;

    public dkx() {
        duf dufVar = dmi.a;
        this.b = dmi.a;
        this.c = dmi.b;
    }

    @Override // defpackage.diz
    public final diz a() {
        dkx dkxVar = new dkx();
        dkxVar.a = this.a;
        dkxVar.b = this.b;
        dkxVar.c = this.c;
        return dkxVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.a;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.a = djhVar;
    }

    public final String toString() {
        return "EmittableLinearProgressIndicator(modifier=" + this.a + ", progress=0.0, indeterminate=false, color=" + this.b + ", backgroundColor=" + this.c + ')';
    }
}
