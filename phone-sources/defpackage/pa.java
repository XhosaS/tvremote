package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pa implements bdy {
    public final pd a;
    public yjv b;
    public yjv c;
    final /* synthetic */ hnj d;

    public pa(hnj hnjVar, pd pdVar, yjv yjvVar, yjv yjvVar2) {
        this.d = hnjVar;
        this.a = pdVar;
        this.b = yjvVar;
        this.c = yjvVar2;
    }

    @Override // defpackage.bdy
    public final Object a() {
        b(((pf) this.d.c).e());
        return this.a.a();
    }

    public final void b(pb pbVar) {
        Object objA = this.c.a(pbVar.b());
        if (!((pf) this.d.c).A()) {
            this.a.m(objA, (np) this.b.a(pbVar));
        } else {
            this.a.l(this.c.a(pbVar.a()), objA, (np) this.b.a(pbVar));
        }
    }
}
