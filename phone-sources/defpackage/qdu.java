package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdu implements qdq {
    public static final tvn a = tvn.n("GnpSdk");
    public final qnr b;
    public final yil c;
    public final Context d;
    public final Set e;

    public qdu(qnr qnrVar, yil yilVar, Context context, Set set) {
        set.getClass();
        this.b = qnrVar;
        this.c = yilVar;
        this.d = context;
        this.e = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qen r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qdt
            if (r0 == 0) goto L13
            r0 = r8
            qdt r0 = (defpackage.qdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qdt r0 = new qdt
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L4c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ybn.f(r8)
            qnr r8 = r6.b
            qpv r7 = r7.b()
            r0.c = r3
            ajp r2 = new ajp
            qnx r8 = (defpackage.qnx) r8
            r4 = 0
            r5 = 10
            r2.<init>(r8, r7, r4, r5)
            yil r7 = r8.c
            java.lang.Object r8 = defpackage.ykr.l(r7, r2, r0)
            if (r8 == r1) goto L82
        L4c:
            qdl r8 = (defpackage.qdl) r8
            boolean r7 = r8 instanceof defpackage.qdn
            if (r7 == 0) goto L75
            qdn r8 = (defpackage.qdn) r8
            java.lang.Object r7 = r8.a
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 == r3) goto L6d
            qdj r7 = new qdj
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "Failed deleting account"
            r8.<init>(r0)
            r0 = 32
            r7.<init>(r8, r0)
            return r7
        L6d:
            qdn r7 = new qdn
            ygi r8 = defpackage.ygi.a
            r7.<init>(r8)
            return r7
        L75:
            boolean r7 = r8 instanceof defpackage.qdi
            if (r7 == 0) goto L7c
            qdi r8 = (defpackage.qdi) r8
            return r8
        L7c:
            yfu r7 = new yfu
            r7.<init>()
            throw r7
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdu.a(qen, yih):java.lang.Object");
    }
}
