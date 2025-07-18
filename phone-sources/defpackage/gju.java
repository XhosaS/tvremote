package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gju implements Cloneable {
    private gjr[] B;
    public ArrayList h;
    public ArrayList i;
    long o;
    public gjq p;
    long q;
    public gli r;
    private static final Animator[] v = new Animator[0];
    private static final int[] w = {2, 1, 3, 4};
    private static final gli F = new gli();
    private static final ThreadLocal x = new ThreadLocal();
    private final String y = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    private ArrayList z = null;
    private ArrayList A = null;
    public isy t = new isy();
    public isy u = new isy();
    gkc f = null;
    public final int[] g = w;
    final ArrayList j = new ArrayList();
    private Animator[] C = v;
    int k = 0;
    private boolean D = false;
    boolean l = false;
    public gju m = null;
    private ArrayList E = null;
    public ArrayList n = new ArrayList();
    public gli s = F;

    private static void P(isy isyVar, View view, gke gkeVar) {
        ((ko) isyVar.a).put(view, gkeVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) isyVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = cww.a;
        String strF = cwm.f(view);
        if (strF != null) {
            ko koVar = (ko) isyVar.c;
            if (koVar.containsKey(strF)) {
                koVar.put(strF, null);
            } else {
                koVar.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                jn jnVar = (jn) isyVar.d;
                if (jnVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    jnVar.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) jnVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    jnVar.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.z;
        if (arrayList == null || !arrayList.contains(view)) {
            ArrayList arrayList2 = this.A;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((Class) this.A.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                gke gkeVar = new gke(view);
                if (z) {
                    c(gkeVar);
                } else {
                    b(gkeVar);
                }
                gkeVar.c.add(this);
                o(gkeVar);
                if (z) {
                    P(this.t, view, gkeVar);
                } else {
                    P(this.u, view, gkeVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    private static boolean g(gke gkeVar, gke gkeVar2, String str) {
        Map map = gkeVar2.a;
        Object obj = gkeVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static ir h() {
        ThreadLocal threadLocal = x;
        ir irVar = (ir) threadLocal.get();
        if (irVar != null) {
            return irVar;
        }
        ir irVar2 = new ir();
        threadLocal.set(irVar2);
        return irVar2;
    }

    public boolean A(gke gkeVar, gke gkeVar2) {
        if (gkeVar != null && gkeVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (g(gkeVar, gkeVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = gkeVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (g(gkeVar, gkeVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean B(View view) {
        int id = view.getId();
        ArrayList arrayList = this.z;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.A.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = this.d;
        return (arrayList3.size() == 0 && this.e.size() == 0) || arrayList3.contains(Integer.valueOf(id)) || this.e.contains(view);
    }

    public final void C(gjr gjrVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(gjrVar);
    }

    public void D(View view) {
        this.e.add(view);
    }

    public final void E(View view) {
        ArrayList arrayListJ = this.z;
        if (view != null) {
            arrayListJ = gli.j(arrayListJ, view);
        }
        this.z = arrayListJ;
    }

    public void F(Class cls) {
        this.A = gli.j(this.A, cls);
    }

    public final void G(gjr gjrVar) {
        gju gjuVar;
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(gjrVar) && (gjuVar = this.m) != null) {
            gjuVar.G(gjrVar);
        }
        if (this.E.size() == 0) {
            this.E = null;
        }
    }

    public void H(View view) {
        this.e.remove(view);
    }

    public void I(long j) {
        this.b = j;
    }

    public void J(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void L(long j) {
        this.a = j;
    }

    public void M(gli gliVar) {
        this.r = gliVar;
    }

    public void N(gli gliVar) {
        if (gliVar == null) {
            this.s = F;
        } else {
            this.s = gliVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void O(ViewGroup viewGroup, isy isyVar, isy isyVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        gke gkeVar;
        gke gkeVar2;
        ir irVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        gjq gjqVar = j().p;
        for (int i = 0; i < size; i++) {
            gke gkeVar3 = (gke) arrayList.get(i);
            gke gkeVar4 = (gke) arrayList2.get(i);
            if (gkeVar3 != null && !gkeVar3.c.contains(this)) {
                gkeVar3 = null;
            }
            if (gkeVar4 != null && !gkeVar4.c.contains(this)) {
                gkeVar4 = null;
            }
            if ((gkeVar3 != null || gkeVar4 != null) && (gkeVar3 == null || gkeVar4 == null || A(gkeVar3, gkeVar4))) {
                Animator animatorA = a(viewGroup, gkeVar3, gkeVar4);
                if (animatorA != null) {
                    if (gkeVar4 != null) {
                        view = gkeVar4.b;
                        String[] strArrE = e();
                        if (strArrE != null) {
                            gke gkeVar5 = new gke(view);
                            gke gkeVar6 = (gke) ((ko) isyVar2.a).get(view);
                            animator = animatorA;
                            if (gkeVar6 != null) {
                                int i2 = 0;
                                while (i2 < strArrE.length) {
                                    Map map = gkeVar5.a;
                                    String[] strArr = strArrE;
                                    String str = strArr[i2];
                                    map.put(str, gkeVar6.a.get(str));
                                    i2++;
                                    strArrE = strArr;
                                }
                            }
                            int i3 = irVarH.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    gkeVar2 = gkeVar5;
                                    break;
                                }
                                lkt lktVar = (lkt) irVarH.get((Animator) irVarH.d(i4));
                                Object obj = lktVar.c;
                                if (obj != null && lktVar.b == view) {
                                    if (((String) lktVar.a).equals(this.y) && ((gke) obj).equals(gkeVar5)) {
                                        gkeVar2 = gkeVar5;
                                        animator = null;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            animator = animatorA;
                            gkeVar2 = null;
                        }
                        gkeVar = gkeVar2;
                    } else {
                        animator = animatorA;
                        view = gkeVar3.b;
                        gkeVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        lkt lktVar2 = new lkt(view2, this.y, this, viewGroup.getWindowId(), gkeVar, animator2);
                        if (gjqVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        irVarH.put(animator2, lktVar2);
                        this.n.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                lkt lktVar3 = (lkt) irVarH.get((Animator) this.n.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                Animator animator3 = (Animator) lktVar3.e;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public Animator a(ViewGroup viewGroup, gke gkeVar, gke gkeVar2) {
        return null;
    }

    public abstract void b(gke gkeVar);

    public abstract void c(gke gkeVar);

    public boolean d() {
        return false;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public gju clone() {
        try {
            gju gjuVar = (gju) super.clone();
            gjuVar.n = new ArrayList();
            gjuVar.t = new isy();
            gjuVar.u = new isy();
            gjuVar.h = null;
            gjuVar.i = null;
            gjuVar.p = null;
            gjuVar.m = this;
            gjuVar.E = null;
            return gjuVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final gju j() {
        gkc gkcVar = this.f;
        return gkcVar != null ? gkcVar.j() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.gke) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.gke k(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            gkc r0 = r5.f
            if (r0 == 0) goto L9
            gke r6 = r0.k(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.h
            goto L10
        Le:
            java.util.ArrayList r0 = r5.i
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            gke r4 = (defpackage.gke) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.i
            goto L36
        L34:
            java.util.ArrayList r6 = r5.h
        L36:
            java.lang.Object r6 = r6.get(r3)
            gke r6 = (defpackage.gke) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gju.k(android.view.View, boolean):gke");
    }

    public final gke l(View view, boolean z) {
        gkc gkcVar = this.f;
        if (gkcVar != null) {
            return gkcVar.l(view, z);
        }
        return (gke) ((ko) (z ? this.t : this.u).a).get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        ArrayList arrayList = this.d;
        if (arrayList.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.e;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void n() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                s(this, gjt.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        ArrayList arrayList = this.d;
        if (arrayList.size() <= 0 && this.e.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                gke gkeVar = new gke(viewFindViewById);
                if (z) {
                    c(gkeVar);
                } else {
                    b(gkeVar);
                    z3 = false;
                }
                gkeVar.c.add(this);
                o(gkeVar);
                if (z3) {
                    P(this.t, viewFindViewById, gkeVar);
                } else {
                    P(this.u, viewFindViewById, gkeVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            gke gkeVar2 = new gke(view);
            if (z) {
                c(gkeVar2);
                z2 = true;
            } else {
                b(gkeVar2);
                z2 = false;
            }
            gkeVar2.c.add(this);
            o(gkeVar2);
            if (z2) {
                P(this.t, view, gkeVar2);
            } else {
                P(this.u, view, gkeVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            ((ko) this.t.a).clear();
            ((SparseArray) this.t.b).clear();
            ((jn) this.t.d).i();
        } else {
            ((ko) this.u.a).clear();
            ((SparseArray) this.u.b).clear();
            ((jn) this.u.d).i();
        }
    }

    protected final void r() {
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            s(this, gjt.b, false);
            for (int i2 = 0; i2 < ((jn) this.t.d).b(); i2++) {
                View view = (View) ((jn) this.t.d).g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((jn) this.u.d).b(); i3++) {
                View view2 = (View) ((jn) this.u.d).g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.l = true;
        }
    }

    public final void s(gju gjuVar, gjt gjtVar, boolean z) {
        gju gjuVar2 = this.m;
        if (gjuVar2 != null) {
            gjuVar2.s(gjuVar, gjtVar, z);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.E.size();
        gjr[] gjrVarArr = this.B;
        if (gjrVarArr == null) {
            gjrVarArr = new gjr[size];
        }
        this.B = null;
        gjr[] gjrVarArr2 = (gjr[]) this.E.toArray(gjrVarArr);
        for (int i = 0; i < size; i++) {
            gjtVar.a(gjrVarArr2[i], gjuVar);
            gjrVarArr2[i] = null;
        }
        this.B = gjrVarArr2;
    }

    public void t(View view) {
        if (this.l) {
            return;
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                s(this, gjt.d, false);
                this.D = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public final String toString() {
        return m("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u() {
        ir irVarH = h();
        this.o = 0L;
        for (int i = 0; i < this.n.size(); i++) {
            Animator animator = (Animator) this.n.get(i);
            lkt lktVar = (lkt) irVarH.get(animator);
            if (animator != null && lktVar != null) {
                long j = this.b;
                if (j >= 0) {
                    ((Animator) lktVar.e).setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    Animator animator2 = (Animator) lktVar.e;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    ((Animator) lktVar.e).setInterpolator(timeInterpolator);
                }
                this.j.add(animator);
                this.o = Math.max(this.o, animator.getTotalDuration());
            }
        }
        this.n.clear();
    }

    public void v(View view) {
        if (this.D) {
            if (!this.l) {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
                this.C = v;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.C = animatorArr;
                s(this, gjt.e, false);
            }
            this.D = false;
        }
    }

    protected void w() {
        y();
        ir irVarH = h();
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (irVarH.containsKey(animator)) {
                y();
                if (animator != null) {
                    animator.addListener(new gjo(this, irVarH));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new gjp(this));
                    animator.start();
                }
            }
        }
        this.n.clear();
        r();
    }

    public void x(long j, long j2) {
        long j3 = this.o;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.l = false;
            s(this, gjt.a, z);
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.C = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.l = true;
        }
        s(this, gjt.b, z);
    }

    protected final void y() {
        if (this.k == 0) {
            s(this, gjt.a, false);
            this.l = false;
        }
        this.k++;
    }

    public boolean z() {
        return !this.j.isEmpty();
    }

    public void K() {
    }

    public void o(gke gkeVar) {
    }
}
