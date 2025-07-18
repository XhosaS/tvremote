package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0106y extends AbstractC0101t implements r {
    @Override // j$.util.stream.r
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) j];
        h(0, iArr);
        return iArr;
    }

    @Override // j$.util.stream.r
    public final void h(int i, Object obj) {
        InterfaceC0100s interfaceC0100s = this.a;
        ((r) interfaceC0100s).h(i, obj);
        ((r) this.b).h(i + ((int) ((r) interfaceC0100s).count()), obj);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return L.g(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
