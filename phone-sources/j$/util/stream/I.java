package j$.util.stream;

/* loaded from: classes4.dex */
public abstract class I implements H {
    public final H a;
    public final H b;
    public final long c;

    public I(H h, H h2) {
        this.a = h;
        this.b = h2;
        this.c = h2.count() + h.count();
    }

    @Override // j$.util.stream.H
    public final H a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.H
    public final int t() {
        return 2;
    }

    @Override // j$.util.stream.H
    public /* bridge */ /* synthetic */ G a(int i) {
        return (G) a(i);
    }
}
