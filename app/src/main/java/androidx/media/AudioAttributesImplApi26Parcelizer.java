package androidx.media;

import android.media.AudioAttributes;
import defpackage.bww;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(bww bwwVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bwwVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bwwVar.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, bww bwwVar) {
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        bwwVar.p(1);
        bwwVar.x(audioAttributes);
        int i = audioAttributesImplApi26.b;
        bwwVar.p(2);
        bwwVar.v(i);
    }
}
