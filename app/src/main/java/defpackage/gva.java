package defpackage;

import android.accounts.Account;
import com.google.common.collect.Sets;
import j$.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gva implements gtu {
    public static final /* synthetic */ int d = 0;
    private static final gtx e = new gtx();
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl");
    private static final Duration g;
    public final agte a;
    public final jwr b;
    public final agow c;
    private final fqa h;
    private final agow i;
    private final fsl j;
    private final fsp k;
    private final fxu l;
    private final fug m;
    private final fuw n;
    private final gvb o;
    private final agow p;
    private final ahni q;
    private final ahni r;
    private final Set s;
    private Account t;
    private Map u;
    private Map v;
    private Map w;
    private List x;
    private List y;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(2L);
        durationOfSeconds.getClass();
        g = durationOfSeconds;
    }

    public gva(fqa fqaVar, agte agteVar, agow agowVar, fsl fslVar, fsp fspVar, jwr jwrVar, fxu fxuVar, fug fugVar, fuw fuwVar, agow agowVar2, gvb gvbVar, agow agowVar3) {
        agteVar.getClass();
        agowVar.getClass();
        fxuVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        this.h = fqaVar;
        this.a = agteVar;
        this.i = agowVar;
        this.j = fslVar;
        this.k = fspVar;
        this.b = jwrVar;
        this.l = fxuVar;
        this.m = fugVar;
        this.n = fuwVar;
        this.c = agowVar2;
        this.o = gvbVar;
        this.p = agowVar3;
        this.q = new ahnm(false);
        this.r = new ahnm(false);
        Set setF = Sets.f();
        setF.getClass();
        this.s = setF;
        agre agreVar = agre.a;
        this.u = agreVar;
        this.v = agreVar;
        this.w = agreVar;
        agrd agrdVar = agrd.a;
        this.x = agrdVar;
        this.y = agrdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0032, LOOP:0: B:26:0x007e->B:28:0x0084, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:25:0x006d, B:26:0x007e, B:28:0x0084, B:29:0x0095), top: B:37:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(defpackage.gva r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.gup
            if (r0 == 0) goto L13
            r0 = r7
            gup r0 = (defpackage.gup) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gup r0 = new gup
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.b
            gva r6 = (defpackage.gva) r6
            java.lang.Object r0 = r0.a
            ahni r0 = (defpackage.ahni) r0
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6d
        L32:
            r6 = move-exception
            goto L9f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r2 = r0.a
            gva r2 = (defpackage.gva) r2
            defpackage.agpl.b(r7)
            r7 = r6
            r6 = r2
            goto L5c
        L4b:
            defpackage.agpl.b(r7)
            ahni r7 = r6.r
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto La3
        L5c:
            fsp r2 = r6.k     // Catch: java.lang.Throwable -> L9d
            r0.a = r7     // Catch: java.lang.Throwable -> L9d
            r0.b = r6     // Catch: java.lang.Throwable -> L9d
            r0.d = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 == r1) goto La3
            r5 = r0
            r0 = r7
            r7 = r5
        L6d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r2 = 10
            int r2 = defpackage.agqq.i(r7, r2)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L32
        L7e:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L95
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L32
            android.accounts.Account r3 = new android.accounts.Account     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "com.google"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L32
            r1.add(r3)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L95:
            r6.x = r1     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L9d:
            r6 = move-exception
            r0 = r7
        L9f:
            r0.d()
            throw r6
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.t(gva, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(defpackage.gva r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.guq
            if (r0 == 0) goto L13
            r0 = r7
            guq r0 = (defpackage.guq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            guq r0 = new guq
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.b
            gva r6 = (defpackage.gva) r6
            java.lang.Object r0 = r0.a
            ahni r0 = (defpackage.ahni) r0
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r2 = r0.a
            gva r2 = (defpackage.gva) r2
            defpackage.agpl.b(r7)
            r7 = r6
            r6 = r2
            goto L5b
        L4a:
            defpackage.agpl.b(r7)
            ahni r7 = r6.q
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L7c
        L5b:
            fsl r2 = r6.j     // Catch: java.lang.Throwable -> L76
            r0.a = r7     // Catch: java.lang.Throwable -> L76
            r0.b = r6     // Catch: java.lang.Throwable -> L76
            r0.d = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == r1) goto L7c
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L32
            r6.v = r7     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L76:
            r6 = move-exception
            r0 = r7
        L78:
            r0.d()
            throw r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.u(gva, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0032, LOOP:0: B:26:0x007e->B:28:0x0084, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:25:0x006d, B:26:0x007e, B:28:0x0084, B:29:0x0095), top: B:37:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v(defpackage.gva r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.gur
            if (r0 == 0) goto L13
            r0 = r7
            gur r0 = (defpackage.gur) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gur r0 = new gur
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.b
            gva r6 = (defpackage.gva) r6
            java.lang.Object r0 = r0.a
            ahni r0 = (defpackage.ahni) r0
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6d
        L32:
            r6 = move-exception
            goto L9f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r2 = r0.a
            gva r2 = (defpackage.gva) r2
            defpackage.agpl.b(r7)
            r7 = r6
            r6 = r2
            goto L5c
        L4b:
            defpackage.agpl.b(r7)
            ahni r7 = r6.q
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto La3
        L5c:
            fqa r2 = r6.h     // Catch: java.lang.Throwable -> L9d
            r0.a = r7     // Catch: java.lang.Throwable -> L9d
            r0.b = r6     // Catch: java.lang.Throwable -> L9d
            r0.d = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r2.d(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 == r1) goto La3
            r5 = r0
            r0 = r7
            r7 = r5
        L6d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r2 = 10
            int r2 = defpackage.agqq.i(r7, r2)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L32
        L7e:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L95
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L32
            android.accounts.Account r3 = new android.accounts.Account     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "com.google"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L32
            r1.add(r3)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L95:
            r6.y = r1     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L9d:
            r6 = move-exception
            r0 = r7
        L9f:
            r0.d()
            throw r6
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.v(gva, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(defpackage.gva r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.gus
            if (r0 == 0) goto L13
            r0 = r7
            gus r0 = (defpackage.gus) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gus r0 = new gus
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.b
            gva r6 = (defpackage.gva) r6
            java.lang.Object r0 = r0.a
            ahni r0 = (defpackage.ahni) r0
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r2 = r0.a
            gva r2 = (defpackage.gva) r2
            defpackage.agpl.b(r7)
            r7 = r6
            r6 = r2
            goto L5b
        L4a:
            defpackage.agpl.b(r7)
            ahni r7 = r6.q
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L7c
        L5b:
            fug r2 = r6.m     // Catch: java.lang.Throwable -> L76
            r0.a = r7     // Catch: java.lang.Throwable -> L76
            r0.b = r6     // Catch: java.lang.Throwable -> L76
            r0.d = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == r1) goto L7c
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L32
            r6.u = r7     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L76:
            r6 = move-exception
            r0 = r7
        L78:
            r0.d()
            throw r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.w(gva, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(defpackage.gva r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.gut
            if (r0 == 0) goto L13
            r0 = r7
            gut r0 = (defpackage.gut) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gut r0 = new gut
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.b
            gva r6 = (defpackage.gva) r6
            java.lang.Object r0 = r0.a
            ahni r0 = (defpackage.ahni) r0
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r2 = r0.a
            gva r2 = (defpackage.gva) r2
            defpackage.agpl.b(r7)
            r7 = r6
            r6 = r2
            goto L5b
        L4a:
            defpackage.agpl.b(r7)
            ahni r7 = r6.q
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L7c
        L5b:
            fuw r2 = r6.n     // Catch: java.lang.Throwable -> L76
            r0.a = r7     // Catch: java.lang.Throwable -> L76
            r0.b = r6     // Catch: java.lang.Throwable -> L76
            r0.d = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == r1) goto L7c
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L32
            r6.w = r7     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L76:
            r6 = move-exception
            r0 = r7
        L78:
            r0.d()
            throw r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.x(gva, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(defpackage.gva r7, boolean r8, defpackage.agsw r9) {
        /*
            boolean r0 = r9 instanceof defpackage.guu
            if (r0 == 0) goto L13
            r0 = r9
            guu r0 = (defpackage.guu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            guu r0 = new guu
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            java.util.Iterator r7 = (java.util.Iterator) r7
            defpackage.agpl.b(r9)
            goto L75
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            boolean r7 = r0.b
            java.lang.Object r8 = r0.a
            gva r8 = (defpackage.gva) r8
            defpackage.agpl.b(r9)
            goto L6d
        L43:
            boolean r8 = r0.b
            java.lang.Object r7 = r0.a
            gva r7 = (defpackage.gva) r7
            defpackage.agpl.b(r9)
            goto L5e
        L4d:
            defpackage.agpl.b(r9)
            gvb r9 = r7.o
            r0.a = r7
            r0.b = r8
            r0.d = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto L92
        L5e:
            r0.a = r7
            r0.b = r8
            r0.d = r4
            java.lang.Object r9 = r7.z(r0)
            if (r9 == r1) goto L92
            r6 = r8
            r8 = r7
            r7 = r6
        L6d:
            if (r7 == 0) goto L8f
            java.util.Set r7 = r8.s
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r7.next()
            r8.getClass()
            gtt r8 = (defpackage.gtt) r8
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L75
            goto L92
        L8f:
            agpu r7 = defpackage.agpu.a
            return r7
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.y(gva, boolean, agsw):java.lang.Object");
    }

    @Override // defpackage.gtu
    public final Account a() {
        Account account = this.t;
        if (account != null) {
            return b(account);
        }
        return null;
    }

    @Override // defpackage.gtu
    public final Account b(Account account) {
        account.getClass();
        String str = (String) this.u.get(account.name);
        if (str == null) {
            str = "";
        }
        if (gts.a(str)) {
            return new Account(str, "com.google");
        }
        return null;
    }

    @Override // defpackage.gtu
    public final Account c() {
        return this.t;
    }

    @Override // defpackage.gtu
    public final fwx d() {
        Account account = this.t;
        fwx fwxVar = account != null ? (fwx) this.w.get(account.name) : null;
        return fwxVar == null ? fwx.PROFILE_LOCK_UNSPECIFIED : fwxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.accounts.Account r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gtz
            if (r0 == 0) goto L13
            r0 = r8
            gtz r0 = (defpackage.gtz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gtz r0 = new gtz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.agpl.b(r8)     // Catch: java.lang.Exception -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.agpl.b(r8)
            java.lang.String r8 = r7.name
            r8.getClass()
            boolean r8 = defpackage.gts.a(r8)
            if (r8 == 0) goto L9a
            j$.time.Duration r8 = defpackage.gva.g     // Catch: java.lang.Exception -> L29
            gub r2 = new gub     // Catch: java.lang.Exception -> L29
            r5 = 0
            r2.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L29
            r0.c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = defpackage.zty.b(r8, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r8 == r1) goto L57
        L51:
            r8.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L29
            return r8
        L57:
            return r1
        L58:
            boolean r8 = r7 instanceof defpackage.jwj
            java.lang.String r0 = "fetchAuthToken"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl"
            java.lang.String r2 = "KatnissAccountManagerImpl.kt"
            if (r8 != 0) goto L81
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto L67
            goto L81
        L67:
            zdy r8 = defpackage.gva.f
            zeo r8 = r8.d()
            zdv r8 = (defpackage.zdv) r8
            zeo r7 = r8.p(r7)
            r8 = 198(0xc6, float:2.77E-43)
            zeo r7 = r7.q(r1, r0, r8, r2)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Auth check failed due to unexpected exception."
            r7.u(r8)
            goto L9a
        L81:
            zdy r8 = defpackage.gva.f
            zeo r8 = r8.b()
            zdv r8 = (defpackage.zdv) r8
            zeo r7 = r8.p(r7)
            r8 = 195(0xc3, float:2.73E-43)
            zeo r7 = r7.q(r1, r0, r8, r2)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Token fetching failed to do GoogleAuth."
            r7.u(r8)
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.e(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.accounts.Account r6, defpackage.agsw r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.guc
            if (r0 == 0) goto L13
            r0 = r7
            guc r0 = (defpackage.guc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            guc r0 = new guc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.agpl.b(r7)     // Catch: java.lang.Exception -> L27
            goto L5b
        L27:
            r6 = move-exception
            goto L61
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.agpl.b(r7)
            java.lang.String r7 = r6.name
            r7.getClass()
            boolean r7 = defpackage.gts.a(r7)
            if (r7 != 0) goto L4b
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid account provided"
            r6.<init>(r7)
            java.lang.Object r6 = defpackage.agpl.a(r6)
            return r6
        L4b:
            j$.time.Duration r7 = defpackage.gva.g     // Catch: java.lang.Exception -> L27
            gue r2 = new gue     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = defpackage.zty.b(r7, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r7 == r1) goto L60
        L5b:
            agpk r7 = (defpackage.agpk) r7     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r7.a     // Catch: java.lang.Exception -> L27
            return r6
        L60:
            return r1
        L61:
            boolean r7 = r6 instanceof defpackage.jwj
            java.lang.String r0 = "fetchAuthTokenWithResult-gIAlu-s"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl"
            java.lang.String r2 = "KatnissAccountManagerImpl.kt"
            if (r7 != 0) goto L8a
            boolean r7 = r6 instanceof java.io.IOException
            if (r7 == 0) goto L70
            goto L8a
        L70:
            zdy r7 = defpackage.gva.f
            zeo r7 = r7.d()
            zdv r7 = (defpackage.zdv) r7
            zeo r7 = r7.p(r6)
            r3 = 233(0xe9, float:3.27E-43)
            zeo r7 = r7.q(r1, r0, r3, r2)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r0 = "Auth check failed due to unexpected exception."
            r7.u(r0)
            goto La3
        L8a:
            zdy r7 = defpackage.gva.f
            zeo r7 = r7.b()
            zdv r7 = (defpackage.zdv) r7
            zeo r7 = r7.p(r6)
            r3 = 230(0xe6, float:3.22E-43)
            zeo r7 = r7.q(r1, r0, r3, r2)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r0 = "Token fetching failed to do GoogleAuth."
            r7.u(r0)
        La3:
            java.lang.Object r6 = defpackage.agpl.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.f(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.guf
            if (r0 == 0) goto L13
            r0 = r5
            guf r0 = (defpackage.guf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            guf r0 = new guf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fsp r5 = r4.k
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L65
        L3c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.agqq.i(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L4d
        L64:
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.g(agsw):java.lang.Object");
    }

    @Override // defpackage.gtu
    public final Object h(Account account, agsw agswVar) {
        String str = account.name;
        str.getClass();
        return this.j.a(str, agswVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gug
            if (r0 == 0) goto L13
            r0 = r7
            gug r0 = (defpackage.gug) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gug r0 = new gug
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.agpl.b(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            fug r2 = r0.d
            defpackage.agpl.b(r7)
            goto L4a
        L39:
            defpackage.agpl.b(r7)
            fug r2 = r6.m
            fqa r7 = r6.h
            r0.d = r2
            r0.c = r5
            java.lang.Object r7 = r7.e(r0)
            if (r7 == r1) goto L67
        L4a:
            java.lang.String r7 = (java.lang.String) r7
            r0.d = r3
            r0.c = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 == r1) goto L67
        L56:
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = defpackage.gts.a(r7)
            if (r0 == 0) goto L66
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r7, r1)
            return r0
        L66:
            return r3
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.i(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.guh
            if (r0 == 0) goto L13
            r0 = r5
            guh r0 = (defpackage.guh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            guh r0 = new guh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fqa r5 = r4.h
            r0.c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 == r1) goto L67
        L3c:
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = defpackage.gts.a(r5)
            if (r0 == 0) goto L4c
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "com.google"
            r0.<init>(r5, r1)
            return r0
        L4c:
            zdy r5 = defpackage.gva.f
            zeo r5 = r5.b()
            r0 = 247(0xf7, float:3.46E-43)
            java.lang.String r1 = "KatnissAccountManagerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl"
            java.lang.String r3 = "getSearchAccount"
            zeo r5 = r5.q(r2, r3, r0, r1)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r0 = "Read invalid search account from PDS"
            r5.u(r0)
            r5 = 0
            return r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.j(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.k(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        if (r9.a(r0) != r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
    
        if (r9.a(r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c8, code lost:
    
        if (r13.c(r9, r11, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0280, code lost:
    
        if (r9.a(r0) != r1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179 A[PHI: r9 r10 r11 r12
  0x0179: PHI (r9v30 java.lang.String) = (r9v27 java.lang.String), (r9v32 java.lang.String) binds: [B:46:0x0177, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0179: PHI (r10v15 fwx) = (r10v12 fwx), (r10v17 fwx) binds: [B:46:0x0177, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0179: PHI (r11v7 java.lang.String) = (r11v5 java.lang.String), (r11v8 java.lang.String) binds: [B:46:0x0177, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0179: PHI (r12v8 java.lang.String) = (r12v5 java.lang.String), (r12v10 java.lang.String) binds: [B:46:0x0177, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0262 A[PHI: r9 r10
  0x0262: PHI (r9v46 java.lang.String) = 
  (r9v36 java.lang.String)
  (r9v36 java.lang.String)
  (r9v36 java.lang.String)
  (r9v43 java.lang.String)
  (r9v48 java.lang.String)
 binds: [B:76:0x025f, B:73:0x024a, B:60:0x01ef, B:69:0x022f, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r10v30 fwx) = (r10v21 fwx), (r10v21 fwx), (r10v21 fwx), (r10v27 fwx), (r10v32 fwx) binds: [B:76:0x025f, B:73:0x024a, B:60:0x01ef, B:69:0x022f, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0276  */
    @Override // defpackage.gtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.fwx r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.l(java.lang.String, java.lang.String, java.lang.String, fwx, agsw):java.lang.Object");
    }

    @Override // defpackage.gtu
    public final String m() {
        Account account = this.t;
        String str = account != null ? (String) this.v.get(account.name) : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.gtu
    public final List n() {
        return this.x;
    }

    @Override // defpackage.gtu
    public final List o() {
        return this.y;
    }

    @Override // defpackage.gtu
    public final void p(gtt gttVar) {
        gttVar.getClass();
        this.s.remove(gttVar);
    }

    @Override // defpackage.gtu
    public final void q(gtt gttVar) {
        gttVar.getClass();
        this.s.add(gttVar);
    }

    @Override // defpackage.gtu
    public final boolean r(Account account) {
        account.getClass();
        return b(account) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (x(r5, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.agsw r6) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.s(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:25:0x0075, B:27:0x007d, B:29:0x0099, B:28:0x0085), top: B:39:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:25:0x0075, B:27:0x007d, B:29:0x0099, B:28:0x0085), top: B:39:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ahni] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.agsw r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.guz
            if (r0 == 0) goto L13
            r0 = r10
            guz r0 = (defpackage.guz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            guz r0 = new guz
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "updateSearchAccount"
            java.lang.String r4 = "com/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "KatnissAccountManagerImpl.kt"
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r10 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r10)
            r10 = r2
            goto L53
        L44:
            defpackage.agpl.b(r10)
            ahni r10 = r9.q
            r0.a = r10
            r0.d = r6
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto La9
        L53:
            zdy r2 = defpackage.gva.f     // Catch: java.lang.Throwable -> La1
            zeo r2 = r2.b()     // Catch: java.lang.Throwable -> La1
            r6 = 413(0x19d, float:5.79E-43)
            zeo r2 = r2.q(r4, r3, r6, r7)     // Catch: java.lang.Throwable -> La1
            zdv r2 = (defpackage.zdv) r2     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "Updating searchAccount"
            r2.u(r6)     // Catch: java.lang.Throwable -> La1
            fqa r2 = r9.h     // Catch: java.lang.Throwable -> La1
            r0.a = r10     // Catch: java.lang.Throwable -> La1
            r0.d = r5     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r2.e(r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == r1) goto La9
            r8 = r0
            r0 = r10
            r10 = r8
        L75:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L32
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L32
            if (r1 <= 0) goto L85
            android.accounts.Account r1 = new android.accounts.Account     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "com.google"
            r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> L32
            goto L99
        L85:
            zdy r10 = defpackage.gva.f     // Catch: java.lang.Throwable -> L32
            zeo r10 = r10.b()     // Catch: java.lang.Throwable -> L32
            r1 = 419(0x1a3, float:5.87E-43)
            zeo r10 = r10.q(r4, r3, r1, r7)     // Catch: java.lang.Throwable -> L32
            zdv r10 = (defpackage.zdv) r10     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Read empty search account from PDS"
            r10.u(r1)     // Catch: java.lang.Throwable -> L32
            r1 = 0
        L99:
            r9.t = r1     // Catch: java.lang.Throwable -> L32
            r0.d()
            agpu r10 = defpackage.agpu.a
            return r10
        La1:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        La5:
            r0.d()
            throw r10
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.z(agsw):java.lang.Object");
    }
}
