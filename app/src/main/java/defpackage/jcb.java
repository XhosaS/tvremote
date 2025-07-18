package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jcb extends jcu {
    private final String a;
    private final String b;

    public jcb(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null locale");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null keyphrase");
        }
        this.b = str2;
    }

    @Override // defpackage.jcu
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jcu
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcu) {
            jcu jcuVar = (jcu) obj;
            if (this.a.equals(jcuVar.b()) && this.b.equals(jcuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HotwordInitPayload{locale=" + this.a + ", keyphrase=" + this.b + "}";
    }
}
