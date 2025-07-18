package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzc extends yxy {
    private static final long serialVersionUID = 0;
    final yze b;

    public yzc(yze yzeVar) {
        this.b = yzeVar;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.b.o(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yza(this.b);
    }

    @Override // defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return new yza(this.b);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size;
    }

    @Override // defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
