package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbm implements nbj {
    private final /* synthetic */ int c;
    public static final nbm b = new nbm(1);
    public static final nbm a = new nbm(0);

    private nbm(int i) {
        this.c = i;
    }

    @Override // defpackage.nbj
    public final void a(Context context, ImageView imageView, String str) {
        if (this.c != 0) {
            hjr.c(context).g(str).h(hvc.a()).k(imageView);
        } else {
            hjr.c(context).g(str).h(new hvc().z(new hsm(context.getResources().getDimensionPixelSize(R.dimen.info_card_song_image_corner_radius)))).k(imageView);
        }
    }
}
