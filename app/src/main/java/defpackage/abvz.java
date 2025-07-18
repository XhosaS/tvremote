package defpackage;

import com.google.protobuf.MessageLite;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abvz extends abvf {
    private static final Logger a = Logger.getLogger(abvz.class.getName());
    public static final boolean e = acah.c;
    abwa f;

    @Deprecated
    static int C(int i, MessageLite messageLite, abzj abzjVar) {
        int iH = H(i << 3);
        return iH + iH + ((abut) messageLite).cJ(abzjVar);
    }

    public static int D(MessageLite messageLite) {
        int iG = messageLite.g();
        return H(iG) + iG;
    }

    static int E(MessageLite messageLite, abzj abzjVar) {
        int iCJ = ((abut) messageLite).cJ(abzjVar);
        return H(iCJ) + iCJ;
    }

    public static int F(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int G(String str) {
        int length;
        try {
            length = acam.a(str);
        } catch (acal unused) {
            length = str.getBytes(abxt.a).length;
        }
        return H(length) + length;
    }

    public static int H(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int I(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static abvz J(byte[] bArr) {
        return new abvw(bArr, 0, bArr.length);
    }

    public abstract void A(byte[] bArr, int i);

    public final void K() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void L(String str, acal acalVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) acalVar);
        byte[] bytes = str.getBytes(abxt.a);
        try {
            int length = bytes.length;
            x(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new abvx(e2);
        }
    }

    public abstract void O();

    public abstract void P(byte b);

    public abstract void Q(int i, boolean z);

    @Override // defpackage.abvf
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract int b();

    public abstract void h(int i, abvo abvoVar);

    public abstract void i(abvo abvoVar);

    public abstract void j(int i, int i2);

    public abstract void k(int i);

    public abstract void l(int i, long j);

    public abstract void m(long j);

    public abstract void n(int i, int i2);

    public abstract void o(int i);

    public abstract void p(int i, MessageLite messageLite, abzj abzjVar);

    public abstract void q(MessageLite messageLite);

    public abstract void r(int i, MessageLite messageLite);

    public abstract void s(int i, abvo abvoVar);

    public abstract void t(int i, String str);

    public abstract void u(String str);

    public abstract void v(int i, int i2);

    public abstract void w(int i, int i2);

    public abstract void x(int i);

    public abstract void y(int i, long j);

    public abstract void z(long j);
}
