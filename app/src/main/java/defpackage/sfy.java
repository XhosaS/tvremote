package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfy extends BroadcastReceiver {
    final /* synthetic */ sge a;

    public sfy(sge sgeVar) {
        this.a = sgeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action != null && agvy.c(action, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            sfj sfjVar = sfk.a;
            sfk sfkVarA = sfjVar.a(intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1));
            sfk sfkVarA2 = sfjVar.a(intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1));
            sfg sfgVar = new sfg(null, (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
            sge sgeVar = this.a;
            sgeVar.e.a(new sfx(sgeVar, sfkVarA, sfkVarA2, sfgVar, null));
        }
    }
}
