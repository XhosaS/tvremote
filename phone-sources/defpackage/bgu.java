package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgu<K, V> extends ygq<K, V> implements Map<K, V>, bgg {
    public static final bgu a = new bgu(bhc.a, 0);
    public final bhc b;
    public final int c;

    public bgu(bhc bhcVar, int i) {
        this.b = bhcVar;
        this.c = i;
    }

    @Override // defpackage.ygq
    public final int a() {
        return this.c;
    }

    public final bgu b(Object obj, Object obj2) {
        etc etcVarM = this.b.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        if (etcVarM == null) {
            return this;
        }
        return new bgu((bhc) etcVarM.b, a() + etcVarM.a);
    }

    @Override // defpackage.ygq
    public final /* synthetic */ Collection c() {
        return new bhb(this);
    }

    @Override // defpackage.ygq, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.ygq
    public final Set d() {
        return new bha(this, 1);
    }

    @Override // defpackage.ygq
    public final /* synthetic */ Set e() {
        return new bha(this, 0);
    }

    @Override // defpackage.ygq, java.util.Map
    public V get(Object obj) {
        return (V) this.b.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
