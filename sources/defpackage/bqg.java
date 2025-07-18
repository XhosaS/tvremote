package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqg extends AudioManager$AudioRecordingCallback {
    final /* synthetic */ bqh a;
    private ArraySet b;

    public bqg(bqh bqhVar, List list) {
        this.a = bqhVar;
        this.b = b(list);
    }

    private static final ArrayList a(Set set, Set set2) {
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (!set2.contains(num)) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private static final ArraySet b(List list) {
        ArraySet arraySet = new ArraySet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationM27m = k$$ExternalSyntheticApiModelOutline1.m27m(it.next());
            if (audioRecordingConfigurationM27m.getClientAudioSource() == 6) {
                if (Build.VERSION.SDK_INT < 29 || !audioRecordingConfigurationM27m.isClientSilenced()) {
                    arraySet.add(Integer.valueOf(audioRecordingConfigurationM27m.getClientAudioSessionId()));
                } else {
                    ((cbs) bqh.a.g().j("com/google/android/tv/remote/service/audio/AudioBridgeX$LocalAudioRecordingCallback", "getIds", 238, "AudioBridgeX.java")).r("Ignoring silenced audio recording configuration %s", audioRecordingConfigurationM27m.getClientAudioSessionId());
                }
            }
        }
        return arraySet;
    }

    public final void onRecordingConfigChanged(List list) {
        ArraySet arraySetB = b(list);
        this.a.d(list, a(this.b, arraySetB), a(arraySetB, this.b));
        this.b = arraySetB;
    }
}
