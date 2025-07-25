package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import defpackage.se;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RowHeaderView extends TextView {
    public RowHeaderView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    public RowHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rowHeaderStyle);
    }

    public RowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
