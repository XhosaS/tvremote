package defpackage;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgx {
    public final Integer a;
    public final Map b;
    public final byte[] c;
    private final String d;
    private final byte[] e;
    private final Exception f;

    public qgx() {
        throw null;
    }

    public static sjo d() {
        sjo sjoVar = new sjo();
        sjoVar.b = new HashMap();
        return sjoVar;
    }

    public final Throwable a() {
        Integer num;
        Exception exc = this.f;
        return (exc != null || (num = this.a) == null || num.intValue() == 200) ? exc : new qgy(num.intValue());
    }

    public final boolean b() {
        return a() != null;
    }

    public final boolean c() {
        Throwable thA = a();
        if (thA == null) {
            return false;
        }
        if ((thA instanceof SocketException) || (thA instanceof UnknownHostException) || (thA instanceof SSLException)) {
            return true;
        }
        return (thA instanceof qgy) && ((qgy) thA).a == 401;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgx) {
            qgx qgxVar = (qgx) obj;
            Integer num = this.a;
            if (num != null ? num.equals(qgxVar.a) : qgxVar.a == null) {
                String str = this.d;
                if (str != null ? str.equals(qgxVar.d) : qgxVar.d == null) {
                    if (this.b.equals(qgxVar.b)) {
                        boolean z = qgxVar instanceof qgx;
                        if (Arrays.equals(this.e, z ? qgxVar.e : qgxVar.e)) {
                            if (Arrays.equals(this.c, z ? qgxVar.c : qgxVar.c)) {
                                Exception exc = this.f;
                                Exception exc2 = qgxVar.f;
                                if (exc != null ? exc.equals(exc2) : exc2 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.d;
        int iHashCode2 = ((((((((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003) ^ Arrays.hashCode(this.c);
        Exception exc = this.f;
        return (iHashCode2 * 1000003) ^ (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        Exception exc = this.f;
        byte[] bArr = this.c;
        byte[] bArr2 = this.e;
        return "GnpHttpResponse{statusCode=" + this.a + ", statusMessage=" + this.d + ", headers=" + String.valueOf(this.b) + ", rawBody=" + Arrays.toString(bArr2) + ", body=" + Arrays.toString(bArr) + ", exception=" + String.valueOf(exc) + "}";
    }

    public qgx(Integer num, String str, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.a = num;
        this.d = str;
        this.b = map;
        this.e = bArr;
        this.c = bArr2;
        this.f = exc;
    }
}
