package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uom implements uon {
    public final Random a;
    private final Context b;
    private final Executor c;
    private final Object d = new Object();
    private zyd e = null;

    public uom(Context context, Random random, Executor executor) {
        this.b = context;
        this.a = random;
        this.c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0070, B:16:0x0072), top: B:21:0x0003, inners: #1 }] */
    @Override // defpackage.uon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd a() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            zyd r0 = r9.e     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L16
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L16
            zyd r0 = r9.e     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L74
            defpackage.zxn.o(r0)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L74
            goto L16
        L13:
            r0 = 0
            r9.e = r0     // Catch: java.lang.Throwable -> L74
        L16:
            zyd r0 = r9.e     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L70
            android.content.Context r0 = r9.b     // Catch: java.lang.Throwable -> L74
            zyd r0 = defpackage.zxn.h(r0)     // Catch: java.lang.Throwable -> L74
            uok r2 = new uok     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.Executor r4 = r9.c     // Catch: java.lang.Throwable -> L74
            zyd r0 = defpackage.zuz.g(r0, r2, r4)     // Catch: java.lang.Throwable -> L74
            uoe r6 = defpackage.uoe.a     // Catch: java.lang.Throwable -> L74
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L74
            unm r2 = defpackage.uja.a     // Catch: java.lang.Throwable -> L74
            defpackage.ujr.a(r2, r7)     // Catch: java.lang.Throwable -> L74
            ueg r5 = new ueg     // Catch: java.lang.Throwable -> L74
            r2 = 1
            uhp[] r2 = new defpackage.uhp[r2]     // Catch: java.lang.Throwable -> L74
            ufc r3 = new ufc     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            r8 = 0
            r2[r8] = r3     // Catch: java.lang.Throwable -> L74
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L74
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L74
            ujq r3 = new ujq     // Catch: java.lang.Throwable -> L74
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L74
            uol r2 = new uol     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            zwk r3 = defpackage.zwk.a     // Catch: java.lang.Throwable -> L74
            zyd r0 = defpackage.zuz.g(r0, r2, r3)     // Catch: java.lang.Throwable -> L74
            uoi r2 = new uoi     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            zyd r0 = defpackage.zuz.h(r0, r2, r3)     // Catch: java.lang.Throwable -> L74
            uoj r2 = new uoj     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            zyd r0 = defpackage.zuz.g(r0, r2, r3)     // Catch: java.lang.Throwable -> L74
            r9.e = r0     // Catch: java.lang.Throwable -> L74
        L70:
            zyd r0 = r9.e     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            return r0
        L74:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uom.a():zyd");
    }
}
