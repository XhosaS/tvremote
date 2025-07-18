package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayz extends LinearLayout {
    private final HorizontalGridView a;

    public ayz(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.lb_list_row, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(R.id.row_content);
        this.a = horizontalGridView;
        horizontalGridView.t = false;
        setOrientation(1);
        setDescendantFocusability(262144);
    }

    public HorizontalGridView getGridView() {
        return this.a;
    }
}
