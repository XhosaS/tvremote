package com.google.android.apps.play.movies.mobileux.component.downloadanimation;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.google.android.videos.R;
import defpackage.kuj;
import defpackage.mvb;
import defpackage.tht;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PreplayDownloadAnimationView extends tht implements mvb {
    private ObjectAnimator E;
    private int F;
    private String G;

    public PreplayDownloadAnimationView(Context context) {
        super(context);
    }

    @Override // defpackage.mvb
    public final void b() {
        a(0.0f);
        d(false);
        f(false);
        this.F = 0;
        this.G = null;
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.mvb
    public final void c(kuj kujVar) {
        float f = kujVar.b;
        if (kujVar.h()) {
            this.F = R.string.accessibility_pin_video_downloading;
            d(true);
            a(f);
            f(true);
            return;
        }
        if (kujVar.f()) {
            this.F = R.string.accessibility_pin_video_downloaded;
            a(1.0f);
            f(true);
            return;
        }
        if (kujVar.i() || kujVar.j()) {
            this.F = R.string.accessibility_pin_couldnt_download_video;
            d(false);
            if (f < 0.01f) {
                f = 0.01f;
            }
            a(f);
            f(false);
            return;
        }
        if (kujVar.k()) {
            this.F = R.string.accessibility_pin_video_download_pending;
            d(true);
            a(f);
            f(false);
            return;
        }
        this.F = R.string.accessibility_pin_download_video;
        d(false);
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            float f2 = this.h;
            if (f2 <= 0.0f) {
                a(0.0f);
                f(true);
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "downloadFraction", f2, 0.0f).setDuration((int) (1000.0f * f2));
            this.E = duration;
            duration.setInterpolator(new LinearInterpolator());
            this.E.start();
        }
    }

    @Override // defpackage.mvb
    public final void e(String str) {
        this.G = str;
    }

    @Override // defpackage.tht, android.view.View
    public final CharSequence getContentDescription() {
        if (this.F == 0 || this.G == null) {
            return null;
        }
        return getContext().getString(this.F, this.G);
    }

    public PreplayDownloadAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreplayDownloadAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
