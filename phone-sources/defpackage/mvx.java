package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListTabContainer;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListTabStrip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvx extends DataSetObserver implements gls {
    final /* synthetic */ PlayHeaderListTabStrip a;
    private int b;

    public mvx(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.a = playHeaderListTabStrip;
    }

    @Override // defpackage.gls
    public final void a(int i) {
        this.b = i;
        PlayHeaderListTabStrip playHeaderListTabStrip = this.a;
        gls glsVar = playHeaderListTabStrip.b;
        if (glsVar != null) {
            glsVar.a(i);
        }
        if (this.b == 0) {
            playHeaderListTabStrip.c = true;
        }
    }

    @Override // defpackage.gls
    public final void b(int i) {
        PlayHeaderListTabStrip playHeaderListTabStrip = this.a;
        gls glsVar = playHeaderListTabStrip.b;
        if (glsVar != null) {
            glsVar.b(i);
        }
        PlayHeaderListTabContainer playHeaderListTabContainer = playHeaderListTabStrip.a;
        playHeaderListTabContainer.a = i;
        playHeaderListTabContainer.b = 0.0f;
        playHeaderListTabContainer.invalidate();
    }

    @Override // defpackage.gls
    public final void c(int i, float f) {
        int childCount;
        View childAt;
        PlayHeaderListTabStrip playHeaderListTabStrip = this.a;
        if (playHeaderListTabStrip.c && (childCount = playHeaderListTabStrip.a.getChildCount()) != 0 && i >= 0 && i < childCount) {
            PlayHeaderListTabContainer playHeaderListTabContainer = playHeaderListTabStrip.a;
            playHeaderListTabContainer.a = i;
            playHeaderListTabContainer.b = f;
            playHeaderListTabContainer.invalidate();
            View childAt2 = playHeaderListTabStrip.a.getChildAt(i);
            int width = childAt2 == null ? 0 : childAt2.getWidth();
            float width2 = f * (width + (playHeaderListTabStrip.a.getChildAt(i + 1) != null ? r3.getWidth() : 0));
            int childCount2 = playHeaderListTabStrip.a.getChildCount();
            if (childCount2 == 0 || i >= childCount2 || (childAt = playHeaderListTabStrip.a.getChildAt(i)) == null || childAt.getMeasuredWidth() == 0) {
                return;
            }
            int left = ((childAt.getLeft() + ((int) (width2 * 0.5f))) - (playHeaderListTabStrip.getWidth() / 2)) + (childAt.getWidth() / 2);
            if (left != playHeaderListTabStrip.d) {
                playHeaderListTabStrip.d = left;
            }
        }
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.a.removeAllViews();
    }
}
