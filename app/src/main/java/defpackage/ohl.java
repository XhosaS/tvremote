package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohl extends oig {
    public Long a;
    public Long b;
    public Long c;
    public oii d;
    private String e;
    private Integer f;

    @Override // defpackage.oig
    public final oik a() {
        String str = this.e;
        if (str != null) {
            return new ohm(str, this.a, this.b, this.c, this.f, this.d);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    @Override // defpackage.oig
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.e = str;
    }

    @Override // defpackage.oig
    public final void c(Integer num) {
        this.f = num;
    }
}
