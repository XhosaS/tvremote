package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgu {
    public static final qgu a = a("Content-Encoding");
    public static final qgu b = a("Content-Type");
    public static final qgu c = a("X-DFE-Device-Id");
    public static final qgu d = a("X-DFE-Debug-Overrides");
    public static final qgu e = a("X-Server-Token");
    public final String f;

    public qgu() {
        throw null;
    }

    public static qgu a(String str) {
        sij.s(tro.a.e(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new qgu(str.toLowerCase(Locale.US));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgu) {
            return this.f.equals(((qgu) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GnpHttpHeaderKey{key=" + this.f + "}";
    }

    public qgu(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f = str;
    }
}
