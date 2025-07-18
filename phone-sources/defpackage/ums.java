package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ums implements umv, umw {
    public final unj a;
    public final unj b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public ums(Context context, String str, Set set, unj unjVar, Executor executor) {
        this.a = new ukl(context, str, 2);
        this.d = set;
        this.e = executor;
        this.b = unjVar;
        this.c = context;
    }

    @Override // defpackage.umv
    public final onz a() {
        return !crh.h(this.c) ? osk.r("") : osk.p(this.e, new rjs(this, 11));
    }

    @Override // defpackage.umw
    public final synchronized int b() {
        unj unjVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = unjVar.a();
        if (!((ulp) objA).x(jCurrentTimeMillis)) {
            return 1;
        }
        ((ulp) objA).t();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            osk.r(null);
        } else if (crh.h(this.c)) {
            osk.p(this.e, new rjs(this, 12));
        } else {
            osk.r(null);
        }
    }
}
