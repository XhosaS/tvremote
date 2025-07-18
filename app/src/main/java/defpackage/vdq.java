package defpackage;

import android.media.MediaPlayer;
import com.google.android.testing.assistantreadinesstest.ArtModelService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vdq implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ((zdv) ((zdv) ArtModelService.a.d().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService$1", "onError", 385, "ArtModelService.java")).z("MediaPlayer error %s, extra: %s", i, i2);
        return true;
    }
}
