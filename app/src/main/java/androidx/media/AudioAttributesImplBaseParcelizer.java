package androidx.media;

import defpackage.bww;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(bww bwwVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bwwVar.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bwwVar.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bwwVar.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bwwVar.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, bww bwwVar) {
        int i = audioAttributesImplBase.a;
        bwwVar.p(1);
        bwwVar.v(i);
        int i2 = audioAttributesImplBase.b;
        bwwVar.p(2);
        bwwVar.v(i2);
        int i3 = audioAttributesImplBase.c;
        bwwVar.p(3);
        bwwVar.v(i3);
        int i4 = audioAttributesImplBase.d;
        bwwVar.p(4);
        bwwVar.v(i4);
    }
}
