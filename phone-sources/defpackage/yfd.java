package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfd {
    final Collection a;
    final int b;

    public yfd(xqt xqtVar) {
        xqtVar.getClass();
        if (xqtVar.b.size() < 10) {
            this.a = xqtVar.b;
        } else {
            this.a = new HashSet(xqtVar.b);
        }
        Iterator it = xqtVar.b.iterator();
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
        if (!(obj instanceof yfd)) {
            return false;
        }
        yfd yfdVar = (yfd) obj;
        if (yfdVar.b == this.b) {
            Collection collection = yfdVar.a;
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
