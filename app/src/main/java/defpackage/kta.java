package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kta implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ EventParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    public kta(AppMeasurementDynamiteService appMeasurementDynamiteService, krc krcVar, EventParcel eventParcel, String str) {
        this.a = krcVar;
        this.b = eventParcel;
        this.c = str;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.d.a.k();
        lgpVarK.g();
        lgpVarK.a();
        lbk lbkVar = lgpVarK.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        int iAt = lioVar.at();
        krc krcVar = this.a;
        if (iAt == 0) {
            lgpVarK.p(new lfy(lgpVarK, this.b, this.c, krcVar));
            return;
        }
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.f.a("Not bundling data. Service unavailable or out of date");
        lbkVar.m(lioVar);
        lioVar.R(krcVar, new byte[0]);
    }
}
