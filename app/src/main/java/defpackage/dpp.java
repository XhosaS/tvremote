package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dpp implements dpm {
    @Override // defpackage.dpm
    public final void a(dpl dplVar) throws Resources.NotFoundException {
        View viewK = dplVar.k();
        yrp yrpVar = nym.a;
        viewK.clearAnimation();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(viewK.getContext(), R.anim.fade_in_elements);
        animationLoadAnimation.setAnimationListener(new nyj(viewK));
        viewK.startAnimation(animationLoadAnimation);
    }
}
