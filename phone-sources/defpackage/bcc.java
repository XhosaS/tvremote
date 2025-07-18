package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcc implements bad {
    private final bad a;
    private final int b;
    private int c;

    public bcc(bad badVar, int i) {
        this.a = badVar;
        this.b = i;
    }

    @Override // defpackage.bad
    public final Object a() {
        throw null;
    }

    @Override // defpackage.bad
    public final void b(yjz yjzVar, Object obj) {
        this.a.b(yjzVar, obj);
    }

    @Override // defpackage.bad
    public final void c() {
        throw null;
    }

    @Override // defpackage.bad
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.bad
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.bad
    public final void h() {
        if (this.c <= 0) {
            bau.i("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.bad
    public final void i(int i, Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.bad
    public final void j(int i, Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.bad
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.bad
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.bad
    public final /* synthetic */ void f() {
    }
}
