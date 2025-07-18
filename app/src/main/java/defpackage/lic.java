package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lic implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ lid d;

    public lic(lid lidVar, String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = lidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.d.a;
        lio lioVarP = lihVar.p();
        kkk.k(lihVar.l);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.a;
        EventParcel eventParcelAr = lioVarP.ar(str, this.b, this.c, "auto", jCurrentTimeMillis, false);
        kkk.k(eventParcelAr);
        lihVar.F(eventParcelAr, str);
    }
}
