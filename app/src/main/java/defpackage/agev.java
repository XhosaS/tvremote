package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agev {
    final Collection a;
    final int b;

    public agev(affy affyVar) {
        affyVar.getClass();
        if (affyVar.b.size() < 10) {
            this.a = affyVar.b;
        } else {
            this.a = new HashSet(affyVar.b);
        }
        Iterator it = affyVar.b.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agev)) {
            return false;
        }
        agev agevVar = (agev) obj;
        if (agevVar.b == this.b) {
            Collection collection = agevVar.a;
            int size = collection.size();
            Collection<?> collection2 = this.a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
