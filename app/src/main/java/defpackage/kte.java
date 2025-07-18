package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kte implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    public kte(AppMeasurementDynamiteService appMeasurementDynamiteService, krc krcVar) {
        this.a = krcVar;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.b;
        lbk lbkVar = appMeasurementDynamiteService.a;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        lioVar.O(this.a, appMeasurementDynamiteService.a.r());
    }
}
