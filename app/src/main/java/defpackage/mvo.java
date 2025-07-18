package defpackage;

import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.litho.widget.LithoScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvo implements nzy {
    ObjectAnimator a = null;

    public static int c(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acyj.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final acyj acyjVar = (acyj) obj;
        return agff.h(new Runnable() { // from class: mvk
            /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 271
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mvk.run():void");
            }
        });
    }

    public final View d(View view) {
        if ((view instanceof HorizontalScrollView) || (view instanceof LithoScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewD = d(viewGroup.getChildAt(i));
                if (viewD != null) {
                    return viewD;
                }
            }
        }
        return null;
    }

    public final void e() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.a.cancel();
        }
        this.a = null;
    }
}
