package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.katniss.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hhz extends AnimatorListenerAdapter {
    final /* synthetic */ hia a;

    public hhz(hia hiaVar) {
        this.a = hiaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onAnimationEnd(animator);
        hia hiaVar = this.a;
        hiaVar.aC.getLayoutParams().height = hiaVar.aA.getHeight();
        hiaVar.aE.j(hiaVar.aB.getId(), 6, 6, 0);
        hiaVar.aE.b(hiaVar.aD);
        if (hiaVar.aF.a()) {
            hiaVar.aA.setBackground(hiaVar.dZ().getResources().getDrawable(R.drawable.search_pop_up_translucent_bg, null));
        } else {
            hiaVar.aA.setBackground(hiaVar.dZ().getResources().getDrawable(R.drawable.search_pop_up_opaque_bg, null));
        }
        hiaVar.az.setVisibility(8);
        hho.c(false, hiaVar.ax);
        hiaVar.ay = false;
        hiaVar.aA.animate().alpha(1.0f).setDuration(200L).setListener(null);
    }
}
