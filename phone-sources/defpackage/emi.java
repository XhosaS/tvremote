package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emi {
    public final AudioTrack a;
    public final elq b;
    public AudioRouting$OnRoutingChangedListener c = new AudioRouting$OnRoutingChangedListener() { // from class: emh
        public final void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            emi emiVar = this.a;
            if (emiVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            emiVar.b.b(routedDevice);
        }
    };

    public emi(AudioTrack audioTrack, elq elqVar) {
        this.a = audioTrack;
        this.b = elqVar;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }
}
