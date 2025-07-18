package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.testing.assistantreadinesstest.ArtModelService;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vds implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        vdr vdrVar = (vdr) iBinder;
        if (vdrVar == null) {
            ((zdv) ((zdv) vdt.a.d().o(zfi.a, "ArtModelServiceProvider")).q("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider$1", "onServiceConnected", 34, "ArtModelServiceProvider.java")).u("No binder! Failed to bind to ArtModelService!");
            return;
        }
        zeo zeoVarB = ArtModelService.a.b();
        zer zerVar = zfi.a;
        ((zdv) ((zdv) zeoVarB.o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService$ArtBinder", "getService", 78, "ArtModelService.java")).u("Returning instance of ArtModelService.");
        vdt.b = vdrVar.a;
        vdt.c = true;
        ((zdv) ((zdv) vdt.a.b().o(zerVar, "ArtModelServiceProvider")).q("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider$1", "onServiceConnected", 32, "ArtModelServiceProvider.java")).u("Bound to ArtModelService.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        vdt.c = false;
        vdt.b = null;
        ((zdv) ((zdv) vdt.a.b().o(zfi.a, "ArtModelServiceProvider")).q("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider$1", "onServiceDisconnected", 42, "ArtModelServiceProvider.java")).u("Unbound from ArtModelService.");
    }
}
