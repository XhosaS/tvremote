package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grd extends fki {
    private static final String g = gpn.a("WorkContinuationImpl");
    public final grs a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private gps i;

    public grd(grs grsVar, String str, int i, List list) {
        this(grsVar, str, i, list, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final gps be() {
        if (this.e) {
            gpn.b();
            Log.w(g, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
        } else {
            grs grsVar = this.a;
            this.i = fki.bb((gli) grsVar.h.d, "EnqueueRunnable_".concat(this.f != 1 ? "KEEP" : "REPLACE"), grsVar.k.c, new gem(this, 18));
        }
        return this.i;
    }

    public grd(grs grsVar, String str, int i, List list, byte[] bArr) {
        super((short[]) null);
        this.a = grsVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((guw) ((cvi) list.get(i2)).b).t != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strY = ((cvi) list.get(i2)).y();
            this.d.add(strY);
            this.h.add(strY);
        }
    }
}
