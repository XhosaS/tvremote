package defpackage;

import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcy extends jbp {
    final /* synthetic */ jdd a;
    final /* synthetic */ ImageView b;

    public jcy(jdd jddVar, ImageView imageView) {
        this.a = jddVar;
        this.b = imageView;
    }

    @Override // defpackage.jbp
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
}
