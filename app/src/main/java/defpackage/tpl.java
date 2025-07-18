package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpl {
    public Boolean a;
    public boolean b;
    private final yyf c;
    private final yyf d;

    public tpl() {
        int i = yyk.e;
        this.c = new yyf(4);
        this.d = new yyf(4);
        this.b = false;
    }

    public final tpm a() {
        this.a.getClass();
        return new tpm(this.a.booleanValue(), this.b, this.c.f(), this.d.f());
    }

    public final void b(tpr tprVar) {
        this.a.getClass();
        this.c.g(tprVar);
    }

    public final void c() {
        yqw.M(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
