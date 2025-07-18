package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drx implements diz {
    public djh a = djh.b;

    @Override // defpackage.diz
    public final diz a() {
        drx drxVar = new drx();
        drxVar.a = this.a;
        return drxVar;
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
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
