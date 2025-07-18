package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldx implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ leo b;

    public ldx(leo leoVar, Bundle bundle) {
        this.a = bundle;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        leo leoVar = this.b;
        leoVar.g();
        leoVar.a();
        Bundle bundle = this.a;
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        kkk.h(string);
        kkk.h(string2);
        kkk.k(bundle.get("value"));
        if (!leoVar.y.s()) {
            lbk lbkVar = leoVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Conditional property not set since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            lbk lbkVar2 = leoVar.y;
            lio lioVar = lbkVar2.i;
            lbkVar2.m(lioVar);
            EventParcel eventParcelAr = lioVar.ar(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
            lbkVar2.m(lioVar);
            EventParcel eventParcelAr2 = lioVar.ar(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
            lbkVar2.m(lioVar);
            leoVar.y.k().r(new ConditionalUserPropertyParcel(bundle.getString("app_id"), string2, userAttributeParcel, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), eventParcelAr2, bundle.getLong("trigger_timeout"), eventParcelAr, bundle.getLong("time_to_live"), lioVar.ar(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
