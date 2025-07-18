package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ycw implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ ych c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ ycz e;

    public ycw(ycz yczVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, ych ychVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = ychVar;
        this.d = countDownLatch2;
        this.e = yczVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        r7 = new defpackage.zgk();
        r7.R(r14, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if (r8 >= r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r2 = r14.codePointAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        if (r2 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        r2 = r8 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        if (r2 >= r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r6 = defpackage.yen.a(r14.charAt(r8 + 1));
        r2 = defpackage.yen.a(r14.charAt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        if (r6 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        r7.M((r6 << 4) + r2);
        r8 = r2;
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r7.S(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
    
        r8 = r8 + java.lang.Character.charCount(r2);
        r3 = r20;
        r6 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
    
        r2 = r7.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0575 A[Catch: all -> 0x0577, DONT_GENERATE, TryCatch #14 {, blocks: (B:229:0x0533, B:231:0x053e, B:233:0x0547, B:236:0x054e, B:238:0x0554, B:242:0x0559, B:243:0x0575), top: B:326:0x0533, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycw.run():void");
    }
}
