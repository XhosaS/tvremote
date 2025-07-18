package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfp {
    public static final byte[] a = new byte[0];
    public final String b;
    public final String c;
    public final byte[] d;
    public final Map e;

    public mfp(String str, String str2, byte[] bArr, Map map) {
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = map;
    }

    public static mfp a(String str) {
        return new mfp("GET", str, a, new HashMap());
    }

    public final void b(String str, String str2) {
        this.e.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mfp mfpVar = (mfp) obj;
        return this.b.equals(mfpVar.b) && this.c.equals(mfpVar.c) && Arrays.equals(this.d, mfpVar.d) && this.e.equals(mfpVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        Map map = this.e;
        return "HttpRequest{method='" + this.b + "', uri='" + this.c + "', body=" + Arrays.toString(this.d) + ", header=" + map.toString() + "}";
    }
}
