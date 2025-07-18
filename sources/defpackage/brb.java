package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brb implements bqy {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService");
    public aci b = new bra();
    private final PackageManager c;

    public brb(buf bufVar) {
        this.c = bufVar.getPackageManager();
        Intent intent = new Intent("com.android.systemui.AudioRecordingDisclosureService").setPackage("com.android.systemui");
        bpg bpgVar = new bpg(this, 3);
        if (bufVar.bindService(intent, bpgVar, 5)) {
            bufVar.k(new bsp(bufVar, bpgVar, 1));
        } else {
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "<init>", 55, "SystemUiDisclosureService.java")).z("%s(%s) is not present", "com.android.systemui.AudioRecordingDisclosureService", "com.android.systemui");
        }
    }

    @Override // defpackage.bqy
    public final void a(IBinder iBinder) {
        ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "closeMic", 77, "SystemUiDisclosureService.java")).t("closeMic %s", iBinder);
        try {
            this.b.a(iBinder);
        } catch (RemoteException e) {
            ((cbs) ((cbs) a.g().i(e)).j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "closeMic", 81, "SystemUiDisclosureService.java")).p("Unable to unregister mic disclosure");
        }
    }

    @Override // defpackage.bqy
    public final boolean b(IBinder iBinder, boolean z, int i, String str) {
        cbt cbtVar = a;
        ((cbs) ((cbs) cbtVar.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "openMic", 61, "SystemUiDisclosureService.java")).t("openMic %s", iBinder);
        if (this.c.checkPermission("android.permission.RECORD_AUDIO", str) == -1) {
            ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "openMic", 63, "SystemUiDisclosureService.java")).z("Package %s doesn't hold %s", str, "android.permission.RECORD_AUDIO");
            return false;
        }
        try {
            this.b.b(iBinder);
            return true;
        } catch (RemoteException e) {
            ((cbs) ((cbs) a.g().i(e)).j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService", "openMic", 69, "SystemUiDisclosureService.java")).p("Unable to register mic disclosure");
            return false;
        }
    }
}
