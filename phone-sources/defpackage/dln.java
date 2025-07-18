package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dln {
    public final Map a;
    private final Map b;

    public dln() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dln)) {
            return false;
        }
        dln dlnVar = (dln) obj;
        return yks.e(this.b, dlnVar.b) && yks.e(this.a, dlnVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.b + ", providerNameToReceivers=" + this.a + ')';
    }

    public dln(Map map, Map map2) {
        this.b = map;
        this.a = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dln(byte[] bArr) {
        yhc yhcVar = yhc.a;
        this(yhcVar, yhcVar);
    }
}
