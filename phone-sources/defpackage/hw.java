package defpackage;

import android.content.ClipData;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import androidx.compose.foundation.ScrollingContainerElement;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hw {
    public static bnp a;
    public static bpo b;
    public static bng c;

    public static final boolean A(cfy cfyVar) {
        int iA = cfyVar.a();
        List list = cfyVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cfx cfxVar = (cfx) list.get(i);
                if ((cfxVar.a instanceof cgf) && cfz.b(0, iA, cfxVar.b, cfxVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int B(boolean z, int i, int i2) {
        if (z || !a.A(i)) {
            return ykn.j(i2, 1);
        }
        return 1;
    }

    public static final long C(long j, boolean z, int i, float f) {
        int iB = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if ((z || a.A(i)) && clv.h(j)) {
            iB = clv.b(j);
        }
        if (clv.d(j) != iB) {
            iB = ykn.l(hq.p(f), clv.d(j), iB);
        }
        return clw.n(0, iB, 0, clv.a(j));
    }

    public static final long D(int i, int i2, akb akbVar) {
        int i3;
        if (i == -1) {
            return akd.b(i2);
        }
        long jA = akbVar.a(i);
        long jC = akbVar.c(jA);
        if (chb.g(jA) && chb.g(jC)) {
            i3 = 1;
        } else if (chb.g(jA) || chb.g(jC)) {
            boolean zG = chb.g(jA);
            i3 = 4;
            if (zG && !chb.g(jC)) {
                i3 = 2;
            }
        } else {
            i3 = 3;
        }
        int i4 = i3 - 1;
        if (i4 != 0) {
            return i4 != 2 ? i4 != 3 ? i > i2 ? i == chb.e(jC) ? akd.c(i, 1) : akd.c(chb.a(jC), 2) : i == chb.a(jC) ? akd.c(i, 2) : akd.c(chb.e(jC), 1) : akd.b(i) : i > i2 ? akd.c(chb.a(jC), 1) : akd.c(chb.e(jC), 2);
        }
        return akd.c(i, i <= i2 ? 2 : 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [bvc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(defpackage.btq r9, defpackage.amf r10, defpackage.ybo r11, defpackage.bsr r12, defpackage.yih r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.E(btq, amf, ybo, bsr, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0031, B:48:0x010a, B:50:0x0112, B:52:0x0116, B:54:0x0122, B:56:0x012e), top: B:68:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(defpackage.btq r16, defpackage.amf r17, defpackage.ybo r18, defpackage.bsr r19, defpackage.yih r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.F(btq, amf, ybo, bsr, yih):java.lang.Object");
    }

    public static final String G(cvw cvwVar) {
        ClipData clipData = (ClipData) cvwVar.a;
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipData.getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = clipData.getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }

    private static final amn H(amn amnVar, aml amlVar, int i) {
        int iR = amlVar.d.r(i);
        long j = amnVar.b;
        return new amn(iR, i);
    }

    private static final amn I(yft yftVar) {
        return (amn) yftVar.a();
    }

    private static final amn J(aml amlVar, boolean z, boolean z2, amc amcVar) {
        long jA = amcVar.a(amlVar, z2 ? amlVar.a : amlVar.b);
        return amlVar.a(z ^ z2 ? chb.e(jA) : chb.a(jA));
    }

    static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }

    public static BiometricPrompt.CryptoObject b(hr hrVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (hrVar == null) {
            return null;
        }
        Cipher cipher = hrVar.b;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = hrVar.a;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = hrVar.c;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = hrVar.d) != null) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
        if (Build.VERSION.SDK_INT >= 33 && (presentationSession = hrVar.e) != null) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }
        if (Build.VERSION.SDK_INT < 35) {
            return null;
        }
        long j = hrVar.f;
        if (j != 0) {
            return new BiometricPrompt.CryptoObject(j);
        }
        return null;
    }

    public static hr c() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new hr(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static final Iterator d(kp kpVar) {
        kpVar.getClass();
        return new ks(kpVar);
    }

    public static final int e(it itVar, int i) {
        try {
            return ku.a(itVar.a, itVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int f(it itVar, Object obj, int i) {
        int i2 = itVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iE = e(itVar, i);
        if (iE < 0 || yks.e(obj, itVar.b[iE])) {
            return iE;
        }
        int i3 = iE + 1;
        while (i3 < i2 && itVar.a[i3] == i) {
            if (yks.e(obj, itVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iE - 1; i4 >= 0 && itVar.a[i4] == i; i4--) {
            if (yks.e(obj, itVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int g(it itVar) {
        return f(itVar, null, 0);
    }

    public static final void h(it itVar, int i) {
        itVar.a = new int[i];
        itVar.b = new Object[i];
    }

    public static final sj i(bao baoVar) {
        Object[] objArr = new Object[0];
        bii biiVar = sj.a;
        boolean zD = baoVar.D(0);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zD || objT == ban.a) {
            objT = new gf(7);
            basVar.ae(objT);
        }
        return (sj) bga.m(objArr, biiVar, (yjk) objT, baoVar, 0);
    }

    @yfp
    public static rz k(bao baoVar) {
        baoVar.x(1257603829);
        rz rzVar = rz.a;
        baoVar.p();
        return rzVar;
    }

    public static /* synthetic */ bkp l(bkp bkpVar, vs vsVar, uv uvVar, boolean z, ybo yboVar, kw kwVar, boolean z2, qj qjVar) {
        return bkpVar.a(uvVar == uv.a ? bga.w(bkp.g, sm.a) : bga.w(bkp.g, sm.b)).a(new ScrollingContainerElement(vsVar, uvVar, z, yboVar, kwVar, z2, qjVar));
    }

    public static final boolean m(cds cdsVar, bsz bszVar, bsz bszVar2) {
        return bmx.a(a.at(bszVar.c, bszVar2.c)) < kv.n(cdsVar, bszVar.i);
    }

    public static final boolean n(bsr bsrVar) {
        List list = bsrVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.r(((bsz) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(defpackage.btq r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.amv
            if (r0 == 0) goto L13
            r0 = r8
            amv r0 = (defpackage.amv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            amv r0 = new amv
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            btq r7 = r0.c
            defpackage.ybn.f(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
        L34:
            bss r8 = defpackage.bss.b
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r7.q(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            bsr r8 = (defpackage.bsr) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r6 = defpackage.bny.D(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.o(btq, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[Catch: CancellationException -> 0x0044, TryCatch #0 {CancellationException -> 0x0044, blocks: (B:13:0x002a, B:41:0x00c8, B:43:0x00d0, B:45:0x00dd, B:47:0x00e9, B:48:0x00ec, B:49:0x00ef, B:51:0x00ff, B:52:0x0103, B:18:0x003d, B:26:0x0067, B:28:0x006b, B:30:0x0075, B:32:0x0082, B:39:0x00ad, B:35:0x008e, B:36:0x0096, B:38:0x00a6, B:23:0x004a), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v9, types: [bvc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(defpackage.btq r8, defpackage.agb r9, defpackage.bsr r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.p(btq, agb, bsr, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(defpackage.btq r8, defpackage.agb r9, defpackage.bsr r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.q(btq, agb, bsr, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: CancellationException -> 0x010b, TryCatch #2 {CancellationException -> 0x010b, blocks: (B:28:0x0090, B:30:0x0094, B:31:0x0096, B:33:0x009a, B:35:0x00a3, B:37:0x00ac, B:39:0x00b0, B:40:0x00b5, B:55:0x0108), top: B:67:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: CancellationException -> 0x010b, TryCatch #2 {CancellationException -> 0x010b, blocks: (B:28:0x0090, B:30:0x0094, B:31:0x0096, B:33:0x009a, B:35:0x00a3, B:37:0x00ac, B:39:0x00b0, B:40:0x00b5, B:55:0x0108), top: B:67:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: CancellationException -> 0x0032, TryCatch #1 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:43:0x00d1, B:45:0x00d9, B:47:0x00e6, B:49:0x00f2, B:50:0x00f5, B:51:0x00f8, B:52:0x00ff), top: B:66:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff A[Catch: CancellationException -> 0x0032, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:43:0x00d1, B:45:0x00d9, B:47:0x00e6, B:49:0x00f2, B:50:0x00f5, B:51:0x00f8, B:52:0x00ff), top: B:66:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108 A[Catch: CancellationException -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x010b, blocks: (B:28:0x0090, B:30:0x0094, B:31:0x0096, B:33:0x009a, B:35:0x00a3, B:37:0x00ac, B:39:0x00b0, B:40:0x00b5, B:55:0x0108), top: B:67:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(defpackage.btq r13, defpackage.agb r14, defpackage.bsr r15, defpackage.yih r16) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.r(btq, agb, bsr, yih):java.lang.Object");
    }

    public static final int s(yft yftVar) {
        return ((Number) yftVar.a()).intValue();
    }

    public static final amn t(final anj anjVar, final aml amlVar, amn amnVar) {
        boolean z = anjVar.a;
        final int i = z ? amlVar.a : amlVar.b;
        final yft yftVarG = ybn.g(3, new amt(amlVar, i, 0));
        final int i2 = z ? amlVar.b : amlVar.a;
        yft yftVarG2 = ybn.g(3, new yjk() { // from class: amu
            @Override // defpackage.yjk
            public final Object a() {
                aml amlVar2 = amlVar;
                cgz cgzVar = amlVar2.d;
                int iS = hw.s(yftVarG);
                anj anjVar2 = anjVar;
                int iA = anjVar2.a();
                int i3 = i;
                long jK = cgzVar.k(i3);
                int iE = cgzVar.g(chb.e(jK)) == iS ? chb.e(jK) : iS >= cgzVar.e() ? cgzVar.i(cgzVar.e() - 1) : cgzVar.i(iS);
                int iA2 = cgzVar.g(chb.a(jK)) == iS ? chb.a(jK) : iS >= cgzVar.e() ? cgzVar.f(cgzVar.e() - 1, false) : cgzVar.f(iS, false);
                int i4 = i2;
                if (iE == i4) {
                    return amlVar2.a(iA2);
                }
                if (iA2 == i4) {
                    return amlVar2.a(iE);
                }
                if (!(anjVar2.a ^ (iA == 1)) ? i3 >= iE : i3 > iA2) {
                    iE = iA2;
                }
                return amlVar2.a(iE);
            }
        });
        long j = amnVar.b;
        int i3 = amlVar.c;
        if (i == i3) {
            return amnVar;
        }
        cgz cgzVar = amlVar.d;
        if (s(yftVarG) != cgzVar.g(i3)) {
            return I(yftVarG2);
        }
        int i4 = amnVar.a;
        long jK = cgzVar.k(i4);
        if (i3 != -1) {
            if (i != i3) {
                if (((z ? 1 : 0) ^ (amlVar.c() == 1 ? 1 : 0)) == 0) {
                }
            }
            return amlVar.a(i);
        }
        return (i4 == chb.e(jK) || i4 == chb.a(jK)) ? I(yftVarG2) : amlVar.a(i);
    }

    public static final amo u(anj anjVar, amc amcVar) {
        boolean z = anjVar.a() == 1;
        aml amlVar = anjVar.c;
        return new amo(J(amlVar, z, true, amcVar), J(amlVar, z, false, amcVar), z);
    }

    public static final amo v(amo amoVar, anj anjVar) {
        amn amnVar = amoVar.b;
        long j = amnVar.b;
        amn amnVar2 = amoVar.a;
        long j2 = amnVar2.b;
        if (amnVar2.a != amnVar.a) {
            return amoVar;
        }
        aml amlVar = anjVar.c;
        amo amoVar2 = anjVar.b;
        String strB = amlVar.b();
        if (amoVar2 == null || strB.length() == 0) {
            return amoVar;
        }
        String strB2 = amlVar.b();
        int i = amlVar.a;
        int length = strB2.length();
        if (i == 0) {
            int iQ = hq.q(strB2, 0);
            return anjVar.a ? amo.a(amoVar, H(amnVar2, amlVar, iQ), null, true, 2) : amo.a(amoVar, null, H(amnVar, amlVar, iQ), false, 1);
        }
        if (i == length) {
            int iR = hq.r(strB2, length);
            return anjVar.a ? amo.a(amoVar, H(amnVar2, amlVar, iR), null, false, 2) : amo.a(amoVar, null, H(amnVar, amlVar, iR), true, 1);
        }
        boolean z = amoVar2.c;
        boolean z2 = anjVar.a;
        int iR2 = z2 ^ z ? hq.r(strB2, i) : hq.q(strB2, i);
        return z2 ? amo.a(amoVar, H(amnVar2, amlVar, iR2), null, z, 2) : amo.a(amoVar, null, H(amnVar, amlVar, iR2), z, 1);
    }

    public static final void w(amg amgVar, bkd bkdVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1090171650);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(amgVar) : baoVarD.H(amgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.F(amgVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z3 || objT == ban.a) {
                objT = new ame(bkdVar, amgVar);
                basVar.ae(objT);
            }
            cnk.b((ame) objT, null, new cob(false, false), yjzVar, baoVarD, ((i2 << 3) & 7168) | 384, 2);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(amgVar, bkdVar, yjzVar, i, 5);
        }
    }

    public static final void x(bkp bkpVar, yjk yjkVar, boolean z, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2111672474);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            zy.k(bdi.E(zi.f(bkpVar, 25.0f, 25.0f), new kfc(yjkVar, z, 1)), baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly((Object) bkpVar, yjkVar, z, i, 0);
        }
    }

    public static final void y(final amg amgVar, final boolean z, final int i, final boolean z2, final long j, final float f, final bkp bkpVar, bao baoVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-466280168);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? baoVarD.F(amgVar) : baoVarD.H(amgVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.D(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 524288 : 1048576;
        }
        if (baoVarD.L((533651 & i3) != 533650, i3 & 1)) {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            final boolean zB = z ? anf.b(i, z2) : !anf.b(i, z2);
            bkd bkdVar = zB ? bjz.b : bjz.a;
            int i5 = i3 & 14;
            boolean zG = baoVarD.G(zB) | (i5 == 4 || ((i3 & 8) != 0 && baoVarD.H(amgVar))) | ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zG || objT == ban.a) {
                objT = new yjv() { // from class: alw
                    @Override // defpackage.yjv
                    public final Object a(Object obj) {
                        boolean z3 = z;
                        cfc cfcVar = (cfc) obj;
                        long jA = amgVar.a();
                        cfcVar.e(anf.a, new ane(z3 ? afo.b : afo.c, jA, true != zB ? 3 : 1, (9223372034707292159L & jA) != 9205357640488583168L));
                        return ygi.a;
                    }
                };
                basVar.ae(objT);
            }
            w(amgVar, bkdVar, bga.k(1365123137, new ama((cds) baoVarD.f(ccq.m), j, zB, cfd.b(bkpVar, false, (yjv) objT), amgVar), baoVarD), baoVarD, i5 | 384);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: alx
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    amg amgVar2 = amgVar;
                    boolean z3 = z;
                    int i6 = i;
                    boolean z4 = z2;
                    long j2 = j;
                    float f2 = f;
                    hw.y(amgVar2, z3, i6, z4, j2, f2, bkpVar, (bao) obj, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final bng z(blr blrVar, float f) {
        float fCeil = (float) Math.ceil(f);
        bng bngVarB = c;
        bnp bnpVarB = a;
        bpo bpoVar = b;
        int i = (int) fCeil;
        int i2 = i + i;
        if (bngVarB == null || bnpVarB == null || i2 > bngVarB.c() || i2 > bngVarB.b()) {
            bngVarB = bny.b(i2, i2, 1);
            c = bngVarB;
            bnpVarB = bnc.b(bngVarB);
            a = bnpVarB;
        }
        bng bngVar = bngVarB;
        bnp bnpVar = bnpVarB;
        if (bpoVar == null) {
            bpoVar = new bpo();
            b = bpoVar;
        }
        bpo bpoVar2 = bpoVar;
        cmi cmiVarN = blrVar.n();
        float fC = bngVar.c();
        float fB = bngVar.b();
        long jFloatToRawIntBits = Float.floatToRawIntBits(fC);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
        bpm bpmVar = bpoVar2.a;
        clx clxVar = bpmVar.a;
        cmi cmiVar = bpmVar.b;
        bnp bnpVar2 = bpmVar.c;
        long j = bpmVar.d;
        bpmVar.a = blrVar;
        bpmVar.b = cmiVarN;
        bpmVar.c = bnpVar;
        bpmVar.d = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        bnpVar.g();
        brx.o(bpoVar2, bnq.a, 0L, brx.m(bpoVar2), 0.0f, null, 58);
        brx.o(bpoVar2, bny.j(4278190080L), 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), 0.0f, null, R.styleable.AppCompatTheme_windowFixedHeightMajor);
        brx.F(bpoVar2, bny.j(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, R.styleable.AppCompatTheme_windowFixedHeightMajor);
        bnpVar.e();
        bpmVar.a = clxVar;
        bpmVar.b = cmiVar;
        bpmVar.c = bnpVar2;
        bpmVar.d = j;
        return bngVar;
    }
}
