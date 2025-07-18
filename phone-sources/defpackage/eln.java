package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eln extends AudioDeviceCallback {
    final /* synthetic */ elq a;

    public eln(elq elqVar) {
        this.a = elqVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        elq elqVar = this.a;
        elqVar.a(elm.f(elqVar.a, elqVar.g, elqVar.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        elq elqVar = this.a;
        if (edt.ah(audioDeviceInfoArr, elqVar.i)) {
            elqVar.i = null;
        }
        elqVar.a(elm.f(elqVar.a, elqVar.g, elqVar.i));
    }
}
