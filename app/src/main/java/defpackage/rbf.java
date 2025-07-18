package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbf extends rbd implements qsn, quz {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final qux b;
    public final Context c;
    public final aehf d;
    public final rcs e;
    private final qst f;
    private final Executor g;

    public rbf(quy quyVar, Context context, qst qstVar, Executor executor, aehf aehfVar, rcs rcsVar, agow agowVar) {
        this.b = quyVar.a(executor, aehfVar, agowVar);
        this.g = executor;
        this.c = context;
        this.d = aehfVar;
        this.e = rcsVar;
        this.f = qstVar;
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        this.f.c.b(this);
        zxn.l(new zvh() { // from class: rbe
            /* JADX WARN: Removed duplicated region for block: B:104:0x00dc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 765
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rbe.a():zyd");
            }
        }, this.g);
    }

    @Override // defpackage.quz
    public final void k() {
        this.f.c.a(this);
    }

    @Override // defpackage.qsn
    public final /* synthetic */ void j(qpi qpiVar) {
    }
}
