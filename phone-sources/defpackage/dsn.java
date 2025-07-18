package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dsn {
    public final String e;
    public final AtomicBoolean f = new AtomicBoolean(true);
    private final yrz a = vyf.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 6);

    public dsn(String str) {
        this.e = str;
    }

    public abstract djd b();

    public abstract Object d(Context context, djd djdVar, yih yihVar);

    public abstract Object f(Context context, Object obj, yih yihVar);

    public abstract yjz i(Context context);

    public void j() {
        throw null;
    }

    public Object m(Context context, Throwable th) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[Catch: ysf -> 0x008e, TRY_LEAVE, TryCatch #0 {ysf -> 0x008e, blocks: (B:13:0x002c, B:23:0x0051, B:27:0x0067, B:29:0x006f, B:18:0x0040, B:22:0x004b), top: B:36:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:23:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(android.content.Context r8, defpackage.yjv r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dsm
            if (r0 == 0) goto L13
            r0 = r10
            dsm r0 = (defpackage.dsm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsm r0 = new dsm
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yrr r8 = r0.e
            gk r9 = r0.f
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r10)     // Catch: defpackage.ysf -> L8e
            r10 = r8
            r8 = r2
            goto L51
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            yrr r8 = r0.e
            gk r9 = r0.f
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r10)     // Catch: defpackage.ysf -> L8e
            r6 = r0
            r0 = r8
            r8 = r2
        L46:
            r2 = r6
            goto L67
        L48:
            defpackage.ybn.f(r10)
            yrz r10 = r7.a     // Catch: defpackage.ysf -> L8e
            yrr r10 = r10.C()     // Catch: defpackage.ysf -> L8e
        L51:
            r0.a = r8     // Catch: defpackage.ysf -> L8e
            r2 = r9
            gk r2 = (defpackage.gk) r2     // Catch: defpackage.ysf -> L8e
            r0.f = r2     // Catch: defpackage.ysf -> L8e
            r0.e = r10     // Catch: defpackage.ysf -> L8e
            r0.d = r4     // Catch: defpackage.ysf -> L8e
            java.lang.Object r2 = r10.a(r0)     // Catch: defpackage.ysf -> L8e
            if (r2 != r1) goto L63
            goto L8d
        L63:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L46
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: defpackage.ysf -> L8e
            boolean r10 = r10.booleanValue()     // Catch: defpackage.ysf -> L8e
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r0.b()     // Catch: defpackage.ysf -> L8e
            r9.a(r10)     // Catch: defpackage.ysf -> L8e
            r2.a = r8     // Catch: defpackage.ysf -> L8e
            r5 = r9
            gk r5 = (defpackage.gk) r5     // Catch: defpackage.ysf -> L8e
            r2.f = r5     // Catch: defpackage.ysf -> L8e
            r2.e = r0     // Catch: defpackage.ysf -> L8e
            r2.d = r3     // Catch: defpackage.ysf -> L8e
            r5 = r8
            android.content.Context r5 = (android.content.Context) r5     // Catch: defpackage.ysf -> L8e
            java.lang.Object r10 = r7.f(r5, r10, r2)     // Catch: defpackage.ysf -> L8e
            if (r10 == r1) goto L8d
            r10 = r0
            r0 = r2
            goto L51
        L8d:
            return r1
        L8e:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsn.n(android.content.Context, yjv, yih):java.lang.Object");
    }

    public final Object o(Object obj, yih yihVar) {
        Object objA = this.a.a(obj, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    public final void p() {
        this.a.e(null);
        this.f.set(false);
        j();
    }
}
