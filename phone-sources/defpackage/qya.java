package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qya {
    public static final /* synthetic */ int b = 0;
    private static final Duration c;
    public final rkp a;
    private final Context d;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    public qya(Context context, rkp rkpVar) {
        this.d = context;
        this.a = rkpVar;
    }

    public final void a(String str) {
        Uri uri = Uri.parse(str);
        try {
            bhi bhiVarE = new fx((byte[]) null).e();
            ((Intent) bhiVarE.a).setFlags(268435456);
            bhiVarE.r(this.d, uri);
        } catch (ActivityNotFoundException e) {
            Log.e("DeactivatedAccountEvent", "No activity found to handle URL: ".concat(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.vrn r12, defpackage.yih r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.qxz
            if (r0 == 0) goto L13
            r0 = r13
            qxz r0 = (defpackage.qxz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qxz r0 = new qxz
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ybn.f(r13)
            goto L47
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ybn.f(r13)
            j$.time.Duration r13 = defpackage.qya.c
            long r5 = r13.toMillis()
            qxa r13 = new qxa
            r2 = 4
            r13.<init>(r11, r12, r4, r2)
            r0.c = r3
            java.lang.Object r13 = defpackage.yoz.t(r5, r13, r0)
            if (r13 == r1) goto La8
        L47:
            nhr r13 = (defpackage.nhr) r13
            if (r13 != 0) goto L51
            rkp r12 = r11.a
            nhr r13 = r12.c()
        L51:
            vrj r5 = new vrj
            java.lang.String r6 = r13.a
            r6.getClass()
            byte[] r12 = r13.b     // Catch: defpackage.vuq -> L9e
            vtp r0 = defpackage.vtp.a()     // Catch: defpackage.vuq -> L9e
            tzm r1 = defpackage.tzm.a     // Catch: defpackage.vuq -> L9e
            int r2 = r12.length     // Catch: defpackage.vuq -> L9e
            r3 = 0
            vuc r12 = defpackage.vuc.p(r1, r12, r3, r2, r0)     // Catch: defpackage.vuq -> L9e
            defpackage.vuc.B(r12)     // Catch: defpackage.vuq -> L9e
            tzm r12 = (defpackage.tzm) r12     // Catch: defpackage.vuq -> L9e
            java.lang.String r12 = r12.c
            tzl r0 = new tzl
            r0.<init>(r12)
            java.lang.String r7 = r0.a
            java.lang.String r12 = r13.d
            if (r12 != 0) goto L84
            android.content.Context r12 = r11.d
            r0 = 2132018343(0x7f1404a7, float:1.967499E38)
            java.lang.String r12 = r12.getString(r0)
            r12.getClass()
        L84:
            r8 = r12
            qaz r9 = new qaz
            r12 = 9
            r9.<init>(r13, r11, r12, r4)
            java.lang.String r12 = r13.c
            if (r12 == 0) goto L99
            android.content.Context r12 = r11.d
            r13 = 2132018339(0x7f1404a3, float:1.9674982E38)
            java.lang.String r4 = r12.getString(r13)
        L99:
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L9e:
            r0 = move-exception
            r12 = r0
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to parse rich body text"
            r13.<init>(r0, r12)
            throw r13
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qya.b(vrn, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, yjv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qyn r8, int r9, defpackage.vrn r10, defpackage.cuh r11, defpackage.yvc r12, defpackage.yih r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof defpackage.qxy
            if (r0 == 0) goto L13
            r0 = r13
            qxy r0 = (defpackage.qxy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qxy r0 = new qxy
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L36
            if (r2 != r6) goto L2e
            yvc r12 = r0.d
            bw r11 = r0.e
            defpackage.ybn.f(r13)
            goto L57
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ybn.f(r13)
            java.lang.Object r13 = r12.d()
            vqp r13 = (defpackage.vqp) r13
            vqp r13 = defpackage.vqp.a(r13, r5, r4, r5, r3)
            r12.e(r13)
            if (r9 != r3) goto L5b
            r8 = r11
            bw r8 = (defpackage.bw) r8
            r0.e = r8
            r0.d = r12
            r0.c = r6
            java.lang.Object r13 = r7.b(r10, r0)
            if (r13 == r1) goto L5a
        L57:
            vrj r13 = (defpackage.vrj) r13
            goto L63
        L5a:
            return r1
        L5b:
            rbi r8 = r8.k
            java.lang.Object r8 = r8.a
            r8.a(r10)
            r13 = r4
        L63:
            if (r13 == 0) goto L68
            r11.accept(r13)
        L68:
            java.lang.Object r8 = r12.d()
            vqp r8 = (defpackage.vqp) r8
            vqp r8 = defpackage.vqp.a(r8, r5, r4, r6, r3)
            r12.e(r8)
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qya.c(qyn, int, vrn, cuh, yvc, yih):java.lang.Object");
    }
}
