package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyw extends zdl {
    final zdl a;
    final /* synthetic */ yyz b;

    public yyw(yyz yyzVar) {
        this.b = yyzVar;
        this.a = yyzVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
