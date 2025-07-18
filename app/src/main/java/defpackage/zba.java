package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zba extends zdk {
    final /* synthetic */ zbb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zba(zbb zbbVar, ListIterator listIterator) {
        super(listIterator);
        this.a = zbbVar;
    }

    @Override // defpackage.zdj
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
