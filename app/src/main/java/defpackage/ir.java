package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ir {
    ahx b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final ahy f = new iq(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahw) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ahw ahwVar = (ahw) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                ahwVar.c(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ahwVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                ahwVar.d(this.f);
            }
            View view2 = (View) ahwVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c(ahw ahwVar) {
        if (this.c) {
            return;
        }
        this.a.add(ahwVar);
    }

    public final void d() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void e(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void f(ahx ahxVar) {
        if (this.c) {
            return;
        }
        this.b = ahxVar;
    }
}
