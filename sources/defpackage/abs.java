package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abs extends AnimatorListenerAdapter {
    final /* synthetic */ abv a;

    public abs(abv abvVar) {
        this.a = abvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        abv abvVar = this.a;
        ArrayList arrayList = new ArrayList(abvVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((abq) arrayList.get(i)).b(abvVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        abv abvVar = this.a;
        ArrayList arrayList = new ArrayList(abvVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((abq) arrayList.get(i)).c(abvVar);
        }
    }
}
