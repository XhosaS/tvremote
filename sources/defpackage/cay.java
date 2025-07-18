package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cay extends bzs {
    final /* synthetic */ caz a;

    public cay(caz cazVar) {
        this.a = cazVar;
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        caz cazVar = this.a;
        bdq.n(i, cazVar.b);
        Object[] objArr = cazVar.a;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b;
    }

    @Override // defpackage.bzs, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
