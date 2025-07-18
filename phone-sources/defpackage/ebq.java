package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebq {
    public final int a = 1;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final dyo d;
    public final boolean e;
    private final Object f;

    public ebq(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, dyo dyoVar, boolean z) {
        this.c = handler;
        this.d = dyoVar;
        this.e = z;
        if (Build.VERSION.SDK_INT < 26) {
            this.b = new ebp(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        this.f = Build.VERSION.SDK_INT >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes((AudioAttributes) dyoVar.a().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final AudioFocusRequest a() {
        Object obj = this.f;
        obj.getClass();
        return kw$$ExternalSyntheticApiModelOutline0.m444m(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebq)) {
            return false;
        }
        ebq ebqVar = (ebq) obj;
        int i = ebqVar.a;
        return this.e == ebqVar.e && Objects.equals(this.b, ebqVar.b) && Objects.equals(this.c, ebqVar.c) && Objects.equals(this.d, ebqVar.d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
