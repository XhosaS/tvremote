package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class fcp implements ServiceConnection {
    final /* synthetic */ fcq a;

    public fcp(fcq fcqVar) {
        this.a = fcqVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gqf gqfVar;
        fcq fcqVar = this.a;
        gfr gfrVar = fcqVar.b;
        rqs rqsVarBy = rpm.by();
        abqb abqbVar = abqb.OK;
        gfrVar.a(rqsVarBy, abqbVar, null, null);
        gmd gmdVar = fcqVar.d;
        gmdVar.m(gmc.m);
        if (iBinder == null) {
            gqfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tvsearch.operator.IAssistantOperatorService");
            gqfVar = iInterfaceQueryLocalInterface instanceof gqf ? (gqf) iInterfaceQueryLocalInterface : new gqf(iBinder);
        }
        fcqVar.f = gqfVar;
        fcqVar.b();
        fcqVar.c.unbindService(fcqVar.e);
        fcqVar.f = null;
        gfrVar.c(rpm.ee(), abqbVar, null, null);
        gmdVar.m(gmc.p);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((zdv) ((zdv) fcq.a.c()).q("com/google/android/apps/tvsearch/assistant/operator/TvOperatorServiceConnection$1", "onServiceDisconnected", 68, "TvOperatorServiceConnection.java")).u("Service has been disconnected");
        this.a.f = null;
    }
}
