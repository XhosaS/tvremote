package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksz implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    public ksz(AppMeasurementDynamiteService appMeasurementDynamiteService, krc krcVar) {
        this.a = krcVar;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.b.a.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new lfs(lgpVarK, lgpVarK.i(false), this.a));
    }
}
