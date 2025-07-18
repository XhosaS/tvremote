package defpackage;

import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcl extends jcb {
    final /* synthetic */ jcm a;
    final /* synthetic */ ImageView b;

    public jcl(jcm jcmVar, ImageView imageView) {
        this.a = jcmVar;
        this.b = imageView;
    }

    @Override // defpackage.jcb
    public final void a(int i) {
        jcm jcmVar = this.a;
        ExoPlayer exoPlayer = jcmVar.m;
        if (exoPlayer != null) {
            exoPlayer.h();
        }
        ImageView imageView = this.b;
        imageView.getClass();
        jcm.m(imageView);
        jcmVar.g(false, i);
    }

    @Override // defpackage.jcb
    public final void b() {
        PlayerView playerView = this.a.u;
        if (playerView != null) {
            if (playerView.w()) {
                playerView.d();
            } else {
                playerView.k();
            }
        }
    }
}
