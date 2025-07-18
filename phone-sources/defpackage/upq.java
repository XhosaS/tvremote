package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upq {
    public static volatile upq a;
    public final Object b;

    public upq(Object obj, byte[] bArr) {
        this.b = obj;
    }

    private static final String D(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i != 13 && i != 10 && i >= 0) {
                stringBuffer.append((char) i);
            } else if (i < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
        } else if (i == 13) {
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == 10) {
                inputStream.mark(1);
            } else if (i2 > 0) {
            }
            inputStream.reset();
        }
        return stringBuffer.toString();
    }

    private final ztj E(String str) {
        for (int i = 0; i != 3; i++) {
            ztj ztjVar = ((ztj[]) this.b)[i];
            if (ztjVar.b(str) || ztjVar.a(str)) {
                return ztjVar;
            }
        }
        return null;
    }

    public final void A() {
        while (true) {
            ynu ynuVar = (ynu) this.b;
            yxh yxhVar = (yxh) ynuVar.a;
            if (yxhVar.d()) {
                return;
            } else {
                ynuVar.d(yxhVar, yxhVar.c());
            }
        }
    }

    public final boolean B(Object obj) {
        while (true) {
            ynu ynuVar = (ynu) this.b;
            yxh yxhVar = (yxh) ynuVar.a;
            int iA = yxhVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            ynuVar.d(yxhVar, yxhVar.c());
        }
    }

    public final ynu C(int i) {
        return ((ynu[]) this.b)[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    final Set a() {
        Set setUnmodifiableSet;
        ?? r0 = this.b;
        synchronized (r0) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(r0);
        }
        return setUnmodifiableSet;
    }

    public final /* synthetic */ vjj b() {
        vuc vucVarO = ((vtw) this.b).r();
        vucVarO.getClass();
        return (vjj) vucVarO;
    }

    public final /* synthetic */ vwv c() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((vjj) ((vtw) this.b).b).f);
        listUnmodifiableList.getClass();
        return new vwv(listUnmodifiableList);
    }

    public final /* synthetic */ void d(Iterable iterable) {
        iterable.getClass();
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjj vjjVar = (vjj) vtwVar.b;
        vjj vjjVar2 = vjj.a;
        vjjVar.b();
        vsf.h(iterable, vjjVar.f);
    }

    public final /* synthetic */ void e() {
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjj vjjVar = (vjj) vtwVar.b;
        vjj vjjVar2 = vjj.a;
        vjjVar.f = vvt.a;
    }

    public final /* synthetic */ vjf f() {
        vuc vucVarO = ((vtw) this.b).r();
        vucVarO.getClass();
        return (vjf) vucVarO;
    }

    public final /* synthetic */ uxb g() {
        vuc vucVarO = ((vtw) this.b).r();
        vucVarO.getClass();
        return (uxb) vucVarO;
    }

    public final void h(String str) {
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        vuk vukVar = uxb.a;
        uxbVar.d |= 64;
        uxbVar.j = str;
    }

    public final void i(uww uwwVar) {
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        vuk vukVar = uxb.a;
        uxbVar.t = uwwVar;
        uxbVar.d |= 65536;
    }

    public final void j(uwx uwxVar) {
        uwxVar.getClass();
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        vuk vukVar = uxb.a;
        uxbVar.o = uwxVar.G;
        uxbVar.d |= 512;
    }

    public final void k(vib vibVar) {
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        vuk vukVar = uxb.a;
        uxbVar.u = vibVar;
        uxbVar.d |= 131072;
    }

    public final void l(uxa uxaVar) {
        uxaVar.getClass();
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        vuk vukVar = uxb.a;
        uxbVar.q = uxaVar.f;
        uxbVar.d |= RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public final /* synthetic */ uwq m() {
        vuc vucVarO = ((vtw) this.b).r();
        vucVarO.getClass();
        return (uwq) vucVarO;
    }

    public final void n(uxb uxbVar) {
        vtw vtwVar = (vtw) this.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uwq uwqVar = (uwq) vtwVar.b;
        uwq uwqVar2 = uwq.a;
        uwqVar.h = uxbVar;
        uwqVar.b |= 67108864;
    }

    public final zjm o(InputStream inputStream, boolean z) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        ztj ztjVarE = null;
        while (ztjVarE == null) {
            String strD = D(inputStream);
            if (strD == null) {
                break;
            }
            ztjVarE = E(strD);
            if (ztjVarE != null && !ztjVarE.b(strD)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (ztjVarE == null) {
            if (z) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        ztj ztjVarE2 = null;
        while (ztjVarE2 == null) {
            String strD2 = D(inputStream);
            if (strD2 == null) {
                break;
            }
            ztjVarE2 = E(strD2);
            if (ztjVarE2 == null) {
                stringBuffer.append(strD2);
            } else if (!ztjVarE.a(strD2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (ztjVarE2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            String string = stringBuffer.toString();
            zxv zxvVar = zxs.a;
            char c = 4;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((string.length() / 4) * 3);
            try {
                zxv zxvVar2 = zxs.a;
                byte[] bArr = new byte[54];
                int length = string.length();
                while (length > 0) {
                    int i = length - 1;
                    if (!zxt.a(string.charAt(i))) {
                        break;
                    }
                    length = i;
                }
                if (length != 0) {
                    int i2 = length;
                    int i3 = 0;
                    while (i2 > 0 && i3 != 4) {
                        i2--;
                        if (!zxt.a(string.charAt(i2))) {
                            i3++;
                        }
                    }
                    int iB = zxt.b(string, 0, i2);
                    int i4 = 0;
                    while (iB < i2) {
                        byte[] bArr2 = ((zxt) zxvVar2).c;
                        int i5 = iB + 1;
                        byte b = bArr2[string.charAt(iB)];
                        int iB2 = zxt.b(string, i5, i2);
                        int i6 = iB2 + 1;
                        byte b2 = bArr2[string.charAt(iB2)];
                        int iB3 = zxt.b(string, i6, i2);
                        int i7 = iB3 + 1;
                        byte b3 = bArr2[string.charAt(iB3)];
                        int iB4 = zxt.b(string, i7, i2);
                        char c2 = c;
                        int i8 = iB4 + 1;
                        byte b4 = bArr2[string.charAt(iB4)];
                        if ((b | b2 | b3 | b4) < 0) {
                            throw new IOException("invalid characters encountered in base64 data");
                        }
                        bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                        int i9 = i4 + 2;
                        bArr[i4 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
                        i4 += 3;
                        bArr[i9] = (byte) (b4 | (b3 << 6));
                        if (i4 == 54) {
                            byteArrayOutputStream.write(bArr);
                            i4 = 0;
                        }
                        iB = zxt.b(string, i8, i2);
                        c = c2;
                    }
                    if (i4 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    }
                    int iB5 = zxt.b(string, iB, length);
                    int iB6 = zxt.b(string, iB5 + 1, length);
                    int iB7 = zxt.b(string, iB6 + 1, length);
                    int iB8 = zxt.b(string, iB7 + 1, length);
                    char cCharAt = string.charAt(iB5);
                    char cCharAt2 = string.charAt(iB6);
                    char cCharAt3 = string.charAt(iB7);
                    char cCharAt4 = string.charAt(iB8);
                    char c3 = ((zxt) zxvVar2).b;
                    if (cCharAt3 == c3) {
                        if (cCharAt4 != c3) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byte[] bArr3 = ((zxt) zxvVar2).c;
                        byte b5 = bArr3[cCharAt];
                        byte b6 = bArr3[cCharAt2];
                        if ((b5 | b6) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b6 >> 4) | (b5 << 2));
                    } else if (cCharAt4 == c3) {
                        byte[] bArr4 = ((zxt) zxvVar2).c;
                        byte b7 = bArr4[cCharAt];
                        byte b8 = bArr4[cCharAt2];
                        byte b9 = bArr4[cCharAt3];
                        if ((b7 | b8 | b9) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b7 << 2) | (b8 >> 4));
                        byteArrayOutputStream.write((b9 >> 2) | (b8 << 4));
                    } else {
                        byte[] bArr5 = ((zxt) zxvVar2).c;
                        byte b10 = bArr5[cCharAt];
                        byte b11 = bArr5[cCharAt2];
                        byte b12 = bArr5[cCharAt3];
                        byte b13 = bArr5[cCharAt4];
                        if ((b10 | b11 | b12 | b13) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b10 << 2) | (b11 >> 4));
                        byteArrayOutputStream.write((b11 << 4) | (b12 >> 2));
                        byteArrayOutputStream.write(b13 | (b12 << 6));
                    }
                }
                return zjm.j(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new zxu("unable to decode base64 string: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void p(zco zcoVar) {
        this.b.remove(zcoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void q(zco zcoVar) {
        this.b.add(zcoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean r(zco zcoVar) {
        return this.b.contains(zcoVar);
    }

    public final void s(Runnable runnable) {
        runnable.getClass();
        ((ThreadPoolExecutor) this.b).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final zcc t() {
        return new zcc((String[]) this.b.toArray(new String[0]));
    }

    public final void u(String str, String str2) {
        str.getClass();
        str2.getClass();
        wbb.S(str);
        wbb.T(str2, str);
        v(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void v(String str, String str2) {
        str.getClass();
        str2.getClass();
        ?? r0 = this.b;
        r0.add(str);
        r0.add(ylh.E(str2).toString());
    }

    public final void w(String str, String str2) {
        wbb.S(str);
        wbb.T(str2, str);
        x(str);
        v(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void x(String str) {
        int i = 0;
        while (true) {
            ?? r1 = this.b;
            if (i >= r1.size()) {
                return;
            }
            if (ylh.y(str, (String) r1.get(i), true)) {
                r1.remove(i);
                r1.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final int y() {
        long j = ((yxh) ((ynu) this.b).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object z() {
        while (true) {
            ynu ynuVar = (ynu) this.b;
            yxh yxhVar = (yxh) ynuVar.a;
            Object objB = yxhVar.b();
            if (objB != yxh.a) {
                return objB;
            }
            ynuVar.d(yxhVar, yxhVar.c());
        }
    }

    public upq() {
        this.b = new HashSet();
    }

    public upq(Object obj) {
        obj.getClass();
        this.b = obj;
    }

    public upq(xsm xsmVar) {
        xsmVar.getClass();
        this.b = xsmVar;
    }

    public upq(char[] cArr, byte[] bArr) {
        this.b = new ArrayList(20);
    }

    public upq(int i) {
        ynu[] ynuVarArr = new ynu[i];
        for (int i2 = 0; i2 < i; i2++) {
            ynuVarArr[i2] = new ynu(null, ynv.a);
        }
        this.b = ynuVarArr;
    }

    public upq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new ynu(new yxh(8, false), ynv.a);
    }

    public upq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(null, null, null, null);
    }

    public upq(char[] cArr) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        this.b = new zdg(zcv.a, timeUnit);
    }

    public upq(byte[] bArr, byte[] bArr2) {
        this.b = new ArrayList(20);
    }

    public upq(ThreadFactory threadFactory) {
        this.b = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public upq(byte[] bArr) {
        this.b = new LinkedHashSet();
    }

    public upq(String str) {
        this.b = new ztj[]{new ztj(str), new ztj("X509 ".concat(str)), new ztj("PKCS7")};
    }
}
