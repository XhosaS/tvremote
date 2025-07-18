package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbl implements scc {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer");
    public final ruo b;
    public final int c;
    public final smw d;
    public final sca e;
    public final Executor f;
    public final CopyOnWriteArrayList g;
    public final taa h;
    public final agzy i;
    public final scb j;
    public final String k;
    public final agzw l;
    public rsw m;
    private final List n;
    private final Executor o;
    private final Set p = new LinkedHashSet();

    public sbl(ruo ruoVar, int i, int i2, yqt yqtVar, List list, Executor executor, smw smwVar, sca scaVar) {
        this.b = ruoVar;
        this.c = i2;
        this.n = list;
        this.o = executor;
        this.d = smwVar;
        this.e = scaVar;
        this.f = new zyt(executor);
        this.g = new CopyOnWriteArrayList(list);
        this.h = new taa(i * i2, i, new agux() { // from class: sbh
            @Override // defpackage.agux
            public final Object a(Object obj) {
                rsu rsuVar = (rsu) obj;
                rsuVar.getClass();
                return Integer.valueOf((rsuVar.c == 1 ? (rss) rsuVar.d : rss.a).c.d());
            }
        });
        agzz agzzVar = agzz.a;
        this.i = new agzy(null, agzzVar);
        this.j = new scb(ruoVar, i2, yqtVar);
        String strA = szx.a(this);
        this.k = strA;
        this.l = new agzw(0, agzzVar);
        rsw rswVar = rsw.a;
        this.m = rtl.a(new rsv());
        if (i <= 0) {
            throw new IllegalArgumentException("max number of chunks should be positive");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("chunk size should be positive");
        }
        smwVar.d(strA);
    }

    @Override // defpackage.rsp
    public final rso a(final rsm rsmVar, rsn rsnVar) {
        zdv zdvVar = (zdv) a.b().o(zfi.a, "ALT.BytesReceiverBuffer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "registerAudioBytesReceiver", 257, "AudioBytesReceiverAudioBuffer.kt");
        int i = rsnVar.a;
        zdvVar.J("#audio# registering receiver(%s), range(offset=%d, minimal=%s), buffer(%s)", szx.a(rsmVar), 0, i == Integer.MAX_VALUE ? "no-limit" : Integer.valueOf(i), this.k);
        final sbk sbkVar = new sbk(this, i);
        return new rso(zxn.k(wyo.i(new Callable() { // from class: sbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                sbl sblVar = this.a;
                scb scbVar = sblVar.j;
                taa taaVar = sblVar.h;
                smw smwVar = sblVar.d;
                String str = sblVar.k;
                int i2 = taaVar.f;
                smwVar.B(str, i2, scbVar.e);
                rsm rsmVar2 = rsmVar;
                sbq sbqVar = new sbq(new sbv(rsmVar2));
                zyd zydVar = (zyd) ((scn) sci.a(sblVar, scn.class).e(sco.e)).a();
                Duration durationOfMillis = Duration.ofMillis(0L);
                durationOfMillis.getClass();
                ahbt ahbtVar = (ahbt) sblVar.e.a.a();
                ahbtVar.getClass();
                sbp sbpVar = new sbp(new sbz(zydVar, sblVar.b, sbqVar, durationOfMillis, ahbtVar));
                sbk sbkVar2 = sbkVar;
                if (i2 > 0) {
                    ((zdv) sbl.a.d().o(zfi.a, "ALT.BytesReceiverBuffer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "registerAudioBytesReceiverInternal", 299, "AudioBytesReceiverAudioBuffer.kt")).I("#audio# registering receiver(%s), disposed(%d), buffer(%s)", szx.a(rsmVar2), Integer.valueOf(i2), str);
                    sbkVar2.a.c(sbpVar);
                    sblVar.j(sbkVar2);
                    z = false;
                } else {
                    sbkVar2.a.c(new sbt(sbpVar, -i2));
                    sblVar.j(sbkVar2);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), this.f), new agum() { // from class: sbg
            @Override // defpackage.agum
            public final Object a() {
                final sbl sblVar = this.a;
                final sbk sbkVar2 = sbkVar;
                sblVar.f.execute(wyo.h(new Runnable() { // from class: sbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        sbl sblVar2 = sblVar;
                        scb scbVar = sblVar2.j;
                        sbo sboVar = sbkVar2;
                        rsu rsuVarB = scbVar.b(false);
                        if (rsuVarB != null) {
                            sblVar2.f(sboVar, rsuVarB);
                        }
                        rsu rsuVar = rsu.a;
                        rst rstVar = new rst();
                        rtj rtjVar = rtj.a;
                        rti rtiVar = new rti();
                        rzc.b(rtiVar);
                        rtj rtjVarA = rzc.a(rtiVar);
                        if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rstVar.y();
                        }
                        rsu rsuVar2 = (rsu) rstVar.b;
                        rsuVar2.d = rtjVarA;
                        rsuVar2.c = 2;
                        sblVar2.f(sboVar, rsq.a(rstVar));
                    }
                }));
                return agpu.a;
            }
        });
    }

    @Override // defpackage.tac
    public final int b() {
        return this.l.c;
    }

    public final void c(rsu rsuVar) {
        Object objC;
        if (rsuVar.c != 2) {
            taa taaVar = this.h;
            int i = taaVar.d;
            agux aguxVar = taaVar.b;
            taaVar.d = i + ((Number) aguxVar.a(rsuVar)).intValue();
            while (taaVar.d > taaVar.a && (objC = taaVar.c.c()) != null) {
                int iIntValue = ((Number) aguxVar.a(objC)).intValue();
                taaVar.d -= iIntValue;
                taaVar.f += iIntValue;
            }
            taaVar.c.addLast(rsuVar);
        } else if (!this.i.d(null, rsuVar)) {
            return;
        }
        Iterator it = new ArrayList(this.p).iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            f((sbo) next, rsuVar);
        }
    }

    @Override // defpackage.scd
    public final List d() {
        return sci.b(this.n);
    }

    @Override // defpackage.scd
    public final void e(final List list) {
        list.getClass();
        this.f.execute(wyo.h(new Runnable() { // from class: sbe
            @Override // java.lang.Runnable
            public final void run() {
                sbl sblVar = this.a;
                if (sblVar.i.a != null) {
                    return;
                }
                List list2 = list;
                ((zdv) sbl.a.b().o(zfi.a, "ALT.BytesReceiverBuffer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "addAudioBufferProcessors$lambda$4", 105, "AudioBytesReceiverAudioBuffer.kt")).D("#audio# adding buffer(%s) processors, missed(%d)", sblVar.k, sblVar.l.c);
                sblVar.g.addAll(list2);
            }
        }));
    }

    public final void f(sbo sboVar, rsu rsuVar) {
        sboVar.b(rsuVar);
        if (rsuVar.c == 2 && this.p.remove(sboVar)) {
            ((zdv) a.b().o(zfi.a, "ALT.BytesReceiverBuffer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "emitAudio", 221, "AudioBytesReceiverAudioBuffer.kt")).F("#audio# unregistering receiver(%s) due to EOF, buffer(%s)", szx.a(sboVar), this.k);
        }
    }

    @Override // defpackage.tac
    public final void g() {
        this.f.execute(wyo.h(new Runnable() { // from class: sbi
            @Override // java.lang.Runnable
            public final void run() {
                sbl sblVar = this.a;
                if (sblVar.i.a != null) {
                    return;
                }
                smw smwVar = sblVar.d;
                String str = sblVar.k;
                scb scbVar = sblVar.j;
                smwVar.a(str, scbVar.e);
                ((zdv) sbl.a.b().o(zfi.a, "ALT.BytesReceiverBuffer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "markBufferClosedInternal", 192, "AudioBytesReceiverAudioBuffer.kt")).D("#audio# marking buffer(%s) closed, available(%d)", str, scbVar.e);
                Iterator it = sblVar.g.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    ((sch) next).b();
                }
                rsu rsuVarB = scbVar.b(true);
                if (rsuVarB != null) {
                    sblVar.c(rsuVarB);
                }
                rsu rsuVar = rsu.a;
                rst rstVar = new rst();
                rtj rtjVar = rtj.a;
                rti rtiVar = new rti();
                rzc.b(rtiVar);
                rtj rtjVarA = rzc.a(rtiVar);
                if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rstVar.y();
                }
                rsu rsuVar2 = (rsu) rstVar.b;
                rsuVar2.d = rtjVarA;
                rsuVar2.c = 2;
                sblVar.c(rsq.a(rstVar));
            }
        }));
    }

    @Override // defpackage.tae
    public final void h(final sdx sdxVar, final byte[] bArr) {
        boolean z;
        if (sdxVar.c()) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.BytesReceiverBuffer")).N().q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "writeToBuffer", 116, "AudioBytesReceiverAudioBuffer.kt")).u("#audio# skipping an error write request");
            return;
        }
        int i = sdxVar.a;
        Iterator it = this.g.iterator();
        it.getClass();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                int iC = ((sch) next).c(bArr, i);
                if (z || iC == 3) {
                    z = true;
                }
            }
        }
        if (z) {
            ((zdv) ((zdv) a.b().o(zfi.a, "ALT.BytesReceiverBuffer")).N().q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "processBufferData", 135, "AudioBytesReceiverAudioBuffer.kt")).x("#audio# silencing buffer(%s) -- skip requested...", this.k);
            bArr = new byte[i];
        }
        this.f.execute(wyo.h(new Runnable() { // from class: sbc
            @Override // java.lang.Runnable
            public final void run() {
                sbl sblVar;
                int i2;
                sbl sblVar2;
                sbc sbcVar = this;
                sbl sblVar3 = sbcVar.a;
                if (sblVar3.i.a != null) {
                    return;
                }
                int i3 = 1;
                int i4 = 0;
                if ((sblVar3.m.b & 1) == 0) {
                    rsv rsvVar = new rsv();
                    rtl.b(1, rsvVar);
                    sblVar3.i(rtl.a(rsvVar));
                }
                int i5 = 0;
                while (true) {
                    sdx sdxVar2 = sdxVar;
                    int i6 = sdxVar2.a;
                    if (i5 >= i6) {
                        zer zerVar = zfi.a;
                        TimeUnit.SECONDS.getClass();
                        return;
                    }
                    int i7 = sblVar3.c;
                    int i8 = i6 - i5;
                    if (i7 <= i8) {
                        i8 = i7;
                    }
                    sdx sdxVarB = sdxVar2.b(i8, i5, sblVar3.b);
                    scb scbVar = sblVar3.j;
                    if (sdxVarB.c()) {
                        throw new IllegalArgumentException("Only successful reads can be part of the buffer");
                    }
                    int i9 = sdxVarB.a;
                    byte[] bArr2 = scbVar.b;
                    int length = bArr2.length;
                    if (i9 > length) {
                        throw new IllegalArgumentException("Bytes written should fit the buffer size");
                    }
                    rsu rsuVar = null;
                    if (i9 == 0) {
                        sblVar2 = sblVar3;
                        i2 = i4;
                    } else {
                        byte[] bArr3 = bArr;
                        int i10 = scbVar.d;
                        int i11 = length - i10;
                        if (i11 > i9) {
                            System.arraycopy(bArr3, i5, bArr2, i10, i9);
                            scbVar.f = sdxVarB.a(scbVar.f + i9);
                            sblVar = sblVar3;
                            i2 = i4;
                        } else {
                            sdx sdxVarB2 = sdxVarB.b(i11, i4, scbVar.a);
                            int i12 = i3;
                            scbVar.c = sdxVarB2.b;
                            scbVar.f = sdxVarB2.a(scbVar.f + i11);
                            System.arraycopy(bArr3, i5, bArr2, scbVar.d, i11);
                            int i13 = scbVar.e + i11;
                            rsu rsuVar2 = rsu.a;
                            rst rstVar = new rst();
                            rss rssVar = rss.a;
                            rsr rsrVar = new rsr();
                            abvo abvoVarU = abvo.u(bArr2, 0, length);
                            if ((rsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                rsrVar.y();
                            }
                            rss rssVar2 = (rss) rsrVar.b;
                            rssVar2.b |= 1;
                            rssVar2.c = abvoVarU;
                            rss rssVarA = rud.a(rsrVar);
                            if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                rstVar.y();
                            }
                            rsu rsuVar3 = (rsu) rstVar.b;
                            rsuVar3.d = rssVarA;
                            rsuVar3.c = i12;
                            sblVar = sblVar3;
                            rsu rsuVarA = scbVar.a(rsq.a(rstVar), i13 - length, i13 - 1);
                            int i14 = i9 - i11;
                            i2 = 0;
                            System.arraycopy(bArr3, i11 + i5, bArr2, 0, i14);
                            scbVar.f = sdxVarB.a(scbVar.f + i14);
                            rsuVar = rsuVarA;
                        }
                        scbVar.d = (scbVar.d + i9) % length;
                        scbVar.c = sdxVarB.b;
                        scbVar.e += i9;
                        sblVar2 = sblVar;
                    }
                    sblVar2.l.c = scbVar.e;
                    if (rsuVar != null) {
                        sblVar2.c(rsuVar);
                    }
                    i5 += i7;
                    sblVar3 = sblVar2;
                    i4 = i2;
                    i3 = 1;
                    sbcVar = this;
                }
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.rsw r7) {
        /*
            r6 = this;
            agzy r0 = r6.i
            java.lang.Object r0 = r0.a
            if (r0 == 0) goto L8
            goto L9b
        L8:
            rsw r0 = r6.m
            int r1 = r7.b
            r2 = 1
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto L43
            int r1 = r0.b
            r1 = r1 & r2
            if (r1 == 0) goto L2a
            int r1 = r7.c
            int r1 = defpackage.rsy.a(r1)
            if (r1 != 0) goto L1f
            r1 = r2
        L1f:
            int r4 = r0.c
            int r4 = defpackage.rsy.a(r4)
            if (r4 != 0) goto L28
            r4 = r2
        L28:
            if (r1 == r4) goto L43
        L2a:
            rsv r1 = new rsv
            r1.<init>()
            r1.B(r0)
            int r7 = r7.c
            int r7 = defpackage.rsy.a(r7)
            if (r7 != 0) goto L3b
            r7 = r2
        L3b:
            defpackage.rtl.b(r7, r1)
            rsw r0 = defpackage.rtl.a(r1)
            r3 = r2
        L43:
            if (r2 == r3) goto L46
            r0 = 0
        L46:
            if (r0 == 0) goto L9b
            zdy r7 = defpackage.sbl.a
            zeo r7 = r7.b()
            zer r1 = defpackage.zfi.a
            java.lang.String r3 = "ALT.BytesReceiverBuffer"
            zeo r7 = r7.o(r1, r3)
            r1 = 176(0xb0, float:2.47E-43)
            java.lang.String r3 = "AudioBytesReceiverAudioBuffer.kt"
            java.lang.String r4 = "com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer"
            java.lang.String r5 = "noteAudioStateInternal"
            zeo r7 = r7.q(r4, r5, r1, r3)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r1 = r6.k
            java.lang.String r3 = "#audio# noting buffer(%s) new state(%s)"
            r7.F(r3, r1, r0)
            scb r7 = r6.j
            rsu r7 = r7.b(r2)
            if (r7 == 0) goto L76
            r6.c(r7)
        L76:
            r6.m = r0
            rsu r7 = defpackage.rsu.a
            rst r7 = new rst
            r7.<init>()
            abxd r1 = r7.b
            int r1 = r1.memoizedSerializedSize
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 != 0) goto L8b
            r7.y()
        L8b:
            abxd r1 = r7.b
            rsu r1 = (defpackage.rsu) r1
            r1.d = r0
            r0 = 7
            r1.c = r0
            rsu r7 = defpackage.rsq.a(r7)
            r6.c(r7)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.i(rsw):void");
    }

    public final void j(sbo sboVar) {
        this.p.add(sboVar);
        Iterator it = this.h.e.iterator();
        while (it.hasNext()) {
            f(sboVar, (rsu) it.next());
        }
        rsu rsuVar = (rsu) this.i.a;
        if (rsuVar != null) {
            f(sboVar, rsuVar);
        }
    }
}
