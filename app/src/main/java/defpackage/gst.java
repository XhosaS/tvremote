package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gst implements rmj {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/phenotype/KatnissReaper");
    public static final Duration b;
    public final aehf c;
    public final aehf d;
    public final ahni e;
    public boolean f;
    public final fbh g;
    public final fbi h;
    private final ahbt i;
    private final hag j;
    private final fmg k;
    private final ztw l;
    private final aehf m;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(10L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
    }

    public gst(aehf aehfVar, aehf aehfVar2, ahbt ahbtVar, fbh fbhVar, hag hagVar, fbi fbiVar, fmg fmgVar, ztw ztwVar, aehf aehfVar3) {
        aehfVar.getClass();
        aehfVar2.getClass();
        ahbtVar.getClass();
        hagVar.getClass();
        ztwVar.getClass();
        aehfVar3.getClass();
        this.c = aehfVar;
        this.d = aehfVar2;
        this.i = ahbtVar;
        this.g = fbhVar;
        this.j = hagVar;
        this.h = fbiVar;
        this.k = fmgVar;
        this.l = ztwVar;
        this.m = aehfVar3;
        this.e = new ahnm(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gsr
            if (r0 == 0) goto L13
            r0 = r5
            gsr r0 = (defpackage.gsr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gsr r0 = new gsr
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
            fmg r5 = r4.k
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L51
        L3c:
            ztw r0 = r4.l
            j$.time.Instant r5 = (j$.time.Instant) r5
            j$.time.Instant r0 = r0.a()
            int r5 = r5.compareTo(r0)
            if (r5 < 0) goto L4b
            goto L4c
        L4b:
            r3 = 0
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gst.a(agsw):java.lang.Object");
    }

    @Override // defpackage.rmj
    public final void b() {
        if (this.j != hag.d) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/phenotype/KatnissReaper", "scheduleReap", 69, "KatnissReaper.kt")).u("Reap scheduled in non-Interactor process. Ignoring.");
        } else {
            ((ghp) this.m.a()).k();
            ahal.e(this.i, null, 0, new gss(this, null), 3).w(new agux() { // from class: gsq
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        ((zdv) ((zdv) gst.a.d()).p(th).q("com/google/android/apps/tvsearch/phenotype/KatnissReaper", "scheduleReap$lambda$0", 93, "KatnissReaper.kt")).u("#scheduleReap coroutine failed.");
                    } else {
                        ((zdv) gst.a.b().q("com/google/android/apps/tvsearch/phenotype/KatnissReaper", "scheduleReap$lambda$0", 95, "KatnissReaper.kt")).u("#scheduleReap coroutine completed successfully.");
                    }
                    return agpu.a;
                }
            });
        }
    }
}
