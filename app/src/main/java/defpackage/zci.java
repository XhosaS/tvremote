package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zci extends yzq {
    public final transient Object[] b;
    public final transient int c;
    private final transient yyr d;

    public zci(yyr yyrVar, Object[] objArr, int i) {
        this.d = yyrVar;
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        return f().b(objArr, i);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yzq
    public final yyk h() {
        return new zch(this);
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
