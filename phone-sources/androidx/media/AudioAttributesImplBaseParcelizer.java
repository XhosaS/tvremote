package androidx.media;

import defpackage.glj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(glj gljVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = gljVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = gljVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = gljVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = gljVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, glj gljVar) {
        gljVar.h(audioAttributesImplBase.a, 1);
        gljVar.h(audioAttributesImplBase.b, 2);
        gljVar.h(audioAttributesImplBase.c, 3);
        gljVar.h(audioAttributesImplBase.d, 4);
    }
}
