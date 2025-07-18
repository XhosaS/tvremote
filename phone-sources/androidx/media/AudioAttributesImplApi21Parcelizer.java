package androidx.media;

import android.media.AudioAttributes;
import defpackage.glj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(glj gljVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) gljVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = gljVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, glj gljVar) {
        gljVar.i(audioAttributesImplApi21.a, 1);
        gljVar.h(audioAttributesImplApi21.b, 2);
    }
}
