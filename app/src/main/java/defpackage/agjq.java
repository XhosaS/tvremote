package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjq extends AtomicReference implements agfs {
    private static final long serialVersionUID = -4823716997131257941L;
    final agjr a;
    final int b;

    public agjq(agjr agjrVar, int i) {
        this.a = agjrVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000b, B:13:0x0015, B:16:0x001f, B:15:0x001d), top: B:24:0x0005 }] */
    @Override // defpackage.agfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            int r0 = r5.b
            agjr r1 = r5.a
            monitor-enter(r1)
            java.lang.Object[] r2 = r1.d     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return
        Lb:
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L29
            r3 = 1
            if (r0 != 0) goto L12
            r0 = r3
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L1d
            int r4 = r1.j     // Catch: java.lang.Throwable -> L29
            int r4 = r4 + r3
            r1.j = r4     // Catch: java.lang.Throwable -> L29
            int r2 = r2.length     // Catch: java.lang.Throwable -> L29
            if (r4 != r2) goto L1f
        L1d:
            r1.g = r3     // Catch: java.lang.Throwable -> L29
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L25
            r1.a()
        L25:
            r1.c()
            return
        L29:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjq.a():void");
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        boolean z;
        int i = this.b;
        agjr agjrVar = this.a;
        synchronized (agjrVar) {
            Object[] objArr = agjrVar.d;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = agjrVar.i;
            if (obj2 == null) {
                i2++;
                agjrVar.i = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                agjrVar.e.h((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                agjrVar.c();
            }
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        aghd.c(this, aggiVar);
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        agjr agjrVar = this.a;
        if (!agnx.c(agjrVar.h, th)) {
            agoh.e(th);
        } else {
            agjrVar.a();
            agjrVar.c();
        }
    }
}
