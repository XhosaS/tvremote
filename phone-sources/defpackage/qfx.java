package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import j$.time.Instant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfx implements qfk {
    public final yfo b;
    private final yfo d;
    private final yfo e;
    private final yfo f;
    private final yfo g;
    private final yfo h;
    private final Context i;
    private final yfo j;
    private final yfo k;
    private final yfo l;
    private final yow m;
    private static final tvn c = tvn.n("GnpSdk");
    public static final Set a = yfm.aZ(new Integer[]{1, 2, 3});

    public qfx(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, Context context, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, yow yowVar) {
        yfoVar.getClass();
        yfoVar2.getClass();
        yfoVar3.getClass();
        yfoVar4.getClass();
        yfoVar5.getClass();
        yfoVar6.getClass();
        yfoVar7.getClass();
        yfoVar8.getClass();
        yfoVar9.getClass();
        this.d = yfoVar;
        this.e = yfoVar2;
        this.f = yfoVar3;
        this.g = yfoVar4;
        this.h = yfoVar5;
        this.i = context;
        this.j = yfoVar6;
        this.k = yfoVar7;
        this.b = yfoVar8;
        this.l = yfoVar9;
        this.m = yowVar;
    }

    private final void m() {
        tst tstVar = (tst) ((xcn) this.k).a;
        if (tstVar.g()) {
            ((qfj) tstVar.c()).a();
        }
    }

    private final byte[] n(byte[] bArr, boolean z, qfi qfiVar) {
        qdl qdjVar;
        yfo yfoVar = this.g;
        long epochMilli = Instant.now().toEpochMilli();
        tvn tvnVar = qht.a;
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inflaterInputStream.available()));
                wef.w(inflaterInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                wef.v(inflaterInputStream, null);
                qdjVar = new qdn(byteArray);
            } finally {
            }
        } catch (Exception e) {
            ((tvk) ((tvk) qht.a.f()).i(e)).s("Failed to decompress the decrypted bytes.");
            qdjVar = new qdj(e, 68);
        }
        ((snc) ((qoj) this.j.b()).g.get()).b(Instant.now().toEpochMilli() - epochMilli, this.i.getPackageName(), Boolean.valueOf(qdjVar.g()));
        if (qdjVar instanceof qdn) {
            return (byte[]) ((qdn) qdjVar).a;
        }
        ((tvk) ((tvk) c.g()).i(qdjVar.f())).s("Payload decompression failed.");
        vhq vhqVar = z ? vhq.FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER : vhq.FAILED_TO_DECOMPRESS;
        yfo yfoVar2 = this.e;
        yfo yfoVar3 = this.f;
        qhn qhnVarB = ((qhp) yfoVar2).b();
        qhs qhsVarM = ((qhq) yfoVar3).b().m(vhqVar);
        vhi vhiVarB = qfiVar.b();
        vhiVarB.getClass();
        qhsVarM.a(vhiVarB);
        qhnVarB.a(qhsVarM);
        return null;
    }

    private static final qfn o(qfi qfiVar, boolean z) {
        byte[] bArrDecode;
        vku vkuVarA;
        tvn tvnVar = qfm.a;
        String str = qfiVar.d;
        qfn qfnVar = null;
        if (str == null) {
            vkuVarA = null;
        } else {
            try {
                bArrDecode = Base64.decode(str, 1);
            } catch (IllegalArgumentException e) {
                ((tvk) ((tvk) qfm.a.f()).i(e)).s("Failed to decode payload string into bytes.");
                bArrDecode = null;
            }
            vkuVarA = qfm.a(bArrDecode);
        }
        if (vkuVarA != null) {
            qfnVar = new qfn(vkuVarA, z ? qfz.c : qfz.a);
        }
        return qfnVar;
    }

    @Override // defpackage.qeq
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.qeq
    public final Object b(Intent intent, qdo qdoVar, long j, yih yihVar) {
        Object objE = e(qfi.a(intent), qdoVar, j, yihVar);
        return objE == yio.a ? objE : ygi.a;
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        f(qfi.a(intent), qdoVar, j);
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        if (!yks.e("com.google.android.c2dm.intent.RECEIVE", intent.getAction())) {
            return false;
        }
        tuv tuvVarL = c.l();
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append('\n');
            }
        }
        sb.append("]");
        tuvVarL.B("onReceive: %s \n %s", action, sb.toString());
        qfi qfiVarA = qfi.a(intent);
        int i = qfiVarA.g;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                return qfiVarA.c();
            }
            if (i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qfk
    public final Object e(qfi qfiVar, qdo qdoVar, long j, yih yihVar) {
        c.l().s("Handling an FCM message in the PushIntentHandler.");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qhn qhnVarB = ((qhp) this.e).b();
        qhs qhsVarN = ((qhq) this.f).b().n(vie.DELIVERED_FCM_PUSH);
        vhi vhiVarB = qfiVar.b();
        vhiVarB.getClass();
        qhsVarN.a(vhiVarB);
        qhsVarN.n = j;
        qhnVarB.a(qhsVarN);
        int i = qfiVar.g;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                Object objI = i(qfiVar, qdoVar, j, jElapsedRealtime, yihVar);
                if (objI == yio.a) {
                    return objI;
                }
            } else if (i2 == 2) {
                rmk rmkVar = (rmk) this.b;
                rmkVar.a();
                Object objA = ((ptr) ((ttd) rmkVar.a()).a).a(a, yihVar);
                if (objA == yio.a) {
                    return objA;
                }
            }
        }
        return ygi.a;
    }

    @Override // defpackage.qfk
    public final void f(qfi qfiVar, qdo qdoVar, long j) throws Throwable {
        c.l().s("Handling an FCM message in the PushIntentHandler.");
        yfo yfoVar = this.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qhn qhnVarB = ((qhp) yfoVar).b();
        qhs qhsVarN = ((qhq) this.f).b().n(vie.DELIVERED_FCM_PUSH);
        vhi vhiVarB = qfiVar.b();
        vhiVarB.getClass();
        qhsVarN.a(vhiVarB);
        qhsVarN.n = j;
        qhnVarB.a(qhsVarN);
        int i = qfiVar.g;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1) {
        } else {
            if (i2 != 2) {
                return;
            }
            ((rmk) this.b).a();
            ykr.n(yim.a, new oza(this, (yih) null, 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.vsz r5, boolean r6, defpackage.qfi r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qfp
            if (r0 == 0) goto L13
            r0 = r8
            qfp r0 = (defpackage.qfp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qfp r0 = new qfp
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r6 = r0.a
            qfi r7 = r0.e
            defpackage.ybn.f(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r8)
            byte[] r5 = r5.w()
            r5.getClass()
            r0.e = r7
            r0.a = r6
            r0.d = r3
            java.lang.Object r8 = r4.l(r6, r7, r0)
            if (r8 == r1) goto L5d
        L49:
            byte[] r8 = (byte[]) r8
            r5 = 0
            if (r8 != 0) goto L4f
            return r5
        L4f:
            byte[] r6 = r4.n(r8, r6, r7)
            if (r6 != 0) goto L56
            return r5
        L56:
            tvn r5 = defpackage.qfm.a
            vku r5 = defpackage.qfm.a(r6)
            return r5
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.g(vsz, boolean, qfi, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.qfi r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.h(qfi, yih):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:170|(1:190)|171|172|194|173|174|196|175|(4:177|186|168|(2:187|188)(0))|189) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x032e, code lost:
    
        if (r4 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0454, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0456, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0457, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x045e, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x045f, code lost:
    
        ((defpackage.tvk) ((defpackage.tvk) defpackage.qfx.c.g()).i(r0)).s("Error while waiting for SystemTrayPushHandler to complete.");
        r2 = defpackage.ygi.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (r0 != r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017e, code lost:
    
        if (r5.length() > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018a, code lost:
    
        if (r5.length() <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018d, code lost:
    
        r0 = ((defpackage.qhq) r23.f).b().m(defpackage.vhq.RECIPIENT_NOT_FOUND);
        r3 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
    
        if (r3 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019f, code lost:
    
        r3 = defpackage.vlq.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        r3.getClass();
        r0.c(r3);
        r3 = r15.b();
        r3.getClass();
        r0.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b5, code lost:
    
        if (defpackage.xgd.b() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        r3 = ((defpackage.qhp) r23.e).b();
        r2 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
    
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c3, code lost:
    
        r2 = defpackage.vmc.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        r2 = r2.d;
        r2.getClass();
        r0.o = r2;
        r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d0, code lost:
    
        r3 = ((defpackage.qhp) r23.e).b();
        r2 = r2.c;
        r2.getClass();
        r0.i = r2;
        r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e2, code lost:
    
        m();
        ((defpackage.tvk) defpackage.qfx.c.g()).s("Recipient was not found on the device for this user targeted notification.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f4, code lost:
    
        return defpackage.ygi.a;
     */
    /* JADX WARN: Path cross not found for [B:125:0x02b3, B:86:0x0225], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:96:0x025f, B:102:0x026e], limit reached: 191 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0452 -> B:186:0x046c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.qfi r24, defpackage.qdo r25, long r26, long r28, defpackage.yih r30) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.i(qfi, qdo, long, long, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r11.a(r9, r8, r10, r6) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r1.d(r9, r8, r4, r11, r6) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.vku r8, defpackage.qen r9, defpackage.qfi r10, defpackage.qdo r11, defpackage.yih r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.j(vku, qen, qfi, qdo, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.qfi r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qfw
            if (r0 == 0) goto L13
            r0 = r6
            qfw r0 = (defpackage.qfw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qfw r0 = new qfw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r6)     // Catch: java.lang.Exception -> L27
            goto L71
        L27:
            r5 = move-exception
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            java.lang.String r5 = r5.f
            if (r5 == 0) goto L71
            yfo r5 = r4.h
            xcn r5 = (defpackage.xcn) r5
            java.lang.Object r5 = r5.a
            tst r5 = (defpackage.tst) r5
            boolean r6 = r5.g()
            if (r6 == 0) goto L61
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Exception -> L27
            qim r5 = (defpackage.qim) r5     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L71
            return r1
        L55:
            tvn r6 = defpackage.qfx.c
            tuv r6 = r6.g()
            java.lang.String r0 = "Failed to save the key to invalidate in shared preferences."
            defpackage.a.co(r6, r0, r5)
            goto L71
        L61:
            tvn r5 = defpackage.qfx.c
            tuv r5 = r5.f()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r6 = "Can't save key to invalidate because GnpEncryptionManager is missing."
            r5.s(r6)
            ygi r5 = defpackage.ygi.a
            return r5
        L71:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.k(qfi, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(boolean r17, defpackage.qfi r18, defpackage.yih r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfx.l(boolean, qfi, yih):java.lang.Object");
    }
}
