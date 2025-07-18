package defpackage;

import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jci extends jbp {
    final /* synthetic */ jcm a;
    final /* synthetic */ ImageView b;

    public jci(jcm jcmVar, ImageView imageView) {
        this.a = jcmVar;
        this.b = imageView;
    }

    @Override // defpackage.jbp
    public final void a(int i) {
        jcm jcmVar = this.a;
        ExoPlayer exoPlayer = jcmVar.m;
        if (exoPlayer != null) {
            exoPlayer.g();
        }
        ImageView imageView = this.b;
        imageView.getClass();
        jcm.m(imageView);
        jcmVar.g(true, i);
    }
}
