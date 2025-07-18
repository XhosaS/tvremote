package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eub extends Thread {
    public final euh a;
    public final boolean b;
    public volatile boolean c;
    public Exception d;
    private final eul e;
    private final eud f;
    private final int g;
    private volatile etz h;
    private long i = -1;

    public eub(euh euhVar, eul eulVar, eud eudVar, boolean z, int i, etz etzVar) {
        this.a = euhVar;
        this.e = eulVar;
        this.f = eudVar;
        this.b = z;
        this.g = i;
        this.h = etzVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.h = null;
        }
        if (this.c) {
            return;
        }
        this.c = true;
        eul eulVar = this.e;
        List list = ((jdj) eulVar).g;
        synchronized (list) {
            ((jdj) eulVar).h.set(true);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((edj) list.get(i)).cancel(true);
            }
        }
        interrupt();
    }

    public final void b(long j, long j2, float f) {
        eud eudVar = this.f;
        eudVar.a = j2;
        eudVar.b = f;
        if (j != this.i) {
            this.i = j;
            etz etzVar = this.h;
            if (etzVar != null) {
                etzVar.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0371 A[Catch: IOException -> 0x0395, Exception -> 0x03cf, InterruptedException -> 0x03d3, LOOP:4: B:142:0x036b->B:144:0x0371, LOOP_END, TryCatch #4 {IOException -> 0x0395, blocks: (B:138:0x035b, B:141:0x0362, B:142:0x036b, B:144:0x0371, B:145:0x0382), top: B:184:0x035b }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a7 A[Catch: Exception -> 0x03cf, InterruptedException -> 0x03d3, TryCatch #16 {InterruptedException -> 0x03d3, Exception -> 0x03cf, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x0047, B:13:0x0054, B:15:0x0058, B:17:0x006b, B:133:0x0344, B:134:0x034e, B:136:0x0354, B:138:0x035b, B:159:0x03a3, B:161:0x03a7, B:166:0x03b4, B:168:0x03ba, B:169:0x03c8, B:141:0x0362, B:142:0x036b, B:144:0x0371, B:145:0x0382, B:148:0x038c, B:150:0x0392, B:116:0x02f0, B:117:0x02fa, B:119:0x0300, B:120:0x030b, B:121:0x0313, B:123:0x0319, B:124:0x032a, B:126:0x0332, B:6:0x0015, B:7:0x0025, B:9:0x002b), top: B:200:0x0002, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0354 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0225 A[PHI: r8
  0x0225: PHI (r8v5 int) = (r8v12 int), (r8v13 int) binds: [B:74:0x0213, B:79:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eub.run():void");
    }
}
