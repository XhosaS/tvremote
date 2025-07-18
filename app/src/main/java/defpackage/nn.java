package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nn extends re {
    private static TimeInterpolator j;
    private final ArrayList k = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    final ArrayList g = new ArrayList();

    private final void t(List list, qv qvVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            nl nlVar = (nl) list.get(size);
            if (w(nlVar, qvVar) && nlVar.a == null && nlVar.b == null) {
                list.remove(nlVar);
            }
        }
    }

    private final void u(nl nlVar) {
        qv qvVar = nlVar.a;
        if (qvVar != null) {
            w(nlVar, qvVar);
        }
        qv qvVar2 = nlVar.b;
        if (qvVar2 != null) {
            w(nlVar, qvVar2);
        }
    }

    private final void v(qv qvVar) {
        if (j == null) {
            j = new ValueAnimator().getInterpolator();
        }
        qvVar.a.animate().setInterpolator(j);
        c(qvVar);
    }

    private final boolean w(nl nlVar, qv qvVar) {
        if (nlVar.b == qvVar) {
            nlVar.b = null;
        } else {
            if (nlVar.a != qvVar) {
                return false;
            }
            nlVar.a = null;
        }
        View view = qvVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        l(qvVar);
        return true;
    }

    final void a(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qv) list.get(size)).a.animate().cancel();
            }
        }
    }

    final void b() {
        if (i()) {
            return;
        }
        m();
    }

    @Override // defpackage.px
    public final void c(qv qvVar) {
        View view = qvVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((nm) arrayList.get(size)).a == qvVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(qvVar);
                arrayList.remove(size);
            }
        }
        t(this.n, qvVar);
        if (this.k.remove(qvVar)) {
            view.setAlpha(1.0f);
            l(qvVar);
        }
        if (this.l.remove(qvVar)) {
            view.setAlpha(1.0f);
            l(qvVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            t(arrayList3, qvVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.b;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((nm) arrayList5.get(size4)).a == qvVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    l(qvVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.a;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(qvVar);
                this.d.remove(qvVar);
                this.g.remove(qvVar);
                this.e.remove(qvVar);
                b();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(qvVar)) {
                view.setAlpha(1.0f);
                l(qvVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.px
    public final void d() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qv qvVar = ((nm) arrayList.get(size)).a;
            View view = qvVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(qvVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.k;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((qv) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.l;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            qv qvVar2 = (qv) arrayList3.get(size3);
            qvVar2.a.setAlpha(1.0f);
            l(qvVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.n;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                u((nl) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!i()) {
            return;
        }
        ArrayList arrayList5 = this.b;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    qv qvVar3 = ((nm) arrayList6.get(size6)).a;
                    View view2 = qvVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    l(qvVar3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.a;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    qv qvVar4 = (qv) arrayList8.get(size8);
                    qvVar4.a.setAlpha(1.0f);
                    l(qvVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.c;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                a(this.f);
                a(this.e);
                a(this.d);
                a(this.g);
                m();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    u((nl) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.px
    public final void e() {
        long j2;
        ArrayList arrayList = this.k;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = !zIsEmpty;
        ArrayList arrayList2 = this.m;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.n;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z2 = !zIsEmpty3;
        ArrayList arrayList4 = this.l;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z2 = true;
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            qv qvVar = (qv) arrayList.get(i);
            View view = qvVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(qvVar);
            viewPropertyAnimatorAnimate.setDuration(120L).alpha(0.0f).setListener(new ng(this, qvVar, viewPropertyAnimatorAnimate, view)).start();
            i++;
            arrayList = arrayList;
            zIsEmpty = zIsEmpty;
        }
        boolean z3 = zIsEmpty;
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.b.add(arrayList5);
            arrayList2.clear();
            nd ndVar = new nd(this, arrayList5);
            if (z3) {
                ndVar.run();
            } else {
                View view2 = ((nm) arrayList5.get(0)).a.a;
                int[] iArr = ahj.a;
                view2.postOnAnimationDelayed(ndVar, 120L);
            }
        }
        if (z2) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.c.add(arrayList6);
            arrayList3.clear();
            ne neVar = new ne(this, arrayList6);
            if (z3) {
                j2 = 120;
                neVar.run();
            } else {
                View view3 = ((nl) arrayList6.get(0)).a.a;
                int[] iArr2 = ahj.a;
                j2 = 120;
                view3.postOnAnimationDelayed(neVar, 120L);
            }
        } else {
            j2 = 120;
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.a.add(arrayList7);
        arrayList4.clear();
        nf nfVar = new nf(this, arrayList7);
        if (z3 && zIsEmpty2 && !z2) {
            nfVar.run();
            return;
        }
        long jMax = (true != z ? 0L : j2) + Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? 250L : 0L);
        View view4 = ((qv) arrayList7.get(0)).a;
        int[] iArr3 = ahj.a;
        view4.postOnAnimationDelayed(nfVar, jMax);
    }

    @Override // defpackage.re
    public final boolean f(qv qvVar, qv qvVar2, int i, int i2, int i3, int i4) {
        if (qvVar == qvVar2) {
            return g(qvVar, i, i2, i3, i4);
        }
        View view = qvVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        v(qvVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (qvVar2 != null) {
            v(qvVar2);
            View view2 = qvVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.n.add(new nl(qvVar, qvVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.re
    public final boolean g(qv qvVar, int i, int i2, int i3, int i4) {
        View view = qvVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        v(qvVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                l(qvVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.m.add(new nm(qvVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.px
    public final boolean h(qv qvVar, List list) {
        return !list.isEmpty() || r(qvVar);
    }

    @Override // defpackage.px
    public final boolean i() {
        return (this.l.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.k.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    @Override // defpackage.re
    public final void j(qv qvVar) {
        v(qvVar);
        qvVar.a.setAlpha(0.0f);
        this.l.add(qvVar);
    }

    @Override // defpackage.re
    public final void k(qv qvVar) {
        v(qvVar);
        this.k.add(qvVar);
    }
}
