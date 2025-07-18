package com.google.common.collect;

import defpackage.tsl;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final tsl<F, ? extends T> function;
    final Ordering<T> ordering;

    public ByFunctionOrdering(tsl<F, ? extends T> tslVar, Ordering<T> ordering) {
        tslVar.getClass();
        this.function = tslVar;
        ordering.getClass();
        this.ordering = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f, F f2) {
        tsl<F, ? extends T> tslVar = this.function;
        return this.ordering.compare(tslVar.apply(f), tslVar.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public String toString() {
        tsl<F, ? extends T> tslVar = this.function;
        return String.valueOf(this.ordering) + ".onResultOf(" + String.valueOf(tslVar) + ")";
    }
}
