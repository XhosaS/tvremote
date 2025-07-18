package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ls implements Iterable {
    public lo b;
    public lo c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    public lo a(Object obj) {
        lo loVar = this.b;
        while (loVar != null && !loVar.a.equals(obj)) {
            loVar = loVar.c;
        }
        return loVar;
    }

    public Object b(Object obj) {
        lo loVarA = a(obj);
        if (loVarA == null) {
            return null;
        }
        this.e--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((lr) it.next()).aG(loVarA);
            }
        }
        lo loVar = loVarA.d;
        lo loVar2 = loVarA.c;
        if (loVar != null) {
            loVar.c = loVar2;
        } else {
            this.b = loVar2;
        }
        lo loVar3 = loVarA.c;
        if (loVar3 != null) {
            loVar3.d = loVar;
        } else {
            this.c = loVar;
        }
        loVarA.c = null;
        loVarA.d = null;
        return loVarA.b;
    }

    public final lo d(Object obj, Object obj2) {
        lo loVar = new lo(obj, obj2);
        this.e++;
        lo loVar2 = this.c;
        if (loVar2 == null) {
            this.b = loVar;
        } else {
            loVar2.c = loVar;
            loVar.d = loVar2;
        }
        this.c = loVar;
        return loVar;
    }

    public final lp e() {
        lp lpVar = new lp(this);
        this.d.put(lpVar, false);
        return lpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        if (this.e != lsVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = lsVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((lq) it).next();
            Map.Entry next2 = ((lq) it2).next();
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

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((lq) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lm lmVar = new lm(this.b, this.c);
        this.d.put(lmVar, false);
        return lmVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((lq) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
