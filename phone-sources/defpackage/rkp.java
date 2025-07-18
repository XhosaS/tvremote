package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkp implements rjk {
    private final nib a;
    private final ExecutorService b;
    private final Context c;
    private final rjk d;

    public rkp(nib nibVar, ExecutorService executorService, Context context, rjk rjkVar) {
        this.a = nibVar;
        this.b = executorService;
        this.c = context;
        this.d = rjkVar;
    }

    private final nhr f() {
        xwk xwkVar = new xwk();
        Context context = this.c;
        xwkVar.j(context.getString(R.string.og_account_not_restricted));
        xwkVar.k(txu.e(txu.d(context.getString(R.string.og_account_not_restricted))));
        xwkVar.i(context.getString(R.string.og_dismiss));
        return xwkVar.h();
    }

    @Override // defpackage.rjk
    public final uhp a() {
        return wae.W(yoz.l(new ypx(this.b)), new sbl(this, (yih) null, 1));
    }

    @Override // defpackage.rjk
    public final uhp b() {
        return this.d.b();
    }

    public final nhr c() {
        xwk xwkVar = new xwk();
        Context context = this.c;
        xwkVar.j(context.getString(R.string.og_failed_to_fetch_restriction_info));
        xwkVar.k(txu.e(txu.d(context.getString(R.string.og_failed_to_fetch_restriction_info))));
        xwkVar.i(context.getString(R.string.og_dismiss));
        return xwkVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        if (r10 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r9, defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkp.d(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rko
            if (r0 == 0) goto L13
            r0 = r5
            rko r0 = (defpackage.rko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rko r0 = new rko
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            android.content.Context r5 = r4.c
            xnl r2 = defpackage.xnl.a
            xnm r2 = r2.get()
            boolean r5 = r2.b(r5)
            if (r5 != 0) goto L41
            goto L68
        L41:
            qbn r5 = defpackage.nhu.a()
            r5.c()
            r5.d(r3)
            nhu r5 = r5.b()
            nib r2 = r4.a
            onz r5 = r2.a(r5)
            r0.c = r3
            java.lang.Object r5 = defpackage.wae.G(r5, r0)
            if (r5 == r1) goto L6b
        L5d:
            nhw r5 = (defpackage.nhw) r5
            java.util.List r5 = r5.b
            if (r5 == 0) goto L68
            java.util.List r5 = defpackage.yfm.al(r5)
            return r5
        L68:
            yhb r5 = defpackage.yhb.a
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkp.e(yih):java.lang.Object");
    }
}
