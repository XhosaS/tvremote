package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgb {
    public final String a;
    public final String b;
    public final String c;

    public lgb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lgb) {
            lgb lgbVar = (lgb) obj;
            if (this.a.equals(lgbVar.a) && this.b.equals(lgbVar.b) && this.c.equals(lgbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AssetImageValue{uri=" + this.a + ", ETag=" + this.b + ", lastModified=" + this.c + "}";
    }

    public lgb(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null ETag");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null lastModified");
        }
        this.c = str3;
    }
}
