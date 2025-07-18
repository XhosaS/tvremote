package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eet implements ede, efb {
    public final eiz a;
    public final boolean b;

    public eet(eiz eizVar, boolean z) {
        this.a = eizVar;
        this.b = z;
    }

    @Override // defpackage.ede
    public final void a(int i, int i2) {
        if (!this.b) {
            this.a.M(i, i2);
            return;
        }
        eiz eizVar = this.a;
        eizVar.z();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + eizVar.hashCode() + ") removeRangeAtAsync " + i + ", size: " + i2);
        }
        eio eioVar = new eio(i, i2);
        synchronized (eizVar) {
            eizVar.A = true;
            for (int i3 = 0; i3 < i2; i3++) {
                eizVar.b.remove(i);
            }
            eizVar.w(eioVar);
        }
    }

    @Override // defpackage.efb
    public final void af() {
        this.a.af();
    }

    @Override // defpackage.efb
    public final void ag(int i, int i2) {
        this.a.ag(i, i2);
    }

    @Override // defpackage.ede
    public final void c(int i) {
        throw null;
    }

    @Override // defpackage.ede
    public final void d(int i, List list) {
        int i2 = 0;
        if (this.b) {
            eiz eizVar = this.a;
            eizVar.z();
            if (ejr.a) {
                String[] strArr = new String[list.size()];
                for (int i3 = 0; i3 < list.size(); i3++) {
                    strArr[i3] = ((ejm) list.get(i3)).o();
                }
                Log.d("SectionsDebug", "(" + eizVar.hashCode() + ") insertRangeAtAsync " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr));
            }
            list.size();
            synchronized (eizVar) {
                eizVar.A = true;
                int size = list.size();
                while (i2 < size) {
                    ejm ejmVar = (ejm) list.get(i2);
                    eiz.y(ejmVar);
                    int i4 = i + i2;
                    eik eikVarV = eizVar.v(i4, ejmVar);
                    eizVar.b.add(i4, eikVarV.b);
                    eizVar.J(eikVarV);
                    i2++;
                }
            }
            return;
        }
        eiz eizVar2 = this.a;
        dyd.a();
        if (ejr.a) {
            String[] strArr2 = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr2[i5] = ((ejm) list.get(i5)).o();
            }
            Log.d("SectionsDebug", "(" + eizVar2.hashCode() + ") insertRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr2));
        }
        synchronized (eizVar2) {
            int size2 = list.size();
            while (i2 < size2) {
                ejm ejmVar2 = (ejm) list.get(i2);
                eiz.y(ejmVar2);
                efn efnVarU = eizVar2.u(ejmVar2);
                if (eizVar2.A) {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
                eizVar2.a.add(i + i2, efnVarU);
                ejmVar2.m();
                i2++;
            }
            list.size();
        }
        eizVar2.d.a.d(i, list.size());
        ell ellVar = eizVar2.F;
        list.size();
        ellVar.c(ellVar.f(i, eizVar2.x));
    }

    @Override // defpackage.ede
    public final void e(int i, List list) {
        if (!this.b) {
            this.a.R(i, list);
            return;
        }
        eiz eizVar = this.a;
        eizVar.z();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + eizVar.hashCode() + ") updateRangeAtAsync " + i + ", count: " + list.size());
        }
        synchronized (eizVar) {
            eizVar.w(new eiq(i, list));
            list.size();
        }
    }

    @Override // defpackage.efb
    public final void f(dxt dxtVar, int i, int i2, dtu dtuVar) {
        this.a.f(dxtVar, i, i2, dtuVar);
    }

    @Override // defpackage.efb
    public final /* synthetic */ void g(ViewGroup viewGroup) {
        this.a.g((RecyclerView) viewGroup);
    }

    @Override // defpackage.efb
    public final /* synthetic */ void i(ViewGroup viewGroup) {
        this.a.i((RecyclerView) viewGroup);
    }

    @Override // defpackage.efb
    public final boolean j() {
        return this.a.q;
    }

    @Override // defpackage.efb
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.efb
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.efb
    public final void m() {
    }
}
