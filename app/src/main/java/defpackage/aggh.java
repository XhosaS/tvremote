package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggh implements aggi, aghb {
    agoc a;
    public volatile boolean b;

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x0019, B:12:0x002b, B:36:0x0085, B:15:0x0032, B:18:0x0039, B:21:0x0040, B:23:0x004b, B:24:0x0052, B:26:0x0058, B:27:0x0064, B:30:0x006b, B:35:0x007f, B:33:0x0079, B:38:0x0087), top: B:45:0x000a }] */
    @Override // defpackage.aghb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.aggi r10) {
        /*
            r9 = this;
            java.lang.String r0 = "disposable is null"
            defpackage.aghn.b(r10, r0)
            boolean r0 = r9.b
            if (r0 != 0) goto L8c
            monitor-enter(r9)
            boolean r0 = r9.b     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L87
            agoc r0 = r9.a     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L19
            agoc r0 = new agoc     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r9.a = r0     // Catch: java.lang.Throwable -> L89
        L19:
            java.lang.Object[] r1 = r0.d     // Catch: java.lang.Throwable -> L89
            int r2 = r0.a     // Catch: java.lang.Throwable -> L89
            int r3 = r10.hashCode()     // Catch: java.lang.Throwable -> L89
            int r3 = defpackage.agoc.a(r3)     // Catch: java.lang.Throwable -> L89
            r3 = r3 & r2
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L89
            r5 = 1
            if (r4 == 0) goto L40
            boolean r4 = r4.equals(r10)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L32
            goto L85
        L32:
            int r3 = r3 + r5
            r3 = r3 & r2
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L39
            goto L40
        L39:
            boolean r4 = r4.equals(r10)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L32
            goto L85
        L40:
            r1[r3] = r10     // Catch: java.lang.Throwable -> L89
            int r10 = r0.b     // Catch: java.lang.Throwable -> L89
            int r10 = r10 + r5
            r0.b = r10     // Catch: java.lang.Throwable -> L89
            int r1 = r0.c     // Catch: java.lang.Throwable -> L89
            if (r10 < r1) goto L85
            java.lang.Object[] r1 = r0.d     // Catch: java.lang.Throwable -> L89
            int r2 = r1.length     // Catch: java.lang.Throwable -> L89
            int r3 = r2 + r2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L89
        L52:
            int r6 = r3 + (-1)
            int r7 = r10 + (-1)
            if (r10 != 0) goto L64
            r0.a = r6     // Catch: java.lang.Throwable -> L89
            float r10 = (float) r3     // Catch: java.lang.Throwable -> L89
            r1 = 1061158912(0x3f400000, float:0.75)
            float r10 = r10 * r1
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L89
            r0.c = r10     // Catch: java.lang.Throwable -> L89
            r0.d = r4     // Catch: java.lang.Throwable -> L89
            goto L85
        L64:
            int r2 = r2 + (-1)
            r10 = r1[r2]     // Catch: java.lang.Throwable -> L89
            if (r10 != 0) goto L6b
            goto L64
        L6b:
            int r10 = r10.hashCode()     // Catch: java.lang.Throwable -> L89
            int r10 = defpackage.agoc.a(r10)     // Catch: java.lang.Throwable -> L89
            r10 = r10 & r6
            r8 = r4[r10]     // Catch: java.lang.Throwable -> L89
            if (r8 != 0) goto L79
            goto L7f
        L79:
            int r10 = r10 + r5
            r10 = r10 & r6
            r8 = r4[r10]     // Catch: java.lang.Throwable -> L89
            if (r8 != 0) goto L79
        L7f:
            r6 = r1[r2]     // Catch: java.lang.Throwable -> L89
            r4[r10] = r6     // Catch: java.lang.Throwable -> L89
            r10 = r7
            goto L52
        L85:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L89
            return r5
        L87:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L89
            goto L8c
        L89:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L89
            throw r10
        L8c:
            r10.dispose()
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggh.a(aggi):boolean");
    }

    @Override // defpackage.aghb
    public final boolean b(aggi aggiVar) {
        Object[] objArr;
        int i;
        int iA;
        Object obj;
        Object obj2;
        aghn.b(aggiVar, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            agoc agocVar = this.a;
            if (agocVar != null && (obj = (objArr = agocVar.d)[(iA = agoc.a(aggiVar.hashCode()) & (i = agocVar.a))]) != null) {
                if (obj.equals(aggiVar)) {
                    agocVar.b(iA, objArr, i);
                } else {
                    do {
                        iA = (iA + 1) & i;
                        obj2 = objArr[iA];
                        if (obj2 != null) {
                        }
                    } while (!obj2.equals(aggiVar));
                    agocVar.b(iA, objArr, i);
                }
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.aghb
    public final void c(aggi aggiVar) {
        if (b(aggiVar)) {
            aggiVar.dispose();
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            agoc agocVar = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (agocVar != null) {
                for (Object obj : agocVar.d) {
                    if (obj instanceof aggi) {
                        try {
                            ((aggi) obj).dispose();
                        } catch (Throwable th) {
                            aggq.a(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new aggp(arrayList);
                    }
                    throw agnx.a((Throwable) arrayList.get(0));
                }
            }
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
