package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nv implements bdy {
    public Object a;
    public Object b;
    public my c;
    public oz d;
    public boolean e;
    public boolean f;
    public long g;
    final /* synthetic */ ny h;
    public final bhi i;
    private final bcb j;

    public nv(ny nyVar, Object obj, Object obj2, bhi bhiVar, my myVar) {
        this.h = nyVar;
        this.a = obj;
        this.b = obj2;
        this.i = bhiVar;
        this.j = new bci(obj, bcz.c);
        this.c = myVar;
        this.d = new oz(this.c, bhiVar, this.a, this.b);
    }

    @Override // defpackage.bdy
    public final Object a() {
        return this.j.a();
    }

    public final void b(Object obj) {
        this.j.b(obj);
    }
}
