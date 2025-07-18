package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yxn extends yxo {
    final /* synthetic */ Iterable[] a;

    public yxn(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zal(new yxm(this.a));
    }
}
