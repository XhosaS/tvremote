package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hn<K, V> implements Iterable<Map.Entry<K, V>> {
    public hj b;
    public hj c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected hj a(Object obj) {
        hj hjVar = this.b;
        while (hjVar != null && !hjVar.a.equals(obj)) {
            hjVar = hjVar.c;
        }
        return hjVar;
    }

    public Object b(Object obj) {
        hj hjVarA = a(obj);
        if (hjVarA == null) {
            return null;
        }
        this.e--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((hm) it.next()).bO(hjVarA);
            }
        }
        hj hjVar = hjVarA.d;
        hj hjVar2 = hjVarA.c;
        if (hjVar != null) {
            hjVar.c = hjVar2;
        } else {
            this.b = hjVar2;
        }
        hj hjVar3 = hjVarA.c;
        if (hjVar3 != null) {
            hjVar3.d = hjVar;
        } else {
            this.c = hjVar;
        }
        hjVarA.c = null;
        hjVarA.d = null;
        return hjVarA.b;
    }

    public final hj d(Object obj, Object obj2) {
        hj hjVar = new hj(obj, obj2);
        this.e++;
        hj hjVar2 = this.c;
        if (hjVar2 == null) {
            this.b = hjVar;
        } else {
            hjVar2.c = hjVar;
            hjVar.d = hjVar2;
        }
        this.c = hjVar;
        return hjVar;
    }

    public final hk e() {
        hk hkVar = new hk(this);
        this.d.put(hkVar, false);
        return hkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        if (this.e != hnVar.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = hnVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((hl) it).next();
            Map.Entry next2 = ((hl) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        hj hjVarA = a(obj);
        if (hjVarA != null) {
            return hjVarA.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((hl) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        hh hhVar = new hh(this.b, this.c);
        this.d.put(hhVar, false);
        return hhVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(((hl) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
