package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vr implements Iterable {
    public vn b;
    public vn c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected vn a(Object obj) {
        vn vnVar = this.b;
        while (vnVar != null && !vnVar.a.equals(obj)) {
            vnVar = vnVar.c;
        }
        return vnVar;
    }

    public Object b(Object obj) {
        vn vnVarA = a(obj);
        if (vnVarA == null) {
            return null;
        }
        this.e--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((vq) it.next()).co(vnVarA);
            }
        }
        vn vnVar = vnVarA.d;
        vn vnVar2 = vnVarA.c;
        if (vnVar != null) {
            vnVar.c = vnVar2;
        } else {
            this.b = vnVar2;
        }
        vn vnVar3 = vnVarA.c;
        if (vnVar3 != null) {
            vnVar3.d = vnVar;
        } else {
            this.c = vnVar;
        }
        vnVarA.c = null;
        vnVarA.d = null;
        return vnVarA.b;
    }

    public final vn c(Object obj, Object obj2) {
        vn vnVar = new vn(obj, obj2);
        this.e++;
        vn vnVar2 = this.c;
        if (vnVar2 == null) {
            this.b = vnVar;
        } else {
            vnVar2.c = vnVar;
            vnVar.d = vnVar2;
        }
        this.c = vnVar;
        return vnVar;
    }

    public final vo d() {
        vo voVar = new vo(this);
        this.d.put(voVar, false);
        return voVar;
    }

    public final Object e(Object obj, Object obj2) {
        vn vnVarA = a(obj);
        if (vnVarA != null) {
            return vnVarA.b;
        }
        c(obj, obj2);
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vr)) {
            return false;
        }
        vr vrVar = (vr) obj;
        if (this.e != vrVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = vrVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((vp) it).next();
            Map.Entry next2 = ((vp) it2).next();
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
            iHashCode += ((vp) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vl vlVar = new vl(this.b, this.c);
        this.d.put(vlVar, false);
        return vlVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((vp) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
