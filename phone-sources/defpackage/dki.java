package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.videos.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dki extends dsn {
    public final dlj a;
    public final djz b;
    public final dtn c;
    public final dms d;
    private final ComponentName g;
    private final boolean h;
    private final bcb i;
    private final bcb j;
    private Map k;
    private final yqg l;
    private final yvc m;

    public dki(dlj dljVar, djz djzVar, Bundle bundle, dtn dtnVar, dms dmsVar) {
        super(cwk.p(djzVar));
        this.a = dljVar;
        this.b = djzVar;
        this.c = dtnVar;
        this.g = null;
        this.d = dmsVar;
        this.h = true;
        if (cwk.r(djzVar)) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        bcz bczVar = bcz.b;
        this.i = new bci(null, bczVar);
        this.j = new bci(bundle, bczVar);
        this.k = yhc.a;
        this.l = new yqg(null);
        this.m = yvd.a(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:18|89|90)(1:(2:15|16)(3:17|83|84)))(1:19))(2:20|(2:22|23)(3:24|(1:27)|88))|28|94|29|96|(13:31|(14:33|(1:35)(3:36|(3:39|(2:106|41)(1:42)|37)|105)|43|(4:46|(3:101|48|104)(3:100|49|103)|102|44)|99|53|(1:55)(1:56)|57|58|97|59|60|61|62)|50|(1:52)|53|(0)(0)|57|58|97|59|60|61|62)(3:68|69|70)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:
    
        if (r2.b(r4) != r5) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e9, code lost:
    
        r32 = r1;
        r1 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0201, code lost:
    
        if (r1.b(r4) != r5) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0212, code lost:
    
        if (r1.b(r4) != r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021b, code lost:
    
        r1 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022a, code lost:
    
        if (r1.b(r4) != r5) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dmc] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(defpackage.dki r31, android.content.Context r32, defpackage.djd r33, defpackage.yih r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dki.e(dki, android.content.Context, djd, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object g(defpackage.dki r4, android.content.Context r5, java.lang.Object r6, defpackage.yih r7) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dki.g(dki, android.content.Context, java.lang.Object, yih):java.lang.Object");
    }

    private final void q(Context context, Throwable th) {
        cwk.q(th);
        AppWidgetManager.getInstance(context).updateAppWidget(this.b.a, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    public final Bundle a() {
        return (Bundle) this.j.a();
    }

    @Override // defpackage.dsn
    public final /* synthetic */ djd b() {
        return new dml();
    }

    public final Object c() {
        return this.i.a();
    }

    @Override // defpackage.dsn
    public final Object d(Context context, djd djdVar, yih yihVar) {
        return e(this, context, djdVar, yihVar);
    }

    @Override // defpackage.dsn
    public final Object f(Context context, Object obj, yih yihVar) {
        return g(this, context, obj, yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dkh
            if (r0 == 0) goto L13
            r0 = r6
            dkh r0 = (defpackage.dkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkh r0 = new dkh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dkd r0 = r0.d
            defpackage.ybn.f(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ybn.f(r6)
            yqg r6 = r5.l
            dkd r2 = new dkd
            yqg r4 = new yqg
            r4.<init>(r6)
            r2.<init>(r4)
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r5.o(r2, r0)
            if (r6 == r1) goto L4e
            r0 = r2
        L4b:
            yqg r6 = r0.a
            return r6
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dki.h(yih):java.lang.Object");
    }

    @Override // defpackage.dsn
    public final yjz i(Context context) {
        return new bhq(-650544734, true, new awh(context, this, 5));
    }

    @Override // defpackage.dsn
    public final void j() {
        this.l.t(null);
    }

    public final void k(Object obj) {
        this.i.b(obj);
    }

    public final void l(Bundle bundle) {
        this.j.b(bundle);
    }

    @Override // defpackage.dsn
    public final Object m(Context context, Throwable th) {
        q(context, th);
        return ygi.a;
    }
}
