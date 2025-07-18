package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzt implements idy {
    public final mab a;
    public final kwy b;
    private final Context c;
    private final Executor d;
    private final luq e;

    public lzt(Executor executor, mab mabVar, kwy kwyVar, luq luqVar, Context context) {
        this.c = context;
        this.d = executor;
        this.a = mabVar;
        this.b = kwyVar;
        this.e = luqVar;
    }

    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(lqm lqmVar) {
        jwq.T(this.c, R.string.preorder_canceling_toast, 0);
        mjo.e(new lzs(this, uof.j(ksn.b(lqmVar.a()), lqmVar.a)), new iei(this.e, lqmVar), this.d);
    }
}
