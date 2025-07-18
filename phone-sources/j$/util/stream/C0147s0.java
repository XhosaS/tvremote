package j$.util.stream;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0147s0 extends AbstractC0151u0 {
    public final Object c;

    public C0147s0(G g, Object obj) {
        super(g);
        this.c = obj;
    }

    @Override // j$.util.stream.AbstractC0151u0
    public final void a() {
        ((G) this.a).h(this.b, this.c);
    }

    @Override // j$.util.stream.AbstractC0151u0
    public final AbstractC0151u0 b(int i, int i2) {
        return new C0147s0(this, ((G) this.a).a(i), i2);
    }

    public C0147s0(C0147s0 c0147s0, G g, int i) {
        super(c0147s0, g, i);
        this.c = c0147s0.c;
    }
}
