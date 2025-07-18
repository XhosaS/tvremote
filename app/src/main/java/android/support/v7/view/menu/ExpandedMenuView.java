package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ji;
import defpackage.jj;
import defpackage.jm;
import defpackage.jy;
import defpackage.rv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ji, jy {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private jj b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.jy
    public final void a(jj jjVar) {
        this.b = jjVar;
    }

    @Override // defpackage.ji
    public final boolean b(jm jmVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.x((jm) getAdapter().getItem(i), null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        rv rvVarF = rv.f(context, attributeSet, a, i, 0);
        if (rvVarF.b.hasValue(0)) {
            setBackgroundDrawable(rvVarF.b(0));
        }
        if (rvVarF.b.hasValue(1)) {
            setDivider(rvVarF.b(1));
        }
        rvVarF.b.recycle();
    }
}
