package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.tv.remote.service.AtvRemoteProviderService;
import com.google.android.tv.remote.service.AtvSearchAssistantService;
import com.google.android.tv.remote.service.ImeBridgeService;
import com.google.android.tv.remote.service.RemoteService;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpg implements ServiceConnection {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bpg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [bob, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aci achVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((cbs) ((cbs) ImeBridgeService.a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService$1", "onServiceConnected", 47, "ImeBridgeService.java")).t("onServiceConnected %s", componentName);
                bny bnyVar = ((RemoteService) ((bph) iBinder).a).m;
                ?? r9 = this.a;
                ((ImeBridgeService) r9).b = bnyVar;
                bnyVar.k(r9, false);
                return;
            }
            if (i != 2) {
                ((cbs) brb.a.e().j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService$1", "onServiceConnected", 39, "SystemUiDisclosureService.java")).z("Connected to %s(%s)", "com.android.systemui.AudioRecordingDisclosureService", "com.android.systemui");
                if (iBinder == null) {
                    achVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.systemui.statusbar.tv.IAudioRecordingDisclosureService");
                    achVar = iInterfaceQueryLocalInterface instanceof aci ? (aci) iInterfaceQueryLocalInterface : new ach(iBinder);
                }
                ((brb) this.a).b = achVar;
                return;
            }
            cbt cbtVar = RemoteService.a;
            cch cchVarB = cbtVar.b();
            cck cckVar = btt.a;
            ((cbs) ((cbs) cchVarB.g(cckVar)).j("com/google/android/tv/remote/service/RemoteService$4", "onServiceConnected", 609, "RemoteService.java")).p("Connected to AtvSearchAssistantService");
            try {
                Object obj = this.a;
                ((AtvSearchAssistantService) ((bph) iBinder).a).b = (RemoteService) obj;
                ((RemoteService) obj).b();
                ((cbs) ((cbs) cbtVar.b().g(cckVar)).j("com/google/android/tv/remote/service/RemoteService$4", "onServiceConnected", 613, "RemoteService.java")).p("Search Assistant service is bound");
                return;
            } catch (ClassCastException e) {
                ((cbs) ((cbs) RemoteService.a.f().i(e)).j("com/google/android/tv/remote/service/RemoteService$4", "onServiceConnected", 615, "RemoteService.java")).p("Caught ClassCastException");
                return;
            }
        }
        ((cbs) ((cbs) RemoteService.a.b().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService$3", "onServiceConnected", 478, "RemoteService.java")).p("AtvRemoteProviderService::onServiceConnected");
        try {
            ((RemoteService) this.a).b = (AtvRemoteProviderService) ((bph) iBinder).a;
        } catch (ClassCastException e2) {
            ((cbs) ((cbs) RemoteService.a.f().i(e2)).j("com/google/android/tv/remote/service/RemoteService$3", "onServiceConnected", 483, "RemoteService.java")).p("Caught ClassCastException");
        }
        cbs cbsVar = (cbs) ((cbs) RemoteService.a.b().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService$3", "onServiceConnected", 488, "RemoteService.java");
        RemoteService remoteService = (RemoteService) this.a;
        cbsVar.t("is provider service bound ? : %b", Boolean.valueOf(remoteService.b != null));
        while (true) {
            Queue queue = remoteService.d;
            if (queue.isEmpty()) {
                return;
            }
            Runnable runnable = (Runnable) queue.poll();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.b;
        if (i == 0) {
            ((RemoteService) this.a).b = null;
            return;
        }
        if (i == 1) {
            ((cbs) ((cbs) ImeBridgeService.a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeBridgeService$1", "onServiceDisconnected", 56, "ImeBridgeService.java")).t("onServiceDisconnected %s", componentName);
            ((ImeBridgeService) this.a).b = null;
            return;
        }
        if (i != 2) {
            ((brb) this.a).b = new bra();
            ((cbs) brb.a.g().j("com/google/android/tv/remote/service/audio/provider/SystemUiDisclosureService$1", "onServiceDisconnected", 46, "SystemUiDisclosureService.java")).z("Connection with %s(%s) is lost", "com.android.systemui.AudioRecordingDisclosureService", "com.android.systemui");
            return;
        }
        RemoteService remoteService = (RemoteService) this.a;
        bpm bpmVar = remoteService.c;
        if (bpmVar != null) {
            bpmVar.d();
            remoteService.c.a();
            remoteService.c = null;
        }
    }
}
