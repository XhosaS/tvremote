package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzv extends lzw {
    private final String a = "geller_jni_lib";
    private final String b = "geller_jni_lib_split";

    @Override // defpackage.lzw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.lzw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzw) {
            lzw lzwVar = (lzw) obj;
            if (this.a.equals(lzwVar.a()) && this.b.equals(lzwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "JniLibrary{name=" + this.a + ", splitName=" + this.b + "}";
    }
}
