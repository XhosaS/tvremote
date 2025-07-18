package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohn extends oih {
    public yzq a;
    public oif b;
    public String c;
    public Integer d;
    private int e;
    private byte f;

    @Override // defpackage.oih
    public final oii a() {
        yzq yzqVar;
        if (this.f == 1 && (yzqVar = this.a) != null) {
            return new oho(yzqVar, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" templateUris");
        }
        if (this.f == 0) {
            sb.append(" materializationCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.oih
    public final void b(int i) {
        this.e = i;
        this.f = (byte) 1;
    }

    @Override // defpackage.oih
    public final void c(yzq yzqVar) {
        if (yzqVar == null) {
            throw new NullPointerException("Null templateUris");
        }
        this.a = yzqVar;
    }
}
