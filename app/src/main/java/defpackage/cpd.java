package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpd implements cqf {
    final /* synthetic */ LottieAnimationView a;

    public cpd(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    @Override // defpackage.cqf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.c;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        cqf cqfVar = lottieAnimationView.b;
        if (cqfVar == null) {
            cqfVar = LottieAnimationView.a;
        }
        cqfVar.a(th);
    }
}
