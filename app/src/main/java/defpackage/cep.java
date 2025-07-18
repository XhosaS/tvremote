package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cep extends cco {
    private static final String g = cbx.d("WorkContinuationImpl");
    public final cfq a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h = new ArrayList();
    private ccf i;

    public cep(cfq cfqVar, String str, int i, List list) {
        this.a = cfqVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((ccw) list.get(i2)).b.v != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strA = ((ccw) list.get(i2)).a();
            this.d.add(strA);
            this.h.add(strA);
        }
    }

    public final ccf a() {
        if (this.e) {
            cbx.c();
            Log.w(g, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
        } else {
            cfq cfqVar = this.a;
            this.i = ccj.a(cfqVar.d.j, "EnqueueRunnable_".concat(this.f != 1 ? "KEEP" : "REPLACE"), cfqVar.m.a, new agum() { // from class: ceo
                @Override // defpackage.agum
                public final Object a() throws Throwable {
                    cna.a(this.a);
                    return agpu.a;
                }
            });
        }
        return this.i;
    }
}
