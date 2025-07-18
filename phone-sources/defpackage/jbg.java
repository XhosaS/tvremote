package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbg implements kmj {
    public final kw a;
    private final ldv b;
    private final ino c;
    private final yow d;
    private final yow e;
    private final lfz f;
    private final mdw g;

    public jbg(ldv ldvVar, ino inoVar, kw kwVar, mdw mdwVar, lfz lfzVar, yow yowVar, yow yowVar2) {
        ldvVar.getClass();
        inoVar.getClass();
        kwVar.getClass();
        mdwVar.getClass();
        lfzVar.getClass();
        yowVar2.getClass();
        this.b = ldvVar;
        this.c = inoVar;
        this.a = kwVar;
        this.g = mdwVar;
        this.f = lfzVar;
        this.d = yowVar;
        this.e = yowVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    private static final wkc b(List list, int i, wnv wnvVar) {
        wnu wnuVar;
        Object next;
        wlz next2;
        Iterator it = list.iterator();
        while (true) {
            wnuVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((wlz) next).c) {
                break;
            }
        }
        wlz wlzVar = (wlz) next;
        if (wlzVar == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = 0;
                    break;
                }
                next2 = it2.next();
                if (((wlz) next2).b == i) {
                    break;
                }
            }
            wlzVar = next2;
            if (wlzVar == null) {
                wkc wkcVar = wkc.a;
                wkcVar.getClass();
                return wkcVar;
            }
        }
        vun vunVar = wnvVar.c;
        vunVar.getClass();
        Iterator it3 = vunVar.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ?? next3 = it3.next();
            if (((wnu) next3).e == wlzVar.b) {
                wnuVar = next3;
                break;
            }
        }
        wnu wnuVar2 = wnuVar;
        if (wnuVar2 != null) {
            return jbr.r(wnuVar2);
        }
        wkc wkcVar2 = wkc.a;
        wkcVar2.getClass();
        return wkcVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.kmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.work.WorkerParameters r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbg.a(androidx.work.WorkerParameters, yih):java.lang.Object");
    }
}
