package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abg {
    public static AudioAttributes.Builder a() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(4);
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(5);
    }

    public static AudioAttributes d(AudioAttributes.Builder builder) {
        return builder.build();
    }
}
