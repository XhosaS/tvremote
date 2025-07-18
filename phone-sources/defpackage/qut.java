package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.RingFrameLayout;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qut {
    public final AvatarView a;
    public final RingFrameLayout b;
    public pjs c;
    public rjg d;
    public tst e;
    public tst f;
    private AnimatorSet g = new AnimatorSet();

    public qut(AvatarView avatarView, RingFrameLayout ringFrameLayout) {
        trk trkVar = trk.a;
        this.e = trkVar;
        this.f = trkVar;
        this.a = avatarView;
        this.b = ringFrameLayout;
        avatarView.d();
        avatarView.d = new bw(this, 10);
        avatarView.c(avatarView.a);
        ringFrameLayout.setVisibility(0);
    }

    public final void a(tst tstVar, boolean z) {
        Object qumVar;
        int i;
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        if (!this.f.g()) {
            this.e = tstVar;
            return;
        }
        int iIntValue = ((Integer) this.f.c()).intValue();
        pjs pjsVar = null;
        if (tstVar.g()) {
            qup qupVar = (qup) tstVar.c();
            if (qupVar.d != null) {
                qumVar = new qum(quq.e(this.a.getResources()));
            } else {
                yau yauVar = qupVar.c;
                if (yauVar == null) {
                    throw new IllegalStateException("RingContent must have a ring drawable factory.");
                }
                qumVar = yauVar.a;
                CirclePulseDrawable circlePulseDrawable = (CirclePulseDrawable) qumVar;
                circlePulseDrawable.setAlpha(128);
                Object obj = yauVar.c;
                if (obj != null) {
                    ((AnimatorSet) obj).cancel();
                    ((AnimatorSet) yauVar.c).removeAllListeners();
                }
                int i2 = iIntValue + iIntValue;
                AnimatorSet animatorSetC = yau.c(circlePulseDrawable, "firstPulseSize", i2, 950L, 900L);
                AnimatorSet animatorSetC2 = yau.c(circlePulseDrawable, "secondPulseSize", i2, 900L, 834L);
                animatorSetC2.setStartDelay(400L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animatorSetC, animatorSetC2);
                yauVar.c = animatorSet;
                ((AnimatorSet) yauVar.c).addListener(new rge(yauVar));
                if (yauVar.b) {
                    ((AnimatorSet) yauVar.c).start();
                }
            }
        } else {
            qumVar = null;
        }
        AvatarView avatarView = this.a;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (avatarView.b != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(avatarView, "currRingThickness", iIntValue, -1).setDuration(200L);
            duration.addListener(new qur(this));
            builder.add((ImmutableList.Builder) duration);
        }
        if (qumVar != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(avatarView, "currRingThickness", -1, iIntValue).setDuration(200L);
            duration2.addListener(new qus(this, tstVar, (Drawable) qumVar));
            builder.add((ImmutableList.Builder) duration2);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(builder.build());
        this.g = animatorSet2;
        if (!z || avatarView.b == qumVar) {
            this.g.setDuration(0L);
        }
        this.g.start();
        if (tstVar.g() && (i = ((qup) tstVar.c()).b) != 0) {
            vvd vvdVar = rjd.a;
            vtw vtwVarM = rjf.a.m();
            vtw vtwVarM2 = ucf.a.m();
            vtw vtwVarM3 = uce.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uce uceVar = (uce) vtwVarM3.b;
            uceVar.c = i - 1;
            uceVar.b |= 1;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucf ucfVar = (ucf) vtwVarM2.b;
            uce uceVar2 = (uce) vtwVarM3.r();
            uceVar2.getClass();
            ucfVar.d = uceVar2;
            ucfVar.b |= 8;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            rjf rjfVar = (rjf) vtwVarM.b;
            ucf ucfVar2 = (ucf) vtwVarM2.r();
            ucfVar2.getClass();
            rjfVar.c = ucfVar2;
            rjfVar.b |= 1;
            pjsVar = new pjs(vvdVar, (rjf) vtwVarM.r());
        }
        this.c = pjsVar;
        rjg rjgVar = this.d;
        if (rjgVar == null) {
            return;
        }
        RingFrameLayout ringFrameLayout = this.b;
        ringFrameLayout.e(rjgVar);
        pjs pjsVar2 = this.c;
        if (pjsVar2 != null) {
            ringFrameLayout.c(this.d, pjsVar2);
        } else {
            ringFrameLayout.b(this.d);
        }
    }

    public final void b(tst tstVar) {
        sjl.c();
        a(tstVar, false);
    }
}
