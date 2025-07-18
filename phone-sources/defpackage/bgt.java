package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgt<K, V> extends bgs<K, V> implements Map.Entry<K, V>, yli {
    private Object b;
    private final brl c;

    public bgt(brl brlVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.c = brlVar;
        this.b = obj2;
    }

    @Override // defpackage.bgs, java.util.Map.Entry
    public final V getValue() {
        return (V) this.b;
    }

    @Override // defpackage.bgs, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = (V) this.b;
        this.b = v;
        Iterator it = this.c.a;
        bgx bgxVar = (bgx) it;
        bgw bgwVar = bgxVar.d;
        Object obj = this.a;
        if (!bgwVar.containsKey(obj)) {
            return v2;
        }
        bgv bgvVar = (bgv) it;
        if (bgvVar.c) {
            Object objA = bgvVar.a();
            bgwVar.put(obj, v);
            bgxVar.b(objA != null ? objA.hashCode() : 0, bgwVar.a, objA, 0);
        } else {
            bgwVar.put(obj, v);
        }
        bgxVar.e = bgwVar.c;
        return v2;
    }
}
