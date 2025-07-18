package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hpw implements jpn {
    final /* synthetic */ azt a;
    final /* synthetic */ ImageFitDownloadView b;

    public hpw(azt aztVar, ImageFitDownloadView imageFitDownloadView) {
        this.a = aztVar;
        this.b = imageFitDownloadView;
    }

    @Override // defpackage.jpn
    public final void a(Throwable th) {
        ImageFitDownloadView imageFitDownloadView = this.b;
        float width = imageFitDownloadView.getWidth();
        ViewGroup.LayoutParams layoutParams = imageFitDownloadView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            width += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        if (imageFitDownloadView.getResources().getConfiguration().getLayoutDirection() == 0) {
            width = -width;
        }
        azt aztVar = this.a;
        Property property = View.TRANSLATION_X;
        float[] fArr = {width};
        View view = aztVar.g;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new hpv(imageFitDownloadView, view));
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.jpn
    public final void b() {
    }
}
