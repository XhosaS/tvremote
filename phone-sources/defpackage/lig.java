package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lig {
    private static lig f;
    public List a;
    public Set b;
    public long c;
    public long d;
    public int e = 1;

    static {
        ImmutableList.of(xbu.HOME_PAGE_START, xbu.SHOP_PAGE_START);
    }

    private lig() {
    }

    public static synchronized lig a() {
        lig ligVar = f;
        if (ligVar != null) {
            return ligVar;
        }
        lig ligVar2 = new lig();
        f = ligVar2;
        return ligVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: all -> 0x0095, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x001d, B:13:0x0021, B:15:0x0027, B:22:0x0033, B:24:0x0045, B:25:0x0048, B:27:0x005a, B:28:0x005d, B:30:0x0070, B:31:0x0073, B:32:0x008d, B:35:0x0090, B:36:0x0091), top: B:45:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.xbu r14) {
        /*
            r13 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r13)
            long r2 = r13.c     // Catch: java.lang.Throwable -> L98
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L11
            r13.c = r0     // Catch: java.lang.Throwable -> L98
            r13.d = r0     // Catch: java.lang.Throwable -> L98
        L11:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L98
            long r2 = r13.d
            long r2 = r0 - r2
            long r6 = r13.c
            long r6 = r0 - r6
            monitor-enter(r13)
            if (r14 == 0) goto L91
            java.util.Set r8 = r13.b     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L91
            boolean r8 = r8.contains(r14)     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L91
            int r8 = r13.e     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L8f
            r9 = 1
            if (r8 == r9) goto L91
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L33
            goto L91
        L33:
            java.util.List r4 = r13.a     // Catch: java.lang.Throwable -> L95
            wic r5 = defpackage.wic.a     // Catch: java.lang.Throwable -> L95
            vtw r5 = r5.m()     // Catch: java.lang.Throwable -> L95
            int r8 = r14.I     // Catch: java.lang.Throwable -> L95
            vuc r10 = r5.b     // Catch: java.lang.Throwable -> L95
            boolean r10 = r10.A()     // Catch: java.lang.Throwable -> L95
            if (r10 != 0) goto L48
            r5.u()     // Catch: java.lang.Throwable -> L95
        L48:
            vuc r10 = r5.b     // Catch: java.lang.Throwable -> L95
            r11 = r10
            wic r11 = (defpackage.wic) r11     // Catch: java.lang.Throwable -> L95
            int r12 = r11.b     // Catch: java.lang.Throwable -> L95
            r9 = r9 | r12
            r11.b = r9     // Catch: java.lang.Throwable -> L95
            r11.c = r8     // Catch: java.lang.Throwable -> L95
            boolean r8 = r10.A()     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L5d
            r5.u()     // Catch: java.lang.Throwable -> L95
        L5d:
            vuc r8 = r5.b     // Catch: java.lang.Throwable -> L95
            r9 = r8
            wic r9 = (defpackage.wic) r9     // Catch: java.lang.Throwable -> L95
            int r10 = r9.b     // Catch: java.lang.Throwable -> L95
            r10 = r10 | 2
            r9.b = r10     // Catch: java.lang.Throwable -> L95
            r9.d = r2     // Catch: java.lang.Throwable -> L95
            boolean r2 = r8.A()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L73
            r5.u()     // Catch: java.lang.Throwable -> L95
        L73:
            vuc r2 = r5.b     // Catch: java.lang.Throwable -> L95
            wic r2 = (defpackage.wic) r2     // Catch: java.lang.Throwable -> L95
            int r3 = r2.b     // Catch: java.lang.Throwable -> L95
            r3 = r3 | 4
            r2.b = r3     // Catch: java.lang.Throwable -> L95
            r2.e = r6     // Catch: java.lang.Throwable -> L95
            vuc r2 = r5.r()     // Catch: java.lang.Throwable -> L95
            wic r2 = (defpackage.wic) r2     // Catch: java.lang.Throwable -> L95
            r4.add(r2)     // Catch: java.lang.Throwable -> L95
            java.util.Set r2 = r13.b     // Catch: java.lang.Throwable -> L95
            r2.add(r14)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L95
            goto L92
        L8f:
            r14 = 0
            throw r14     // Catch: java.lang.Throwable -> L95
        L91:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L95
        L92:
            r13.d = r0
            return
        L95:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L95
            throw r14
        L98:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L98
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.b(xbu):void");
    }
}
