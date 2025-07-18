package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.common.collect.Lists;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msh {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;
    public int j;
    public final int l;
    public final msg e = new msg();
    public final List f = new ArrayList();
    public int g = -1;
    public int h = -1;
    public int k = -1;
    public pg i = null;

    public msh(msd msdVar) {
        this.d = false;
        this.j = 1;
        this.j = msdVar.a;
        this.a = msdVar.c;
        this.b = msdVar.b;
        this.l = msdVar.e;
        this.c = msdVar.d;
        this.d = false;
    }

    private final View h(int i, msl mslVar, ql qlVar, FlowLayoutManager flowLayoutManager) {
        mslVar.d = i;
        View viewP = qlVar.p(i);
        flowLayoutManager.aL(viewP, -1, false);
        flowLayoutManager.by(viewP, 0);
        return viewP;
    }

    private final void i(msi msiVar) {
        msf msfVarB = b(msiVar.a);
        if (msfVarB != null) {
            msiVar.a = ((mse) msfVarB.e.get(0)).a;
        }
    }

    private final void j(msi msiVar) {
        msf msfVarB = b(msiVar.a);
        if (msfVarB != null) {
            msiVar.a = ((mse) zag.e(msfVarB.e)).a;
        } else {
            Log.d("FlowLayoutHelper", "No Layout");
        }
    }

    public final int a(qd qdVar) {
        int paddingLeft;
        int paddingRight;
        if (this.j == 0) {
            paddingLeft = qdVar.I - qdVar.getPaddingTop();
            paddingRight = qdVar.getPaddingBottom();
        } else {
            paddingLeft = qdVar.H - qdVar.getPaddingLeft();
            paddingRight = qdVar.getPaddingRight();
        }
        return paddingLeft - paddingRight;
    }

    public final msf b(int i) {
        return (msf) this.e.e.get(Integer.valueOf(i));
    }

    public final void c(FlowLayoutManager flowLayoutManager, ql qlVar, qs qsVar, boolean z) {
        int iA;
        int i;
        msf msfVar;
        FlowLayoutManager flowLayoutManager2;
        boolean z2;
        msf msfVar2;
        if (this.k >= 0 && this.k < (iA = qsVar.a()) && iA != 0) {
            msl mslVar = new msl();
            msf msfVar3 = new msf(this);
            if (this.j == 0 && z) {
                mslVar.f = -1;
            } else {
                mslVar.f = 1;
            }
            msf msfVar4 = msfVar3;
            int i2 = 0;
            while (true) {
                i = this.k;
                if (i2 > i) {
                    break;
                }
                if (this.e.e.containsKey(Integer.valueOf(i2))) {
                    flowLayoutManager2 = flowLayoutManager;
                    z2 = z;
                    msfVar2 = msfVar4;
                    msfVar4 = msfVar2;
                } else {
                    try {
                        View viewH = h(i2, mslVar, qlVar, flowLayoutManager);
                        flowLayoutManager2 = flowLayoutManager;
                        z2 = z;
                        try {
                            if (!msfVar4.c(viewH, i2, flowLayoutManager2, mslVar, z2)) {
                                msfVar4.b(mslVar, flowLayoutManager2, z2, false);
                                msfVar2 = msfVar4;
                                try {
                                    msfVar4 = new msf(this);
                                    try {
                                        msfVar4.c(viewH, i2, flowLayoutManager2, mslVar, z2);
                                    } catch (IndexOutOfBoundsException unused) {
                                    }
                                } catch (IndexOutOfBoundsException unused2) {
                                }
                            }
                            flowLayoutManager2.aO(viewH, qlVar);
                        } catch (IndexOutOfBoundsException unused3) {
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                i2++;
                flowLayoutManager = flowLayoutManager2;
                z = z2;
            }
            FlowLayoutManager flowLayoutManager3 = flowLayoutManager;
            boolean z3 = z;
            msf msfVar5 = msfVar4;
            int i3 = i + 1;
            while (true) {
                if (i3 >= iA) {
                    msfVar = msfVar5;
                    break;
                }
                if (this.e.e.containsKey(Integer.valueOf(i3))) {
                    msfVar = msfVar5;
                } else {
                    View viewH2 = h(i3, mslVar, qlVar, flowLayoutManager3);
                    msfVar = msfVar5;
                    if (!msfVar.c(viewH2, i3, flowLayoutManager3, mslVar, z3)) {
                        flowLayoutManager3.aO(viewH2, qlVar);
                        break;
                    }
                    flowLayoutManager3.aO(viewH2, qlVar);
                }
                i3++;
                msfVar5 = msfVar;
            }
            msfVar.b(mslVar, flowLayoutManager3, z3, true);
            this.k = -1;
        }
    }

    public final void d(final int i) {
        Predicate predicate = new Predicate() { // from class: msc
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((msg) obj).a >= i;
            }
        };
        List list = this.f;
        Collection.EL.removeIf(list, predicate);
        for (int size = list.size() - 1; size >= 0; size--) {
            msg msgVar = (msg) list.get(size);
            if (msgVar.e.get(Integer.valueOf(i)) == null) {
                List list2 = msgVar.d;
                if (list2.isEmpty()) {
                    msgVar.c = 0;
                } else {
                    msf msfVar = (msf) zag.e(list2);
                    if (msfVar.a() == i - 1) {
                        msgVar.c = ((mse) msfVar.e.get(0)).a;
                        msgVar.b = -1;
                        msgVar.a(msfVar);
                    }
                }
            } else {
                ArrayList arrayList = new ArrayList();
                List list3 = msgVar.d;
                boolean z = false;
                for (msf msfVar2 : Lists.b(list3)) {
                    ArrayList arrayList2 = msfVar2.e;
                    if (!arrayList2.isEmpty()) {
                        if (((mse) arrayList2.get(0)).a >= i) {
                            arrayList.add(msfVar2);
                        } else if (((mse) arrayList2.get(0)).a < i && msfVar2.a() >= i) {
                            arrayList.add(msfVar2);
                        }
                        z = true;
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    msgVar.a((msf) arrayList.get(i2));
                }
                if (z) {
                    msgVar.c = list3.isEmpty() ? 0 : ((msf) zag.e(list3)).a() + 1;
                    msgVar.b = -1;
                }
            }
        }
    }

    public final void e() {
        HashMap map = new HashMap();
        msg msgVar = this.e;
        msgVar.e = map;
        msgVar.a = -1;
        msgVar.b = -1;
        msgVar.c = -1;
        msgVar.d.clear();
    }

    public final int f(View view, int i, qs qsVar, msl mslVar) {
        int i2;
        int iB;
        int iB2;
        msf msfVarB = b(i);
        if (msfVarB == null) {
            return 0;
        }
        ArrayList arrayList = msfVarB.e;
        yqw.L(!arrayList.isEmpty());
        int i3 = ((mse) arrayList.get(0)).a;
        int i4 = ((mse) zag.e(arrayList)).a == qsVar.a() + (-1) ? 0 : this.a;
        int i5 = (this.j != 1 && mslVar.f == 1 && mslVar.e == -1 && i3 == 0) ? 0 : i4;
        pg pgVar = this.i;
        pgVar.getClass();
        int i6 = this.l;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 1) {
            if (mslVar.f != -1) {
                i2 = msfVarB.a - i4;
                iB = pgVar.b(view);
                iB2 = i2 - iB;
            }
            return i4;
        }
        if (i7 == 2) {
            if (mslVar.f == -1) {
                i2 = msfVarB.a - i4;
                iB = pgVar.b(view);
                iB2 = i2 - iB;
            }
            return i4;
        }
        iB2 = ((msfVarB.a - i4) - pgVar.b(view)) / 2;
        return iB2 + i5;
    }

    public final void g(msi msiVar, boolean z) {
        if (msiVar.c) {
            if (z) {
                i(msiVar);
                return;
            } else {
                j(msiVar);
                return;
            }
        }
        if (z) {
            j(msiVar);
        } else {
            i(msiVar);
        }
    }
}
