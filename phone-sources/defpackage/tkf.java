package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkf extends BroadcastReceiver {
    private final WifiManager.WifiLock a;

    public tkf(WifiManager.WifiLock wifiLock) {
        this.a = wifiLock;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, "android.intent.action.SCREEN_ON")) {
            ((tug) ((tug) tkg.a.e()).j("com/google/android/tv/remote/support/core/TcpWakePortClient$ScreenOnOffReceiver", "onReceive", 236, "TcpWakePortClient.java")).s("Acquiring WiFi Lock");
            this.a.acquire();
        } else if (Objects.equals(action, "android.intent.action.SCREEN_OFF")) {
            ((tug) ((tug) tkg.a.e()).j("com/google/android/tv/remote/support/core/TcpWakePortClient$ScreenOnOffReceiver", "onReceive", 239, "TcpWakePortClient.java")).s("Releasing WiFi Lock");
            this.a.release();
        }
    }
}
