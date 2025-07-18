package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.rjg;
import defpackage.rji;
import defpackage.trk;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DynamicCardRootView extends ConstraintLayout implements rji {
    public tst j;
    public tst k;
    public boolean l;

    public DynamicCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        if (this.j.g()) {
            rjgVar.b(this, ((Integer) this.j.c()).intValue());
        }
        this.l = true;
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        this.l = false;
        if (this.j.g()) {
            rjgVar.e(this);
        }
    }

    public final ImmutableList f() {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        rji rjiVar = (rji) findViewById(R.id.og_text_card_root);
        if (rjiVar != null) {
            builder.add((ImmutableList.Builder) rjiVar);
        }
        return builder.build();
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        trk trkVar = trk.a;
        this.j = trkVar;
        this.k = trkVar;
    }
}
