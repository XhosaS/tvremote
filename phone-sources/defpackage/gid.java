package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gid extends gih {
    private final gib a;

    public gid(ghk ghkVar, String str) {
        super(ghkVar, str);
        this.a = ghkVar.j(str);
    }

    @Override // defpackage.ghi
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.ghi
    public final long b(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final String c(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        p();
    }

    @Override // defpackage.ghi
    public final String d(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        this.a.a(i, bArr);
    }

    @Override // defpackage.ghi
    public final void f(int i, double d) {
        o();
        this.a.b(i, d);
    }

    @Override // defpackage.ghi
    public final void g(int i, long j) {
        o();
        this.a.c(i, j);
    }

    @Override // defpackage.ghi
    public final void h(int i) {
        o();
        this.a.d(i);
    }

    @Override // defpackage.ghi
    public final void i(int i, String str) {
        str.getClass();
        o();
        this.a.e(i, str);
    }

    @Override // defpackage.ghi
    public final void j() {
        o();
    }

    @Override // defpackage.ghi
    public final boolean k(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }

    @Override // defpackage.ghi
    public final boolean l() {
        o();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.ghi
    public final byte[] m(int i) {
        o();
        gez.u(21, "no row");
        throw new yfs();
    }
}
