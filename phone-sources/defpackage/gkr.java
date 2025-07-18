package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gkr extends gju {
    private static final String[] w = {"android:visibility:visibility", "android:visibility:parent"};
    public int v = 3;

    public static final void P(gke gkeVar) {
        Integer numValueOf = Integer.valueOf(gkeVar.b.getVisibility());
        Map map = gkeVar.a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", gkeVar.b.getParent());
        int[] iArr = new int[2];
        gkeVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r9 == 0) goto L26;
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
    private static final defpackage.gkq Q(defpackage.gke r8, defpackage.gke r9) {
        /*
            gkq r0 = new gkq
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.Map r6 = r8.a
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
            if (r9 == 0) goto L52
            java.util.Map r6 = r9.a
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
            if (r8 == 0) goto L7f
            if (r9 == 0) goto L7f
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L67
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L8d
        L67:
            if (r8 == r9) goto L75
            if (r8 != 0) goto L70
        L6b:
            r0.b = r1
        L6d:
            r0.a = r2
            return r0
        L70:
            if (r9 != 0) goto L8d
        L72:
            r0.b = r2
            goto L6d
        L75:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L7a
            goto L6b
        L7a:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L8d
            goto L72
        L7f:
            if (r8 != 0) goto L86
            int r8 = r0.d
            if (r8 != 0) goto L86
            goto L72
        L86:
            if (r9 != 0) goto L8d
            int r8 = r0.c
            if (r8 != 0) goto L8d
            goto L6b
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkr.Q(gke, gke):gkq");
    }

    @Override // defpackage.gju
    public final boolean A(gke gkeVar, gke gkeVar2) {
        if (gkeVar == null && gkeVar2 == null) {
            return false;
        }
        if (gkeVar != null && gkeVar2 != null) {
            if (gkeVar2.a.containsKey("android:visibility:visibility") != gkeVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        gkq gkqVarQ = Q(gkeVar, gkeVar2);
        if (gkqVarQ.a) {
            return gkqVarQ.c == 0 || gkqVarQ.d == 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0201  */
    @Override // defpackage.gju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.gke r26, defpackage.gke r27) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkr.a(android.view.ViewGroup, gke, gke):android.animation.Animator");
    }

    @Override // defpackage.gju
    public final void b(gke gkeVar) {
        P(gkeVar);
    }

    @Override // defpackage.gju
    public void c(gke gkeVar) {
        throw null;
    }

    @Override // defpackage.gju
    public final String[] e() {
        return w;
    }

    public Animator f(View view, gke gkeVar) {
        throw null;
    }

    public Animator g(View view, gke gkeVar, gke gkeVar2) {
        throw null;
    }
}
