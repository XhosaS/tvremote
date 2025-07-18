package androidx.media;

import android.media.AudioAttributes;
import defpackage.acf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(acf acfVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) acfVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = acfVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, acf acfVar) {
        acfVar.i(audioAttributesImplApi26.a, 1);
        acfVar.h(audioAttributesImplApi26.b, 2);
    }
}
