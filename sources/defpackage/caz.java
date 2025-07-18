package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caz extends cab {
    public final transient Object[] a;
    public final transient int b;
    private final transient bzw c;

    public caz(bzw bzwVar, Object[] objArr, int i) {
        this.c = bzwVar;
        this.a = objArr;
        this.b = i;
    }

    @Override // defpackage.bzl
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        return d().iterator();
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.cab
    public final bzs k() {
        return new cay(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
