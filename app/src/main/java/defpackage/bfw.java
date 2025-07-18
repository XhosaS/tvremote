package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import j$.util.Objects;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class bfw {
    public static final /* synthetic */ int b = 0;
    public final Object a;
    private final int c;
    private final AudioManager.OnAudioFocusChangeListener d;
    private final Handler e;
    private final AudioAttributesCompat f;
    private final boolean g = false;

    static {
        int i = AudioAttributesCompat.b;
        bfv bfvVar = new bfv();
        bfvVar.a.setUsage(1);
        bft.a(bfvVar);
    }

    public bfw(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.c = i;
        this.e = handler;
        this.f = audioAttributesCompat;
        this.d = onAudioFocusChangeListener;
        this.a = new AudioFocusRequest.Builder(i).setAudioAttributes((AudioAttributes) audioAttributesCompat.a.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfw)) {
            return false;
        }
        bfw bfwVar = (bfw) obj;
        if (this.c == bfwVar.c) {
            boolean z = bfwVar.g;
            if (Objects.equals(this.d, bfwVar.d) && Objects.equals(this.e, bfwVar.e) && Objects.equals(this.f, bfwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.d, this.e, this.f, false);
    }
}
