package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtv extends dje {
    public djh a = djh.b;

    @Override // defpackage.diz
    public final diz a() {
        dtv dtvVar = new dtv();
        dtvVar.a = this.a;
        dtvVar.d = this.d;
        dtvVar.e = this.e;
        dtvVar.f = this.f;
        return dtvVar;
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
        return "EmittableText(" + this.d + ", style=" + this.e + ", modifier=" + this.a + ", maxLines=" + this.f + ')';
    }
}
