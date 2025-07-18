package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hru extends qi {
    final /* synthetic */ RecyclerView a;

    public hru(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            if (childAt.getLeft() < 0 || childAt.getRight() > this.a.getWidth()) {
                colorDrawable.setAlpha(180);
            } else {
                colorDrawable.setAlpha(0);
            }
            View viewFindViewById = childAt.findViewById(R.id.image);
            if (viewFindViewById == null) {
                viewFindViewById = childAt.findViewById(R.id.row_item_image);
            }
            if (viewFindViewById == null) {
                viewFindViewById = childAt.findViewById(R.id.item_container);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setForeground(colorDrawable);
            }
        }
    }
}
