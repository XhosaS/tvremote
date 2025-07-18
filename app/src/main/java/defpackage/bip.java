package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bip extends pz {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ bit d;

    public bip(bit bitVar) {
        this.d = bitVar;
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        qv qvVarL = recyclerView.l(view);
        if (!(qvVarL instanceof bjh) || !((bjh) qvVarL).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        qv qvVarL2 = recyclerView.l(recyclerView.getChildAt(iIndexOfChild + 1));
        return (qvVarL2 instanceof bjh) && ((bjh) qvVarL2).u;
    }

    @Override // defpackage.pz
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (a(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }

    @Override // defpackage.pz
    public final void i(Rect rect, View view, RecyclerView recyclerView) {
        if (a(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }
}
