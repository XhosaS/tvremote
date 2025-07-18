package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.play.movies.mobileux.screen.details.synopsis.SynopsisView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jco implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jco(ViewGroup viewGroup, LayoutTransition layoutTransition, int i) {
        this.c = i;
        this.a = viewGroup;
        this.b = layoutTransition;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        if (i9 == 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                    return;
                }
                Object obj = this.b;
                Object obj2 = this.a;
                ((tug) jdd.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "onCreateView$lambda$1$lambda$0", 752, "TvodPlayerFragment.kt")).s("pip changing layout");
                PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
                ((jdd) obj2).S();
                kw.r(builder, (PlayerView) obj);
                return;
            }
            return;
        }
        boolean z = true;
        if (i9 == 1) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                    return;
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment", "onCreateView$lambda$1$lambda$0", 336, "TrailerPlayerFragment.kt")).s("pip changing layout");
                PictureInPictureParams.Builder builder2 = new PictureInPictureParams.Builder();
                ((jcm) obj4).p();
                kw.r(builder2, (PlayerView) obj3);
                return;
            }
            return;
        }
        if (i9 == 2) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            ((mrm) this.a).c.setPictureInPictureParams(((mri) this.b).a());
            return;
        }
        if (i9 == 3) {
            SynopsisView synopsisView = (SynopsisView) this.b;
            Layout layout = synopsisView.a.getLayout();
            int lineCount = synopsisView.a.getLineCount();
            if (lineCount <= synopsisView.b() && layout.getEllipsisCount(lineCount - 1) <= 0) {
                z = false;
            }
            Object obj5 = this.a;
            synopsisView.b = z;
            mzx mzxVar = (mzx) obj5;
            synopsisView.d(mzxVar.i, mzxVar.j, mzxVar.k);
            return;
        }
        if (i9 != 4) {
            if (i9 != 5) {
                view.removeOnLayoutChangeListener(this);
                ((ViewGroup) this.a).setLayoutTransition((LayoutTransition) this.b);
                return;
            } else {
                view.removeOnLayoutChangeListener(this);
                ((ViewGroup) this.a).setLayoutTransition((LayoutTransition) this.b);
                return;
            }
        }
        this.a.run();
        pqw pqwVar = (pqw) this.b;
        pqwVar.m();
        ObjectAnimator duration = ObjectAnimator.ofFloat(pqwVar.H, "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(pqwVar.b(pod.a, 0.0f));
        Rect rect = pqwVar.a;
        float fExactCenterX = rect.exactCenterX();
        pra praVar = pqwVar.e;
        Animator animatorB = praVar.b(fExactCenterX - praVar.h, rect.exactCenterY() - praVar.i, 0.0f);
        Animator animatorB2 = pqwVar.f.b(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, animatorB, animatorB2);
        animatorSet.addListener(new pqs(pqwVar));
        pqwVar.n(animatorSet);
        pqwVar.removeOnLayoutChangeListener(this);
    }

    public /* synthetic */ jco(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public jco(pqw pqwVar, Runnable runnable, int i) {
        this.c = i;
        this.a = runnable;
        this.b = pqwVar;
    }

    public /* synthetic */ jco(xch xchVar, PlayerView playerView, int i) {
        this.c = i;
        this.a = xchVar;
        this.b = playerView;
    }
}
