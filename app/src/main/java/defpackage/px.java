package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class px {
    public py h = null;
    private final ArrayList a = new ArrayList();

    public static void s(qv qvVar) {
        int i = qvVar.j;
        if (!qvVar.q() && (i & 4) == 0) {
            int i2 = qvVar.d;
            qvVar.cs();
        }
    }

    public abstract void c(qv qvVar);

    public abstract void d();

    public abstract void e();

    public boolean h(qv qvVar, List list) {
        return r(qvVar);
    }

    public abstract boolean i();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.qv r11) {
        /*
            r10 = this;
            py r0 = r10.h
            if (r0 == 0) goto L95
            r1 = 1
            r11.m(r1)
            qv r2 = r11.h
            r3 = 0
            if (r2 == 0) goto L13
            qv r2 = r11.i
            if (r2 != 0) goto L13
            r11.h = r3
        L13:
            r11.i = r3
            int r2 = r11.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L95
        L1d:
            android.view.View r2 = r11.a
            android.support.v7.widget.RecyclerView r3 = r0.a
            r3.am()
            na r4 = r3.h
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L39
            android.view.View r1 = r4.d
            if (r1 != r2) goto L31
        L2f:
            r1 = r6
            goto L66
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L39:
            r7 = 2
            if (r5 == r7) goto L8d
            r4.c = r7     // Catch: java.lang.Throwable -> L89
            po r5 = r4.e     // Catch: java.lang.Throwable -> L89
            android.support.v7.widget.RecyclerView r7 = r5.a     // Catch: java.lang.Throwable -> L89
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L89
            r8 = -1
            if (r7 != r8) goto L4f
            r4.m(r2)     // Catch: java.lang.Throwable -> L89
            r4.c = r6
            goto L66
        L4f:
            mz r8 = r4.a     // Catch: java.lang.Throwable -> L89
            boolean r9 = r8.f(r7)     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L63
            r8.g(r7)     // Catch: java.lang.Throwable -> L89
            r4.m(r2)     // Catch: java.lang.Throwable -> L89
            r5.b(r7)     // Catch: java.lang.Throwable -> L89
            r4.c = r6
            goto L66
        L63:
            r4.c = r6
            goto L2f
        L66:
            if (r1 == 0) goto L74
            qv r2 = android.support.v7.widget.RecyclerView.m(r2)
            ql r4 = r3.e
            r4.n(r2)
            r4.k(r2)
        L74:
            r2 = r1 ^ 1
            r3.an(r2)
            if (r1 != 0) goto L95
            boolean r1 = r11.u()
            if (r1 == 0) goto L95
            android.support.v7.widget.RecyclerView r0 = r0.a
            android.view.View r11 = r11.a
            r0.removeDetachedView(r11, r6)
            return
        L89:
            r11 = move-exception
            r4.c = r6
            throw r11
        L8d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.l(qv):void");
    }

    public final void m() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pv) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public abstract boolean n(qv qvVar, pw pwVar, pw pwVar2);

    public abstract boolean o(qv qvVar, qv qvVar2, pw pwVar, pw pwVar2);

    public abstract boolean p(qv qvVar, pw pwVar, pw pwVar2);

    public abstract boolean q(qv qvVar, pw pwVar, pw pwVar2);

    public boolean r(qv qvVar) {
        throw null;
    }
}
