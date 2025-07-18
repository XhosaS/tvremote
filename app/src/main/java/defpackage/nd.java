package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class nd implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ nn b;

    public nd(nn nnVar, ArrayList arrayList) {
        this.b = nnVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nm nmVar = (nm) arrayList.get(i);
            nn nnVar = this.b;
            qv qvVar = nmVar.a;
            int i2 = nmVar.b;
            int i3 = nmVar.c;
            int i4 = nmVar.d;
            int i5 = nmVar.e;
            View view = qvVar.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            nnVar.e.add(qvVar);
            viewPropertyAnimatorAnimate.setDuration(250L).setListener(new ni(nnVar, qvVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
        }
        arrayList.clear();
        this.b.b.remove(arrayList);
    }
}
