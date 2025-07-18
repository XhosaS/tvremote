package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atz extends bit {
    private Context aj;

    @Override // defpackage.bit
    public final bq l() {
        return this.F;
    }

    @Override // defpackage.bit
    public final RecyclerView m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) layoutInflater.inflate(R.layout.leanback_preferences_list, viewGroup, false);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.af(new bjg(verticalGridView));
        return verticalGridView;
    }

    @Override // defpackage.bq
    public Context s() {
        if (this.aj == null && ee() != null) {
            TypedValue typedValue = new TypedValue();
            ee().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i == 0) {
                i = R.style.PreferenceThemeOverlayLeanback;
            }
            this.aj = new ContextThemeWrapper(super.s(), i);
        }
        return this.aj;
    }
}
