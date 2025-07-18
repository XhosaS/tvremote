package androidx.media;

import android.media.AudioAttributes;
import defpackage.glj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(glj gljVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) gljVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = gljVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, glj gljVar) {
        gljVar.i(audioAttributesImplApi26.a, 1);
        gljVar.h(audioAttributesImplApi26.b, 2);
    }
}
