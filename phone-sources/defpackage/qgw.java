package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgw {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final int e;

    public qgw() {
        throw null;
    }

    public static qgv a() {
        qgv qgvVar = new qgv();
        qgvVar.c = 1;
        qgvVar.a = new HashMap();
        return qgvVar;
    }

    public final qgv b() {
        qgv qgvVar = new qgv(this);
        qgvVar.a = new HashMap(this.c);
        return qgvVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgw) {
            qgw qgwVar = (qgw) obj;
            if (this.a.equals(qgwVar.a) && ((str = this.b) != null ? str.equals(qgwVar.b) : qgwVar.b == null) && this.c.equals(qgwVar.c)) {
                boolean z = qgwVar instanceof qgw;
                if (Arrays.equals(this.d, qgwVar.d)) {
                    int i = this.e;
                    int i2 = qgwVar.e;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        int i = this.e;
        a.bl(i);
        return iHashCode2 ^ i;
    }

    public final String toString() {
        byte[] bArr = this.d;
        Map map = this.c;
        return "GnpHttpRequest{url=" + String.valueOf(this.a) + ", contentType=" + this.b + ", headers=" + String.valueOf(map) + ", body=" + Arrays.toString(bArr) + ", purpose=" + osk.ab(this.e) + "}";
    }

    public qgw(URL url, String str, Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }
}
