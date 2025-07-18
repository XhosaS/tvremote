package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceAttributes;
import android.media.AudioManager;
import android.media.audiopolicy.AudioProductStrategy;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgq extends bgp {
    public bgq(Context context) {
        super(context);
    }

    @Override // defpackage.bgn, defpackage.bgt
    public final bgl a() {
        bzt bztVar = this.f;
        bzs bzsVarO = bzs.o(new bzb(((AudioManager) bztVar.a).getDevicesForAttributes(new AudioAttributes.Builder().setUsage(1).build()), new adz(bztVar.e(), 10)));
        return bzsVarO.isEmpty() ? super.a() : (bgl) bzsVarO.get(0);
    }

    @Override // defpackage.bgt
    public final void f() {
        AudioProductStrategy audioProductStrategy;
        List audioProductStrategies = AudioManager.getAudioProductStrategies();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).build();
        Iterator it = audioProductStrategies.iterator();
        while (true) {
            if (!it.hasNext()) {
                audioProductStrategy = null;
                break;
            } else {
                audioProductStrategy = (AudioProductStrategy) it.next();
                if (audioProductStrategy.supportsAudioAttributes(audioAttributesBuild)) {
                    break;
                }
            }
        }
        if (audioProductStrategy == null) {
            return;
        }
        ((AudioManager) this.f.a).removePreferredDeviceForStrategy(audioProductStrategy);
    }

    @Override // defpackage.bgt
    public final void g(int i, String str) {
        AudioProductStrategy audioProductStrategy;
        List audioProductStrategies = AudioManager.getAudioProductStrategies();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).build();
        Iterator it = audioProductStrategies.iterator();
        while (true) {
            if (!it.hasNext()) {
                audioProductStrategy = null;
                break;
            } else {
                audioProductStrategy = (AudioProductStrategy) it.next();
                if (audioProductStrategy.supportsAudioAttributes(audioAttributesBuild)) {
                    break;
                }
            }
        }
        if (audioProductStrategy == null) {
            return;
        }
        bzt bztVar = this.f;
        ((AudioManager) bztVar.a).setPreferredDeviceForStrategy(audioProductStrategy, new AudioDeviceAttributes(2, i, str));
    }
}
