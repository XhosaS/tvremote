package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqt {
    public static final xpu a = new xpu("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final xpv c;
    private final int d;

    public xqt(SocketAddress socketAddress) {
        this(socketAddress, xpv.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqt)) {
            return false;
        }
        xqt xqtVar = (xqt) obj;
        List list = this.b;
        int size = list.size();
        List list2 = xqtVar.b;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.c.equals(xqtVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        xpv xpvVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + xpvVar.toString() + "]";
    }

    public xqt(SocketAddress socketAddress, xpv xpvVar) {
        this(Collections.singletonList(socketAddress), xpvVar);
    }

    public xqt(List list, xpv xpvVar) {
        sij.o(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = listUnmodifiableList;
        xpvVar.getClass();
        this.c = xpvVar;
        this.d = listUnmodifiableList.hashCode();
    }
}
