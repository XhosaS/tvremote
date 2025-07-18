package defpackage;

import android.media.AudioRecord;
import android.support.v7.appcompat.R;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlk {
    public static final tui a = tui.l("com/google/android/tv/remote/virtual/audio/VoiceInput");
    public static final int b = Math.max(64000, AudioRecord.getMinBufferSize(16000, 16, 2));
    public Thread d;
    public AudioRecord e;
    public final tll g;
    public final CountDownLatch c = new CountDownLatch(1);
    public volatile boolean f = true;

    public tlk(tll tllVar) {
        this.g = tllVar;
    }

    public final void a(boolean z) {
        ((tug) ((tug) a.e()).j("com/google/android/tv/remote/virtual/audio/VoiceInput", "stop", R.styleable.AppCompatTheme_windowNoTitle, "VoiceInput.java")).s("Stopping recording");
        boolean z2 = false;
        if (!z) {
            this.f = false;
        }
        while (true) {
            try {
                this.c.await();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        AudioRecord audioRecord = this.e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (IllegalStateException e) {
                ((tug) ((tug) a.g()).j("com/google/android/tv/remote/virtual/audio/VoiceInput", "stop", 135, "VoiceInput.java")).v("Cannot stop AudioRecord: %s", e.getMessage());
            }
        }
        sfy.r(this.d);
    }
}
