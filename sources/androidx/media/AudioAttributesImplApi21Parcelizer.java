package androidx.media;

import android.media.AudioAttributes;
import defpackage.acf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(acf acfVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) acfVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = acfVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, acf acfVar) {
        acfVar.i(audioAttributesImplApi21.a, 1);
        acfVar.h(audioAttributesImplApi21.b, 2);
    }
}
