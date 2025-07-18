package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zfa implements zej {
    private final zej a;
    private final Object b;

    public zfa(zej zejVar, Object obj) {
        zejVar.getClass();
        this.a = zejVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zfa)) {
            return false;
        }
        zfa zfaVar = (zfa) obj;
        return this.a.equals(zfaVar.a) && this.b.equals(zfaVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
