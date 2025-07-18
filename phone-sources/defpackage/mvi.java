package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvi extends sfj {
    public mvi() {
        super(R.layout.replaydialog_divider);
    }

    @Override // defpackage.sfj
    protected final void a(Context context, View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = 0;
    }
}
