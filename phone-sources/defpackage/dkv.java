package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkv implements diz {
    public djh a = djh.b;
    public duf b;

    public dkv() {
        duf dufVar = dmi.a;
        this.b = dmi.a;
    }

    @Override // defpackage.diz
    public final diz a() {
        dkv dkvVar = new dkv();
        dkvVar.a = this.a;
        dkvVar.b = this.b;
        return dkvVar;
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
        return "EmittableCircularProgressIndicator(modifier=" + this.a + ", color=" + this.b + ')';
    }
}
