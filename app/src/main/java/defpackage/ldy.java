package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldy implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ leo b;

    public ldy(leo leoVar, Bundle bundle) {
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
        kkk.h(string);
        if (!leoVar.y.s()) {
            lbk lbkVar = leoVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(string, 0L, null, "");
        try {
            lbk lbkVar2 = leoVar.y;
            lio lioVar = lbkVar2.i;
            lbkVar2.m(lioVar);
            leoVar.y.k().r(new ConditionalUserPropertyParcel(bundle.getString("app_id"), "", userAttributeParcel, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), lioVar.ar(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
