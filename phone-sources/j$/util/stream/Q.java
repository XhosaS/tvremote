package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public abstract class Q extends I implements G {
    @Override // j$.util.stream.G
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        h(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.G
    public final void h(int i, Object obj) {
        H h = this.a;
        ((G) h).h(i, obj);
        ((G) this.b).h(i + ((int) ((G) h).count()), obj);
    }

    @Override // j$.util.stream.G
    public final void i(Object obj) {
        ((G) this.a).i(obj);
        ((G) this.b).i(obj);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0153v0.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
