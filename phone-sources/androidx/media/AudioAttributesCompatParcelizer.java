package androidx.media;

import defpackage.glj;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(glj gljVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) gljVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, glj gljVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gljVar.u(audioAttributesCompat.a);
    }
}
