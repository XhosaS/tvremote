package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyx extends yyk {
    final /* synthetic */ yyk b;

    public yyx(yyk yykVar) {
        this.b = yykVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.b.get(i)).getValue();
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.yyk, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
