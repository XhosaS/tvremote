package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
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
public abstract class bvc implements Cloneable {
    private static final Animator[] u = new Animator[0];
    private static final int[] v = {2, 1, 3, 4};
    private static final bum w = new buo();
    private static final ThreadLocal x = new ThreadLocal();
    public ArrayList i;
    public ArrayList j;
    public bus p;
    public long r;
    public buu s;
    long t;
    private buv[] z;
    private final String y = getClass().getName();
    public long a = -1;
    long b = -1;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public bvm e = new bvm();
    public bvm f = new bvm();
    bvk g = null;
    public final int[] h = v;
    final ArrayList k = new ArrayList();
    private Animator[] A = u;
    int l = 0;
    private boolean B = false;
    boolean m = false;
    public bvc n = null;
    private ArrayList C = null;
    public ArrayList o = new ArrayList();
    public bum q = w;

    private static boolean N(bvl bvlVar, bvl bvlVar2, String str) {
        Map map = bvlVar2.a;
        Object obj = bvlVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(bvm bvmVar, View view, bvl bvlVar) {
        bvmVar.a.put(view, bvlVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = bvmVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = ahj.a;
        String strF = ahc.f(view);
        if (strF != null) {
            we weVar = bvmVar.d;
            if (weVar.containsKey(strF)) {
                weVar.put(strF, null);
            } else {
                weVar.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                wr wrVar = bvmVar.c;
                if (wrVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wrVar.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wrVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wrVar.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            bvl bvlVar = new bvl(view);
            if (z) {
                c(bvlVar);
            } else {
                b(bvlVar);
            }
            bvlVar.c.add(this);
            o(bvlVar);
            if (z) {
                f(this.e, view, bvlVar);
            } else {
                f(this.f, view, bvlVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public static we h() {
        ThreadLocal threadLocal = x;
        we weVar = (we) threadLocal.get();
        if (weVar != null) {
            return weVar;
        }
        we weVar2 = new we();
        threadLocal.set(weVar2);
        return weVar2;
    }

    public void A(bum bumVar) {
        if (bumVar == null) {
            this.q = w;
        } else {
            this.q = bumVar;
        }
    }

    protected final void B() {
        if (this.l == 0) {
            t(this, bvb.a, false);
            this.m = false;
        }
        this.l++;
    }

    public boolean C() {
        return !this.k.isEmpty();
    }

    public boolean D(bvl bvlVar, bvl bvlVar2) {
        if (bvlVar != null && bvlVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (N(bvlVar, bvlVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = bvlVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (N(bvlVar, bvlVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean E(View view) {
        int id = view.getId();
        ArrayList arrayList = this.c;
        return (arrayList.size() == 0 && this.d.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.d.contains(view);
    }

    public final void F(buv buvVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(buvVar);
    }

    public void G(View view) {
        this.d.add(view);
    }

    public final void H(buv buvVar) {
        bvc bvcVar;
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(buvVar) && (bvcVar = this.n) != null) {
            bvcVar.H(buvVar);
        }
        if (this.C.size() == 0) {
            this.C = null;
        }
    }

    public void I(View view) {
        this.d.remove(view);
    }

    public void L(long j) {
        this.a = j;
    }

    public void M() {
        this.b = 0L;
    }

    public Animator a(ViewGroup viewGroup, bvl bvlVar, bvl bvlVar2) {
        return null;
    }

    public abstract void b(bvl bvlVar);

    public abstract void c(bvl bvlVar);

    public boolean d() {
        throw null;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bvc clone() {
        try {
            bvc bvcVar = (bvc) super.clone();
            bvcVar.o = new ArrayList();
            bvcVar.e = new bvm();
            bvcVar.f = new bvm();
            bvcVar.i = null;
            bvcVar.j = null;
            bvcVar.s = null;
            bvcVar.n = this;
            bvcVar.C = null;
            return bvcVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final bvc j() {
        bvk bvkVar = this.g;
        return bvkVar != null ? bvkVar.j() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.bvl) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.bvl k(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            bvk r0 = r5.g
            if (r0 == 0) goto L9
            bvl r6 = r0.k(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.i
            goto L10
        Le:
            java.util.ArrayList r0 = r5.j
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
            bvl r4 = (defpackage.bvl) r4
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
            java.util.ArrayList r6 = r5.j
            goto L36
        L34:
            java.util.ArrayList r6 = r5.i
        L36:
            java.lang.Object r6 = r6.get(r3)
            bvl r6 = (defpackage.bvl) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvc.k(android.view.View, boolean):bvl");
    }

    public final bvl l(View view, boolean z) {
        bvk bvkVar = this.g;
        if (bvkVar != null) {
            return bvkVar.l(view, z);
        }
        return (bvl) (z ? this.e : this.f).a.get(view);
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
        ArrayList arrayList = this.c;
        if (arrayList.size() > 0 || this.d.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.d;
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

    protected void n() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = u;
        while (true) {
            size--;
            if (size < 0) {
                this.A = animatorArr;
                t(this, bvb.c, false);
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
        ArrayList arrayList = this.c;
        if (arrayList.size() <= 0 && this.d.size() <= 0) {
            g(viewGroup, z);
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
                bvl bvlVar = new bvl(viewFindViewById);
                if (z) {
                    c(bvlVar);
                } else {
                    b(bvlVar);
                    z3 = false;
                }
                bvlVar.c.add(this);
                o(bvlVar);
                if (z3) {
                    f(this.e, viewFindViewById, bvlVar);
                } else {
                    f(this.f, viewFindViewById, bvlVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            bvl bvlVar2 = new bvl(view);
            if (z) {
                c(bvlVar2);
                z2 = true;
            } else {
                b(bvlVar2);
                z2 = false;
            }
            bvlVar2.c.add(this);
            o(bvlVar2);
            if (z2) {
                f(this.e, view, bvlVar2);
            } else {
                f(this.f, view, bvlVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            this.e.a.clear();
            this.e.b.clear();
            this.e.c.h();
        } else {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.h();
        }
    }

    public void r(ViewGroup viewGroup, bvm bvmVar, bvm bvmVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        bvl bvlVar;
        bvl bvlVar2;
        we weVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        buu buuVar = j().s;
        for (int i = 0; i < size; i++) {
            bvl bvlVar3 = (bvl) arrayList.get(i);
            bvl bvlVar4 = (bvl) arrayList2.get(i);
            if (bvlVar3 != null && !bvlVar3.c.contains(this)) {
                bvlVar3 = null;
            }
            if (bvlVar4 != null && !bvlVar4.c.contains(this)) {
                bvlVar4 = null;
            }
            if ((bvlVar3 != null || bvlVar4 != null) && (bvlVar3 == null || bvlVar4 == null || D(bvlVar3, bvlVar4))) {
                Animator animatorA = a(viewGroup, bvlVar3, bvlVar4);
                if (animatorA != null) {
                    if (bvlVar4 != null) {
                        view = bvlVar4.b;
                        String[] strArrE = e();
                        if (strArrE != null) {
                            bvl bvlVar5 = new bvl(view);
                            bvl bvlVar6 = (bvl) bvmVar2.a.get(view);
                            animator = animatorA;
                            if (bvlVar6 != null) {
                                int i2 = 0;
                                while (i2 < strArrE.length) {
                                    Map map = bvlVar5.a;
                                    String[] strArr = strArrE;
                                    String str = strArr[i2];
                                    map.put(str, bvlVar6.a.get(str));
                                    i2++;
                                    strArrE = strArr;
                                }
                            }
                            int i3 = weVarH.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    bvlVar2 = bvlVar5;
                                    break;
                                }
                                bur burVar = (bur) weVarH.get((Animator) weVarH.e(i4));
                                bvl bvlVar7 = burVar.c;
                                if (bvlVar7 != null && burVar.a == view && burVar.b.equals(this.y) && bvlVar7.equals(bvlVar5)) {
                                    bvlVar2 = bvlVar5;
                                    animator = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator = animatorA;
                            bvlVar2 = null;
                        }
                        bvlVar = bvlVar2;
                    } else {
                        animator = animatorA;
                        view = bvlVar3.b;
                        bvlVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        bur burVar2 = new bur(view2, this.y, this, viewGroup.getWindowId(), bvlVar, animator2);
                        if (buuVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        weVarH.put(animator2, burVar2);
                        this.o.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                bur burVar3 = (bur) weVarH.get((Animator) this.o.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                Animator animator3 = burVar3.f;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    protected final void s() {
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            t(this, bvb.b, false);
            for (int i2 = 0; i2 < this.e.c.c(); i2++) {
                View view = (View) this.e.c.g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.f.c.c(); i3++) {
                View view2 = (View) this.f.c.g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.m = true;
        }
    }

    public final void t(bvc bvcVar, bvb bvbVar, boolean z) {
        bvc bvcVar2 = this.n;
        if (bvcVar2 != null) {
            bvcVar2.t(bvcVar, bvbVar, z);
        }
        ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.C.size();
        buv[] buvVarArr = this.z;
        if (buvVarArr == null) {
            buvVarArr = new buv[size];
        }
        this.z = null;
        buv[] buvVarArr2 = (buv[]) this.C.toArray(buvVarArr);
        for (int i = 0; i < size; i++) {
            bvbVar.a(buvVarArr2[i], bvcVar);
            buvVarArr2[i] = null;
        }
        this.z = buvVarArr2;
    }

    public final String toString() {
        return m("");
    }

    public void u(View view) {
        if (this.m) {
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = u;
        while (true) {
            size--;
            if (size < 0) {
                this.A = animatorArr;
                t(this, bvb.d, false);
                this.B = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void v() {
        we weVarH = h();
        this.r = 0L;
        for (int i = 0; i < this.o.size(); i++) {
            Animator animator = (Animator) this.o.get(i);
            bur burVar = (bur) weVarH.get(animator);
            if (animator != null && burVar != null) {
                if (this.b >= 0) {
                    burVar.f.setDuration(0L);
                }
                long j = this.a;
                if (j >= 0) {
                    Animator animator2 = burVar.f;
                    animator2.setStartDelay(j + animator2.getStartDelay());
                }
                this.k.add(animator);
                this.r = Math.max(this.r, animator.getTotalDuration());
            }
        }
        this.o.clear();
    }

    public void w(View view) {
        if (this.B) {
            if (!this.m) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
                this.A = u;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.A = animatorArr;
                t(this, bvb.e, false);
            }
            this.B = false;
        }
    }

    protected void x() {
        B();
        we weVarH = h();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (weVarH.containsKey(animator)) {
                B();
                if (animator != null) {
                    animator.addListener(new bup(this, weVarH));
                    if (this.b >= 0) {
                        animator.setDuration(0L);
                    }
                    long j = this.a;
                    if (j >= 0) {
                        animator.setStartDelay(j + animator.getStartDelay());
                    }
                    animator.addListener(new buq(this));
                    animator.start();
                }
            }
        }
        this.o.clear();
        s();
    }

    public void y(long j, long j2) {
        long j3 = this.r;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.m = false;
            t(this, bvb.a, z);
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = u;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.A = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.m = true;
        }
        t(this, bvb.b, z);
    }

    public void z(bus busVar) {
        this.p = busVar;
    }

    public void J() {
    }

    public void K() {
    }

    public void o(bvl bvlVar) {
    }
}
