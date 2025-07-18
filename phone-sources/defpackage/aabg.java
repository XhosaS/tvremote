package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aabg extends zzy {
    private final AtomicInteger a;
    private final aabj b;

    public aabg() {
        aabj aabjVar = new aabj();
        this.a = new AtomicInteger();
        this.b = aabjVar;
    }

    private static int e(zzv zzvVar) {
        int iOrdinal = zzvVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    return 0;
                }
            }
        }
        return i;
    }

    @Override // defpackage.zzy
    public final long a() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[PHI: r1
  0x0031: PHI (r1v8 int) = (r1v3 int), (r1v9 int), (r1v10 int) binds: [B:13:0x0027, B:15:0x002a, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.zzu r20) {
        /*
            r19 = this;
            r0 = r20
            zyg r1 = new zyg
            java.lang.String r2 = "CronetLoggerImpl#logCronetEngineBuilderInitializedInfo"
            r3 = 0
            r1.<init>(r2, r3)
            long r4 = r0.a     // Catch: java.lang.Throwable -> L76
            int r1 = r0.h     // Catch: java.lang.Throwable -> L76
            int r2 = r1 + (-1)
            if (r1 == 0) goto L74
            r1 = 2
            r6 = 1
            if (r2 == 0) goto L1c
            if (r2 == r6) goto L1a
            r2 = r3
            goto L1d
        L1a:
            r2 = r1
            goto L1d
        L1c:
            r2 = r6
        L1d:
            int r7 = r0.b     // Catch: java.lang.Throwable -> L76
            zzv r8 = r0.c     // Catch: java.lang.Throwable -> L76
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L76
            if (r8 == r6) goto L33
            if (r8 == r1) goto L31
            r1 = 3
            if (r8 == r1) goto L31
            r1 = 4
            if (r8 == r1) goto L31
            r8 = r3
            goto L34
        L31:
            r8 = r1
            goto L34
        L33:
            r8 = r6
        L34:
            java.lang.Boolean r1 = r0.d     // Catch: java.lang.Throwable -> L76
            int r1 = defpackage.vxr.aD(r1)     // Catch: java.lang.Throwable -> L76
            r3 = -1
            int r9 = r1 + (-1)
            zzx r1 = r0.e     // Catch: java.lang.Throwable -> L76
            int r10 = r1.a     // Catch: java.lang.Throwable -> L76
            int r11 = r1.b     // Catch: java.lang.Throwable -> L76
            int r12 = r1.c     // Catch: java.lang.Throwable -> L76
            int r13 = r1.d     // Catch: java.lang.Throwable -> L76
            zzx r1 = r0.f     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L4d
            r14 = r3
            goto L50
        L4d:
            int r6 = r1.a     // Catch: java.lang.Throwable -> L76
            r14 = r6
        L50:
            if (r1 != 0) goto L54
            r15 = r3
            goto L57
        L54:
            int r6 = r1.b     // Catch: java.lang.Throwable -> L76
            r15 = r6
        L57:
            if (r1 != 0) goto L5c
            r16 = r3
            goto L60
        L5c:
            int r6 = r1.c     // Catch: java.lang.Throwable -> L76
            r16 = r6
        L60:
            if (r1 != 0) goto L65
        L62:
            r17 = r3
            goto L68
        L65:
            int r3 = r1.d     // Catch: java.lang.Throwable -> L76
            goto L62
        L68:
            int r0 = r0.g     // Catch: java.lang.Throwable -> L76
            r18 = r0
            r6 = r2
            defpackage.vxr.aE(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()
            return
        L74:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            r1 = r0
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r0 = move-exception
            r1.addSuppressed(r0)
        L80:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabg.b(zzu):void");
    }

    @Override // defpackage.zzy
    public final void c(long j, zzt zztVar, zzx zzxVar, zzv zzvVar) {
        int i;
        int i2;
        boolean z;
        Object objCast;
        if (zzvVar == null) {
            return;
        }
        try {
            new zyg("CronetLoggerImpl#writeCronetEngineCreation", 0);
            try {
                aabh aabhVar = new aabh(zztVar.f);
                int i3 = zzxVar.a;
                int i4 = zzxVar.b;
                int i5 = zzxVar.c;
                int i6 = zzxVar.d;
                int iE = e(zzvVar);
                boolean z2 = zztVar.d;
                boolean z3 = zztVar.c;
                int i7 = zztVar.e;
                int i8 = 1;
                if (i7 == 0) {
                    i = i8;
                } else if (i7 != 1) {
                    i8 = i7 != 2 ? 4 : 3;
                    i = i8;
                } else {
                    i = 2;
                }
                boolean z4 = zztVar.a;
                boolean z5 = zztVar.b;
                boolean z6 = zztVar.g;
                String string = (String) aabhVar.f("QUIC", "connection_options", null, String.class);
                if (aabh.h(string)) {
                    i2 = -1;
                    z = z5;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArrSplit = string.split(",", -1);
                    i2 = -1;
                    int length = strArrSplit.length;
                    z = z5;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = length;
                        String str = strArrSplit[i9];
                        int i11 = i9;
                        String[] strArr = strArrSplit;
                        if (aabh.a.contains(str.toUpperCase(Locale.ROOT).trim())) {
                            arrayList.add(str);
                        }
                        i9 = i11 + 1;
                        length = i10;
                        strArrSplit = strArr;
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        CharSequence charSequence = (CharSequence) it.next();
                        while (true) {
                            sb.append(charSequence);
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) ",");
                            charSequence = (CharSequence) it.next();
                        }
                    }
                    string = sb.toString();
                }
                String str2 = string;
                int iAD = vxr.aD((Boolean) aabhVar.f("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                int iB = aabhVar.b();
                int iA = aabhVar.a();
                int iAD2 = vxr.aD((Boolean) aabhVar.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iAD3 = vxr.aD((Boolean) aabhVar.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iK = aabhVar.k() - 1;
                int iJ = aabhVar.j() - 1;
                int iAD4 = vxr.aD((Boolean) aabhVar.f("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                Integer numValueOf = Integer.valueOf(i2);
                int iIntValue = ((Integer) aabhVar.f("QUIC", "max_time_before_crypto_handshake_seconds", numValueOf, Integer.class)).intValue();
                int iIntValue2 = ((Integer) aabhVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", numValueOf, Integer.class)).intValue();
                int iAD5 = vxr.aD((Boolean) aabhVar.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                int i12 = aabhVar.i() - 1;
                int iM = aabhVar.m() - 1;
                int iC = aabhVar.c();
                int iD = aabhVar.d();
                int iIntValue3 = ((Integer) aabhVar.f("StaleDNS", "max_stale_uses", numValueOf, Integer.class)).intValue();
                int iL = aabhVar.l() - 1;
                int iN = aabhVar.n() - 1;
                int iE2 = aabhVar.e();
                int iO = aabhVar.o() - 1;
                if (aabhVar.b.length() == 0) {
                    objCast = null;
                } else {
                    try {
                        objCast = Boolean.class.cast(aabhVar.b.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException unused) {
                    }
                }
                vxr.aF(j, i3, i4, i5, i6, iE, z2, z3, i, z4, z, z6, str2, iAD, iB, iA, iAD2, iAD3, iK, iJ, iAD4, iIntValue, iIntValue2, iAD5, i12, iM, iC, iD, iIntValue3, iL, iN, iE2, iO, vxr.aD((Boolean) objCast) - 1, zztVar.h, Process.myUid());
                Trace.endSection();
            } finally {
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.zzy
    public final void d(long j, zzw zzwVar) throws Throwable {
        Throwable th;
        int i;
        int i2;
        byte[] bytes;
        aabj aabjVar = this.b;
        synchronized (aabjVar.a) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (aabjVar.c + 1000 <= jElapsedRealtime) {
                aabjVar.b = 1;
                aabjVar.c = jElapsedRealtime;
            } else {
                if (aabjVar.b > 0) {
                    this.a.incrementAndGet();
                    return;
                }
                aabjVar.b = 1;
            }
            ?? r2 = this.a;
            int andSet = r2.getAndSet(0);
            try {
                try {
                    new zyg("CronetLoggerImpl#writeCronetTrafficReported", 0);
                    try {
                        long j2 = zzwVar.a;
                        vxr.aB(j2, "Request header size is negative");
                        double d = j2 / 1024.0d;
                        int i3 = 5;
                        if (vxr.aC(d, 0, 1)) {
                            i3 = 1;
                        } else if (vxr.aC(d, 1, 10)) {
                            i3 = 2;
                        } else if (vxr.aC(d, 10, 25)) {
                            i3 = 3;
                        } else if (vxr.aC(d, 25, 50)) {
                            i3 = 4;
                        } else if (!vxr.aC(d, 50, 100)) {
                            i3 = 6;
                        }
                        vxr.aB(-1L, "Request body size is negative");
                        int i4 = vxr.aC(-9.765625E-4d, 10, 50) ? 3 : vxr.aC(-9.765625E-4d, 50, 200) ? 4 : vxr.aC(-9.765625E-4d, 200, 500) ? 5 : vxr.aC(-9.765625E-4d, 500, 1000) ? 6 : vxr.aC(-9.765625E-4d, 1000, 5000) ? 7 : 8;
                        long j3 = zzwVar.b;
                        vxr.aB(j3, "Response header size is negative");
                        double d2 = j3 / 1024.0d;
                        if (vxr.aC(d2, 0, 1)) {
                            i2 = 1;
                            i = 1000;
                        } else if (vxr.aC(d2, 1, 10)) {
                            i = 1000;
                            i2 = 2;
                        } else if (vxr.aC(d2, 10, 25)) {
                            i = 1000;
                            i2 = 3;
                        } else if (vxr.aC(d2, 25, 50)) {
                            i = 1000;
                            i2 = 4;
                        } else if (vxr.aC(d2, 50, 100)) {
                            i = 1000;
                            i2 = 5;
                        } else {
                            i = 1000;
                            i2 = 6;
                        }
                        long j4 = zzwVar.c;
                        vxr.aB(j4, "Response body size is negative");
                        double d3 = j4 / 1024.0d;
                        int i5 = d3 == 0.0d ? 1 : (d3 <= 0.0d || d3 >= 10.0d) ? vxr.aC(d3, 10, 50) ? 3 : vxr.aC(d3, 50, 200) ? 4 : vxr.aC(d3, 200, 500) ? 5 : vxr.aC(d3, 500, i) ? 6 : vxr.aC(d3, i, 5000) ? 7 : 8 : 2;
                        int i6 = zzwVar.d;
                        String str = zzwVar.g;
                        MessageDigest messageDigest = aabi.a;
                        long j5 = 0;
                        if (messageDigest != null && str != null) {
                            try {
                                if (!str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                                    j5 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = andSet;
                                try {
                                    Trace.endSection();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        }
                        long j6 = j5;
                        int millis = (int) zzwVar.e.toMillis();
                        int millis2 = (int) zzwVar.f.toMillis();
                        int i7 = zzwVar.n - 1;
                        vxr.aG(j, i3, i4, i2, i5, i6, j6, millis, millis2, andSet, i7 != 0 ? i7 != 1 ? 3 : 2 : 1, zzwVar.h, zzwVar.i, zzwVar.j, vxr.aD(false) - 1, vxr.aD(Boolean.valueOf(zzwVar.k)) - 1, zzwVar.l, vxr.aD(false) - 1, e(zzwVar.m));
                        Trace.endSection();
                    } catch (Throwable th4) {
                        r2 = andSet;
                        th = th4;
                    }
                } catch (Exception unused) {
                    r2 = andSet;
                    this.a.addAndGet(r2);
                }
            } catch (Exception unused2) {
                this.a.addAndGet(r2);
            }
        }
    }
}
