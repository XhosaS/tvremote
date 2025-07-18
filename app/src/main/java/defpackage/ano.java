package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ano implements amb {
    public final apl a;
    public final ahbt b;
    public final amk e;
    public final apj g;
    private int i;
    private ahdl j;
    public final ahgr c = new ahio(new ams(this, null));
    private final ahni h = new ahnm(false);
    public final anp d = new anp();
    public final agpc f = new agpn(new agum() { // from class: amc
        /* JADX WARN: Type inference failed for: r0v7, types: [aof, java.lang.Object] */
        @Override // defpackage.agum
        public final Object a() throws IOException {
            anw anwVar = (anw) this.a.a;
            File canonicalFile = ((File) anwVar.d.a()).getCanonicalFile();
            synchronized (anw.b) {
                String absolutePath = canonicalFile.getAbsolutePath();
                Set set = anw.a;
                if (set.contains(absolutePath)) {
                    throw new IllegalStateException(a.e(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                }
                absolutePath.getClass();
                set.add(absolutePath);
            }
            canonicalFile.getClass();
            return new anz(canonicalFile, anwVar.e, anwVar.c.a(canonicalFile), new anv(canonicalFile));
        }
    });
    private final agpc k = new agpn(new agum() { // from class: amd
        @Override // defpackage.agum
        public final Object a() {
            return this.a.c().b();
        }
    });

    public ano(apl aplVar, List list, ahbt ahbtVar) {
        this.a = aplVar;
        this.b = ahbtVar;
        this.e = new amk(this, list);
        this.g = new apj(ahbtVar, new agux() { // from class: ame
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ano anoVar = this.a;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    anoVar.d.b(new aoe(th));
                }
                if (anoVar.f.b()) {
                    anoVar.c().a();
                }
                return agpu.a;
            }
        }, new agvb() { // from class: amf
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                aog aogVar = (aog) obj;
                Throwable cancellationException = (Throwable) obj2;
                aogVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                aogVar.d.g(cancellationException);
                return agpu.a;
            }
        }, new anl(this, null));
    }

    @Override // defpackage.amb
    public final Object a(agvb agvbVar, agsw agswVar) {
        aps apsVar = (aps) agswVar.fr().get(apr.a);
        if (apsVar != null) {
            apsVar.a(this);
        }
        return ahal.a(new aps(apsVar, this), new ank(this, agvbVar, null), agswVar);
    }

    public final aof b() {
        return (aof) this.k.a();
    }

    public final apm c() {
        return (apm) this.f.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.amt
            if (r0 == 0) goto L13
            r0 = r5
            amt r0 = (defpackage.amt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            amt r0 = new amt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.agpl.b(r5)
            ahni r5 = r4.h
            r0.a = r5
            r0.d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L5e
            r0 = r5
        L41:
            int r5 = r4.i     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-1)
            r4.i = r5     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L53
            ahdl r5 = r4.j     // Catch: java.lang.Throwable -> L59
            r1 = 0
            if (r5 == 0) goto L51
            r5.s(r1)     // Catch: java.lang.Throwable -> L59
        L51:
            r4.j = r1     // Catch: java.lang.Throwable -> L59
        L53:
            r0.d()
            agpu r5 = defpackage.agpu.a
            return r5
        L59:
            r5 = move-exception
            r0.d()
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aog r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.amv
            if (r0 == 0) goto L13
            r0 = r9
            amv r0 = (defpackage.amv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amv r0 = new amv
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ahaz r8 = r0.d
            defpackage.agpl.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L60
        L29:
            r9 = move-exception
            goto L5c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.agpl.b(r9)
            ahaz r9 = r8.d
            agte r2 = r8.c     // Catch: java.lang.Throwable -> L58
            agte r4 = r0.E     // Catch: java.lang.Throwable -> L58
            r4.getClass()     // Catch: java.lang.Throwable -> L58
            agte r2 = r2.plus(r4)     // Catch: java.lang.Throwable -> L58
            amw r4 = new amw     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r4.<init>(r7, r8, r5)     // Catch: java.lang.Throwable -> L58
            r0.d = r9     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = defpackage.ahal.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L58
            if (r8 == r1) goto L57
            r6 = r9
            r9 = r8
            r8 = r6
            goto L60
        L57:
            return r1
        L58:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L5c:
            java.lang.Object r9 = defpackage.agpl.a(r9)
        L60:
            defpackage.ahba.b(r8, r9)
            agpu r8 = defpackage.agpu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.e(aog, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.amx
            if (r0 == 0) goto L13
            r0 = r6
            amx r0 = (defpackage.amx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            amx r0 = new amx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.agpl.b(r6)
            ahni r6 = r5.h
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L63
            r0 = r6
        L41:
            int r6 = r5.i     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + r3
            r5.i = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != r3) goto L58
            ahbt r6 = r5.b     // Catch: java.lang.Throwable -> L5e
            amz r1 = new amz     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 0
            r4 = 3
            ahdl r6 = defpackage.ahal.e(r6, r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L5e
            r5.j = r6     // Catch: java.lang.Throwable -> L5e
        L58:
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L5e:
            r6 = move-exception
            r0.d()
            throw r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.f(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r2.b(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ana
            if (r0 == 0) goto L13
            r0 = r7
            ana r0 = (defpackage.ana) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ana r0 = new ana
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.a
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            defpackage.agpl.b(r7)
            goto L49
        L3a:
            defpackage.agpl.b(r7)
            aof r7 = r6.b()
            r0.d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L6e
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            amk r2 = r6.e     // Catch: java.lang.Throwable -> L5f
            r0.a = r7     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r2.b(r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L5c
            goto L6e
        L5c:
            agpu r7 = defpackage.agpu.a
            return r7
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            anp r1 = r6.d
            apa r2 = new apa
            r2.<init>(r7, r0)
            r1.b(r2)
            throw r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.g(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r9 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.anb
            if (r0 == 0) goto L13
            r0 = r9
            anb r0 = (defpackage.anb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            anb r0 = new anb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.agpl.b(r9)
            goto La2
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.agpl.b(r9)
            goto L8c
        L3a:
            boolean r8 = r0.a
            java.lang.Object r2 = r0.b
            defpackage.agpl.b(r9)
            goto L5f
        L42:
            defpackage.agpl.b(r9)
            anp r9 = r7.d
            apk r2 = r9.a()
            boolean r9 = r2 instanceof defpackage.app
            if (r9 != 0) goto Lb9
            aof r9 = r7.b()
            r0.b = r2
            r0.a = r8
            r0.e = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lb8
        L5f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            boolean r5 = r2 instanceof defpackage.alt
            if (r5 == 0) goto L6f
            r6 = r2
            alt r6 = (defpackage.alt) r6
            int r6 = r6.c
            goto L70
        L6f:
            r6 = -1
        L70:
            if (r5 == 0) goto L76
            if (r9 == r6) goto L75
            goto L76
        L75:
            return r2
        L76:
            r9 = 0
            if (r8 == 0) goto L8f
            aof r8 = r7.b()
            anc r2 = new anc
            r2.<init>(r7, r9)
            r0.b = r9
            r0.e = r4
            java.lang.Object r9 = r8.c(r2, r0)
            if (r9 == r1) goto Lb8
        L8c:
            agpi r9 = (defpackage.agpi) r9
            goto La4
        L8f:
            aof r8 = r7.b()
            and r2 = new and
            r2.<init>(r7, r6, r9)
            r0.b = r9
            r0.e = r3
            java.lang.Object r9 = r8.d(r2, r0)
            if (r9 == r1) goto Lb8
        La2:
            agpi r9 = (defpackage.agpi) r9
        La4:
            java.lang.Object r8 = r9.a
            apk r8 = (defpackage.apk) r8
            java.lang.Object r9 = r9.b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb7
            anp r9 = r7.d
            r9.b(r8)
        Lb7:
            return r8
        Lb8:
            return r1
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.h(boolean, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
    
        if (r10 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[Catch: als -> 0x00af, TryCatch #1 {als -> 0x00af, blocks: (B:34:0x008f, B:68:0x011d, B:37:0x0096, B:66:0x0103, B:45:0x00ab, B:55:0x00c8, B:56:0x00cc, B:52:0x00b8, B:63:0x00f3), top: B:75:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(boolean r9, defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.i(boolean, agsw):java.lang.Object");
    }

    public final Object j(agvb agvbVar, agte agteVar, agsw agswVar) {
        return b().c(new anj(this, agteVar, agvbVar, null), agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r11, boolean r12, defpackage.agsw r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.anm
            if (r0 == 0) goto L13
            r0 = r13
            anm r0 = (defpackage.anm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anm r0 = new anm
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            agwg r11 = r0.d
            defpackage.agpl.b(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.agpl.b(r13)
            agwg r5 = new agwg
            r5.<init>()
            apm r13 = r10.c()
            ann r4 = new ann
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r13.d(r4, r0)
            if (r11 == r1) goto L59
            r11 = r5
        L51:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ano.k(java.lang.Object, boolean, agsw):java.lang.Object");
    }
}
