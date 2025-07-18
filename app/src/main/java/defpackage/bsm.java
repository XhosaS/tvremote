package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsm extends bsq {
    private final bsj a;

    public bsm(brm brmVar, String str) {
        super(brmVar, str);
        this.a = brmVar.b(str);
    }

    @Override // defpackage.brj
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.brj
    public final long b(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final String c(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj, java.lang.AutoCloseable
    public final void close() {
        this.a.a.close();
        this.h = true;
    }

    @Override // defpackage.brj
    public final String d(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        this.a.a.bindBlob(i, bArr);
    }

    @Override // defpackage.brj
    public final void f(int i, double d) {
        o();
        this.a.a.bindDouble(i, d);
    }

    @Override // defpackage.brj
    public final void g(int i, long j) {
        o();
        this.a.a.bindLong(i, j);
    }

    @Override // defpackage.brj
    public final void h(int i) {
        o();
        this.a.a.bindNull(i);
    }

    @Override // defpackage.brj
    public final void i(int i, String str) {
        str.getClass();
        o();
        this.a.a.bindString(i, str);
    }

    @Override // defpackage.brj
    public final void j() {
        o();
    }

    @Override // defpackage.brj
    public final boolean k(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }

    @Override // defpackage.brj
    public final boolean l() {
        o();
        this.a.b.execute();
        return false;
    }

    @Override // defpackage.brj
    public final byte[] m(int i) {
        o();
        bri.b(21, "no row");
        throw new agpb();
    }
}
