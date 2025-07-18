package defpackage;

import android.media.AudioAttributes;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frf {
    public final AudioAttributes a;

    public frf(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof frf) {
            return Objects.equals(this.a, ((frf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(String.valueOf(this.a)));
    }
}
