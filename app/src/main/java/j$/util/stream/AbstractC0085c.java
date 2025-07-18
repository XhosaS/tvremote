package j$.util.stream;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0085c {
    public int a;
    public int b;
    public long[] c;

    public abstract void clear();

    public final long count() {
        int i = this.b;
        return i == 0 ? this.a : this.c[i] + this.a;
    }
}
