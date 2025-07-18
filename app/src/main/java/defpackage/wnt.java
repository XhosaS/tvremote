package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnt {
    public final wsk a;

    public wnt(wsk wskVar) {
        this.a = wskVar;
    }

    public static wnt a(String str) {
        wsk wskVar = wsk.a;
        wsj wsjVar = new wsj();
        if ((wsjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wsjVar.y();
        }
        wsk wskVar2 = (wsk) wsjVar.b;
        str.getClass();
        wskVar2.b |= 1;
        wskVar2.c = str;
        return new wnt((wsk) wsjVar.v());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wnt) && this.a.c.equals(((wnt) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", this.a.c);
    }
}
