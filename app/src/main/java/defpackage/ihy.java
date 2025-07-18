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
class ihy extends axe {
    final /* synthetic */ iic f;

    public ihy(iic iicVar) {
        this.f = iicVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return R.layout.setup_guidance_v2p1;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        zdy zdyVar = iic.d;
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        iic iicVar = this.f;
        if (iicVar.n != null) {
            TextView textView = (TextView) viewB.findViewById(R.id.guidance_subtitle);
            yyk yykVarQ = yyk.q(iicVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_1), iicVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_2), iicVar.dZ().getResources().getString(R.string.assistant_entry_subtitle_watson_3));
            final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setStartDelay(((Long) iic.f.get(iicVar.ah)).longValue());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat.addListener(new ihz(iicVar, textView, yykVarQ, objectAnimatorOfFloat2));
            objectAnimatorOfFloat2.addListener(new iia(iicVar, yykVarQ, objectAnimatorOfFloat));
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewB.findViewById(R.id.left_animation);
            lottieAnimationView.setAnimation(iicVar.n.getInt("setup_animation_res_id"));
            lottieAnimationView.h(new cqh() { // from class: ihw
                @Override // defpackage.cqh
                public final void a(cph cphVar) {
                    ((zdv) ((zdv) iic.d.b()).q("com/google/android/apps/tvsearch/setup/fragment/AssistantEntryFragment$1", "onCreateView", 72, "AssistantEntryFragment.java")).u("Animation loaded successfully.");
                    LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                    lottieAnimationView2.setVisibility(0);
                    lottieAnimationView2.c();
                    objectAnimatorOfFloat.start();
                }
            });
            lottieAnimationView.d.b.addListener(new ihx(this, objectAnimatorOfFloat));
        }
        return viewB;
    }
}
