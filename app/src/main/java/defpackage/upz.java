package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upz {
    public final yyf a;
    public yqt b = ypv.a;
    private final yyf c;
    private uqa d;

    public upz() {
        int i = yyk.e;
        this.a = new yyf(4);
        this.c = new yyf(4);
    }

    public final uqe a() {
        if (this.d == null) {
            this.d = new uqa();
        }
        return new uqe(this.b, this.a.f(), this.c.f(), this.d);
    }

    public final void b(String str) {
        this.a.g(new uqc(str));
    }
}
