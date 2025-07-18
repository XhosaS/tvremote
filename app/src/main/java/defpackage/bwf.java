package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwf extends AnimatorListenerAdapter {
    final /* synthetic */ bwi a;

    public bwf(bwi bwiVar) {
        this.a = bwiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bwi bwiVar = this.a;
        ArrayList arrayList = new ArrayList(bwiVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bwd) arrayList.get(i)).b(bwiVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        bwi bwiVar = this.a;
        ArrayList arrayList = new ArrayList(bwiVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bwd) arrayList.get(i)).c(bwiVar);
        }
    }
}
