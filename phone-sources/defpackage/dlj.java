package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dlj {
    public final dtt a = dtu.a;

    public static /* synthetic */ Object e(dlj dljVar, Context context, int i, yih yihVar) {
        AtomicBoolean atomicBoolean = dmv.a;
        if (Build.VERSION.SDK_INT >= 29 && dmv.a.get()) {
            Trace.beginAsyncSection("GlanceAppWidget::update", 0);
        }
        Object objC = dljVar.c(context, new djz(i), null, new dlx(null, 1, null), yihVar);
        return objC == yio.a ? objC : ygi.a;
    }

    public dms a() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r10.d((android.content.Context) r2, r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        r8 = r9;
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        if (r10.d((android.content.Context) r2, r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r10.d((android.content.Context) r2, r8, r0) == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r8, int r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlj.b(android.content.Context, int, yih):java.lang.Object");
    }

    public final Object c(Context context, djz djzVar, Bundle bundle, ykb ykbVar, yih yihVar) {
        return dsu.a.a(new dlg(context, djzVar, this, bundle, ykbVar, (yih) null, 0), yihVar);
    }

    public abstract Object d(Context context, yih yihVar);
}
