package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wwz extends AudioDeviceCallback {
    final /* synthetic */ String a = "";
    final /* synthetic */ String b = "";
    final /* synthetic */ String c = "ALT.BluetoothDeviceManager.audioDeviceCallback";
    final /* synthetic */ AudioDeviceCallback d;
    final /* synthetic */ wxc e;

    public wwz(wxc wxcVar, AudioDeviceCallback audioDeviceCallback) {
        this.d = audioDeviceCallback;
        this.e = wxcVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        wvl wvlVarB = this.e.b(this.c.concat("#onAudioDevicesAdded"), this.a, this.b, 0);
        try {
            this.d.onAudioDevicesAdded(audioDeviceInfoArr);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        wvl wvlVarB = this.e.b(this.c.concat("#onAudioDevicesRemoved"), this.a, this.b, 0);
        try {
            this.d.onAudioDevicesRemoved(audioDeviceInfoArr);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
