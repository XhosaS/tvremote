package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import com.google.android.play.headerlist.PlayHeaderListTabContainer;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfy extends DataSetObserver implements gls {
    final /* synthetic */ PlayHeaderListTabStrip a;

    public tfy(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.a = playHeaderListTabStrip;
    }

    @Override // defpackage.gls
    public final void a(int i) {
        if (i == 0) {
            this.a.c = true;
        }
    }

    @Override // defpackage.gls
    public final void b(int i) {
        PlayHeaderListTabContainer playHeaderListTabContainer = this.a.b;
        playHeaderListTabContainer.b = i;
        playHeaderListTabContainer.c = 0.0f;
        playHeaderListTabContainer.invalidate();
    }

    @Override // defpackage.gls
    public final void c(int i, float f) {
        int childCount;
        int childCount2;
        View childAt;
        PlayHeaderListTabStrip playHeaderListTabStrip = this.a;
        if (playHeaderListTabStrip.c && (childCount = playHeaderListTabStrip.b.getChildCount()) != 0 && i >= 0 && i < childCount) {
            PlayHeaderListTabContainer playHeaderListTabContainer = playHeaderListTabStrip.b;
            playHeaderListTabContainer.b = i;
            playHeaderListTabContainer.c = f;
            playHeaderListTabContainer.invalidate();
            View childAt2 = playHeaderListTabStrip.b.getChildAt(i);
            int width = childAt2 == null ? 0 : childAt2.getWidth();
            float width2 = f * (width + (playHeaderListTabStrip.b.getChildAt(i + 1) == null ? 0 : r3.getWidth()));
            if (playHeaderListTabStrip.a == null || (childCount2 = playHeaderListTabStrip.b.getChildCount()) == 0 || i >= childCount2 || (childAt = playHeaderListTabStrip.b.getChildAt(i)) == null || childAt.getMeasuredWidth() == 0) {
                return;
            }
            int left = ((childAt.getLeft() + ((int) (width2 * 0.5f))) - (playHeaderListTabStrip.getWidth() / 2)) + (childAt.getWidth() / 2);
            if (left != playHeaderListTabStrip.d) {
                Math.abs(left - playHeaderListTabStrip.a.getScrollX());
                playHeaderListTabStrip.a.smoothScrollBy(0, 0);
                playHeaderListTabStrip.a.smoothScrollBy(0, 0);
                playHeaderListTabStrip.a.scrollTo(left, 0);
                playHeaderListTabStrip.d = left;
            }
        }
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.b.removeAllViews();
    }
}
