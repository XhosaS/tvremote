package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.aps;
import defpackage.dt;
import defpackage.du;
import defpackage.dw;
import defpackage.ei;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, dt, ei {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private du b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.ei
    public final void a(du duVar) {
        this.b = duVar;
    }

    @Override // defpackage.dt
    public final boolean b(dw dwVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((dw) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aps apsVarR = aps.r(context, attributeSet, a, i, 0);
        if (apsVarR.o(0)) {
            setBackgroundDrawable(apsVarR.i(0));
        }
        if (apsVarR.o(1)) {
            setDivider(apsVarR.i(1));
        }
        apsVarR.m();
    }
}
