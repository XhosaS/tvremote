package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqr implements afh {
    private final dqq a;
    private final dqt b;
    private final afh c;

    public dqr(afh afhVar, dqq dqqVar, dqt dqtVar) {
        this.c = afhVar;
        this.a = dqqVar;
        this.b = dqtVar;
    }

    @Override // defpackage.afh
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(objA.getClass()))));
            }
        }
        if (objA instanceof dqs) {
            ((dqv) ((dqs) objA).cB()).a = false;
        }
        return objA;
    }

    @Override // defpackage.afh
    public final boolean b(Object obj) {
        if (obj instanceof dqs) {
            ((dqv) ((dqs) obj).cB()).a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
