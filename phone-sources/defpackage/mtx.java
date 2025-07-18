package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtx extends RecyclerView.ViewHolder {
    public final TextView a;
    public final View b;
    public final View c;

    public mtx(PlayerControlView playerControlView, View view) {
        super(view);
        int i = 1;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.c = (TextView) view.findViewById(R.id.exo_main_text);
        this.a = (TextView) view.findViewById(R.id.exo_sub_text);
        this.b = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new iuy(this, playerControlView, i, null));
    }

    public mtx(View view) {
        super(view);
        this.b = view.findViewById(R.id.no_content);
        this.a = (TextView) view.findViewById(R.id.no_content_text);
        this.c = (ImageView) view.findViewById(R.id.no_content_image);
    }
}
