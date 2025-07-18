package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtl extends RecyclerView.ViewHolder {
    public final FrameLayout a;
    public final FrameLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final Drawable f;
    public final Drawable g;
    public final mge h;
    public float i;
    public rzy j;

    public mtl(mtm mtmVar, View view, int i) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.image_frame);
        this.a = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.text_frame);
        this.b = frameLayout2;
        View viewFindViewById = view.findViewById(R.id.image_view);
        this.c = viewFindViewById;
        this.d = (TextView) view.findViewById(R.id.first_line_text);
        this.e = (TextView) view.findViewById(R.id.second_line_text);
        iuy iuyVar = new iuy(this, mtmVar, 13, null);
        frameLayout.setOnClickListener(iuyVar);
        frameLayout2.setOnClickListener(iuyVar);
        this.g = frameLayout.getForeground();
        this.f = view.getContext().getResources().getDrawable(R.drawable.selectable_item_circular_background, view.getContext().getTheme());
        if (i == R.layout.second_screen_actor_item) {
            this.h = new mgd(mtmVar.e, (TextView) viewFindViewById, mtmVar.d);
        } else {
            this.h = new mtn((ImageView) viewFindViewById, mtmVar.c);
        }
    }
}
