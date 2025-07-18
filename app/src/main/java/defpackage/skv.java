package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skv implements rzb {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult");
    public final rzb b;
    public final boolean c;
    public final smv d;
    public final sbs e;
    public final String f = szx.a(this);
    public final List g = new ArrayList();
    public final agzw h;
    public final agzv i;
    public final Duration j;
    private final agum k;
    private final zyd l;
    private final ahbt m;
    private final agpc n;
    private final agpc o;
    private final yqt p;
    private final yqt q;
    private final zyd r;
    private final Object s;
    private final mcw t;
    private final ahaz u;
    private final ahaz v;

    public skv(rzb rzbVar, agum agumVar, zyd zydVar, boolean z, smv smvVar, ahbt ahbtVar, sbs sbsVar, mcw mcwVar) {
        this.b = rzbVar;
        this.k = agumVar;
        this.l = zydVar;
        this.c = z;
        this.d = smvVar;
        this.m = ahbtVar;
        this.e = sbsVar;
        this.t = mcwVar;
        agzz agzzVar = agzz.a;
        this.h = new agzw(Integer.MAX_VALUE, agzzVar);
        this.i = new agzv(false, agzzVar);
        ahaz ahazVar = new ahaz();
        this.u = ahazVar;
        ahaz ahazVar2 = new ahaz();
        this.v = ahazVar2;
        Duration durationOfNanos = Duration.ofNanos(mcwVar.a());
        durationOfNanos.getClass();
        this.j = durationOfNanos;
        ahal.e(ahbtVar, null, 0, new skr(this, null), 3);
        this.n = new agpn(new agum() { // from class: skm
            @Override // defpackage.agum
            public final Object a() {
                final skv skvVar = this.a;
                rzb rzbVar2 = skvVar.b;
                if (!rzbVar2.a().g()) {
                    return ypv.a;
                }
                Object objC = rzbVar2.a().c();
                final sba sbaVar = objC instanceof sba ? (sba) objC : null;
                if (sbaVar != null) {
                    return yqt.h(new sba() { // from class: skk
                        @Override // defpackage.rsk
                        public final /* synthetic */ int a(byte[] bArr, int i, int i2, int i3) {
                            return saz.a(this, bArr, i, i2, i3);
                        }

                        @Override // defpackage.sba
                        public final int c(byte[] bArr, int i, int i2, int i3, int i4) {
                            int i5 = skvVar.h.c;
                            return sbaVar.c(bArr, i, i2, i3, i5 <= i4 ? i5 : i4);
                        }
                    });
                }
                ((zdv) skv.a.c().o(zfi.a, "ALT.StopAwareStartRslt").q("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "audioAccessorLazy_delegate$lambda$1", 84, "StopAwareStartListeningResult.kt")).x("#audio# result's(%s) delegate type is unexpected", skvVar.f);
                return ypv.a;
            }
        });
        this.o = new agpn(new agum() { // from class: skn
            @Override // defpackage.agum
            public final Object a() {
                final skv skvVar = this.a;
                final rsp rspVar = (rsp) skvVar.b.b().f();
                return rspVar == null ? ypv.a : yqt.h(new rsp() { // from class: skl
                    @Override // defpackage.rsp
                    public final rso a(rsm rsmVar, rsn rsnVar) {
                        rso rsoVarA;
                        rsp rspVar2 = rspVar;
                        skv skvVar2 = skvVar;
                        List list = skvVar2.g;
                        synchronized (list) {
                            if (skvVar2.c) {
                                sbs sbsVar2 = skvVar2.e;
                                Duration duration = skvVar2.j;
                                smv smvVar2 = skvVar2.d;
                                duration.getClass();
                                smw smwVar = (smw) sbsVar2.a.a();
                                smwVar.getClass();
                                rsmVar = new sbr(rsmVar, duration, smvVar2, smwVar);
                            }
                            int i = skvVar2.h.c;
                            int i2 = rsnVar.a;
                            if (i > i2) {
                                i = i2;
                            }
                            rsoVarA = rspVar2.a(rsmVar, new rsn(i));
                            if (!skvVar2.i.b()) {
                                list.add(rsoVarA.a);
                            }
                        }
                        return rsoVarA;
                    }
                });
            }
        });
        this.p = rzbVar.d();
        this.q = yqt.h(ahkr.a(ahazVar2));
        this.r = ahkr.a(ahazVar);
        this.s = rzbVar.f();
    }

    @Override // defpackage.rzb
    public final yqt a() {
        Object objA = this.n.a();
        objA.getClass();
        return (yqt) objA;
    }

    @Override // defpackage.rzb
    public final yqt b() {
        Object objA = this.o.a();
        objA.getClass();
        return (yqt) objA;
    }

    @Override // defpackage.rzb
    public final yqt c() {
        return this.q;
    }

    @Override // defpackage.rzb
    public final yqt d() {
        return this.p;
    }

    @Override // defpackage.rzb
    public final zyd e() {
        return this.r;
    }

    @Override // defpackage.rzb
    public final Object f() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sks
            if (r0 == 0) goto L13
            r0 = r6
            sks r0 = (defpackage.sks) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sks r0 = new sks
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ahaz r0 = r0.d
            defpackage.agpl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.agpl.b(r6)
            ahaz r6 = r5.u
            rzb r2 = r5.b     // Catch: java.lang.Throwable -> L4f
            zyd r2 = r2.e()     // Catch: java.lang.Throwable -> L4f
            r0.d = r6     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = defpackage.ahkr.b(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == r1) goto L4e
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            rur r6 = (defpackage.rur) r6     // Catch: java.lang.Throwable -> L29
            goto L57
        L4e:
            return r1
        L4f:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L53:
            java.lang.Object r6 = defpackage.agpl.a(r6)
        L57:
            java.lang.Throwable r1 = defpackage.agpk.a(r6)
            if (r1 == 0) goto L68
            rur r6 = defpackage.rur.a
            ruq r6 = new ruq
            r6.<init>()
            rur r6 = defpackage.rxo.a(r6)
        L68:
            boolean r6 = r0.N(r6)
            if (r6 == 0) goto L91
            zdy r6 = defpackage.skv.a
            zeo r6 = r6.b()
            zer r0 = defpackage.zfi.a
            java.lang.String r1 = "ALT.StopAwareStartRslt"
            zeo r6 = r6.o(r0, r1)
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r1 = "StopAwareStartListeningResult.kt"
            java.lang.String r2 = "com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult"
            java.lang.String r3 = "awaitAudioStartTime"
            zeo r6 = r6.q(r2, r3, r0, r1)
            zdv r6 = (defpackage.zdv) r6
            java.lang.String r0 = r5.f
            java.lang.String r1 = "#audio# result(%s) synced audio-start-time"
            r6.x(r1, r0)
        L91:
            agpu r6 = defpackage.agpu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skv.g(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.skt
            if (r0 == 0) goto L13
            r0 = r5
            skt r0 = (defpackage.skt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            skt r0 = new skt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ahaz r0 = r0.d
            defpackage.agpl.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L6b
        L29:
            r5 = move-exception
            goto L71
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.agpl.b(r5)
            rzb r5 = r4.b
            yqt r2 = r5.c()
            boolean r2 = r2.g()
            if (r2 != 0) goto L54
            ahaz r5 = r4.v
            rut r0 = defpackage.rut.a
            rus r0 = new rus
            r0.<init>()
            rut r0 = defpackage.rzd.a(r0)
            boolean r5 = r5.N(r0)
            goto L8a
        L54:
            ahaz r2 = r4.v
            yqt r5 = r5.c()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Throwable -> L6f
            zyd r5 = (defpackage.zyd) r5     // Catch: java.lang.Throwable -> L6f
            r0.d = r2     // Catch: java.lang.Throwable -> L6f
            r0.c = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = defpackage.ahkr.b(r5, r0)     // Catch: java.lang.Throwable -> L6f
            if (r5 == r1) goto L6e
            r0 = r2
        L6b:
            rut r5 = (defpackage.rut) r5     // Catch: java.lang.Throwable -> L29
            goto L75
        L6e:
            return r1
        L6f:
            r5 = move-exception
            r0 = r2
        L71:
            java.lang.Object r5 = defpackage.agpl.a(r5)
        L75:
            java.lang.Throwable r1 = defpackage.agpk.a(r5)
            if (r1 == 0) goto L86
            rut r5 = defpackage.rut.a
            rus r5 = new rus
            r5.<init>()
            rut r5 = defpackage.rzd.a(r5)
        L86:
            boolean r5 = r0.N(r5)
        L8a:
            if (r5 == 0) goto Laf
            zdy r5 = defpackage.skv.a
            zeo r5 = r5.b()
            zer r0 = defpackage.zfi.a
            java.lang.String r1 = "ALT.StopAwareStartRslt"
            zeo r5 = r5.o(r0, r1)
            r0 = 166(0xa6, float:2.33E-43)
            java.lang.String r1 = "StopAwareStartListeningResult.kt"
            java.lang.String r2 = "com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult"
            java.lang.String r3 = "awaitFirstByte"
            zeo r5 = r5.q(r2, r3, r0, r1)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r0 = r4.f
            java.lang.String r1 = "#audio# result(%s) synced first-byte-read"
            r5.x(r1, r0)
        Laf:
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skv.h(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.agsw r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skv.i(agsw):java.lang.Object");
    }
}
