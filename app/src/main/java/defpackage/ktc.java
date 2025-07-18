package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ktc implements Runnable {
    final /* synthetic */ ktf a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    public ktc(AppMeasurementDynamiteService appMeasurementDynamiteService, ktf ktfVar) {
        this.a = ktfVar;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lbk lbkVar = this.b.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.K(this.a);
    }
}
