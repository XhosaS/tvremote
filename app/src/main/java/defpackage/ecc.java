package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecc implements ede {
    public final ede a;
    public final SparseArray b = new SparseArray();
    public int c = Integer.MAX_VALUE;
    public int d = -1;
    public int e = -1;

    static {
        boolean z = ebc.a;
    }

    public ecc(ede edeVar) {
        this.a = edeVar;
    }

    private static List f(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            ejm ejmVar = (ejm) sparseArray.get(i3);
            if (ejmVar == null) {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
            arrayList.add(ejmVar);
        }
        return arrayList;
    }

    @Override // defpackage.ede
    public final void a(int i, int i2) {
        throw null;
    }

    final void b() {
        int i = this.c;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        if (i == 1) {
            int i2 = this.d;
            int i3 = this.e;
            SparseArray sparseArray = this.b;
            List listF = f(i2, i3, sparseArray);
            if (this.e > 1) {
                this.a.d(this.d, listF);
            } else {
                ede edeVar = this.a;
                int i4 = this.d;
                ejm ejmVar = (ejm) sparseArray.get(i4);
                eet eetVar = (eet) edeVar;
                if (eetVar.b) {
                    eetVar.a.A(i4, ejmVar);
                } else {
                    eiz eizVar = eetVar.a;
                    dyd.a();
                    if (ejr.a) {
                        Log.d("SectionsDebug", "(" + eizVar.hashCode() + ") insertItemAt " + i4 + ", name: " + ejmVar.o());
                    }
                    eiz.y(ejmVar);
                    efn efnVarU = eizVar.u(ejmVar);
                    synchronized (eizVar) {
                        if (eizVar.A) {
                            throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                        }
                        eizVar.a.add(i4, efnVarU);
                        ejmVar.m();
                    }
                    eizVar.d.t(i4);
                    ell ellVar = eizVar.F;
                    ellVar.c(ellVar.f(i4, eizVar.x));
                }
            }
        } else if (i == 2) {
            int i5 = this.d;
            int i6 = this.e;
            SparseArray sparseArray2 = this.b;
            List listF2 = f(i5, i6, sparseArray2);
            if (this.e > 1) {
                this.a.e(this.d, listF2);
            } else {
                ede edeVar2 = this.a;
                int i7 = this.d;
                ejm ejmVar2 = (ejm) sparseArray2.get(i7);
                eet eetVar2 = (eet) edeVar2;
                if (eetVar2.b) {
                    eiz eizVar2 = eetVar2.a;
                    eizVar2.z();
                    if (ejr.a) {
                        Log.d("SectionsDebug", "(" + eizVar2.hashCode() + ") updateItemAtAsync " + i7);
                    }
                    synchronized (eizVar2) {
                        eizVar2.w(new eip(i7, ejmVar2));
                    }
                } else {
                    eetVar2.a.Q(i7, ejmVar2);
                }
            }
        } else if (i == 3) {
            int i8 = this.e;
            if (i8 > 1) {
                this.a.a(this.d, i8);
            } else {
                ede edeVar3 = this.a;
                int i9 = this.d;
                eet eetVar3 = (eet) edeVar3;
                if (eetVar3.b) {
                    eiz eizVar3 = eetVar3.a;
                    eizVar3.z();
                    if (ejr.a) {
                        Log.d("SectionsDebug", "(" + eizVar3.hashCode() + ") removeItemAtAsync " + i9);
                    }
                    ein einVar = new ein(i9);
                    synchronized (eizVar3) {
                        eizVar3.A = true;
                        eizVar3.b.remove(i9);
                        eizVar3.w(einVar);
                    }
                } else {
                    eetVar3.a.L(i9);
                }
            }
        }
        this.c = Integer.MAX_VALUE;
        this.b.clear();
    }

    @Override // defpackage.ede
    public final void c(int i) {
        eiz eizVar = ((eet) this.a).a;
        if (eizVar.s != null) {
            eizVar.c.l(i, 0);
        } else {
            eizVar.t = i;
            eizVar.w = 0;
        }
    }

    @Override // defpackage.ede
    public final void d(int i, List list) {
        throw null;
    }

    @Override // defpackage.ede
    public final void e(int i, List list) {
        throw null;
    }
}
