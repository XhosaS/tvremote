package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class ne implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ nn b;

    public ne(nn nnVar, ArrayList arrayList) {
        this.b = nnVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nl nlVar = (nl) arrayList.get(i);
            nn nnVar = this.b;
            qv qvVar = nlVar.a;
            View view = qvVar == null ? null : qvVar.a;
            qv qvVar2 = nlVar.b;
            View view2 = qvVar2 != null ? qvVar2.a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250L);
                nnVar.g.add(nlVar.a);
                duration.translationX(nlVar.e - nlVar.c);
                duration.translationY(nlVar.f - nlVar.d);
                duration.alpha(0.0f).setListener(new nj(nnVar, nlVar, duration, view)).start();
            }
            if (view2 != null) {
                ArrayList arrayList2 = nnVar.g;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(nlVar.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new nk(nnVar, nlVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
        arrayList.clear();
        this.b.c.remove(arrayList);
    }
}
