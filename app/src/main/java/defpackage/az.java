package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class az extends am {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public az(defpackage.en r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r6.getClass()
            r5.<init>(r6)
            int r0 = r6.h
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L29
            if (r7 == 0) goto L22
            bq r7 = r6.a
            bn r0 = r7.U
            if (r0 != 0) goto L17
            goto L31
        L17:
            java.lang.Object r0 = r0.l
            java.lang.Object r1 = defpackage.bq.g
            if (r0 != r1) goto L3e
            java.lang.Object r0 = r7.eo()
            goto L3e
        L22:
            bq r7 = r6.a
            java.lang.Object r0 = r7.cQ()
            goto L46
        L29:
            if (r7 == 0) goto L40
            bq r7 = r6.a
            bn r0 = r7.U
            if (r0 != 0) goto L33
        L31:
            r0 = r4
            goto L3e
        L33:
            java.lang.Object r0 = r0.j
            java.lang.Object r1 = defpackage.bq.g
            if (r0 != r1) goto L3e
            java.lang.Object r7 = r7.cQ()
            r0 = r7
        L3e:
            r2 = r3
            goto L46
        L40:
            bq r7 = r6.a
            java.lang.Object r0 = r7.eo()
        L46:
            r5.b = r0
            r5.c = r3
            if (r8 == 0) goto L5f
            bq r6 = r6.a
            if (r2 == 0) goto L5b
            bn r7 = r6.U
            if (r7 != 0) goto L55
            goto L5f
        L55:
            java.lang.Object r4 = r7.n
            java.lang.Object r7 = defpackage.bq.g
            if (r4 != r7) goto L5f
        L5b:
            java.lang.Object r4 = r6.eq()
        L5f:
            r5.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.<init>(en, boolean, boolean):void");
    }

    private final dy d(Object obj) {
        if (obj == null) {
            return null;
        }
        dy dyVar = dq.a;
        if (obj instanceof Transition) {
            return dyVar;
        }
        dy dyVar2 = dq.b;
        if (dyVar2 != null && dyVar2.l(obj)) {
            return dyVar2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final dy a() {
        Object obj = this.d;
        Object obj2 = this.b;
        dy dyVarD = d(obj2);
        dy dyVarD2 = d(obj);
        if (dyVarD == null || dyVarD2 == null || dyVarD == dyVarD2) {
            return dyVarD == null ? dyVarD2 : dyVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}
