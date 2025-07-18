package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zaa extends yxo {
    final /* synthetic */ Iterable a;
    final /* synthetic */ yqi b;

    public zaa(Iterable iterable, yqi yqiVar) {
        this.a = iterable;
        this.b = yqiVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zar.h(this.a.iterator(), this.b);
    }
}
