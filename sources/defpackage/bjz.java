package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjz {
    public static void a(View view, bkc bkcVar) {
        biv bivVar = bkcVar.a.c;
        if (bivVar == null || !bivVar.b) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        bka bkaVar = bkcVar.a;
        if (bkaVar.o != elevation) {
            bkaVar.o = elevation;
            bkcVar.r();
        }
    }

    public static String b(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        return String.format("%0" + (length + length) + "x", new BigInteger(1, bArr));
    }

    public static Certificate c(SSLSession sSLSession) throws bll, SSLPeerUnverifiedException {
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length > 0) {
                return peerCertificates[0];
            }
            throw new bll("No peer certificate for " + sSLSession.getProtocol() + " " + sSLSession.getCipherSuite());
        } catch (SSLPeerUnverifiedException e) {
            throw new bll(e);
        }
    }

    public static boolean d(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = car.a;
            }
        } else {
            if (!(iterable instanceof cbg)) {
                return false;
            }
            comparator2 = ((cbg) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int e(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static HashSet f(int i) {
        int iCeil;
        if (i < 3) {
            bit.h(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    public static void g(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(b.e(i, "at index "));
        }
    }

    public static void h(Object... objArr) {
        i(objArr, objArr.length);
    }

    public static void i(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            g(objArr[i2], i2);
        }
    }

    public static boolean j(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static xo k(int i) {
        return i != 1 ? new bkf() : new bjy();
    }
}
