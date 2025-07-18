package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyy extends a {
    final /* synthetic */ EntityPageActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyy(EntityPageActivity entityPageActivity) {
        super(null);
        this.a = entityPageActivity;
    }

    @Override // defpackage.a
    public final void bB(bv bvVar) {
        if (yks.e(bvVar.getTag(), EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG)) {
            this.a.O();
        }
    }

    @Override // defpackage.a
    public final void bC(cr crVar, bv bvVar, View view) {
        if (yks.e(bvVar.getTag(), EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            EntityPageActivity entityPageActivity = this.a;
            Resources resources = entityPageActivity.getResources();
            resources.getClass();
            layoutParams.height = EntityPageActivity.access$getTrailerPlayerHeight(entityPageActivity, resources);
            if (view.isAttachedToWindow()) {
                mjo.s(view);
            } else {
                view.addOnAttachStateChangeListener(new bne(view, 5));
            }
            entityPageActivity.O();
            View viewFindViewById = entityPageActivity.findViewById(R.id.player_container);
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new kag(viewFindViewById, entityPageActivity, 1));
        }
    }
}
