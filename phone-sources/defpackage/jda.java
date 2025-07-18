package defpackage;

import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jda extends jcb {
    final /* synthetic */ jdd a;
    final /* synthetic */ ImageView b;

    public jda(jdd jddVar, ImageView imageView) {
        this.a = jddVar;
        this.b = imageView;
    }

    @Override // defpackage.jcb
    public final void a(int i) {
        jdd jddVar = this.a;
        ExoPlayer exoPlayer = jddVar.C;
        if (exoPlayer != null) {
            exoPlayer.g();
        }
        ImageView imageView = this.b;
        imageView.getClass();
        jdd.N(imageView);
        jddVar.p(true, i);
    }

    @Override // defpackage.jcb
    public final void b() {
        PlayerView playerView = this.a.ac;
        if (playerView != null) {
            if (playerView.w()) {
                playerView.d();
            } else {
                playerView.k();
            }
        }
    }
}
