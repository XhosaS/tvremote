package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mmj extends a {
    final /* synthetic */ cr a;
    final /* synthetic */ mmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmj(mmk mmkVar, cr crVar) {
        super(null);
        this.a = crVar;
        this.b = mmkVar;
    }

    @Override // defpackage.a
    public final void bB(bv bvVar) {
        if (bvVar instanceof InlineLocalWatchFragment) {
            this.b.c();
            this.a.ap(this);
        }
    }

    @Override // defpackage.a
    public final void bC(cr crVar, bv bvVar, View view) {
        int iMin;
        if (bvVar instanceof InlineLocalWatchFragment) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Resources resources = this.b.getResources();
            if (resources.getConfiguration().orientation == 2) {
                iMin = -1;
            } else {
                iMin = Math.min(mmb.c(resources) + resources.getDimensionPixelSize(R.dimen.movie_details_screenshot_overlapped_height), (int) (resources.getConfiguration().screenHeightDp * resources.getDisplayMetrics().density));
            }
            layoutParams.height = iMin;
            if (view.isAttachedToWindow()) {
                mjo.s(view);
            } else {
                view.addOnAttachStateChangeListener(new bne(view, 8));
            }
        }
    }
}
