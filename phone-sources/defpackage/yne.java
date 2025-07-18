package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yne implements Iterator, yli {
    final /* synthetic */ ynb a;
    private int b = -1;
    private int c;
    private int d;
    private ymd e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public yne(ynb ynbVar) {
        this.a = ynbVar;
        int iL = ykn.l(0, 0, ynbVar.b.length());
        this.c = iL;
        this.d = iL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    private final void a() {
        Object objA;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        ynb ynbVar = this.a;
        ?? r3 = ynbVar.b;
        if (i <= r3.length() && (objA = ynbVar.a.a(r3, Integer.valueOf(this.d))) != null) {
            yfw yfwVar = (yfw) objA;
            int iIntValue = ((Number) yfwVar.a).intValue();
            int iIntValue2 = ((Number) yfwVar.b).intValue();
            this.e = ykn.r(this.c, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.c = i2;
            this.d = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.e = new ymd(this.c, ylh.C(r3));
            this.d = -1;
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        ymd ymdVar = this.e;
        ymdVar.getClass();
        this.e = null;
        this.b = -1;
        return ymdVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
