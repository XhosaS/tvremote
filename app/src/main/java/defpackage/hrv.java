package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrv extends qi {
    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View viewFindViewById = recyclerView.getChildAt(i3).findViewById(R.id.row_content);
            if (viewFindViewById instanceof RecyclerView) {
                RecyclerView recyclerView2 = (RecyclerView) viewFindViewById;
                List list = recyclerView2.O;
                if (list != null) {
                    list.clear();
                }
                recyclerView2.y(new hru(recyclerView2));
            }
        }
    }
}
