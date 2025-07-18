package j$.util;

import j$.util.Comparator;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0096d implements java.util.Comparator, Serializable, Comparator {
    private static final long serialVersionUID = -7569533591570686392L;
    public final boolean a;
    public final java.util.Comparator b;

    public C0096d(boolean z, java.util.Comparator comparator) {
        this.a = z;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z = this.a;
        if (obj == null) {
            if (obj2 == null) {
                return 0;
            }
            return z ? -1 : 1;
        }
        if (obj2 == null) {
            return z ? 1 : -1;
        }
        java.util.Comparator comparator = this.b;
        if (comparator == null) {
            return 0;
        }
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        boolean z = !this.a;
        java.util.Comparator comparator = this.b;
        return new C0096d(z, comparator == null ? null : Comparator.EL.reversed(comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.EL.a(this, Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator thenComparing(java.util.Comparator comparator) {
        comparator.getClass();
        java.util.Comparator comparator2 = this.b;
        if (comparator2 != null) {
            comparator = Comparator.EL.a(comparator2, comparator);
        }
        return new C0096d(this.a, comparator);
    }
}
