package defpackage;

import android.media.AudioManager;
import com.google.android.apps.assistant.audio.LibAAudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxo implements LibAAudioManager {
    private final AudioManager a;
    private final gxt b;

    public gxo(AudioManager audioManager, gxt gxtVar) {
        this.a = audioManager;
        this.b = gxtVar;
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final int abandonAudioFocus(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return this.a.abandonAudioFocus(onAudioFocusChangeListener);
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final void adjustStreamVolume(int i, int i2, int i3) {
        this.a.adjustStreamVolume(i, i2, i3);
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final int getStreamMaxVolume(int i) {
        return this.a.getStreamMaxVolume(i);
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final int getStreamVolume(int i) {
        if (this.b.f() == fnj.CEC) {
            return -1;
        }
        return this.a.getStreamVolume(i);
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final int requestAudioFocus(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        return this.a.requestAudioFocus(onAudioFocusChangeListener, i, i2);
    }

    @Override // com.google.android.apps.assistant.audio.LibAAudioManager
    public final void setStreamVolume(int i, int i2, int i3) {
        this.a.setStreamVolume(i, i2, i3);
    }
}
