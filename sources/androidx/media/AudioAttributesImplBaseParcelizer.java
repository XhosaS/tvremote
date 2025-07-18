package androidx.media;

import defpackage.acf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(acf acfVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = acfVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = acfVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = acfVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = acfVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, acf acfVar) {
        acfVar.h(audioAttributesImplBase.a, 1);
        acfVar.h(audioAttributesImplBase.b, 2);
        acfVar.h(audioAttributesImplBase.c, 3);
        acfVar.h(audioAttributesImplBase.d, 4);
    }
}
