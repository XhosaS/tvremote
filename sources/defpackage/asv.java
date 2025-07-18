package defpackage;

import android.app.Application;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asv {
    private static volatile Provider b;
    public final Object a;

    public asv() {
        this.a = "tiktok_systrace";
    }

    public static asv aa(int i, int i2, int i3, int i4) {
        return new asv(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, false), (byte[]) null);
    }

    public static asv ab(int i, int i2) {
        return new asv(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0), (byte[]) null);
    }

    private static synchronized Provider ad() {
        Provider provider = Security.getProvider("BC");
        if (provider instanceof dgi) {
            return provider;
        }
        if (b != null) {
            return b;
        }
        b = new dgi();
        return b;
    }

    private static final String ae(InputStream inputStream) throws IOException {
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

    private final dka af(String str) {
        for (int i = 0; i != 3; i++) {
            dka dkaVar = ((dka[]) this.a)[i];
            if (dkaVar.b(str) || dkaVar.a(str)) {
                return dkaVar;
            }
        }
        return null;
    }

    public static cja e(ami amiVar) {
        return cgp.i(apd.c(amiVar), afy.class, new bfu(1), chz.a);
    }

    public static int p(cmt cmtVar, Object obj, Object obj2) {
        return clk.a((cog) cmtVar.c, 1, obj) + clk.a((cog) cmtVar.d, 2, obj2);
    }

    public static void q(cld cldVar, cmt cmtVar, Object obj, Object obj2) {
        clk.g(cldVar, (cog) cmtVar.c, 1, obj);
        clk.g(cldVar, (cog) cmtVar.d, 2, obj2);
    }

    public final void A(int i, long j) {
        ((cld) this.a).D(i, j);
    }

    public final void B(int i, Object obj, cno cnoVar) {
        ((cld) this.a).u(i, (cmz) obj, cnoVar);
    }

    public final void C(int i, Object obj) {
        if (obj instanceof ckv) {
            ((cld) this.a).x(i, (ckv) obj);
        } else {
            ((cld) this.a).w(i, (cmz) obj);
        }
    }

    public final void D(int i, int i2) {
        ((cld) this.a).o(i, i2);
    }

    public final void E(int i, long j) {
        ((cld) this.a).q(i, j);
    }

    public final void F(int i, int i2) {
        ((cld) this.a).ao(i, i2);
    }

    public final void G(int i, long j) {
        ((cld) this.a).aq(i, j);
    }

    public final void H(int i, String str) {
        ((cld) this.a).y(i, str);
    }

    public final void I(int i, int i2) {
        ((cld) this.a).B(i, i2);
    }

    public final void J(int i, long j) {
        ((cld) this.a).D(i, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void K() {
        ?? r0 = this.a;
        Iterator it = r0.values().iterator();
        while (it.hasNext()) {
            ((xx) it.next()).f();
        }
        r0.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void L() {
        ?? r0 = this.a;
        for (int iAJ = dnx.aJ(r0); iAJ >= 0; iAJ--) {
            ((tp) ((ArrayList) r0).get(iAJ)).a();
        }
    }

    public final void M(boolean z) {
        ((qp) this.a).g(z);
    }

    public final void N(boolean z) {
        ((qp) this.a).h(z);
    }

    public final void O() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void P(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void Q(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void R(rd rdVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (rdVar != null) {
                view.animate().setListener(new rc(rdVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void S(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qa] */
    public final void T(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qa] */
    public final void U(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final boolean V() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final void W(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.a).getContext().obtainStyledAttributes(attributeSet, cu.i, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(14)) {
                typedArrayObtainStyledAttributes.getBoolean(14, true);
            }
            typedArrayObtainStyledAttributes.recycle();
            ue ueVar = ue.b;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final am X() {
        return ((y) this.a).e;
    }

    public final void Y() {
        ((y) this.a).e.H();
    }

    public final void Z() {
        ((y) this.a).e.ab(true);
    }

    public final void a(asu asuVar) {
        asuVar.getClass();
        Object obj = ((att) this.a).a;
        int i = asw.c;
        ((asw) obj).a.add(asuVar);
    }

    public final void ac(byj byjVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(byjVar != null ? new rb(byjVar, 0) : null);
        }
    }

    public final void b(asu asuVar) {
        Object obj = ((att) this.a).a;
        int i = asw.c;
        ((asw) obj).a.remove(asuVar);
    }

    public final int c() {
        return ((AtomicInteger) this.a).get();
    }

    public final cja d(String str) {
        str.getClass();
        return e(((alh) this.a).a(str));
    }

    public final cja f(bcx bcxVar) throws Throwable {
        String str;
        BufferedReader bufferedReader;
        String strH;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        agb agbVar = (agb) this.a;
        ahi ahiVarD = qo.d(bcxVar, agbVar.f, alk.class.getSimpleName());
        if (ajt.a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                ajt.a = Application.getProcessName();
            } else {
                int iMyPid = ajt.b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    ajt.b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        strH = b.h(iMyPid, "/proc/", "/cmdline");
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(strH));
                        try {
                            String line = bufferedReader.readLine();
                            qp.p(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            ajs.a(bufferedReader2);
                            throw th;
                        }
                        ajs.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                ajt.a = strTrim;
            }
        }
        String str2 = ajt.a;
        if (str2 == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = str2 + "|" + System.identityHashCode(alk.class);
        }
        alc alcVar = new alc(str, ahiVarD, 2);
        ald aldVar = new ald(0);
        ahn ahnVar = new ahn();
        ahnVar.c = ahiVarD;
        ahnVar.a = alcVar;
        ahnVar.b = aldVar;
        ahnVar.d = new aes[]{aku.d};
        ahnVar.e = false;
        return e(agbVar.g(ahnVar.a()));
    }

    public final String g() {
        return (String) this.a;
    }

    public final Signature h(String str) {
        return Signature.getInstance(str, (Provider) this.a);
    }

    public final CertificateFactory i() {
        return CertificateFactory.getInstance("X.509", (Provider) this.a);
    }

    public final dag j(InputStream inputStream, boolean z) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        dka dkaVarAf = null;
        while (dkaVarAf == null) {
            String strAe = ae(inputStream);
            if (strAe == null) {
                break;
            }
            dkaVarAf = af(strAe);
            if (dkaVarAf != null && !dkaVarAf.b(strAe)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (dkaVarAf == null) {
            if (z) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        dka dkaVarAf2 = null;
        while (dkaVarAf2 == null) {
            String strAe2 = ae(inputStream);
            if (strAe2 == null) {
                break;
            }
            dkaVarAf2 = af(strAe2);
            if (dkaVarAf2 == null) {
                stringBuffer.append(strAe2);
            } else if (!dkaVarAf.a(strAe2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (dkaVarAf2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            String string = stringBuffer.toString();
            don donVar = dok.a;
            char c = 4;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((string.length() / 4) * 3);
            try {
                don donVar2 = dok.a;
                byte[] bArr = new byte[54];
                int length = string.length();
                while (length > 0) {
                    int i = length - 1;
                    if (!dol.a(string.charAt(i))) {
                        break;
                    }
                    length = i;
                }
                if (length != 0) {
                    int i2 = length;
                    int i3 = 0;
                    while (i2 > 0 && i3 != 4) {
                        i2--;
                        if (!dol.a(string.charAt(i2))) {
                            i3++;
                        }
                    }
                    int iB = dol.b(string, 0, i2);
                    int i4 = 0;
                    while (iB < i2) {
                        byte[] bArr2 = ((dol) donVar2).c;
                        int i5 = iB + 1;
                        byte b2 = bArr2[string.charAt(iB)];
                        int iB2 = dol.b(string, i5, i2);
                        int i6 = iB2 + 1;
                        byte b3 = bArr2[string.charAt(iB2)];
                        int iB3 = dol.b(string, i6, i2);
                        int i7 = iB3 + 1;
                        byte b4 = bArr2[string.charAt(iB3)];
                        int iB4 = dol.b(string, i7, i2);
                        char c2 = c;
                        int i8 = iB4 + 1;
                        byte b5 = bArr2[string.charAt(iB4)];
                        if ((b2 | b3 | b4 | b5) < 0) {
                            throw new IOException("invalid characters encountered in base64 data");
                        }
                        bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                        int i9 = i4 + 2;
                        bArr[i4 + 1] = (byte) ((b3 << 4) | (b4 >> 2));
                        i4 += 3;
                        bArr[i9] = (byte) (b5 | (b4 << 6));
                        if (i4 == 54) {
                            byteArrayOutputStream.write(bArr);
                            i4 = 0;
                        }
                        iB = dol.b(string, i8, i2);
                        c = c2;
                    }
                    if (i4 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    }
                    int iB5 = dol.b(string, iB, length);
                    int iB6 = dol.b(string, iB5 + 1, length);
                    int iB7 = dol.b(string, iB6 + 1, length);
                    int iB8 = dol.b(string, iB7 + 1, length);
                    char cCharAt = string.charAt(iB5);
                    char cCharAt2 = string.charAt(iB6);
                    char cCharAt3 = string.charAt(iB7);
                    char cCharAt4 = string.charAt(iB8);
                    char c3 = ((dol) donVar2).b;
                    if (cCharAt3 == c3) {
                        if (cCharAt4 != c3) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byte[] bArr3 = ((dol) donVar2).c;
                        byte b6 = bArr3[cCharAt];
                        byte b7 = bArr3[cCharAt2];
                        if ((b6 | b7) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b7 >> 4) | (b6 << 2));
                    } else if (cCharAt4 == c3) {
                        byte[] bArr4 = ((dol) donVar2).c;
                        byte b8 = bArr4[cCharAt];
                        byte b9 = bArr4[cCharAt2];
                        byte b10 = bArr4[cCharAt3];
                        if ((b8 | b9 | b10) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b8 << 2) | (b9 >> 4));
                        byteArrayOutputStream.write((b10 >> 2) | (b9 << 4));
                    } else {
                        byte[] bArr5 = ((dol) donVar2).c;
                        byte b11 = bArr5[cCharAt];
                        byte b12 = bArr5[cCharAt2];
                        byte b13 = bArr5[cCharAt3];
                        byte b14 = bArr5[cCharAt4];
                        if ((b11 | b12 | b13 | b14) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b11 << 2) | (b12 >> 4));
                        byteArrayOutputStream.write((b12 << 4) | (b13 >> 2));
                        byteArrayOutputStream.write(b14 | (b13 << 6));
                    }
                }
                return dag.j(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new dom("unable to decode base64 string: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }

    public final int k() {
        long j = ((cvu) ((cvg) this.a).a).d.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l() {
        /*
            r14 = this;
        L0:
            java.lang.Object r0 = r14.a
            cvg r0 = (defpackage.cvg) r0
            java.lang.Object r1 = r0.a
            cvu r1 = (defpackage.cvu) r1
            cvf r2 = r1.d
        La:
            long r3 = r2.b
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r5 = r5 & r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L18
            cvx r2 = defpackage.cvu.a
            goto L5b
        L18:
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r3 & r5
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r3
            int r11 = r1.c
            r12 = 30
            long r9 = r9 >> r12
            int r9 = (int) r9
            r9 = r9 & r11
            int r7 = (int) r7
            r8 = r7 & r11
            r10 = 0
            if (r9 != r8) goto L32
        L30:
            r2 = r10
            goto L5b
        L32:
            asv r9 = r1.e
            cvg r11 = r9.o(r8)
            java.lang.Object r11 = r11.a
            if (r11 == 0) goto La
            boolean r12 = r11 instanceof defpackage.cvt
            if (r12 == 0) goto L41
            goto L30
        L41:
            int r7 = r7 + 1
            long r5 = defpackage.dnx.av(r3, r5)
            r12 = 1073741823(0x3fffffff, float:1.9999999)
            r7 = r7 & r12
            long r12 = (long) r7
            long r5 = r5 | r12
            boolean r3 = r2.a(r3, r5)
            if (r3 == 0) goto La
            cvg r2 = r9.o(r8)
            r2.b(r10)
            r2 = r11
        L5b:
            cvx r3 = defpackage.cvu.a
            if (r2 == r3) goto L60
            return r2
        L60:
            cvu r2 = r1.a()
            r0.c(r1, r2)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asv.l():java.lang.Object");
    }

    public final void m() {
        long j;
        while (true) {
            cvg cvgVar = (cvg) this.a;
            cvu cvuVar = (cvu) cvgVar.a;
            cvf cvfVar = cvuVar.d;
            do {
                j = cvfVar.b;
                if ((j & 2305843009213693952L) != 0) {
                    return;
                }
                if ((1152921504606846976L & j) != 0) {
                    break;
                }
            } while (!cvfVar.a(j, 2305843009213693952L | j));
            return;
            cvgVar.c(cvuVar, cvuVar.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r20
            r1 = r19
        L4:
            java.lang.Object r2 = r1.a
            cvg r2 = (defpackage.cvg) r2
            java.lang.Object r3 = r2.a
            cvu r3 = (defpackage.cvu) r3
            cvf r4 = r3.d
        Le:
            long r5 = r4.b
            r7 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r7 = r7 & r5
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L24
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r5 = r5 & r7
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L22
            goto La9
        L22:
            r0 = 0
            return r0
        L24:
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r5
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r5 & r11
            int r15 = r3.c
            r16 = 30
            long r13 = r13 >> r16
            int r13 = (int) r13
            int r14 = r13 + 2
            r14 = r14 & r15
            int r7 = (int) r7
            r8 = r7 & r15
            if (r14 == r8) goto La9
            asv r8 = r3.e
            r14 = r13 & r15
            cvg r15 = r8.o(r14)
            java.lang.Object r15 = r15.a
            r17 = 1073741823(0x3fffffff, float:1.9999999)
            if (r15 == 0) goto L5b
            int r5 = r3.b
            r6 = 1024(0x400, float:1.435E-42)
            if (r5 < r6) goto La9
            int r13 = r13 - r7
            r6 = r13 & r17
            int r5 = r5 >> 1
            if (r6 <= r5) goto Le
            goto La9
        L5b:
            int r7 = r13 + 1
            r7 = r7 & r17
            long r11 = defpackage.dnx.av(r5, r11)
            r17 = r9
            long r9 = (long) r7
            long r9 = r9 << r16
            long r9 = r9 | r11
            boolean r5 = r4.a(r5, r9)
            if (r5 == 0) goto Le
            cvg r2 = r8.o(r14)
            r2.b(r0)
        L76:
            cvf r2 = r3.d
            long r4 = r2.b
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r6
            int r2 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r2 == 0) goto La7
            cvu r2 = r3.a()
            asv r3 = r2.e
            int r4 = r2.c
            r4 = r4 & r13
            cvg r5 = r3.o(r4)
            java.lang.Object r5 = r5.a
            boolean r6 = r5 instanceof defpackage.cvt
            r7 = 0
            if (r6 == 0) goto La4
            cvt r5 = (defpackage.cvt) r5
            int r5 = r5.a
            if (r5 != r13) goto La4
            cvg r3 = r3.o(r4)
            r3.b(r0)
            r3 = r2
            goto La5
        La4:
            r3 = r7
        La5:
            if (r3 != 0) goto L76
        La7:
            r0 = 1
            return r0
        La9:
            cvu r4 = r3.a()
            r2.c(r3, r4)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asv.n(java.lang.Object):boolean");
    }

    public final cvg o(int i) {
        return ((cvg[]) this.a)[i];
    }

    public final void r(int i, boolean z) {
        ((cld) this.a).l(i, z);
    }

    public final void s(int i, ckv ckvVar) {
        ((cld) this.a).m(i, ckvVar);
    }

    public final void t(int i, double d) {
        ((cld) this.a).aj(i, d);
    }

    public final void u(int i, int i2) {
        ((cld) this.a).s(i, i2);
    }

    public final void v(int i, int i2) {
        ((cld) this.a).o(i, i2);
    }

    public final void w(int i, long j) {
        ((cld) this.a).q(i, j);
    }

    public final void x(int i, float f) {
        ((cld) this.a).al(i, f);
    }

    public final void y(int i, Object obj, cno cnoVar) {
        cld cldVar = (cld) this.a;
        cldVar.A(i, 3);
        cnoVar.m((cmz) obj, cldVar.f);
        cldVar.A(i, 4);
    }

    public final void z(int i, int i2) {
        ((cld) this.a).s(i, i2);
    }

    public asv(cog cogVar, Object obj, cog cogVar2, Object obj2) {
        this.a = new cmt(cogVar, obj, cogVar2, obj2);
    }

    public asv(Object obj) {
        this.a = obj;
    }

    public asv(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public asv(int i) {
        cvg[] cvgVarArr = new cvg[i];
        for (int i2 = 0; i2 < i; i2++) {
            cvgVarArr[i2] = new cvg(null, cvh.a);
        }
        this.a = cvgVarArr;
    }

    public asv(int i, byte[] bArr) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public asv(Context context, byte[] bArr) {
        new ConcurrentHashMap();
        tk.f(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public asv(cld cldVar) {
        byte[] bArr = cmf.b;
        this.a = cldVar;
        cldVar.f = this;
    }

    public asv(View view, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new py(view);
        } else {
            this.a = new pz();
        }
    }

    public asv(View view) {
        this.a = new WeakReference(view);
    }

    public asv(byte[] bArr, byte[] bArr2) {
        this.a = new cvg(new cvu(8), cvh.a);
    }

    public asv(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new sj(window);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new sj(window);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.a = new si(window);
        } else {
            this.a = new sh(window);
        }
    }

    public asv(String str, byte[] bArr) {
        this.a = new dka[]{new dka(str), new dka("X509 ".concat(str)), new dka("PKCS7")};
    }

    public asv(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new sy(uri, clipDescription, uri2) : new sz(uri, clipDescription, uri2);
    }

    public asv(char[] cArr) {
        this.a = ad();
    }

    public asv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public asv(short[] sArr) {
        this.a = new LinkedHashMap();
    }

    public asv(byg bygVar) {
        this.a = (aox) bygVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public asv(Context context, att attVar) {
        this.a = attVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(attVar.a);
        application.registerComponentCallbacks(attVar.a);
    }

    public asv(Context context) {
        this.a = bit.k(new asf(context, 4));
    }

    public asv(byte[] bArr) {
        this.a = new AtomicInteger();
    }
}
