package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gln implements cvq {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public gln(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        cyh cyhVarF = cww.f(view, cyhVar);
        if (cyhVarF.u()) {
            return cyhVarF;
        }
        Rect rect = this.b;
        rect.left = cyhVarF.b();
        rect.top = cyhVarF.d();
        rect.right = cyhVarF.c();
        rect.bottom = cyhVarF.a();
        ViewPager viewPager = this.a;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            cyh cyhVarE = cww.e(viewPager.getChildAt(i), cyhVarF);
            rect.left = Math.min(cyhVarE.b(), rect.left);
            rect.top = Math.min(cyhVarE.d(), rect.top);
            rect.right = Math.min(cyhVarE.c(), rect.right);
            rect.bottom = Math.min(cyhVarE.a(), rect.bottom);
        }
        cxw cxvVar = Build.VERSION.SDK_INT >= 34 ? new cxv(cyhVarF) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVarF) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVarF) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVarF) : new cxr(cyhVarF);
        cxvVar.c(csr.d(rect));
        return cxvVar.a();
    }
}
