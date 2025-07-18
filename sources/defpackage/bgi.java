package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgi extends AudioDeviceCallback {
    final /* synthetic */ bgt a;

    public bgi(bgt bgtVar) {
        this.a = bgtVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.i();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.i();
    }
}
