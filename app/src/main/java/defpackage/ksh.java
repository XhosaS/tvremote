package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksh extends ksg {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ kso c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksh(kso ksoVar, Bundle bundle, Activity activity) {
        super(ksoVar.a, true);
        this.a = bundle;
        this.b = activity;
        this.c = ksoVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        kqz kqzVar = this.c.a.f;
        kkk.k(kqzVar);
        Activity activity = this.b;
        kqzVar.onActivityCreatedByScionActivityInfo(ScionActivityInfo.a(activity), bundle, this.g);
    }
}
