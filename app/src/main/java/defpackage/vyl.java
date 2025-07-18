package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyl extends vyj implements vyp {
    public final Object a = new Object();
    public final Map b = new we();
    private final zbp c = new yxu(3);

    @Override // defpackage.vyj
    public final void a(zyd zydVar, Object obj) {
        b(zydVar, obj, vyo.a, ypv.a, zwk.a);
    }

    public final void b(zyd zydVar, Object obj, vyo vyoVar, yqt yqtVar, Executor executor) {
        wum.w(false);
        zxn.p(zydVar, wyo.f(new vyk(this, obj, vyoVar, yqtVar)), executor);
    }

    @Override // defpackage.vyp
    public final void c(Object obj, vzp vzpVar) {
        uea.c();
        wg wgVar = new wg(0);
        synchronized (this.a) {
            yzg yzgVar = new yzg(4);
            Map map = this.b;
            yzj yzjVar = (yzj) map.get(obj);
            if (yzjVar != null) {
                yzgVar.b(yzjVar);
            }
            yzgVar.f(vzpVar, 1);
            map.put(obj, yzgVar.a());
        }
        wf wfVar = new wf(wgVar);
        while (wfVar.hasNext()) {
            ((vyn) wfVar.next()).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:4:0x000c, B:8:0x001a, B:10:0x0035, B:12:0x0039, B:17:0x0052, B:19:0x0059, B:21:0x0068, B:23:0x007b, B:24:0x007e, B:20:0x0063, B:14:0x0045, B:16:0x0049), top: B:33:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:4:0x000c, B:8:0x001a, B:10:0x0035, B:12:0x0039, B:17:0x0052, B:19:0x0059, B:21:0x0068, B:23:0x007b, B:24:0x007e, B:20:0x0063, B:14:0x0045, B:16:0x0049), top: B:33:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:4:0x000c, B:8:0x001a, B:10:0x0035, B:12:0x0039, B:17:0x0052, B:19:0x0059, B:21:0x0068, B:23:0x007b, B:24:0x007e, B:20:0x0063, B:14:0x0045, B:16:0x0049), top: B:33:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:4:0x000c, B:8:0x001a, B:10:0x0035, B:12:0x0039, B:17:0x0052, B:19:0x0059, B:21:0x0068, B:23:0x007b, B:24:0x007e, B:20:0x0063, B:14:0x0045, B:16:0x0049), top: B:33:0x000c }] */
    @Override // defpackage.vyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r9, defpackage.vzp r10) {
        /*
            r8 = this;
            defpackage.uea.c()
            wg r0 = new wg
            r1 = 0
            r0.<init>(r1)
            java.lang.Object r2 = r8.a
            monitor-enter(r2)
            java.util.Map r3 = r8.b     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r3.get(r9)     // Catch: java.lang.Throwable -> L95
            yzj r4 = (defpackage.yzj) r4     // Catch: java.lang.Throwable -> L95
            r5 = 1
            if (r4 == 0) goto L19
            r6 = r5
            goto L1a
        L19:
            r6 = r1
        L1a:
            java.lang.String r7 = "Failed to remove a subscription key. State is corrupted."
            defpackage.yqw.M(r6, r7)     // Catch: java.lang.Throwable -> L95
            yzg r6 = new yzg     // Catch: java.lang.Throwable -> L95
            r7 = 4
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L95
            r6.b(r4)     // Catch: java.lang.Throwable -> L95
            int r4 = r4.a(r10)     // Catch: java.lang.Throwable -> L95
            int r4 = r4 + (-1)
            zby r7 = r6.a     // Catch: java.lang.Throwable -> L95
            r7.getClass()     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L45
            boolean r4 = r6.c     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L44
            zbz r4 = new zbz     // Catch: java.lang.Throwable -> L95
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L95
            r6.a = r4     // Catch: java.lang.Throwable -> L95
            r6.c = r5     // Catch: java.lang.Throwable -> L95
            r4 = r1
            goto L52
        L44:
            r4 = r1
        L45:
            boolean r5 = r6.b     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L52
            zby r5 = new zby     // Catch: java.lang.Throwable -> L95
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L95
            r6.a = r5     // Catch: java.lang.Throwable -> L95
            r6.c = r1     // Catch: java.lang.Throwable -> L95
        L52:
            r6.b = r1     // Catch: java.lang.Throwable -> L95
            r10.getClass()     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L63
            zby r1 = r6.a     // Catch: java.lang.Throwable -> L95
            int r4 = defpackage.yxv.b(r10)     // Catch: java.lang.Throwable -> L95
            r1.f(r10, r4)     // Catch: java.lang.Throwable -> L95
            goto L68
        L63:
            zby r1 = r6.a     // Catch: java.lang.Throwable -> L95
            r1.p(r10, r4)     // Catch: java.lang.Throwable -> L95
        L68:
            yzj r10 = r6.a()     // Catch: java.lang.Throwable -> L95
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r10 = r3.get(r9)     // Catch: java.lang.Throwable -> L95
            yzj r10 = (defpackage.yzj) r10     // Catch: java.lang.Throwable -> L95
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L7e
            r3.remove(r9)     // Catch: java.lang.Throwable -> L95
        L7e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            wf r9 = new wf
            r9.<init>(r0)
        L84:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r9.next()
            vyn r10 = (defpackage.vyn) r10
            r10.c()
            goto L84
        L94:
            return
        L95:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyl.d(java.lang.Object, vzp):void");
    }
}
