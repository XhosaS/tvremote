package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfv extends AudioDeviceCallback {
    final /* synthetic */ sge a;

    public sfv(sge sgeVar) {
        this.a = sgeVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        audioDeviceInfoArr.getClass();
        sge sgeVar = this.a;
        sgeVar.e.a(new sft(audioDeviceInfoArr, sgeVar, null));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        audioDeviceInfoArr.getClass();
        sge sgeVar = this.a;
        sgeVar.e.a(new sfu(audioDeviceInfoArr, sgeVar, null));
    }
}
