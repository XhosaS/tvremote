package defpackage;

import android.content.Intent;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gly implements ewb {
    public static final /* synthetic */ int c = 0;
    private static final Duration d;
    public final fke a;
    public final ztw b;
    private final ahbt e;
    private final gmd f;

    static {
        Duration durationOfHours = Duration.ofHours(12L);
        durationOfHours.getClass();
        d = durationOfHours;
    }

    public gly(ahbt ahbtVar, fke fkeVar, gmd gmdVar, ztw ztwVar) {
        ahbtVar.getClass();
        gmdVar.getClass();
        ztwVar.getClass();
        this.e = ahbtVar;
        this.a = fkeVar;
        this.f = gmdVar;
        this.b = ztwVar;
    }

    @Override // defpackage.ewb
    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    ahal.e(this.e, null, 0, new glx(this, null), 3);
                }
            } else if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                ahal.e(this.e, null, 0, new glw(this, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.glv
            if (r0 == 0) goto L13
            r0 = r5
            glv r0 = (defpackage.glv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            glv r0 = new glv
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
            fke r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L58
        L3c:
            ztw r0 = r4.b
            j$.time.Instant r5 = (j$.time.Instant) r5
            j$.time.Instant r0 = r0.a()
            j$.time.Duration r1 = defpackage.gly.d
            j$.time.Instant r5 = r5.plus(r1)
            int r5 = r0.compareTo(r5)
            if (r5 <= 0) goto L55
            gmd r5 = r4.f
            r5.g()
        L55:
            agpu r5 = defpackage.agpu.a
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gly.b(agsw):java.lang.Object");
    }
}
