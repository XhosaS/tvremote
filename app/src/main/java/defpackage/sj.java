package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sj {
    final si a;
    final sh b = new sh();

    public sj(si siVar) {
        this.a = siVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        si siVar = this.a;
        int iD = siVar.d();
        int iC = siVar.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = siVar.e(i5);
            int iB = siVar.b(viewE);
            int iA = siVar.a(viewE);
            sh shVar = this.b;
            shVar.b(iD, iC, iB, iA);
            shVar.a = i3;
            if (shVar.c()) {
                return viewE;
            }
            if (i4 != 0) {
                shVar.a = i4;
                if (shVar.c()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    public final boolean b(View view) {
        sh shVar = this.b;
        si siVar = this.a;
        shVar.b(siVar.d(), siVar.c(), siVar.b(view), siVar.a(view));
        shVar.a = 24579;
        return shVar.c();
    }
}
