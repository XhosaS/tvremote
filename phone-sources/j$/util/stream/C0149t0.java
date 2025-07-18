package j$.util.stream;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0149t0 extends AbstractC0151u0 {
    public final Object[] c;

    public C0149t0(H h, Object[] objArr) {
        super(h);
        this.c = objArr;
    }

    @Override // j$.util.stream.AbstractC0151u0
    public final void a() {
        this.a.m(this.c, this.b);
    }

    @Override // j$.util.stream.AbstractC0151u0
    public final AbstractC0151u0 b(int i, int i2) {
        return new C0149t0(this, this.a.a(i), i2);
    }

    public C0149t0(C0149t0 c0149t0, H h, int i) {
        super(c0149t0, h, i);
        this.c = c0149t0.c;
    }
}
