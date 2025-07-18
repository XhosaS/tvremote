package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bha<K, V> extends ygv<K> implements Set<K>, Collection<K>, j$.util.Set<K>, yli {
    private final bgu a;
    private final /* synthetic */ int b;

    public bha(bgu bguVar, int i) {
        this.b = i;
        this.a = bguVar;
    }

    @Override // defpackage.ygk
    public final int a() {
        int i = this.b;
        return this.a.a();
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.b == 0) {
            return this.a.containsKey(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        bgu bguVar = this.a;
        V v = bguVar.get(entry.getKey());
        return v != null ? yks.e(v, entry.getValue()) : entry.getValue() == null && bguVar.containsKey(entry.getKey());
    }

    @Override // defpackage.ygv, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = 0;
        if (this.b != 0) {
            bhd[] bhdVarArr = new bhd[8];
            while (i < 8) {
                bhdVarArr[i] = new bhe();
                i++;
            }
            return new bgv(this.a.b, bhdVarArr);
        }
        bhd[] bhdVarArr2 = new bhd[8];
        while (i < 8) {
            bhdVarArr2[i] = new bhf();
            i++;
        }
        return new bgv(this.a.b, bhdVarArr2);
    }
}
