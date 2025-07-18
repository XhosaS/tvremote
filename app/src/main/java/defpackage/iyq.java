package defpackage;

import android.media.session.MediaSessionManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyq implements iyj, iyd {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/suggestions/starters/SuggestionsFetcherImpl");
    public final ixj b;
    public final fae c;
    public iyd d;
    private final ahbt e;
    private final gtu f;
    private final goa g;
    private final fau h;
    private final MediaSessionManager i;
    private final iyh j;
    private boolean k;
    private final iye l;

    public iyq(ixj ixjVar, ahbt ahbtVar, fae faeVar, gtu gtuVar, goa goaVar, iye iyeVar, fau fauVar, MediaSessionManager mediaSessionManager, iyh iyhVar) {
        ixjVar.getClass();
        ahbtVar.getClass();
        gtuVar.getClass();
        iyeVar.getClass();
        iyhVar.getClass();
        this.b = ixjVar;
        this.e = ahbtVar;
        this.c = faeVar;
        this.f = gtuVar;
        this.g = goaVar;
        this.l = iyeVar;
        this.h = fauVar;
        this.i = mediaSessionManager;
        this.j = iyhVar;
    }

    @Override // defpackage.iyj
    public final void a() {
        this.b.e();
    }

    @Override // defpackage.iyj
    public final void b() {
        this.d = null;
        this.k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // defpackage.iyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.izq r10, defpackage.iyu r11, defpackage.iyd r12, j$.util.Optional r13, defpackage.xtv r14, j$.time.Duration r15) {
        /*
            r9 = this;
            r10.getClass()
            r11.getClass()
            r14.getClass()
            r15.getClass()
            boolean r0 = r9.k
            if (r0 == 0) goto L15
            if (r12 == 0) goto L14
            zdy r10 = defpackage.hxr.f
        L14:
            return
        L15:
            r0 = 1
            r9.k = r0
            boolean r1 = r13.isPresent()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r13.get()
            xds r1 = (defpackage.xds) r1
            abmr r1 = r1.c
            if (r1 != 0) goto L2a
            abmr r1 = defpackage.abmr.a
        L2a:
            abmf r1 = r1.e
            if (r1 != 0) goto L30
            abmf r1 = defpackage.abmf.a
        L30:
            int r1 = r1.b
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            ixj r0 = r9.b
            java.lang.Object r1 = r13.get()
            xds r1 = (defpackage.xds) r1
            abmr r1 = r1.c
            if (r1 != 0) goto L43
            abmr r1 = defpackage.abmr.a
        L43:
            abmf r1 = r1.e
            if (r1 != 0) goto L49
            abmf r1 = defpackage.abmf.a
        L49:
            java.lang.String r1 = r1.c
            r0.i(r1)
            goto L56
        L4f:
            ixj r0 = r9.b
            java.lang.String r1 = ""
            r0.i(r1)
        L56:
            r9.d = r12
            iyg r2 = new iyg
            iyk r4 = new iyk
            r4.<init>(r9)
            iye r5 = r9.l
            iyh r6 = r9.j
            ixj r7 = r9.b
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            ahbt r0 = r3.e
            r7 = r2
            iyo r2 = new iyo
            r8 = 0
            r5 = r13
            r4 = r14
            r6 = r3
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3 = r6
            r10 = 0
            r13 = 0
            r14 = 3
            ahdl r1 = defpackage.ahal.e(r0, r10, r13, r2, r14)
            iyl r2 = new iyl
            r2.<init>()
            r1.w(r2)
            if (r12 == 0) goto L93
            gmc r1 = defpackage.gmc.V
            hxb r12 = (defpackage.hxb) r12
            hxr r12 = r12.a
            gmd r12 = r12.F
            r12.l(r1)
        L93:
            iyp r12 = new iyp
            r12.<init>(r15, r9, r11, r10)
            ahdl r10 = defpackage.ahal.e(r0, r10, r13, r12, r14)
            iym r11 = new iym
            r11.<init>()
            r10.w(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyq.c(izq, iyu, iyd, j$.util.Optional, xtv, j$.time.Duration):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r8 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        if (r8 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(j$.util.Optional r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.iyn
            if (r0 == 0) goto L13
            r0 = r8
            iyn r0 = (defpackage.iyn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iyn r0 = new iyn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.agpl.b(r8)
            goto Ld4
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.agpl.b(r8)
            goto La0
        L3a:
            java.lang.String r7 = r0.d
            defpackage.agpl.b(r8)
            goto L72
        L40:
            defpackage.agpl.b(r8)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L4e
            j$.util.Optional r7 = j$.util.Optional.empty()
            return r7
        L4e:
            java.lang.Object r7 = r7.get()
            xds r7 = (defpackage.xds) r7
            abmr r7 = r7.c
            if (r7 != 0) goto L5a
            abmr r7 = defpackage.abmr.a
        L5a:
            abmf r7 = r7.e
            if (r7 != 0) goto L60
            abmf r7 = defpackage.abmf.a
        L60:
            java.lang.String r7 = r7.c
            r7.getClass()
            gtu r8 = r6.f
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r1) goto L72
            goto Ld9
        L72:
            r2 = 0
            if (r8 == 0) goto La5
            goa r8 = r6.g
            java.util.List r8 = r8.a()
            java.util.Iterator r8 = r8.iterator()
        L7f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lda
            java.lang.Object r3 = r8.next()
            goc r3 = (defpackage.goc) r3
            java.lang.String r5 = r3.a
            boolean r5 = defpackage.agvy.c(r5, r7)
            if (r5 == 0) goto L7f
            fau r7 = r6.h
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r7.c(r3, r0)
            if (r8 != r1) goto La0
            goto Ld9
        La0:
            j$.util.Optional r7 = j$.util.Optional.of(r8)
            return r7
        La5:
            android.media.session.MediaSessionManager r8 = r6.i
            java.util.List r8 = r8.getActiveSessions(r2)
            java.util.Iterator r8 = r8.iterator()
        Laf:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto Lda
            java.lang.Object r4 = r8.next()
            android.media.session.MediaController r4 = (android.media.session.MediaController) r4
            java.lang.String r5 = r4.getPackageName()
            boolean r5 = defpackage.agvy.c(r5, r7)
            if (r5 == 0) goto Laf
            fau r7 = r6.h
            r4.getClass()
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r7.b(r4, r0)
            if (r8 == r1) goto Ld9
        Ld4:
            j$.util.Optional r7 = j$.util.Optional.of(r8)
            return r7
        Ld9:
            return r1
        Lda:
            j$.util.Optional r7 = j$.util.Optional.empty()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyq.d(j$.util.Optional, agsw):java.lang.Object");
    }
}
