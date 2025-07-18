package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yza extends zdl {
    final Iterator a;
    Object b = null;
    Iterator c = zak.a;
    final /* synthetic */ yze d;

    public yza(yze yzeVar) {
        this.d = yzeVar;
        this.a = yzeVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((yxy) entry.getValue()).iterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new yxz(obj, this.c.next());
    }
}
