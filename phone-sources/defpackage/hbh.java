package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbh implements hbx {
    final /* synthetic */ LottieAnimationView a;

    public hbh(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    @Override // defpackage.hbx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.b;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        LottieAnimationView.a.a(th);
    }
}
