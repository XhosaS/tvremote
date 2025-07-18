package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxh extends dhc {
    @Override // defpackage.dhc
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = sxi.h;
        return ((sxi) obj).b() * 10000.0f;
    }

    @Override // defpackage.dhc
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        sxi sxiVar = (sxi) obj;
        int i = sxi.h;
        sxiVar.d(f / 10000.0f);
        if (sxiVar.j.c(true)) {
            if (sxiVar.d == null) {
                Context context = sxiVar.i;
                TimeInterpolator timeInterpolator = sns.a;
                sxiVar.f = sim.k(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                sxiVar.g = sim.k(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                sxiVar.d = new ValueAnimator();
                sxiVar.d.setDuration(500L);
                sxiVar.d.setFloatValues(0.0f, 1.0f);
                sxiVar.d.setInterpolator(null);
                sxiVar.d.addUpdateListener(new fsz(sxiVar, 11));
            }
            float fA = sxiVar.a((int) f);
            if (fA == sxiVar.c) {
                if (sxiVar.d.isRunning()) {
                    return;
                }
                sxiVar.c(fA);
                return;
            }
            if (sxiVar.d.isRunning()) {
                sxiVar.d.cancel();
            }
            sxiVar.c = fA;
            if (fA == 1.0f) {
                sxiVar.e = sxiVar.f;
                sxiVar.d.start();
            } else {
                sxiVar.e = sxiVar.g;
                sxiVar.d.reverse();
            }
        }
    }
}
