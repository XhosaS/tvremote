package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgu {
    public final ziq a;
    public final String b;

    public zgu(ziq ziqVar, String str) {
        ziqVar.getClass();
        this.a = ziqVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zgu) {
            zgu zguVar = (zgu) obj;
            if (this.a.equals(zguVar.a) && this.b.equals(zguVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
