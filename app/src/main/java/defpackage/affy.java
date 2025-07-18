package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affy {
    public static final afeg a = new afeg("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final afeh c;
    private final int d;

    public affy(List list, afeh afehVar) {
        yqw.B(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = listUnmodifiableList;
        afehVar.getClass();
        this.c = afehVar;
        this.d = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affy)) {
            return false;
        }
        affy affyVar = (affy) obj;
        List list = this.b;
        int size = list.size();
        List list2 = affyVar.b;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.c.equals(affyVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "[" + String.valueOf(this.b) + "/" + this.c.b.toString() + "]";
    }
}
