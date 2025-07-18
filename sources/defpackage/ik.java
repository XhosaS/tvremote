package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ik {
    private static TimeInterpolator o;
    public boolean a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public byj m;
    private final ArrayList n;

    public ik(byte[] bArr) {
        this.m = null;
        this.n = new ArrayList();
        this.a = true;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public static void i(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ja) list.get(size)).b.animate().cancel();
            }
        }
    }

    public static void j(ja jaVar) {
        int i = jaVar.k;
        if (!jaVar.q() && (i & 4) == 0) {
            int i2 = jaVar.e;
            jaVar.a();
        }
    }

    public static final pv k(ja jaVar) {
        pv pvVar = new pv();
        pvVar.d(jaVar);
        return pvVar;
    }

    private final void m(List list, ja jaVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            gz gzVar = (gz) list.get(size);
            if (o(gzVar, jaVar) && gzVar.a == null && gzVar.b == null) {
                list.remove(gzVar);
            }
        }
    }

    private final void n(gz gzVar) {
        ja jaVar = gzVar.a;
        if (jaVar != null) {
            o(gzVar, jaVar);
        }
        ja jaVar2 = gzVar.b;
        if (jaVar2 != null) {
            o(gzVar, jaVar2);
        }
    }

    private final boolean o(gz gzVar, ja jaVar) {
        if (gzVar.b == jaVar) {
            gzVar.b = null;
        } else {
            if (gzVar.a != jaVar) {
                return false;
            }
            gzVar.a = null;
        }
        View view = jaVar.b;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        a(jaVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ja r11) {
        /*
            r10 = this;
            byj r0 = r10.m
            if (r0 == 0) goto L97
            r1 = 1
            r11.k(r1)
            ja r2 = r11.i
            r3 = 0
            if (r2 == 0) goto L13
            ja r2 = r11.j
            if (r2 != 0) goto L13
            r11.i = r3
        L13:
            r11.j = r3
            int r2 = r11.k
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L97
        L1d:
            android.view.View r2 = r11.b
            java.lang.Object r3 = r0.a
            android.support.v7.widget.RecyclerView r3 = (android.support.v7.widget.RecyclerView) r3
            r3.T()
            gs r4 = r3.h
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L3b
            android.view.View r1 = r4.d
            if (r1 != r2) goto L33
        L31:
            r1 = r6
            goto L66
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L3b:
            r7 = 2
            if (r5 == r7) goto L8f
            r4.c = r7     // Catch: java.lang.Throwable -> L8b
            byj r5 = r4.e     // Catch: java.lang.Throwable -> L8b
            int r7 = r5.x(r2)     // Catch: java.lang.Throwable -> L8b
            r8 = -1
            if (r7 != r8) goto L4f
            r4.l(r2)     // Catch: java.lang.Throwable -> L8b
            r4.c = r6
            goto L66
        L4f:
            gr r8 = r4.a     // Catch: java.lang.Throwable -> L8b
            boolean r9 = r8.f(r7)     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L63
            r8.g(r7)     // Catch: java.lang.Throwable -> L8b
            r4.l(r2)     // Catch: java.lang.Throwable -> L8b
            r5.A(r7)     // Catch: java.lang.Throwable -> L8b
            r4.c = r6
            goto L66
        L63:
            r4.c = r6
            goto L31
        L66:
            if (r1 == 0) goto L74
            ja r2 = android.support.v7.widget.RecyclerView.f(r2)
            ir r4 = r3.f
            r4.l(r2)
            r4.j(r2)
        L74:
            r2 = r1 ^ 1
            r3.U(r2)
            if (r1 != 0) goto L97
            boolean r1 = r11.u()
            if (r1 == 0) goto L97
            java.lang.Object r0 = r0.a
            android.view.View r11 = r11.b
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r0.removeDetachedView(r11, r6)
            return
        L8b:
            r11 = move-exception
            r4.c = r6
            throw r11
        L8f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.a(ja):void");
    }

    public final void b() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ij) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public final void c() {
        if (h()) {
            return;
        }
        b();
    }

    public final void d(ja jaVar) {
        View view = jaVar.b;
        view.animate().cancel();
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ha) this.d.get(size)).a == jaVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(jaVar);
                this.d.remove(size);
            }
        }
        m(this.e, jaVar);
        if (this.b.remove(jaVar)) {
            view.setAlpha(1.0f);
            a(jaVar);
        }
        if (this.c.remove(jaVar)) {
            view.setAlpha(1.0f);
            a(jaVar);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.h.get(size2);
            m(arrayList, jaVar);
            if (arrayList.isEmpty()) {
                this.h.remove(size2);
            }
        }
        int size3 = this.g.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.g.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ha) arrayList2.get(size4)).a == jaVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(jaVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.g.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.k.remove(jaVar);
                this.i.remove(jaVar);
                this.l.remove(jaVar);
                this.j.remove(jaVar);
                c();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f.get(size5);
            if (arrayList3.remove(jaVar)) {
                view.setAlpha(1.0f);
                a(jaVar);
                if (arrayList3.isEmpty()) {
                    this.f.remove(size5);
                }
            }
        }
    }

    public final void e() {
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ja jaVar = ((ha) this.d.get(size)).a;
            View view = jaVar.b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(jaVar);
            this.d.remove(size);
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((ja) this.b.get(size2));
            this.b.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ja jaVar2 = (ja) this.c.get(size3);
            jaVar2.b.setAlpha(1.0f);
            a(jaVar2);
            this.c.remove(size3);
        }
        int size4 = this.e.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                n((gz) this.e.get(size4));
            }
        }
        this.e.clear();
        if (!h()) {
            return;
        }
        int size5 = this.g.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.g.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ja jaVar3 = ((ha) arrayList.get(size6)).a;
                    View view2 = jaVar3.b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    a(jaVar3);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.g.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    ja jaVar4 = (ja) arrayList2.get(size8);
                    jaVar4.b.setAlpha(1.0f);
                    a(jaVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.h.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                i(this.k);
                i(this.j);
                i(this.i);
                i(this.l);
                b();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.h.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    n((gz) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.h.remove(arrayList3);
                    }
                }
            }
        }
    }

    public final void f(ja jaVar) {
        if (o == null) {
            o = new ValueAnimator().getInterpolator();
        }
        jaVar.b.animate().setInterpolator(o);
        d(jaVar);
    }

    public final boolean g(ja jaVar, int i, int i2, int i3, int i4) {
        View view = jaVar.b;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        f(jaVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                a(jaVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.d.add(new ha(jaVar, i5, i7, i3, i4));
        return true;
    }

    public final boolean h() {
        return (this.c.isEmpty() && this.e.isEmpty() && this.d.isEmpty() && this.b.isEmpty() && this.j.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.f.isEmpty() && this.h.isEmpty()) ? false : true;
    }

    public final boolean l(ja jaVar, ja jaVar2, pv pvVar, pv pvVar2) {
        int i;
        int i2;
        int i3 = pvVar.b;
        int i4 = pvVar.a;
        if (jaVar2.x()) {
            int i5 = pvVar.b;
            i2 = pvVar.a;
            i = i5;
        } else {
            i = pvVar2.b;
            i2 = pvVar2.a;
        }
        if (jaVar == jaVar2) {
            return g(jaVar, i3, i4, i, i2);
        }
        View view = jaVar.b;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        f(jaVar);
        float f = (i - i3) - translationX;
        float f2 = (i2 - i4) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (jaVar2 != null) {
            f(jaVar2);
            View view2 = jaVar2.b;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.e.add(new gz(jaVar, jaVar2, i3, i4, i, i2));
        return true;
    }

    public ik() {
        this.m = null;
        this.n = new ArrayList();
    }
}
