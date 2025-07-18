package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ace implements bwa {
    private boolean a;
    private final List b = new ArrayList();

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return bdi.z(this, yjvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.yih r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.acd
            if (r0 == 0) goto L13
            r0 = r6
            acd r0 = (defpackage.acd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            acd r0 = new acd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ylf r0 = r0.d
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L6d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.ybn.f(r6)
            boolean r6 = r5.a
            if (r6 != 0) goto L78
            ylf r6 = new ylf
            r6.<init>()
            r0.d = r6     // Catch: java.lang.Throwable -> L69
            r0.c = r3     // Catch: java.lang.Throwable -> L69
            yof r2 = new yof     // Catch: java.lang.Throwable -> L69
            yih r0 = defpackage.wcq.S(r0)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L69
            r2.v()     // Catch: java.lang.Throwable -> L69
            r6.a = r2     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = r5.b     // Catch: java.lang.Throwable -> L69
            r0.add(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r2.i()     // Catch: java.lang.Throwable -> L69
            if (r0 == r1) goto L68
            r0 = r6
        L5d:
            java.util.List r6 = r5.b
            java.lang.Object r0 = r0.a
            defpackage.ylh.e(r6)
            r6.remove(r0)
            goto L78
        L68:
            return r1
        L69:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L6d:
            java.util.List r1 = r5.b
            java.lang.Object r0 = r0.a
            defpackage.ylh.e(r1)
            r1.remove(r0)
            throw r6
        L78:
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ace.d(yih):java.lang.Object");
    }

    @Override // defpackage.bwa
    public final void e(bvc bvcVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((yih) list.get(i)).resumeWith(ygi.a);
        }
        list.clear();
    }
}
