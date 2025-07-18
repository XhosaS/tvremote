package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class nf implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ nn b;

    public nf(nn nnVar, ArrayList arrayList) {
        this.b = nnVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qv qvVar = (qv) arrayList.get(i);
            nn nnVar = this.b;
            View view = qvVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            nnVar.d.add(qvVar);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(120L).setListener(new nh(nnVar, qvVar, view, viewPropertyAnimatorAnimate)).start();
        }
        arrayList.clear();
        this.b.a.remove(arrayList);
    }
}
