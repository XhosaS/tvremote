package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.leanback.widget.RowHeaderView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azt extends azk {
    public float a;
    final float b;
    final RowHeaderView c;
    final TextView d;

    public azt(View view) {
        super(view);
        RowHeaderView rowHeaderView = (RowHeaderView) view.findViewById(R.id.row_header);
        this.c = rowHeaderView;
        this.d = (TextView) view.findViewById(R.id.row_header_description);
        if (rowHeaderView != null) {
            rowHeaderView.getCurrentTextColor();
        }
        this.b = this.g.getResources().getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
    }
}
