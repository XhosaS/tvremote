package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfz {
    public final String a;
    private final List b;

    public sfz() {
        throw null;
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sfz) {
            sfz sfzVar = (sfz) obj;
            if (this.a.equals(sfzVar.a) && this.b.equals(sfzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SafeSql{query=" + this.a + ", queryArgs=" + this.b.toString() + "}";
    }

    public sfz(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
