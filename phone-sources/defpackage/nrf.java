package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nrf extends fus {
    final /* synthetic */ nrg a;

    public nrf(nrg nrgVar) {
        this.a = nrgVar;
    }

    @Override // defpackage.fus
    public final void onRouteAdded(fuy fuyVar, fux fuxVar) {
        nrg nrgVar = nrg.a;
        nsf.e();
        this.a.a(fuxVar.q);
    }

    @Override // defpackage.fus
    public final void onRouteChanged(fuy fuyVar, fux fuxVar) {
        nrg nrgVar = nrg.a;
        nsf.e();
        this.a.a(fuxVar.q);
    }

    @Override // defpackage.fus
    public final void onRouteRemoved(fuy fuyVar, fux fuxVar) {
        CastDevice castDeviceC;
        nrg nrgVar = nrg.a;
        nsf.e();
        Bundle bundle = fuxVar.q;
        if (bundle == null || (castDeviceC = CastDevice.c(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        nrg nrgVar2 = this.a;
        nrb nrbVar = (nrb) nrgVar2.b.get(castDeviceC.e());
        if (nrbVar != null && string != null) {
            throw null;
        }
        if (nrbVar != null) {
            nml nmlVar = new nml();
            nmlVar.b = 2422;
            nmlVar.a();
            nrbVar.a();
        }
        if (nrbVar != null) {
            throw null;
        }
        nrgVar2.c(castDeviceC);
    }
}
