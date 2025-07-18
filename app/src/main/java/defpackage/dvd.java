package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvd implements enf, enb, elt {
    public static final /* synthetic */ int P = 0;
    private static final AtomicInteger Q = new AtomicInteger(1);
    public final int A;
    public boolean B;
    public AccessibilityManager C;
    public dxy E;
    public volatile boolean F;
    public dzq H;
    public List I;
    final boolean J;
    final boolean K;
    final Map L;
    public boolean M;
    public boolean N;
    public dsz O;
    private dvf W;
    private int X;
    private int Y;
    public List a;
    private dyv ab;
    private dxa ac;
    private List af;
    public final dru b;
    public final drq c;
    public int d;
    public int e;
    public final dve f;
    public final List h;
    public final Map l;
    public final List m;
    dvs n;
    dvs o;
    dvk p;
    dyv q;
    String r;
    public int s;
    public int t;
    int y;
    public final int z;
    private final Map R = new HashMap();
    private final Map S = new HashMap();
    public final List g = new ArrayList(8);
    private final wr T = new wr(8);
    public final Map i = new LinkedHashMap(8);
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    private final wr U = new wr(8);
    private final Set V = new HashSet(4);
    public int u = 0;
    private long Z = -1;
    private int aa = -1;
    public boolean v = true;
    public boolean w = false;
    public int x = -1;
    public boolean D = false;
    private final Map ad = new LinkedHashMap();
    private final Set ae = new HashSet();
    public volatile boolean G = true;

    public dvd(dru druVar, drq drqVar, dxy dxyVar, dsl dslVar, dvd dvdVar, dsz dszVar) {
        boolean z = ebc.a;
        this.J = false;
        this.K = false;
        HashMap map = new HashMap();
        this.L = map;
        this.b = druVar;
        this.c = drqVar;
        int andIncrement = Q.getAndIncrement();
        this.z = andIncrement;
        int i = dvdVar != null ? dvdVar.z : -1;
        this.A = i;
        this.E = dxyVar;
        this.m = ebc.a ? new ArrayList(8) : null;
        this.l = new HashMap();
        this.a = new ArrayList();
        this.h = new ArrayList(8);
        map.put("layoutId", Integer.valueOf(andIncrement));
        map.put("previousLayoutId", Integer.valueOf(i));
        this.f = new dve(this, dxyVar, druVar.h, dslVar, dszVar);
    }

    private static eme C(dvu dvuVar, dvd dvdVar, dvk dvkVar, boolean z, Object obj, eme emeVar) {
        int i;
        int i2;
        if (emeVar != null) {
            i = emeVar.f;
            i2 = emeVar.e;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = dvdVar.X - i2;
        eoe eoeVar = dvkVar.e;
        int iC = (int) eoeVar.c();
        int i4 = dvdVar.Y - i;
        int iD = (int) eoeVar.d();
        int iB = (int) eoeVar.b();
        int iE = i4 + iD;
        int iA = ((int) eoeVar.a()) + iE;
        int iC2 = i3 + iC;
        int iD2 = iB + iC2;
        if (z) {
            Map map = drq.g;
            if (!dvu.b(dvuVar)) {
                iC2 += dvkVar.c();
                iE += dvkVar.e();
                iD2 -= dvkVar.d();
                iA -= dvkVar.b();
            }
        }
        Rect rect = new Rect(iC2, iE, iD2, iA);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i5 = dvdVar.z;
        int i6 = dvdVar.A;
        return dxi.a(dvuVar, rect, new dvj(iWidth, iHeight, obj), emeVar);
    }

    private static void D(dvd dvdVar, dru druVar) {
        dyv dyvVar;
        String string;
        Object obj;
        dxa dxaVar = dvdVar.ac;
        if (dxaVar == null || dxaVar.b == 0 || (dyvVar = dvdVar.ab) == null) {
            return;
        }
        if (dyvVar.a == 3) {
            Set set = dvdVar.ae;
            if (!set.contains(dyvVar)) {
                Map map = dvdVar.ad;
                if (map.put(dyvVar, dxaVar) != null) {
                    map.remove(dyvVar);
                    set.add(dyvVar);
                }
            }
        } else if (dvdVar.ad.put(dyvVar, dxaVar) != null) {
            String string2 = dyvVar.toString();
            dvs dvsVar = dvdVar.n;
            if (dvsVar == null) {
                string = "null";
            } else {
                StringBuilder sb = new StringBuilder();
                LinkedList linkedList = new LinkedList();
                linkedList.addLast(null);
                linkedList.addLast(dvsVar);
                int i = 0;
                while (!linkedList.isEmpty()) {
                    dvs dvsVar2 = (dvs) linkedList.removeLast();
                    if (dvsVar2 == null) {
                        i--;
                    } else {
                        drq drqVarD = dvsVar2.d();
                        if (dvsVar2 != dvsVar) {
                            int i2 = i - 1;
                            sb.append('\n');
                            Iterator it = linkedList.iterator();
                            it.next();
                            it.next();
                            for (int i3 = 0; i3 < i2; i3++) {
                                if (it.next() != null) {
                                    while (it.next() != null) {
                                    }
                                    obj = "│";
                                } else {
                                    obj = ' ';
                                }
                                sb.append(obj);
                                sb.append(' ');
                            }
                            sb.append(linkedList.getLast() == null ? "└╴" : "├╴");
                        }
                        sb.append(drqVarD.d());
                        if (drqVarD.m || dvsVar2.I() || dvsVar2.w != null) {
                            sb.append('[');
                            if (drqVarD.m) {
                                sb.append("manual.key=\"");
                                sb.append(drqVarD.B());
                                sb.append("\";");
                            }
                            if (dvsVar2.I()) {
                                sb.append("trans.key=\"");
                                sb.append(dvsVar2.q);
                                sb.append("\";");
                            }
                            if (dvsVar2.w != null) {
                                sb.append("test.key=\"");
                                sb.append(dvsVar2.w);
                                sb.append("\";");
                            }
                            sb.append(']');
                        }
                        if (dvsVar2.a() != 0) {
                            linkedList.addLast(null);
                            int iA = dvsVar2.a();
                            while (true) {
                                iA--;
                                if (iA < 0) {
                                    break;
                                } else {
                                    linkedList.addLast(dvsVar2.h(iA));
                                }
                            }
                            i++;
                        }
                    }
                }
                string = sb.toString();
            }
            dsr.c(3, a.s(string, string2, "The transitionId '", "' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n"), eev.a(druVar));
        }
        dvdVar.ac = null;
        dvdVar.ab = null;
    }

    private static void E(dvd dvdVar, eme emeVar, dvu dvuVar, duz duzVar, int i, dyv dyvVar, eme emeVar2) {
        if (emeVar2 != null) {
            if (emeVar2.h == null) {
                emeVar2.h = new ArrayList(4);
            }
            emeVar2.h.add(emeVar);
        }
        drq drqVar = duzVar.c;
        if (drqVar.W() && duzVar.a() && emeVar2 != null) {
            ((duk) ((dvu) emeVar2.b).b.c).b = true;
        }
        List list = dvdVar.g;
        int size = list.size();
        Rect rect = new Rect();
        emeVar.b(rect);
        emh emhVar = emeVar.b;
        emp empVar = new emp(size, rect, emeVar2 != null ? (emp) dvdVar.i.get(Long.valueOf(((dvu) emeVar2.b).a)) : null);
        long j = ((dvu) emhVar).a;
        list.add(emeVar);
        Map map = dvdVar.i;
        Long lValueOf = Long.valueOf(j);
        map.put(lValueOf, empVar);
        dvdVar.j.add(empVar);
        dvdVar.k.add(empVar);
        if (drqVar.R()) {
            dvdVar.V.add(lValueOf);
        }
        long j2 = dvuVar.a;
        dvi dviVar = new dvi(j2, rect, i, dvuVar.b.a, dyvVar);
        dvdVar.U.i(j, dviVar);
        dvdVar.T.i(j2, Integer.valueOf(size));
        dxa dxaVar = dvdVar.ac;
        if (dxaVar != null) {
            dxaVar.c(i, dviVar);
        }
    }

    private final boolean F(dvk dvkVar) {
        dvk dvkVar2 = this.p;
        return dvkVar2 instanceof dwo ? dvkVar == ((dwo) dvkVar2).n : dvkVar == dvkVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [duv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [duv, java.lang.Object] */
    private static void G(dru druVar, dvk dvkVar, dvs dvsVar, dvd dvdVar, eme emeVar, dsz dszVar) {
        dsz dszVar2;
        dru druVar2;
        boolean z;
        duk dukVar;
        long jD;
        int i;
        dsz dszVar3;
        dve dveVar;
        int i2;
        dvu dvuVar;
        dxa dxaVar;
        dyv dyvVar;
        boolean z2;
        dvd dvdVar2;
        dvk dvkVar2;
        int i3;
        eme emeVar2;
        eme emeVar3;
        dvk dvkVar3;
        boolean z3;
        int i4;
        long j;
        dvu dvuVar2;
        dvu dvuVar3;
        dvd dvdVar3;
        eme emeVar4;
        dvk dvkVar4;
        eme emeVarC;
        eme emeVar5;
        boolean z4;
        dvu dvuVarA;
        dvd dvdVar4;
        dvk dvkVar5;
        boolean z5;
        dsz dszVar4;
        Rect rect;
        List list;
        ArrayList arrayList;
        dvk dvkVar6 = dvkVar;
        dve dveVar2 = dvdVar.f;
        dveVar2.getClass();
        if (dveVar2.c()) {
            return;
        }
        drq drqVarD = dvsVar.d();
        List list2 = dvsVar.b;
        boolean z6 = ebc.a;
        ArrayList arrayList2 = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((dxo) it.next()).a);
        }
        boolean z7 = true;
        if (dvkVar6 instanceof dwo) {
            dru druVar3 = dvsVar.b() == 1 ? druVar : dvsVar.k(1).b;
            eoe eoeVar = dvkVar6.e;
            dvk dvkVarB = duy.b(dveVar2, druVar3, (dwo) dvkVar6, View.MeasureSpec.makeMeasureSpec((int) eoeVar.b(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) eoeVar.a(), 1073741824));
            if (dvkVarB != null) {
                dvdVar.X += (int) eoeVar.c();
                dvdVar.Y += (int) eoeVar.d();
                G(druVar, dvkVarB, dvkVarB.j(), dvdVar, emeVar, dszVar);
                dvdVar.X -= (int) eoeVar.c();
                dvdVar.Y -= (int) eoeVar.d();
                return;
            }
            return;
        }
        dxo dxoVarL = dvsVar.l();
        dru druVar4 = dxoVarL.b;
        if (dvdVar.w) {
            dsz dszVar5 = new dsz();
            drq drqVar = dxoVarL.a;
            druVar4.i();
            dszVar5.d = drqVar;
            dszVar5.j = dxoVarL;
            if (dszVar != null) {
                dszVar.i.add(dszVar5);
            }
            if (dszVar == null) {
                dvdVar.O = dszVar5;
            }
            dszVar2 = dszVar5;
        } else {
            dszVar2 = null;
        }
        dru druVar5 = dvkVar6.b;
        dve dveVar3 = dvkVar6.a;
        dvd dvdVar5 = dveVar3.b;
        dvdVar5.getClass();
        dvs dvsVarJ = dvkVar6.j();
        dvk dvkVar7 = dvkVar6.f;
        byte b = dvkVar7 == null || ((dvkVar7 instanceof dwo) && dvkVar7.f == null);
        if (b == true || duw.b(dvkVar6, dvdVar5)) {
            duk dukVar2 = new duk();
            List list3 = dvsVarJ.b;
            SparseArray sparseArray = new SparseArray();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                SparseArray sparseArrayI = ((dxo) it2.next()).a.i();
                if (sparseArrayI != null) {
                    dru druVar6 = druVar5;
                    boolean z8 = z7;
                    int i5 = 0;
                    while (i5 < sparseArrayI.size()) {
                        int iKeyAt = sparseArrayI.keyAt(i5);
                        dve dveVar4 = dveVar3;
                        dtl dtlVar = (dtl) sparseArrayI.get(iKeyAt);
                        if (dtlVar != null) {
                            sparseArray.append(iKeyAt, dtlVar);
                        }
                        i5++;
                        dveVar3 = dveVar4;
                    }
                    z7 = z8;
                    druVar5 = druVar6;
                }
            }
            druVar2 = druVar5;
            dve dveVar5 = dveVar3;
            z = z7;
            dukVar2.a = sparseArray;
            if (b == true) {
                dukVar = dukVar2;
                jD = 0;
                i = 2;
            } else {
                dukVar = dukVar2;
                jD = dvdVar5.d(dukVar, dvsVarJ.q(), dvdVar5.u, 3, -1L);
                i = 0;
            }
            dszVar3 = dszVar2;
            dveVar = dveVar5;
            i2 = 2;
            dvu dvuVarC = duw.c(jD, dukVar, null, dvkVar6, dvsVarJ, dvsVarJ.D, i, false, false, true);
            dvkVar6 = dvkVar6;
            dvuVar = dvuVarC;
        } else {
            druVar2 = druVar5;
            dszVar3 = dszVar2;
            z = true;
            i2 = 2;
            dvuVar = null;
            dveVar = dveVar3;
        }
        boolean z9 = dvuVar != null ? z : false;
        long j2 = dvdVar.Z;
        int i6 = dvdVar.aa;
        dyv dyvVar2 = dvdVar.ab;
        dxa dxaVar2 = dvdVar.ac;
        dyv dyvVarH = h(dvsVar);
        dvdVar.ab = dyvVarH;
        dvdVar.ac = dyvVarH != null ? new dxa() : null;
        if (dvuVar == null) {
            dxaVar = dxaVar2;
            dyvVar = dyvVar2;
            z2 = z9;
            dvdVar2 = dvdVar;
            dvkVar2 = dvkVar6;
            i3 = i6;
            emeVar2 = emeVar;
        } else {
            if (dvk.n(dvkVar6) && !dvdVar.F(dvkVar6)) {
                throw new IllegalArgumentException("We shouldn't insert a host as a parent of a View");
            }
            dvdVar2 = dvdVar;
            dyvVar = dyvVar2;
            z2 = z9;
            dxaVar = dxaVar2;
            dvkVar2 = dvkVar;
            i3 = i6;
            E(dvdVar2, C(dvuVar, dvdVar2, dvkVar6, false, null, emeVar), dvuVar, dvuVar.b, 3, dvdVar2.ab, emeVar);
            List list4 = dvdVar2.g;
            int size = list4.size() - 1;
            D(dvdVar2, druVar4);
            eme emeVar6 = (eme) list4.get(size);
            dvdVar2.u++;
            dvdVar2.Z = ((dvu) emeVar6.b).a;
            dvdVar2.aa = size;
            emeVar2 = emeVar6;
        }
        boolean z10 = dvdVar2.v;
        dvdVar2.v = (z2 || dvdVar2.F(dvkVar2)) ? z : false;
        boolean z11 = dvdVar2.K;
        dvkVar2.j();
        Drawable drawable = dvkVar2.c.m;
        dvu dvuVarA2 = (drawable == null || dvk.n(dvkVar2)) ? null : duw.a(dvkVar2, drawable, z ? 1 : 0);
        if (dvuVarA2 != null) {
            dvd dvdVar6 = dvdVar2;
            eme emeVar7 = emeVar2;
            dvkVar3 = dvkVar2;
            eme emeVarH = H(dvuVarA2, emeVar7, dvkVar3, dvdVar6, 1, z2);
            emeVar3 = emeVar7;
            if (dszVar3 != null) {
                dszVar3.b = (dvu) emeVarH.b;
            }
        } else {
            emeVar3 = emeVar2;
            dvkVar3 = dvkVar2;
        }
        dvs dvsVarJ2 = dvkVar3.j();
        drq drqVarD2 = dvsVarJ2.d();
        if (drqVarD2.ah() == 1) {
            z3 = z10;
            i4 = i3;
            dvuVar2 = null;
            j = j2;
        } else {
            String strQ = dvsVarJ2.q();
            dvd dvdVar7 = dveVar.b;
            dvdVar7.getClass();
            dsz dszVar6 = dvkVar3.m;
            long j3 = -1;
            if (dszVar6 != null && (dvuVar3 = dszVar6.a) != null) {
                j3 = dvuVar3.a;
            }
            long j4 = j3;
            long jD2 = dvdVar7.d(drqVarD2, strQ, dvdVar7.u, 0, j4);
            z3 = z10;
            i4 = i3;
            j = j2;
            dvk dvkVar8 = dvkVar3;
            dvu dvuVarC2 = duw.c(jD2, drqVarD2, druVar2, dvkVar8, dvsVarJ2, dvsVarJ2.D, j4 != jD2 ? 0 : dvkVar3.g ? 1 : i2, dvdVar7.v, duw.b(dvkVar3, dvdVar7), dvk.n(dvkVar3));
            dvkVar3 = dvkVar8;
            dvuVar2 = dvuVarC2;
        }
        if (dvuVar2 == null) {
            dvdVar3 = dvdVar;
            dvkVar4 = dvkVar3;
            emeVar4 = emeVar3;
            emeVarC = null;
        } else {
            dvsVar.d();
            dvdVar3 = dvdVar;
            emeVar4 = emeVar3;
            dvkVar4 = dvkVar3;
            emeVarC = C(dvuVar2, dvdVar3, dvkVar3, true, dvkVar3.l, emeVar4);
        }
        if (emeVarC != null) {
            Object obj = emeVarC.c;
            try {
                if (drq.ac(drqVarD)) {
                    drqVarD.I(druVar4, dvkVar4, ((dvj) obj).c);
                }
            } catch (Exception e) {
                dsq.e(druVar4, drqVarD, e);
            }
            boolean z12 = dszVar3 == null;
            dyv dyvVar3 = !z2 ? dvdVar3.ab : null;
            dvu dvuVar4 = (dvu) emeVarC.b;
            eme emeVar8 = emeVar4;
            E(dvdVar3, emeVarC, dvuVar4, dvuVar4.b, 0, dyvVar3, emeVar8);
            emeVar4 = emeVar8;
            emeVar5 = emeVarC;
            if (dszVar3 != null) {
                dszVar3.a = dvuVar4;
            }
            z4 = z12;
        } else {
            emeVar5 = emeVarC;
            z4 = dszVar3 == null;
        }
        if (duy.f(druVar4) && (arrayList = dvsVar.t) != null) {
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                dyt dytVar = (dyt) arrayList.get(i7);
                if (dvdVar3.af == null) {
                    dvdVar3.af = new ArrayList();
                }
                ena.a(dytVar, dvdVar3.af, dvdVar3.r);
                i7++;
                arrayList = arrayList;
            }
        }
        int i8 = dvdVar3.X;
        eoe eoeVar2 = dvkVar4.e;
        dvdVar3.X = i8 + ((int) eoeVar2.c());
        dvdVar3.Y += (int) eoeVar2.d();
        int iH = dvkVar4.h();
        int i9 = 0;
        while (i9 < iH) {
            eoe eoeVar3 = eoeVar2;
            dvk dvkVarI = dvkVar4.i(i9);
            dvd dvdVar8 = dvdVar3;
            dru druVar7 = druVar4;
            dsz dszVar7 = dszVar3;
            G(druVar7, dvkVarI, dvkVarI.j(), dvdVar8, emeVar4, dszVar7);
            dvdVar3 = dvdVar8;
            i9++;
            eoeVar2 = eoeVar3;
            dszVar3 = dszVar7;
            druVar4 = druVar7;
        }
        dsz dszVar8 = dszVar3;
        dru druVar8 = druVar4;
        eoe eoeVar4 = eoeVar2;
        dvdVar3.X -= (int) eoeVar4.c();
        dvdVar3.Y -= (int) eoeVar4.d();
        dru druVar9 = dvkVar4.b;
        if (!dvkVar4.m()) {
            dvuVarA = null;
        } else {
            if (!dvkVar4.m()) {
                throw new RuntimeException("This result does not support drawing border color");
            }
            dvs dvsVarJ3 = dvkVar4.j();
            eny enyVarE = eoeVar4.e();
            if (enyVarE == eny.INHERIT) {
                throw new IllegalStateException("Direction cannot be resolved before layout calculation");
            }
            boolean z13 = enyVarE == eny.RTL;
            float[] fArr = dvsVarJ3.e;
            int[] iArr = dvsVarJ3.d;
            int i10 = z13 ? 3 : 1;
            int i11 = true != z13 ? 3 : 1;
            ebw ebwVar = new ebw();
            ebwVar.i = null;
            ebwVar.e = iArr[dre.b(i10)];
            ebwVar.f = iArr[dre.b(i2)];
            ebwVar.g = iArr[dre.b(i11)];
            ebwVar.h = iArr[dre.b(4)];
            ebwVar.a = dvkVar4.p(i10);
            ebwVar.b = dvkVar4.p(i2);
            ebwVar.c = dvkVar4.p(i11);
            ebwVar.d = dvkVar4.p(4);
            ebwVar.j = Arrays.copyOf(fArr, 4);
            dvuVarA = duw.a(dvkVar4, new ebx(ebwVar), 4);
        }
        if (dvuVarA != null) {
            eme emeVar9 = emeVar4;
            dvkVar5 = dvkVar4;
            dszVar4 = dszVar8;
            eme emeVarH2 = H(dvuVarA, emeVar9, dvkVar5, dvdVar, 4, z2);
            z5 = true;
            emeVar4 = emeVar9;
            dvdVar4 = dvdVar;
            if (true != z4) {
                dszVar4.c = (dvu) emeVarH2.b;
            }
        } else {
            dvdVar4 = dvdVar;
            dvkVar5 = dvkVar4;
            z5 = true;
            dszVar4 = dszVar8;
        }
        boolean z14 = dvdVar4.K;
        dvkVar5.j();
        if (z5 != z4) {
            dszVar4.g = dvkVar5.h;
            dszVar4.h = dvkVar5.i;
            dszVar4.e = dvkVar5.j;
            dszVar4.f = dvkVar5.k;
            dszVar4.k = dvkVar5.l;
            dvkVar5.j();
        }
        if (dvsVar.g != null || dvsVar.h != null || dvsVar.i != null || dvsVar.j != null || dvsVar.k != null || dvsVar.l != null) {
            eme emeVar10 = emeVar5 != null ? emeVar5 : !z2 ? null : emeVar4;
            int iC = dvdVar4.X + ((int) eoeVar4.c());
            int iD = dvdVar4.Y + ((int) eoeVar4.d());
            int iB = (int) eoeVar4.b();
            int iA = (int) eoeVar4.a();
            dtu dtuVar = dvsVar.g;
            dtu dtuVar2 = dvsVar.h;
            dtu dtuVar3 = dvsVar.i;
            dtu dtuVar4 = dvsVar.j;
            dtu dtuVar5 = dvsVar.k;
            dtu dtuVar6 = dvsVar.l;
            drq drqVarD3 = dvsVar.d();
            dvdVar4.h.add(new enj(dvsVar.q(), drqVarD3 != null ? drqVarD3.d() : "Unknown", new Rect(iC, iD, iC + iB, iA + iD), emeVar10 != null, emeVar10 != null ? ((dvu) emeVar10.b).a : 0L, dtuVar, dtuVar5, dtuVar2, dtuVar3, dtuVar4, dtuVar6));
        }
        List list5 = dvdVar4.m;
        if (list5 != null && !TextUtils.isEmpty(dvsVar.w)) {
            emh emhVar = emeVar5 != null ? emeVar5.b : null;
            int iC2 = dvdVar4.X + ((int) eoeVar4.c());
            int iD2 = dvdVar4.Y + ((int) eoeVar4.d());
            int iB2 = (int) eoeVar4.b();
            int iA2 = (int) eoeVar4.a();
            dya dyaVar = new dya();
            emh emhVar2 = emhVar;
            String str = dvsVar.w;
            str.getClass();
            dyaVar.a = str;
            dyaVar.d.set(iC2, iD2, iB2 + iC2, iA2 + iD2);
            dyaVar.b = dvdVar4.Z;
            if (emhVar2 != null) {
                dyaVar.c = ((dvu) emhVar2).a;
            }
            list5.add(dyaVar);
        }
        ArrayList arrayList3 = dvsVar.u;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (dvdVar4.H == null) {
                dvdVar4.H = new dzq();
            }
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                dzp dzpVar = (dzp) arrayList3.get(i12);
                if (drqVarD instanceof dxv) {
                    dzq dzqVar = dvdVar4.H;
                    String str2 = dzpVar.a;
                    dzqVar.a(dzpVar.c, dzpVar.b, dvkVar5.l);
                } else {
                    dzq dzqVar2 = dvdVar4.H;
                    String str3 = dzpVar.a;
                    dzqVar2.a(dzpVar.c, dzpVar.b, null);
                }
            }
        }
        ArrayList arrayList4 = dvkVar5.j().v;
        if (arrayList4 != null) {
            if (dvdVar4.I == null) {
                dvdVar4.I = new ArrayList();
            }
            dvdVar4.I.addAll(arrayList4);
        }
        if (emeVar5 != null) {
            rect = new Rect();
            emeVar5.b(rect);
        } else {
            rect = new Rect();
            rect.left = dvdVar4.X + ((int) eoeVar4.c());
            rect.top = dvdVar4.Y + ((int) eoeVar4.d());
            rect.right = rect.left + ((int) eoeVar4.b());
            rect.bottom = rect.top + ((int) eoeVar4.a());
        }
        int iB3 = dvsVar.b();
        for (int i13 = 0; i13 < iB3; i13++) {
            drq drqVar2 = dvsVar.k(i13).a;
            String strI = dvsVar.k(i13).b.i();
            dru druVar10 = dvsVar.k(i13).b;
            if (druVar10.h != null && (list = dvdVar4.a) != null) {
                dxo dxoVar = druVar10.j;
                dxoVar.getClass();
                list.add(dxoVar);
            }
            if (strI != null || drqVar2.T()) {
                Rect rect2 = new Rect(rect);
                if (strI != null) {
                    dvdVar4.R.put(strI, rect2);
                }
                if (drqVar2.T()) {
                    dvdVar4.S.put(drqVar2.n, rect2);
                }
            }
        }
        if (dvdVar4.Z != j) {
            dvdVar4.Z = j;
            dvdVar4.aa = i4;
            dvdVar4.u--;
        }
        dvdVar4.v = z3;
        D(dvdVar4, druVar8);
        dvdVar4.ab = dyvVar;
        dvdVar4.ac = dxaVar;
    }

    private static eme H(dvu dvuVar, eme emeVar, dvk dvkVar, dvd dvdVar, int i, boolean z) {
        eme emeVarC = C(dvuVar, dvdVar, dvkVar, false, null, emeVar);
        emh emhVar = emeVarC.b;
        dvu dvuVar2 = (dvu) emhVar;
        E(dvdVar, emeVarC, dvuVar2, dvuVar2.b, i, !z ? dvdVar.ab : null, emeVar);
        return emeVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dyv h(defpackage.dvs r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            goto L40
        L4:
            java.lang.String r1 = r5.q
            dyq r2 = r5.s
            java.lang.String r3 = r5.r
            java.lang.String r5 = r5.q()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L34
            dyq r5 = defpackage.dyq.GLOBAL
            if (r2 != r5) goto L1a
            r5 = 1
            goto L38
        L1a:
            dyq r5 = defpackage.dyq.LOCAL
            if (r2 != r5) goto L20
            r5 = 2
            goto L39
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unhandled transition key type "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L34:
            r1 = 3
            r3 = r1
            r1 = r5
            r5 = r3
        L38:
            r3 = r0
        L39:
            if (r1 == 0) goto L40
            dyv r0 = new dyv
            r0.<init>(r5, r1, r3)
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvd.h(dvs):dyv");
    }

    public static String k(int i) {
        switch (i) {
            case -1:
                return "none";
            case 0:
                return "setRoot";
            case 1:
                return "setRootAsync";
            case 2:
                return "setSizeSpec";
            case 3:
                return "setSizeSpecAsync";
            case 4:
                return "updateStateSync";
            case 5:
                return "updateStateAsync";
            case 6:
                return "measure_setSizeSpec";
            default:
                return "measure_setSizeSpecAsync";
        }
    }

    public static void s(dru druVar, dvd dvdVar) {
        wr wrVar;
        dve dveVar = dvdVar.f;
        dveVar.getClass();
        if (dveVar.c()) {
            return;
        }
        boolean z = ebc.a;
        int i = dvdVar.d;
        int i2 = dvdVar.e;
        dvk dvkVar = dvdVar.p;
        dvs dvsVarJ = dvkVar != null ? dvkVar.j() : null;
        int i3 = 0;
        int iB = dvkVar != null ? (int) dvkVar.e.b() : 0;
        int iA = dvkVar != null ? (int) dvkVar.e.a() : 0;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            dvdVar.s = Math.max(0, Math.min(iB, View.MeasureSpec.getSize(i)));
        } else if (mode == 0) {
            dvdVar.s = iB;
        } else if (mode == 1073741824) {
            dvdVar.s = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            dvdVar.t = Math.max(0, Math.min(iA, View.MeasureSpec.getSize(i2)));
        } else if (mode2 == 0) {
            dvdVar.t = iA;
        } else if (mode2 == 1073741824) {
            dvdVar.t = View.MeasureSpec.getSize(i2);
        }
        dvf dvfVar = dvdVar.W;
        if (dvfVar != null && (wrVar = dvfVar.a) != null) {
            wrVar.h();
        }
        dvdVar.Z = -1L;
        if (dvkVar != null) {
            boolean z2 = dvdVar.J;
            G(druVar, dvkVar, dvsVarJ, dvdVar, null, null);
            ArrayList arrayList = dvdVar.j;
            ArrayList arrayList2 = new ArrayList(arrayList);
            try {
                Collections.sort(arrayList, ems.a);
                ArrayList arrayList3 = dvdVar.k;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                try {
                    Collections.sort(arrayList3, ems.b);
                    if (!druVar.n() && !ebc.a) {
                        dvdVar.n = null;
                        dvdVar.p = null;
                    } else {
                        if (ebc.e) {
                            return;
                        }
                        dvdVar.p = null;
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    sb.append("\n");
                    int size = arrayList4.size();
                    sb.append(a.b(size, "Error while sorting LayoutState bottoms. Size: "));
                    sb.append("\n");
                    Rect rect = new Rect();
                    while (i3 < size) {
                        dvdVar.i(i3).b(rect);
                        sb.append("   Index " + i3 + " bottom: " + rect.bottom);
                        sb.append("\n");
                        i3++;
                    }
                    throw new IllegalStateException(sb.toString());
                }
            } catch (IllegalArgumentException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getMessage());
                sb2.append("\n");
                int size2 = arrayList2.size();
                sb2.append(a.b(size2, "Error while sorting LayoutState tops. Size: "));
                sb2.append("\n");
                Rect rect2 = new Rect();
                while (i3 < size2) {
                    dvdVar.i(i3).b(rect2);
                    sb2.append("   Index " + i3 + " top: " + rect2.top);
                    sb2.append("\n");
                    i3++;
                }
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // defpackage.enb
    public final dvi A(long j) {
        return (dvi) this.U.e(j);
    }

    @Override // defpackage.enb
    public final void B() {
        this.b.h.v = false;
    }

    @Override // defpackage.enb
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.elt
    public final int b(long j) {
        Integer num = (Integer) this.T.f(j, -1);
        num.getClass();
        return num.intValue();
    }

    @Override // defpackage.enb
    public final int c() {
        return this.x;
    }

    final long d(drq drqVar, String str, int i, int i2, long j) {
        dve dveVar = this.f;
        dveVar.getClass();
        ComponentTree componentTree = dveVar.a;
        componentTree.getClass();
        if (componentTree.e) {
            dxj dxjVar = componentTree.g;
            str.getClass();
            return (componentTree.E << 35) | (i2 << 32) | dxjVar.a(str);
        }
        if (this.W == null) {
            this.W = new dvf();
        }
        dvf dvfVar = this.W;
        if (dvfVar.a == null) {
            dvfVar.a = new wr(2);
        }
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException(a.b(i, "Level must be non-negative and no greater than 255 actual level "));
        }
        long j2 = i2;
        long j3 = drqVar.i;
        long j4 = i;
        int i3 = -1;
        if (j > 0 && ((int) ((j >> 19) & 255)) == i) {
            i3 = (int) (j & 65535);
        }
        long j5 = (j2 << 16) | (j4 << 19) | (j3 << 27);
        int iIntValue = ((Integer) dvfVar.a.f(j5, 0)).intValue();
        if (i3 < iIntValue) {
            i3 = iIntValue + 1;
        }
        if (i3 < 0 || i3 > 65535) {
            throw new IllegalArgumentException(a.b(i3, "Sequence must be non-negative and no greater than 65535 actual sequence "));
        }
        long j6 = i3 | j5;
        dvfVar.a.i(j5, Integer.valueOf(i3 + 1));
        return j6;
    }

    final dvk e(drq drqVar) {
        return (dvk) this.l.get(Integer.valueOf(drqVar.j));
    }

    @Override // defpackage.enb
    public final dxa f(dyv dyvVar) {
        return (dxa) this.ad.get(dyvVar);
    }

    @Override // defpackage.enb
    public final dyv g() {
        return this.q;
    }

    @Override // defpackage.enb
    public final eme i(int i) {
        return (eme) this.g.get(i);
    }

    @Override // defpackage.enb
    public final String j() {
        return this.r;
    }

    @Override // defpackage.enb
    public final List l() {
        List listH;
        ComponentTree componentTree = this.b.h;
        if (componentTree == null || (listH = componentTree.h()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listH);
        return arrayList;
    }

    @Override // defpackage.enb
    public final List m() {
        return this.af;
    }

    @Override // defpackage.enf
    public final List n() {
        return this.h;
    }

    @Override // defpackage.enb
    public final Map o() {
        return this.ad;
    }

    @Override // defpackage.enf
    public final Set p() {
        return this.V;
    }

    final void q(drq drqVar) {
        this.l.remove(Integer.valueOf(drqVar.j));
    }

    @Override // defpackage.enb
    public final void r(dym dymVar, dym dymVar2) {
        ComponentTree componentTree = this.b.h;
        if (componentTree != null) {
            componentTree.w = dymVar;
            componentTree.x = dymVar2;
        }
    }

    public final boolean t() {
        return dra.c(this.C) == this.D;
    }

    public final boolean u(int i, int i2, int i3) {
        return this.c.j == i && v(i2, i3);
    }

    public final boolean v(int i, int i2) {
        return dwf.a(this.d, i, this.s) && dwf.a(this.e, i2, this.t);
    }

    @Override // defpackage.enb
    public final boolean w() {
        ComponentTree componentTree = this.b.h;
        return componentTree != null && componentTree.o;
    }

    @Override // defpackage.enf
    public final boolean x() {
        return this.N;
    }

    @Override // defpackage.enb
    public final boolean y() {
        return this.b.h.v;
    }

    @Override // defpackage.enb
    public final boolean z(long j) {
        return this.V.contains(Long.valueOf(j));
    }
}
