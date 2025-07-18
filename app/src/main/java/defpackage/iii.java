package defpackage;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iii extends axe {
    final /* synthetic */ iim f;

    public iii(iim iimVar) {
        this.f = iimVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return R.layout.setup_guidance_v2p2;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        iim iimVar = this.f;
        if (iimVar.n != null) {
            TextView textView = (TextView) viewB.findViewById(R.id.guidance_subtitle);
            yyk yykVarQ = yyk.q(iimVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_1), iimVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_2), iimVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_3));
            final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setStartDelay(((Long) iim.f.get(iimVar.ah)).longValue());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat.addListener(new iij(iimVar, textView, yykVarQ, objectAnimatorOfFloat2));
            objectAnimatorOfFloat2.addListener(new iik(iimVar, yykVarQ, objectAnimatorOfFloat));
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewB.findViewById(R.id.left_animation);
            lottieAnimationView.setAnimation(iimVar.n.getInt("setup_animation_res_id"));
            lottieAnimationView.h(new cqh() { // from class: iig
                @Override // defpackage.cqh
                public final void a(cph cphVar) {
                    ((zdv) ((zdv) iim.d.b()).q("com/google/android/apps/tvsearch/setup/fragment/AssistantOptInFragment$1", "onCreateView", 95, "AssistantOptInFragment.java")).u("Animation loaded successfully.");
                    LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                    lottieAnimationView2.setVisibility(0);
                    lottieAnimationView2.c();
                    objectAnimatorOfFloat.start();
                }
            });
            lottieAnimationView.d.b.addListener(new iih(this, objectAnimatorOfFloat));
        }
        return viewB;
    }
}
