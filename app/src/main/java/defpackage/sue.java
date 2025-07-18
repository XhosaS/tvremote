package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sue implements ste {
    private static final List a = agqq.d(5, 7, 4);
    private final AudioManager b;
    private final stx c;

    public sue(AudioManager audioManager, stx stxVar) {
        this.b = audioManager;
        this.c = stxVar;
    }

    private final boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return a.contains(Integer.valueOf(audioRecordingConfiguration.getClientAudioSource()));
    }

    @Override // defpackage.ste
    public final boolean a(int i) {
        Object next;
        sti stgVar;
        AudioManager audioManager = this.b;
        List activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        activeRecordingConfigurations.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(activeRecordingConfigurations, 10));
        Iterator it = activeRecordingConfigurations.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (agvy.c((sti) next, sth.a)) {
                        break;
                    }
                }
                Object obj2 = (sti) next;
                if (obj2 == null) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (((sti) next2) instanceof stg) {
                            obj = next2;
                            break;
                        }
                    }
                    obj2 = (sti) obj;
                    if (obj2 == null) {
                        obj2 = audioManager.getMode() == 2 ? sth.a : stf.a;
                    }
                }
                return !agvy.c(obj2, stf.a);
            }
            AudioRecordingConfiguration audioRecordingConfigurationM41m = al$$ExternalSyntheticApiModelOutline1.m41m(it.next());
            audioRecordingConfigurationM41m.getClass();
            if (i - 1 == 1) {
                stgVar = b(audioRecordingConfigurationM41m) ? sth.a : stf.a;
            } else if (b(audioRecordingConfigurationM41m)) {
                stgVar = sth.a;
            } else if (audioRecordingConfigurationM41m.getClientAudioSource() == 1999) {
                stgVar = stf.a;
            } else {
                stx stxVar = this.c;
                stp stpVar = stp.b;
                Object obj3 = (agqj.q(new stp[]{stp.a, stpVar}, stpVar) && stxVar.a.b(audioRecordingConfigurationM41m.getClientAudioSessionId())) ? str.a : sts.a;
                if (agvy.c(obj3, sts.a)) {
                    stgVar = new stg(null);
                } else if (obj3 instanceof stq) {
                    stgVar = new stg(null);
                } else {
                    if (!agvy.c(obj3, str.a)) {
                        throw new agpg();
                    }
                    stgVar = stf.a;
                }
            }
            arrayList.add(stgVar);
        }
    }
}
