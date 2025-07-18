package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dja extends dje {
    public dit b;
    public djh a = djh.b;
    public boolean c = true;

    @Override // defpackage.diz
    public final diz a() {
        dja djaVar = new dja();
        djaVar.a = this.a;
        djaVar.d = this.d;
        djaVar.e = this.e;
        djaVar.b = this.b;
        djaVar.c = this.c;
        djaVar.f = this.f;
        return djaVar;
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
        return "EmittableButton('" + this.d + "', enabled=" + this.c + ", style=" + this.e + ", colors=" + this.b + " modifier=" + this.a + ", maxLines=" + this.f + ')';
    }
}
