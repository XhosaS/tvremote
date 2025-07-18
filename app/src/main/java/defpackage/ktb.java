package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ktb implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ AppMeasurementDynamiteService e;

    public ktb(AppMeasurementDynamiteService appMeasurementDynamiteService, krc krcVar, String str, String str2, boolean z) {
        this.a = krcVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.e.a.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new lfm(lgpVarK, this.b, this.c, lgpVarK.i(false), this.d, this.a));
    }
}
