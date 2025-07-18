package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxi {
    public final cxk a;
    private final cxn b;

    protected cxi(cxk cxkVar, cxn cxnVar) {
        this.a = cxkVar;
        this.b = cxnVar;
    }

    public abstract void a(cxk cxkVar);

    public final cxl d() {
        cxk cxkVar = this.a;
        cxkVar.b = this.b;
        a(cxkVar);
        return cxkVar.a();
    }
}
