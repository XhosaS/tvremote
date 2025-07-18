package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mce implements mcd {
    public final jzs a;
    private final ieh b;
    private final Executor c;
    private final lfn d;
    private final List e;
    private final ids f;
    private final mru g;

    public mce(ieh iehVar, ExecutorService executorService, lfn lfnVar, jzs jzsVar, mru mruVar, iea ieaVar, iea ieaVar2) {
        this.b = iehVar;
        this.d = lfnVar;
        this.c = executorService;
        this.g = mruVar;
        this.a = jzsVar;
        ids idsVarD = hjt.d(ieaVar, ieaVar2);
        this.f = idsVarD;
        this.e = new ArrayList();
        idsVarD.ea(new krt());
        e(new hfx(ieaVar, (byte[]) null));
        e(new hfx(ieaVar2, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ieh, java.lang.Object] */
    private final ieg f(ksy ksyVar) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ieg iegVarA = ieg.a((kxe) ((Map) ((hfx) it.next()).a.a()).get(ksyVar));
            if (iegVarA.m()) {
                kxe kxeVar = (kxe) iegVarA.g();
                if (kxeVar.c || kxeVar.b + this.d.aU() >= System.currentTimeMillis()) {
                    return iegVarA;
                }
            }
        }
        return ieg.a;
    }

    @Override // defpackage.mcd
    public final ids a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.mcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.kxe b(defpackage.ksy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            ieg r0 = r10.f(r11)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r0.k()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L28
            ieh r1 = r10.b     // Catch: java.lang.Throwable -> L3b
            ldy r1 = (defpackage.ldy) r1     // Catch: java.lang.Throwable -> L3b
            ieg r4 = r1.a()     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r4.m()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L28
            java.util.concurrent.Executor r1 = r10.c     // Catch: java.lang.Throwable -> L3b
            lke r2 = new lke     // Catch: java.lang.Throwable -> L3b
            r6 = 7
            r7 = 0
            r3 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L40
            r1.execute(r2)     // Catch: java.lang.Throwable -> L40
            goto L2a
        L28:
            r3 = r10
            r5 = r11
        L2a:
            kxe r4 = new kxe     // Catch: java.lang.Throwable -> L40
            r7 = -1
            r9 = 0
            r6 = 3
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r11 = r0.h(r4)     // Catch: java.lang.Throwable -> L40
            kxe r11 = (defpackage.kxe) r11     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r11
        L3b:
            r0 = move-exception
            r3 = r10
        L3d:
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r11
        L40:
            r0 = move-exception
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.b(ksy):kxe");
    }

    @Override // defpackage.mcd
    public final synchronized boolean c(ksy ksyVar) {
        ieg iegVarF = f(ksyVar);
        if (iegVarF.m()) {
            if (((kxe) iegVarF.g()).d == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mcd
    public final synchronized void d(ksn ksnVar, ksy ksyVar, int i, boolean z, String str) {
        this.g.h(ksnVar, ksyVar, i, z, str, true);
    }

    public final synchronized void e(hfx hfxVar) {
        this.e.add(hfxVar);
    }
}
