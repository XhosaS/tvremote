package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjh extends agjg {
    private static final long serialVersionUID = -6022804456014692607L;
    final agho d;

    public agjh(agho aghoVar, Iterator it) {
        super(it);
        this.d = aghoVar;
    }

    @Override // defpackage.agjg
    public final void d() {
        agho aghoVar = this.d;
        Iterator it = this.a;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next == null) {
                    aghoVar.e(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                aghoVar.c(next);
                if (this.b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.b) {
                            return;
                        }
                        aghoVar.d();
                        return;
                    }
                } catch (Throwable th) {
                    aggq.a(th);
                    aghoVar.e(th);
                    return;
                }
            } catch (Throwable th2) {
                aggq.a(th2);
                aghoVar.e(th2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r9 = addAndGet(-r4);
     */
    @Override // defpackage.agjg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r9) {
        /*
            r8 = this;
            agho r0 = r8.d
            java.util.Iterator r1 = r8.a
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L51
            boolean r6 = r8.b
            if (r6 == 0) goto L10
            goto L63
        L10:
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L49
            boolean r7 = r8.b
            if (r7 != 0) goto L63
            if (r6 != 0) goto L25
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Iterator.next() returned a null value"
            r9.<init>(r10)
            r0.e(r9)
            return
        L25:
            boolean r6 = r0.c(r6)
            boolean r7 = r8.b
            if (r7 != 0) goto L63
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r7 != 0) goto L3b
            boolean r9 = r8.b
            if (r9 != 0) goto L63
            r0.d()
            return
        L3b:
            if (r6 == 0) goto L7
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L41:
            r9 = move-exception
            defpackage.aggq.a(r9)
            r0.e(r9)
            return
        L49:
            r9 = move-exception
            defpackage.aggq.a(r9)
            r0.e(r9)
            return
        L51:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L63
            goto L6
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjh.f(long):void");
    }
}
