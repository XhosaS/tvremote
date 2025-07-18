package defpackage;

import android.support.v7.widget.ActivityChooserView;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcr {
    public static final byte[] a = new byte[0];
    public static final zcc b;
    public static final zcn c;
    public static final TimeZone d;
    public static final String e;
    private static final ynj f;

    static {
        String[] strArr = (String[]) new String[0].clone();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i] = ylh.E(str).toString();
        }
        int iX = wef.x(0, strArr.length - 1, 2);
        if (iX >= 0) {
            int i2 = 0;
            while (true) {
                String str2 = strArr[i2];
                String str3 = strArr[i2 + 1];
                wbb.S(str2);
                wbb.T(str3, str2);
                if (i2 == iX) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        b = new zcc(strArr);
        zgk zgkVar = new zgk();
        zgkVar.T(a);
        c = new zcm(zgkVar);
        wcq wcqVar = zhc.c;
        zgn zgnVar = zgn.a;
        wcqVar.aB(wcq.aC("efbbbf"), wcq.aC("feff"), wcq.aC("fffe"), wcq.aC("0000ffff"), wcq.aC("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        d = timeZone;
        f = new ynj("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = zch.class.getName();
        name.getClass();
        String strF = ylh.F(name, "okhttp3.");
        if (ylh.Q(strF, "Client")) {
            strF = strF.substring(0, strF.length() - "Client".length());
            strF.getClass();
        }
        e = strF;
    }

    public static final void A(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ybn.h(exc, (Exception) it.next());
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (ylh.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (yks.a(cCharAt, 31) <= 0 || yks.a(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(zgm zgmVar) {
        return x(zgmVar.d()) | (x(zgmVar.d()) << 16) | (x(zgmVar.d()) << 8);
    }

    public static final int h(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final long i(zcl zclVar) {
        String strB = zclVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String j(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final String k(zce zceVar, boolean z) {
        String strCg = zceVar.c;
        if (ylh.K(strCg, ":", false)) {
            strCg = a.cg(strCg, "[", "]");
        }
        if (!z && zceVar.d == wbb.N(zceVar.b)) {
            return strCg;
        }
        return strCg + ":" + zceVar.d;
    }

    public static final String l(String str, int i, int i2) {
        int iD = d(str, i, i2);
        String strSubstring = str.substring(iD, e(str, iD, i2));
        strSubstring.getClass();
        return strSubstring;
    }

    @SafeVarargs
    public static final List m(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(yfm.s(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List n(List list) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(yfm.an(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final zcc o(List list) {
        upq upqVar = new upq((byte[]) null, (byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zea zeaVar = (zea) it.next();
            upqVar.v(zeaVar.g.h(), zeaVar.h.h());
        }
        return upqVar.t();
    }

    public static final void p(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!yks.e(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean q(String str) {
        return f.c(str);
    }

    public static final boolean r(zce zceVar, zce zceVar2) {
        return yks.e(zceVar.c, zceVar2.c) && zceVar.d == zceVar2.d && yks.e(zceVar.b, zceVar2.b);
    }

    public static final boolean s(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itE = ykn.e(strArr2);
                while (itE.hasNext()) {
                    if (comparator.compare(str, (String) itE.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean t(Socket socket, zgm zgmVar) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !zgmVar.C();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean u(String str) {
        str.getClass();
        return ylh.y(str, "Authorization", true) || ylh.y(str, "Cookie", true) || ylh.y(str, "Proxy-Authorization", true) || ylh.y(str, "Set-Cookie", true);
    }

    public static final boolean v(zho zhoVar, int i, TimeUnit timeUnit) {
        boolean z;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jH = zhoVar.b().g() ? zhoVar.b().h() - jNanoTime : Long.MAX_VALUE;
        zhoVar.b().j(Math.min(jH, timeUnit.toNanos(i)) + jNanoTime);
        try {
            zgk zgkVar = new zgk();
            while (zhoVar.a(zgkVar, 8192L) != -1) {
                zgkVar.z();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            zhq zhqVarB = zhoVar.b();
            if (jH == Long.MAX_VALUE) {
                zhqVarB.m();
            } else {
                zhqVarB.j(jNanoTime + jH);
            }
            throw th;
        }
        if (jH == Long.MAX_VALUE) {
            zhoVar.b().m();
        } else {
            zhoVar.b().j(jNanoTime + jH);
        }
        return z;
    }

    public static final String[] w(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int x(byte b2) {
        return b2 & 255;
    }

    public static /* synthetic */ int y(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }

    public static final boolean z(zho zhoVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return v(zhoVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }
}
