package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwa extends bvc {
    private static final String[] v = {"android:visibility:visibility", "android:visibility:parent"};
    public int u = 3;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r10 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.e == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r0.c == 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.bvz O(defpackage.bvl r9, defpackage.bvl r10) {
        /*
            r8 = this;
            bvz r0 = new bvz
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r9 == 0) goto L2f
            java.util.Map r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r10 == 0) goto L52
            java.util.Map r6 = r10.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r9 == 0) goto L7f
            if (r10 == 0) goto L7f
            int r9 = r0.c
            int r10 = r0.d
            if (r9 != r10) goto L67
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L8d
        L67:
            if (r9 == r10) goto L75
            if (r9 != 0) goto L70
        L6b:
            r0.b = r1
        L6d:
            r0.a = r2
            return r0
        L70:
            if (r10 != 0) goto L8d
        L72:
            r0.b = r2
            goto L6d
        L75:
            android.view.ViewGroup r9 = r0.f
            if (r9 != 0) goto L7a
            goto L6b
        L7a:
            android.view.ViewGroup r9 = r0.e
            if (r9 != 0) goto L8d
            goto L72
        L7f:
            if (r9 != 0) goto L86
            int r9 = r0.d
            if (r9 != 0) goto L86
            goto L72
        L86:
            if (r10 != 0) goto L8d
            int r9 = r0.c
            if (r9 != 0) goto L8d
            goto L6b
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwa.O(bvl, bvl):bvz");
    }

    @Override // defpackage.bvc
    public final boolean D(bvl bvlVar, bvl bvlVar2) {
        if (bvlVar == null && bvlVar2 == null) {
            return false;
        }
        if (bvlVar != null && bvlVar2 != null) {
            if (bvlVar2.a.containsKey("android:visibility:visibility") != bvlVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        bvz bvzVarO = O(bvlVar, bvlVar2);
        if (bvzVarO.a) {
            return bvzVarO.c == 0 || bvzVarO.d == 0;
        }
        return false;
    }

    public final void N(bvl bvlVar) {
        Integer numValueOf = Integer.valueOf(bvlVar.b.getVisibility());
        Map map = bvlVar.a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", bvlVar.b.getParent());
        int[] iArr = new int[2];
        bvlVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    @Override // defpackage.bvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.bvl r26, defpackage.bvl r27) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwa.a(android.view.ViewGroup, bvl, bvl):android.animation.Animator");
    }

    @Override // defpackage.bvc
    public final void b(bvl bvlVar) {
        N(bvlVar);
    }

    @Override // defpackage.bvc
    public void c(bvl bvlVar) {
        throw null;
    }

    @Override // defpackage.bvc
    public final String[] e() {
        return v;
    }

    public Animator f(View view, bvl bvlVar) {
        throw null;
    }

    public Animator g(View view, bvl bvlVar, bvl bvlVar2) {
        throw null;
    }
}
