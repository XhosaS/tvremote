package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dra {
    private static volatile boolean a = false;
    private static volatile boolean b;

    public static synchronized void a() {
        a = false;
    }

    public static boolean b(Context context) {
        if (!a) {
            d((AccessibilityManager) context.getSystemService("accessibility"));
        }
        return b;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        if (!a) {
            d(accessibilityManager);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[EDGE_INSN: B:23:0x0042->B:24:0x0043 BREAK  A[LOOP:0: B:17:0x0028->B:35:0x0028]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void d(android.view.accessibility.AccessibilityManager r6) {
        /*
            java.lang.Class<dra> r0 = defpackage.dra.class
            monitor-enter(r0)
            java.lang.String r1 = "is_accessibility_enabled"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L49
            r2 = 1
            if (r1 != 0) goto L42
            r1 = 0
            if (r6 == 0) goto L43
            boolean r3 = r6.isEnabled()     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L16
            goto L43
        L16:
            boolean r3 = r6.isTouchExplorationEnabled()     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L42
            r3 = -1
            java.util.List r6 = r6.getEnabledAccessibilityServiceList(r3)     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L24
            goto L43
        L24:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L49
        L28:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L43
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L49
            android.accessibilityservice.AccessibilityServiceInfo r3 = (android.accessibilityservice.AccessibilityServiceInfo) r3     // Catch: java.lang.Throwable -> L49
            int r4 = r3.eventTypes     // Catch: java.lang.Throwable -> L49
            r5 = 2048(0x800, float:2.87E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L28
            int r3 = r3.getCapabilities()     // Catch: java.lang.Throwable -> L49
            r3 = r3 & r2
            if (r3 != r2) goto L28
        L42:
            r1 = r2
        L43:
            defpackage.dra.b = r1     // Catch: java.lang.Throwable -> L49
            defpackage.dra.a = r2     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            return
        L49:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dra.d(android.view.accessibility.AccessibilityManager):void");
    }
}
