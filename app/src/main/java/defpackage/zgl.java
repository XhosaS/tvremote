package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgl implements Iterator {
    final /* synthetic */ zgm a;
    private final zer b;
    private int c;
    private int d;

    public zgl(zgm zgmVar, zer zerVar, int i) {
        this.a = zgmVar;
        this.b = zerVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objCast = this.b.b.cast(this.a.f(this.c));
        int i = this.d;
        if (i == 0) {
            this.c = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= iNumberOfTrailingZeros;
        this.c += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
