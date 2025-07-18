package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjw extends BroadcastReceiver {
    private final WifiManager.WifiLock a;

    public tjw(WifiManager.WifiLock wifiLock) {
        this.a = wifiLock;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            ((tug) ((tug) tjx.a.b()).j("com/google/android/tv/remote/support/core/TcpClient$ScreenOnOffReceiver", "onReceive", 330, "TcpClient.java")).s("Acquiring WiFi Lock");
            this.a.acquire();
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            ((tug) ((tug) tjx.a.b()).j("com/google/android/tv/remote/support/core/TcpClient$ScreenOnOffReceiver", "onReceive", 333, "TcpClient.java")).s("Releasing WiFi Lock");
            this.a.release();
        }
    }
}
