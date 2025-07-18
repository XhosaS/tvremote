package androidx.media;

import android.media.AudioAttributes;
import defpackage.bww;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(bww bwwVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bwwVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bwwVar.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, bww bwwVar) {
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        bwwVar.p(1);
        bwwVar.x(audioAttributes);
        int i = audioAttributesImplApi21.b;
        bwwVar.p(2);
        bwwVar.v(i);
    }
}
