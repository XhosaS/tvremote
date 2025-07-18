package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgk implements Runnable {
    final /* synthetic */ lgo a;

    public lgk(lgo lgoVar) {
        this.a = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.a.c;
        lbk lbkVar = lgpVar.y;
        kts ktsVar = lbkVar.c;
        lgpVar.n(new ComponentName(lbkVar.a, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
