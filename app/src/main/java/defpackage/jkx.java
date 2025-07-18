package defpackage;

import android.content.Context;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkx implements jiq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler");
    public static final Duration b;
    public static final Duration c;
    public static final Duration d;
    public static final Duration e;
    private static final ActionExecutor.SupportedAction m;
    private static final ActionExecutor.SupportedAction n;
    private static final ActionExecutor.SupportedAction o;
    private static final ActionExecutor.SupportedAction p;
    private static final ActionExecutor.SupportedAction q;
    private static final ActionExecutor.SupportedAction r;
    private static final ActionExecutor.SupportedAction s;
    private static final ActionExecutor.SupportedAction t;
    private static final ActionExecutor.SupportedAction u;
    private static final ActionExecutor.SupportedAction v;
    private static final ActionExecutor.SupportedAction w;
    private final agte A;
    private final ahbt B;
    private final agow C;
    private final agow D;
    private final jhs E;
    private final gph F;
    private final agow G;
    private final gkm H;
    private final gkp I;
    private final gof J;
    private final agow K;
    private final jhz L;
    private final irr M;
    private final jkw N;
    private final String O;
    public final eyw f;
    public final jna g;
    public final fau h;
    public final gqv i;
    public final lzb j;
    public volatile boolean k;
    public jjl l;
    private final fby x;
    private final agow y;
    private final Context z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(1L);
        durationOfSeconds2.getClass();
        c = durationOfSeconds2;
        m = jhy.a.b(fbo.v, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("caption_control_args", "assistant.api.client_op.CaptionControlArgs")}, "", new byte[0]);
        n = jhy.a.b(fbo.w, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs")}, "", new byte[0]);
        o = jhy.a.b(fbo.x, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("media_on_device_lookup_args", "assistant.api.client_op.MediaOnDeviceLookupArgs")}, "", new byte[0]);
        p = jhy.a.b(fbo.y, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs")}, "", new byte[0]);
        q = jhy.a.b(fbo.A, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("play_media_args", "assistant.api.client_op.PlayMediaArgs"), new ActionExecutor.SupportedAction.Arg("media_query_info_args", "assistant.api.client_op.MediaQueryInfoArgs")}, "", new byte[0]);
        r = jhy.a.b(fbo.B, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs")}, "", new byte[0]);
        s = jhy.a.b(fbo.C, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs")}, "", new byte[0]);
        t = jhy.a.b(fbo.D, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("seek_relative_args", "assistant.api.client_op.SeekRelativeArgs")}, "", new byte[0]);
        u = jhy.a.b(fbo.E, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("seek_to_position_args", "assistant.api.client_op.SeekToPositionArgs")}, "", new byte[0]);
        v = jhy.a.b(fbo.F, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("set_sticky_app_args", "assistant.api.client_op.SetStickyAppArgs")}, "", new byte[0]);
        w = jhy.a.b(fbo.G, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs")}, "", new byte[0]);
        Duration durationOfSeconds3 = Duration.ofSeconds(4L);
        durationOfSeconds3.getClass();
        d = durationOfSeconds3;
        Duration durationOfSeconds4 = Duration.ofSeconds(1L);
        durationOfSeconds4.getClass();
        e = durationOfSeconds4;
    }

    public jkx(eyw eywVar, fby fbyVar, agow agowVar, Context context, jna jnaVar, agte agteVar, ahbt ahbtVar, agow agowVar2, agow agowVar3, jhs jhsVar, gph gphVar, agow agowVar4, fau fauVar, gqv gqvVar, gkm gkmVar, gkp gkpVar, gof gofVar, agow agowVar5, jhz jhzVar, irr irrVar, lzb lzbVar) {
        eywVar.getClass();
        fbyVar.getClass();
        agowVar.getClass();
        context.getClass();
        jnaVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        agowVar3.getClass();
        jhsVar.getClass();
        gkmVar.getClass();
        gkpVar.getClass();
        gofVar.getClass();
        agowVar5.getClass();
        jhzVar.getClass();
        lzbVar.getClass();
        this.f = eywVar;
        this.x = fbyVar;
        this.y = agowVar;
        this.z = context;
        this.g = jnaVar;
        this.A = agteVar;
        this.B = ahbtVar;
        this.C = agowVar2;
        this.D = agowVar3;
        this.E = jhsVar;
        this.F = gphVar;
        this.G = agowVar4;
        this.h = fauVar;
        this.i = gqvVar;
        this.H = gkmVar;
        this.I = gkpVar;
        this.J = gofVar;
        this.K = agowVar5;
        this.L = jhzVar;
        this.M = irrVar;
        this.j = lzbVar;
        jkw jkwVar = new jkw(this);
        this.N = jkwVar;
        jnaVar.c(jkwVar);
        this.O = "MediaClientOpHandler";
    }

    @Override // defpackage.jiq
    public final Object a(agsw agswVar) {
        return ahal.a(this.A, new jjt(this, null), agswVar);
    }

    @Override // defpackage.jiq
    public final Object b(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar, agsw agswVar) throws abxv {
        String str2 = "";
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler", "prepare", 196, "MediaClientOpHandler.kt")).x("Preparing ClientOp: %s", str);
        lzb lzbVar = this.j;
        lzbVar.c.set(responseParams.exmoSpecified);
        if (((Boolean) this.C.a()).booleanValue() && gezVar != null) {
            gez.a.a(((gfn) this.G.a()).a(rpm.bq()), gezVar).c();
        }
        if (agvy.c(str, fbo.x.a())) {
            lzbVar.d.set(true);
            lzbVar.i(str, (byte[]) map.get("media_on_device_lookup_args"));
        } else if (agvy.c(str, fbo.A.a())) {
            this.E.f();
            byte[] bArrB = irw.b((byte[]) map.get("play_media_args"));
            try {
                abxd abxdVarH = abxd.h(xjh.a, bArrB, 0, bArrB.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null) {
                    abxd abxdVar = null;
                    byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                    if (bByteValue != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                }
                xjh xjhVar = (xjh) abxdVarH;
                xjhVar.getClass();
                if (xjhVar.c.size() == 0) {
                    ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler", "extractPackageName", 681, "MediaClientOpHandler.kt")).u("PlayMediaArgs doesn't have any mediaItems");
                } else {
                    xbg xbgVar = ((xjg) xjhVar.c.get(0)).e;
                    if (xbgVar == null) {
                        xbgVar = xbg.a;
                    }
                    String str3 = (xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c;
                    str3.getClass();
                    str2 = str3;
                }
            } catch (abxv e2) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/MediaClientOpHandler", "extractPackageName", 687, "MediaClientOpHandler.kt")).u("Failed to parse PlayMediaArgs");
            }
            gkm gkmVar = this.H;
            String str4 = responseParams.eventId;
            str4.getClass();
            gkmVar.a(str2, str4);
            this.I.a(str2);
            this.E.g();
        } else if (agvy.c(str, fbo.v.a()) || agvy.c(str, fbo.w.a()) || agvy.c(str, fbo.y.a()) || agvy.c(str, fbo.B.a()) || agvy.c(str, fbo.C.a()) || agvy.c(str, fbo.D.a()) || agvy.c(str, fbo.E.a()) || agvy.c(str, fbo.G.a())) {
            this.E.g();
            this.L.b(gmc.x);
        }
        return agpu.a;
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.O;
    }

    @Override // defpackage.jiq
    public final List d() {
        return agqq.d(m, n, o, p, q, r, s, t, u, v, w);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r21, java.util.Map r22, defpackage.gez r23, defpackage.agsw r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.e(java.lang.String, java.util.Map, gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agux r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.jjq
            if (r0 == 0) goto L13
            r0 = r9
            jjq r0 = (defpackage.jjq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jjq r0 = new jjq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.agpl.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.a
            defpackage.agpl.b(r9)
            goto L65
        L3c:
            defpackage.agpl.b(r9)
            return r9
        L40:
            defpackage.agpl.b(r9)
            eyw r9 = r7.f
            boolean r9 = r9.k
            if (r9 != 0) goto L53
            r0.d = r6
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L52
            goto L6f
        L52:
            return r8
        L53:
            agte r9 = r7.A
            jjs r2 = new jjs
            r2.<init>(r7, r3)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.ahal.a(r9, r2, r0)
            if (r9 != r1) goto L65
            goto L6f
        L65:
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.f(agux, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(byte[] r12, defpackage.gez r13, defpackage.agsw r14) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.g(byte[], gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.gez r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jjx
            if (r0 == 0) goto L13
            r0 = r8
            jjx r0 = (defpackage.jjx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jjx r0 = new jjx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jhy r7 = r0.d
            defpackage.agpl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r8)
            jhy r8 = defpackage.jhy.a
            jjz r2 = new jjz
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.p(r2, r0)
            if (r7 == r1) goto L50
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            xhe r8 = (defpackage.xhe) r8
            com.google.assistant.sdk.libassistant.ActionExecutor$Result r7 = r7.a(r8)
            return r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.h(gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.gez r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jka
            if (r0 == 0) goto L13
            r0 = r8
            jka r0 = (defpackage.jka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jka r0 = new jka
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jhy r7 = r0.d
            defpackage.agpl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r8)
            jhy r8 = defpackage.jhy.a
            jkc r2 = new jkc
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.p(r2, r0)
            if (r7 == r1) goto L50
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            xhe r8 = (defpackage.xhe) r8
            com.google.assistant.sdk.libassistant.ActionExecutor$Result r7 = r7.a(r8)
            return r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.i(gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.gez r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jkd
            if (r0 == 0) goto L13
            r0 = r8
            jkd r0 = (defpackage.jkd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jkd r0 = new jkd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jhy r7 = r0.d
            defpackage.agpl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r8)
            jhy r8 = defpackage.jhy.a
            jkf r2 = new jkf
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.p(r2, r0)
            if (r7 == r1) goto L50
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            xhe r8 = (defpackage.xhe) r8
            com.google.assistant.sdk.libassistant.ActionExecutor$Result r7 = r7.a(r8)
            return r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.j(gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.gez r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jkg
            if (r0 == 0) goto L13
            r0 = r8
            jkg r0 = (defpackage.jkg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jkg r0 = new jkg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jhy r7 = r0.d
            defpackage.agpl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r8)
            jhy r8 = defpackage.jhy.a
            jki r2 = new jki
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.p(r2, r0)
            if (r7 == r1) goto L50
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            xhe r8 = (defpackage.xhe) r8
            com.google.assistant.sdk.libassistant.ActionExecutor$Result r7 = r7.a(r8)
            return r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.k(gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(byte[] r12, defpackage.gez r13, defpackage.agsw r14) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.l(byte[], gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(byte[] r12, defpackage.gez r13, defpackage.agsw r14) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.m(byte[], gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.gez r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jkp
            if (r0 == 0) goto L13
            r0 = r8
            jkp r0 = (defpackage.jkp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jkp r0 = new jkp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jhy r7 = r0.d
            defpackage.agpl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.agpl.b(r8)
            jhy r8 = defpackage.jhy.a
            jkr r2 = new jkr
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.p(r2, r0)
            if (r7 == r1) goto L50
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            xhe r8 = (defpackage.xhe) r8
            com.google.assistant.sdk.libassistant.ActionExecutor$Result r7 = r7.a(r8)
            return r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.n(gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(byte[] r11, defpackage.agsw r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.o(byte[], agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.agux r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.jkt
            if (r0 == 0) goto L13
            r0 = r9
            jkt r0 = (defpackage.jkt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jkt r0 = new jkt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.agpl.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.a
            defpackage.agpl.b(r9)
            goto L63
        L3c:
            defpackage.agpl.b(r9)
            return r9
        L40:
            defpackage.agpl.b(r9)
            boolean r9 = r7.k
            if (r9 != 0) goto L51
            r0.d = r6
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L50
            goto L6d
        L50:
            return r8
        L51:
            agte r9 = r7.A
            jkv r2 = new jkv
            r2.<init>(r7, r3)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.ahal.a(r9, r2, r0)
            if (r9 != r1) goto L63
            goto L6d
        L63:
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkx.p(agux, agsw):java.lang.Object");
    }
}
