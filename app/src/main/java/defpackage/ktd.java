package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ktd implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public ktd(AppMeasurementDynamiteService appMeasurementDynamiteService, krc krcVar, String str, String str2) {
        this.a = krcVar;
        this.b = str;
        this.c = str2;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.d.a.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new lgf(lgpVarK, this.b, this.c, lgpVarK.i(false), this.a));
    }
}
