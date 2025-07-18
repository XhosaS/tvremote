package defpackage;

import android.media.MediaPlayer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxn implements AutoCloseable {
    public MediaPlayer a;
    public MediaPlayer b;
    public boolean c;
    private final Supplier d;
    private final Supplier e;

    public gxn(Supplier supplier, Supplier supplier2) {
        this.d = supplier;
        this.e = supplier2;
    }

    public final void a(int i) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.e.get();
        this.a = mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(false);
        }
        this.c = true;
        if (i != 2) {
            MediaPlayer mediaPlayer2 = (MediaPlayer) this.d.get();
            this.b = mediaPlayer2;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(false);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.a = null;
        this.c = false;
        MediaPlayer mediaPlayer3 = this.b;
        if (mediaPlayer3 != null) {
            mediaPlayer3.stop();
        }
        MediaPlayer mediaPlayer4 = this.b;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
        }
        this.b = null;
    }
}
