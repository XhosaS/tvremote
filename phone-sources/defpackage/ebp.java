package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebp implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager.OnAudioFocusChangeListener a;
    private final Handler b;

    public ebp(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.a = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = edt.a;
        this.b = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        edt.aB(this.b, new csl(this, i, 3));
    }
}
