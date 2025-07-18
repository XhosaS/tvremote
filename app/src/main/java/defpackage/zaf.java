package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zaf extends yxo {
    private final Iterable a;

    public zaf(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zar.d(this.a.iterator());
    }

    @Override // defpackage.yxo
    public final String toString() {
        return zag.h(this.a);
    }
}
