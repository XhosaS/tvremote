package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zch extends yyk {
    final /* synthetic */ zci b;

    public zch(zci zciVar) {
        this.b = zciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zci zciVar = this.b;
        yqw.al(i, zciVar.c);
        Object[] objArr = zciVar.b;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.c;
    }

    @Override // defpackage.yyk, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
