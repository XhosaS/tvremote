package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyp implements Iterator {
    final /* synthetic */ agyq a;
    private int b = -1;
    private int c;
    private int d;
    private agwy e;

    public agyp(agyq agyqVar) {
        this.a = agyqVar;
        int length = agyqVar.a.length();
        if (length < 0) {
            throw new IllegalArgumentException(a.a(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        this.c = 0;
        this.d = 0;
    }

    private final void a() {
        Object objA;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        agyq agyqVar = this.a;
        CharSequence charSequence = agyqVar.a;
        if (i <= charSequence.length() && (objA = agyqVar.b.a(charSequence, Integer.valueOf(this.d))) != null) {
            agpi agpiVar = (agpi) objA;
            int iIntValue = ((Number) agpiVar.a).intValue();
            int iIntValue2 = ((Number) agpiVar.b).intValue();
            this.e = agwz.b(this.c, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.c = i2;
            this.d = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.e = new agwy(this.c, agyv.h(charSequence));
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
        agwy agwyVar = this.e;
        agwyVar.getClass();
        this.e = null;
        this.b = -1;
        return agwyVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
