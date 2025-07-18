package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwm implements elu {
    private eml A;
    public final wr a;
    public final Map b;
    public long[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final eni i;
    public final emm j;
    public final els l;
    public final dzg m;
    public final emm n;
    private final wr o;
    private final dru p;
    private final dvz q;
    private int t;
    private int u;
    private dvd w;
    private dvd x;
    private final elv y;
    public final wr g = new wr(10);
    public final Rect h = new Rect();
    private final dwl r = new dwl();
    private final dwk s = new dwk();
    private int v = -1;
    private final Set z = new HashSet();
    public final dtk k = new dtk();

    public dwm(dvz dvzVar) {
        dzg dzgVar;
        boolean z = ebc.a;
        this.a = new wr(10);
        this.o = new wr(10);
        this.p = dvzVar.getComponentContext();
        this.q = dvzVar;
        this.d = true;
        this.b = ebc.a ? new HashMap() : null;
        dzj dzjVar = new dzj();
        dzjVar.d = eny.INHERIT;
        dwj dwjVarC = dwj.c(0L, new duk(), null, null, dzjVar, 0, 0, 2);
        Rect previousMountBounds = dvzVar.getPreviousMountBounds();
        elv elvVar = new elv(dxi.a(dwjVarC, previousMountBounds, new dvj(previousMountBounds.width(), previousMountBounds.height(), null), null), dvzVar, dvzVar);
        elvVar.e = new dvr(dvzVar);
        this.y = elvVar;
        els elsVar = new els(this);
        this.l = elsVar;
        if (ebc.i) {
            eni eniVar = eni.a;
            this.i = eniVar;
            emm emmVarA = elsVar.a(eniVar);
            this.j = emmVarA;
            ((enh) emmVarA.c).g = dvzVar;
        } else {
            this.i = null;
            this.j = null;
        }
        if (!ebc.j) {
            this.m = null;
            this.n = null;
            return;
        }
        String str = true == drb.a ? "LithoAnimationDebug" : null;
        if (str != null) {
            if (dzg.b == null) {
                dzg.b = new dzg(str);
            }
            dzgVar = dzg.b;
        } else {
            dzgVar = dzg.a;
        }
        this.m = dzgVar;
        this.n = elsVar.a(dzgVar);
    }

    private final void A() {
        dvi dviVarA;
        dyv dyvVar;
        if (this.m == null || !this.d) {
            return;
        }
        emm emmVar = this.n;
        dzf dzfVar = (dzf) emmVar.c;
        if (dzfVar.e != null) {
            emd.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(dzfVar.f.size());
            elu eluVar = emmVar.b.a;
            int iB = eluVar.b();
            for (int i = 0; i < iB; i++) {
                elv elvVarJ = eluVar.j(i);
                if (elvVarJ != null && (dyvVar = (dviVarA = dzfVar.c.A(((dvu) elvVarJ.d.b).a)).e) != null) {
                    int i2 = dviVarA.c;
                    dxa dxaVar = (dxa) linkedHashMap.get(dyvVar);
                    if (dxaVar == null) {
                        dxaVar = new dxa();
                        linkedHashMap.put(dyvVar, dxaVar);
                    }
                    dxaVar.d(i2, elvVarJ.a);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                dzfVar.e.f((dyv) entry.getKey(), (dxa) entry.getValue());
            }
            for (Map.Entry entry2 : dzfVar.a.entrySet()) {
                dxa dxaVar2 = (dxa) entry2.getValue();
                dxa dxaVar3 = new dxa();
                short s = dxaVar2.b;
                for (int i3 = 0; i3 < s; i3++) {
                    dxaVar3.c(dxaVar2.a(i3), ((elv) dxaVar2.a[dxaVar2.a(i3)]).a);
                }
                dzfVar.e.f((dyv) entry2.getKey(), dxaVar3);
            }
            emc emcVar = emd.a;
            boolean z = ema.a;
        }
        if (dzg.l(dzfVar, dzfVar.c) && dzg.k(dzfVar)) {
            dzc dzcVar = dzfVar.e;
            emd.a();
            Map map = dzcVar.d;
            for (eao eaoVar : map.keySet()) {
                float fFloatValue = ((Float) map.get(eaoVar)).floatValue();
                dxa dxaVar4 = ((dyx) dzcVar.b.a(eaoVar.a)).b;
                if (dxaVar4 != null) {
                    dzc.h(eaoVar.b, fFloatValue, dxaVar4);
                }
            }
            map.clear();
            String str = dzcVar.j;
            if (str != null) {
                Log.d(str, "Starting animations:");
            }
            eah eahVar = dzcVar.i;
            if (eahVar != null) {
                eahVar.b(dzcVar.g);
                dzcVar.i.h(dzcVar.h);
                dzcVar.i = null;
            }
            emc emcVar2 = emd.a;
            boolean z2 = ema.a;
        }
        dzfVar.c.B();
        enb enbVar = dzfVar.c;
        dzfVar.i = enbVar;
        dzfVar.g = false;
        dzfVar.d = enbVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [duv, java.lang.Object] */
    private final void B(elv elvVar, drq drqVar, dru druVar, dvj dvjVar, Object obj) {
        dru druVarY = y(elvVar.d);
        ?? r10 = dvjVar.c;
        if (druVarY != null) {
            druVarY.b = "bind";
        }
        emc emcVar = emd.a;
        boolean z = ema.a;
        try {
            try {
                drqVar.H(druVarY, obj, r10);
            } catch (Exception e) {
                if (druVarY == null) {
                    throw e;
                }
                dsq.d(druVarY, e);
                druVarY.b = null;
            }
            dtk dtkVar = this.k;
            boolean zC = dtk.c(drqVar, obj);
            dtl[] dtlVarArr = drq.h;
            int length = dtlVarArr.length;
            if (zC) {
                HashSet hashSet = new HashSet();
                SparseArray sparseArrayI = drqVar.i();
                for (int i = 0; i < sparseArrayI.size(); i++) {
                    int iKeyAt = sparseArrayI.keyAt(i);
                    dtl dtlVar = (dtl) sparseArrayI.valueAt(i);
                    dtkVar.b(iKeyAt, dtlVar, (View) obj);
                    dtkVar.a(dtlVar, drqVar);
                    hashSet.add(dtlVar);
                }
                int length2 = dtlVarArr.length;
                dtkVar.b.put(drqVar, hashSet);
                dtkVar.c.put(drqVar, obj);
            }
            elvVar.c = true;
        } finally {
            if (druVarY != null) {
                druVarY.b = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void C(elv elvVar) {
        dtf dispatchTouchListener;
        dsg dsgVarH;
        drw drwVarD;
        dsc dscVarF;
        dsc dscVarE;
        drv drvVarC;
        dsf dsfVarG;
        duz duzVar = ((dvu) elvVar.d.b).b;
        int i = dvr.b(elvVar).a;
        Object obj = elvVar.a;
        Map map = drq.g;
        if (obj instanceof View) {
            View view = (View) obj;
            dww dwwVar = duzVar.a;
            int i2 = 1;
            if (dwwVar != null) {
                if (dwwVar.q != null) {
                    view.setOnClickListener(null);
                    view.setClickable(false);
                }
                if (dwwVar.s != null && (dsfVarG = g(view)) != null) {
                    dsfVarG.a = null;
                }
                if (dwwVar.t != null && (drvVarC = c(view)) != null) {
                    drvVarC.a = null;
                }
                if (dwwVar.u != null && (dscVarE = e(view)) != null) {
                    dscVarE.a = null;
                }
                if (dwwVar.v != null && (dscVarF = f(view)) != null) {
                    dscVarF.b = null;
                }
                if (dwwVar.r != null && (drwVarD = d(view)) != null) {
                    drwVarD.a = null;
                }
                if (dwwVar.w != null && (dsgVarH = h(view)) != null) {
                    dsgVarH.a = null;
                }
                if (dwwVar.x != null) {
                    if ((view instanceof duh) && (dispatchTouchListener = ((duh) view).getDispatchTouchListener()) != null) {
                        dispatchTouchListener.a = null;
                    }
                    dsg dsgVarH2 = h(view);
                    if (dsgVarH2 != null) {
                        dsgVarH2.b = null;
                    }
                }
                view.setTag(null);
                SparseArray sparseArray = dwwVar.d;
                if (view instanceof ComponentHost) {
                    ((ComponentHost) view).b = null;
                } else if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        view.setTag(sparseArray.keyAt(i3), null);
                    }
                }
                if (dwwVar.e != -16777216) {
                    view.setOutlineAmbientShadowColor(-16777216);
                }
                if (dwwVar.f != -16777216) {
                    view.setOutlineSpotShadowColor(-16777216);
                }
                if (dwwVar.g != null) {
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                if (dwwVar.h) {
                    view.setClipToOutline(false);
                }
                if (!dwwVar.i && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipToPadding(true);
                }
                if (!dwwVar.j && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(true);
                }
                if (!TextUtils.isEmpty(dwwVar.a)) {
                    view.setContentDescription(null);
                }
                if (dwwVar.M() && view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (dwwVar.N() && view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
                if (dwwVar.H() && view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                if (dwwVar.J() && view.getRotation() != 0.0f) {
                    view.setRotation(0.0f);
                }
                if (dwwVar.K() && view.getRotationX() != 0.0f) {
                    view.setRotationX(0.0f);
                }
                if (dwwVar.L() && view.getRotationY() != 0.0f) {
                    view.setRotationY(0.0f);
                }
                if (dwwVar.O() && view.getTranslationX() != 0.0f) {
                    view.setTranslationX(0.0f);
                }
                if (dwwVar.P() && view.getTranslationY() != 0.0f) {
                    view.setTranslationY(0.0f);
                }
            }
            view.setClickable(1 == (i & 1));
            view.setLongClickable((i & 2) == 2);
            view.setContextClickable((i & 128) == 128);
            view.setFocusable((i & 4) == 4);
            view.setEnabled((i & 8) == 8);
            view.setSelected((i & 16) == 16);
            if (duzVar.e != 0) {
                int[] iArr = ahj.a;
                view.setImportantForAccessibility(0);
            }
            boolean z = view instanceof ComponentHost;
            if (z || view.getTag(R.id.component_node_info) != null) {
                view.setTag(R.id.component_node_info, null);
                if (!z) {
                    ahj.n(view, null);
                }
            }
            dzj dzjVar = duzVar.b;
            if (dzjVar != null && !(duzVar.c instanceof duk)) {
                if (dzjVar.b()) {
                    try {
                        view.setPadding(0, 0, 0, 0);
                    } catch (NullPointerException e) {
                        elo.a().a(2, "From component: ".concat(duzVar.c.d()), e, null);
                    }
                }
                M(view, dzjVar);
                view.setLayoutDirection(2);
            }
            if ((i & 32) == 0) {
                i2 = -1;
            } else if ((i & 64) == 64) {
                i2 = 2;
            }
            if (i2 != -1) {
                view.setLayerType(i2, null);
            }
        }
    }

    private static void D(elv elvVar, boolean z) {
        if (dvu.b(elvVar.d.b)) {
            F((View) elvVar.a, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [duv, java.lang.Object] */
    private final void E(int i, eme emeVar, duz duzVar, dvd dvdVar) {
        Object objA;
        Object objW;
        dzh dzhVar;
        Map mapB;
        emc emcVar = emd.a;
        boolean z = ema.a;
        long j = ((dvu) emeVar.a.b).a;
        wr wrVar = this.g;
        long jNanoTime = System.nanoTime();
        ComponentHost componentHost = (ComponentHost) wrVar.e(j);
        if (componentHost == null) {
            int iB = dvdVar.b(j);
            eme emeVarI = dvdVar.i(iB);
            E(iB, emeVarI, ((dvu) emeVarI.b).b, dvdVar);
            componentHost = (ComponentHost) wrVar.e(j);
        }
        drq drqVar = duzVar.c;
        boolean z2 = drqVar instanceof duk;
        if (z2) {
            Context context = this.p.a;
            boolean z3 = ebc.a;
            objW = ((duk) drqVar).A(context);
        } else {
            Context context2 = this.p.a;
            elw elwVarC = ely.c(context2, drqVar);
            objW = (elwVarC == null || (objA = elwVarC.a(context2, drqVar)) == null) ? drqVar.w(context2) : objA;
        }
        dru druVarY = y(emeVar);
        dvj dvjVar = (dvj) emeVar.c;
        drqVar.F(druVarY, objW, dvjVar.c);
        if (z2) {
            wrVar.i(((dvu) emeVar.b).a, (ComponentHost) objW);
        }
        elv elvVar = new elv(emeVar, componentHost, objW);
        elvVar.e = new dvr(objW);
        this.a.i(this.c[i], elvVar);
        if (drqVar.R()) {
            this.o.i(this.c[i], elvVar);
        }
        int i2 = elvVar.d.g;
        H(elvVar);
        Rect rect = emeVar.d;
        componentHost.f(i, elvVar, rect);
        B(elvVar, drqVar, druVarY, dvjVar, objW);
        Object obj = elvVar.a;
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        dyd.a();
        enc.a(i3, i4, i5, i6, obj, true);
        els elsVar = this.l;
        if (elsVar != null) {
            List list = elsVar.b;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                emm emmVar = (emm) list.get(i7);
                emmVar.a.n(emmVar, emeVar.b, obj);
            }
        }
        dwk dwkVar = this.s;
        if (dwkVar.n) {
            dwkVar.f.add(Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
            dwkVar.a.add(drqVar.d());
            dwkVar.j++;
            dru druVar = ((dvu) emeVar.b).c;
            List list2 = dwkVar.e;
            ohv ohvVarO = druVarY.o();
            String string = null;
            if (druVar != null && (dzhVar = druVar.f) != null && (mapB = ohvVarO.b(dzhVar)) != null) {
                StringBuilder sb = new StringBuilder(mapB.size() * 16);
                for (Map.Entry entry : mapB.entrySet()) {
                    sb.append((String) entry.getKey());
                    sb.append(':');
                    sb.append((String) entry.getValue());
                    sb.append(';');
                }
                string = sb.toString();
            }
            list2.add(string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void F(View view, boolean z) {
        dyd.a();
        if (view instanceof dvz) {
            dvz dvzVar = (dvz) view;
            if (dvzVar.z()) {
                if (z) {
                    dvzVar.s();
                    return;
                } else {
                    dvzVar.r(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    return;
                }
            }
            return;
        }
        if (view instanceof emb) {
            ((emb) view).q();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                F(viewGroup.getChildAt(i), z);
            }
        }
    }

    private final void G(dvd dvdVar, Rect rect, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        emc emcVar = emd.a;
        boolean z2 = ema.a;
        int iA = dvdVar.a();
        if (rect.top >= 0 || this.h.top >= 0) {
            while (true) {
                arrayList = dvdVar.k;
                if (this.u >= iA || rect.top < ((emp) arrayList.get(this.u)).b.bottom) {
                    break;
                }
                emp empVar = (emp) arrayList.get(this.u);
                eme emeVarI = dvdVar.i(empVar.a);
                int iB = dvdVar.b(((dvu) emeVarI.b).a);
                if (!N(emeVarI) && !empVar.c) {
                    x(iB, this.g);
                }
                this.u++;
            }
            while (this.u > 0 && rect.top <= ((emp) arrayList.get(this.u - 1)).b.bottom) {
                int i = this.u - 1;
                this.u = i;
                eme emeVarI2 = dvdVar.i(((emp) arrayList.get(i)).a);
                dvu dvuVar = (dvu) emeVarI2.b;
                duz duzVar = dvuVar.b;
                long j = dvuVar.a;
                if (i(dvdVar.b(j)) == null) {
                    E(dvdVar.b(j), emeVarI2, duzVar, dvdVar);
                    this.z.add(Long.valueOf(j));
                }
            }
        }
        int height = this.q.getHeight();
        if (rect.bottom < height || this.h.bottom < height) {
            while (true) {
                arrayList2 = dvdVar.j;
                if (this.t >= iA || rect.bottom < ((emp) arrayList2.get(this.t)).b.top) {
                    break;
                }
                eme emeVarI3 = dvdVar.i(((emp) arrayList2.get(this.t)).a);
                dvu dvuVar2 = (dvu) emeVarI3.b;
                duz duzVar2 = dvuVar2.b;
                long j2 = dvuVar2.a;
                if (i(dvdVar.b(j2)) == null) {
                    E(dvdVar.b(j2), emeVarI3, duzVar2, dvdVar);
                    this.z.add(Long.valueOf(j2));
                }
                this.t++;
            }
            while (this.t > 0 && rect.bottom < ((emp) arrayList2.get(this.t - 1)).b.top) {
                int i2 = this.t - 1;
                this.t = i2;
                emp empVar2 = (emp) arrayList2.get(i2);
                eme emeVarI4 = dvdVar.i(empVar2.a);
                int iB2 = dvdVar.b(((dvu) emeVarI4.b).a);
                if (!N(emeVarI4) && !empVar2.c) {
                    x(iB2, this.g);
                }
            }
        }
        wr wrVar = this.o;
        int iC = wrVar.c();
        for (int i3 = 0; i3 < iC; i3++) {
            elv elvVar = (elv) wrVar.g(i3);
            long jD = wrVar.d(i3);
            if (!this.z.contains(Long.valueOf(jD)) && dvdVar.b(jD) != -1) {
                D(elvVar, z);
            }
        }
        this.z.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void H(elv elvVar) {
        Object obj = elvVar.a;
        duz duzVar = ((dvu) elvVar.d.b).b;
        if (obj instanceof View) {
            View view = (View) obj;
            dww dwwVar = duzVar.a;
            int i = 2;
            if (dwwVar != null) {
                dtu dtuVar = dwwVar.q;
                if (dtuVar != null) {
                    view.setOnClickListener(new drt(dtuVar));
                    view.setClickable(true);
                }
                dtu dtuVar2 = dwwVar.s;
                if (dtuVar2 != null) {
                    dsf dsfVarG = g(view);
                    if (dsfVarG == null) {
                        dsfVarG = new dsf();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.c = dsfVarG;
                            componentHost.setOnLongClickListener(dsfVarG);
                        } else {
                            view.setOnLongClickListener(dsfVarG);
                            view.setTag(R.id.component_long_click_listener, dsfVarG);
                        }
                    }
                    dsfVarG.a = dtuVar2;
                    view.setLongClickable(true);
                }
                dtu dtuVar3 = dwwVar.t;
                if (dtuVar3 != null) {
                    drv drvVarC = c(view);
                    if (drvVarC == null) {
                        drvVarC = new drv();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.d = drvVarC;
                            componentHost2.setOnContextClickListener(drvVarC);
                        } else {
                            view.setOnContextClickListener(drvVarC);
                            view.setTag(R.id.component_context_click_listener, drvVarC);
                        }
                    }
                    drvVarC.a = dtuVar3;
                    view.setContextClickable(true);
                }
                dtu dtuVar4 = dwwVar.u;
                if (dtuVar4 != null) {
                    dsc dscVarE = e(view);
                    if (dscVarE == null) {
                        dscVarE = new dsc();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.e = dscVarE;
                            componentHost3.setOnHoverListener(dscVarE);
                        } else {
                            view.setOnHoverListener(dscVarE);
                            view.setTag(R.id.component_hover_enter_listener, dscVarE);
                        }
                    }
                    dscVarE.a = dtuVar4;
                }
                dtu dtuVar5 = dwwVar.v;
                if (dtuVar5 != null) {
                    dsc dscVarF = f(view);
                    if (dscVarF == null) {
                        dscVarF = new dsc();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost4 = (ComponentHost) view;
                            componentHost4.e = dscVarF;
                            componentHost4.setOnHoverListener(dscVarF);
                        } else {
                            view.setOnHoverListener(dscVarF);
                            view.setTag(R.id.component_hover_exit_listener, dscVarF);
                        }
                    }
                    dscVarF.b = dtuVar5;
                }
                dtu dtuVar6 = dwwVar.r;
                if (dtuVar6 != null) {
                    drw drwVarD = d(view);
                    if (drwVarD == null) {
                        drwVarD = new drw();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost5 = (ComponentHost) view;
                            componentHost5.f = drwVarD;
                            componentHost5.setOnFocusChangeListener(drwVarD);
                        } else {
                            view.setOnFocusChangeListener(drwVarD);
                            view.setTag(R.id.component_focus_change_listener, drwVarD);
                        }
                    }
                    drwVarD.a = dtuVar6;
                }
                dtu dtuVar7 = dwwVar.w;
                if (dtuVar7 != null) {
                    dsg dsgVarH = h(view);
                    if (dsgVarH == null) {
                        dsgVarH = new dsg();
                        t(view, dsgVarH);
                    }
                    dsgVarH.a = dtuVar7;
                }
                dtu dtuVar8 = dwwVar.x;
                if (dtuVar8 != null) {
                    if (view instanceof duh) {
                        duh duhVar = (duh) view;
                        dtf dispatchTouchListener = duhVar.getDispatchTouchListener();
                        if (dispatchTouchListener == null) {
                            dispatchTouchListener = new dtf();
                            duhVar.i(dispatchTouchListener);
                        }
                        dispatchTouchListener.a = dtuVar8;
                    } else {
                        dsg dsgVarH2 = h(view);
                        if (dsgVarH2 == null) {
                            dsgVarH2 = new dsg();
                            t(view, dsgVarH2);
                        }
                        dsgVarH2.b = dtuVar8;
                    }
                }
                boolean z = view instanceof ComponentHost;
                if (z || dwwVar.Q()) {
                    view.setTag(R.id.component_node_info, dwwVar);
                }
                view.setTag(dwwVar.c);
                SparseArray sparseArray = dwwVar.d;
                if (sparseArray != null) {
                    if (z) {
                        ((ComponentHost) view).b = sparseArray;
                    } else {
                        int size = sparseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                        }
                    }
                }
                view.setOutlineAmbientShadowColor(dwwVar.e);
                view.setOutlineSpotShadowColor(dwwVar.f);
                ViewOutlineProvider viewOutlineProvider = dwwVar.g;
                if (viewOutlineProvider != null) {
                    view.setOutlineProvider(viewOutlineProvider);
                }
                if (dwwVar.h) {
                    view.setClipToOutline(true);
                }
                if (!dwwVar.i && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipToPadding(false);
                }
                if (dwwVar.I() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(dwwVar.j);
                }
                CharSequence charSequence = dwwVar.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i3 = dwwVar.B;
                if (i3 == 1) {
                    view.setFocusable(true);
                } else if (i3 == 2) {
                    view.setFocusable(false);
                }
                int i4 = dwwVar.C;
                if (i4 == 1) {
                    view.setClickable(true);
                } else if (i4 == 2) {
                    view.setClickable(false);
                }
                int i5 = dwwVar.D;
                if (i5 == 1) {
                    view.setLongClickable(true);
                } else if (i5 == 2) {
                    view.setLongClickable(false);
                }
                int i6 = dwwVar.E;
                if (i6 == 1) {
                    view.setEnabled(true);
                } else if (i6 == 2) {
                    view.setEnabled(false);
                }
                int i7 = dwwVar.F;
                if (i7 == 1) {
                    view.setSelected(true);
                } else if (i7 == 2) {
                    view.setSelected(false);
                }
                if (dwwVar.M()) {
                    view.setScaleX(dwwVar.k);
                }
                if (dwwVar.N()) {
                    view.setScaleY(dwwVar.l);
                }
                if (dwwVar.H()) {
                    view.setAlpha(dwwVar.m);
                }
                if (dwwVar.J()) {
                    view.setRotation(dwwVar.n);
                }
                if (dwwVar.K()) {
                    view.setRotationX(0.0f);
                }
                if (dwwVar.L()) {
                    view.setRotationY(0.0f);
                }
                if (dwwVar.O()) {
                    view.setTranslationX(dwwVar.o);
                }
                if (dwwVar.P()) {
                    view.setTranslationY(dwwVar.p);
                }
                int[] iArr = ahj.a;
                ahc.l(view, null);
            }
            int i8 = duzVar.e;
            if (i8 != 0) {
                int[] iArr2 = ahj.a;
                view.setImportantForAccessibility(i8);
            }
            dzj dzjVar = duzVar.b;
            if (dzjVar != null) {
                drq drqVar = duzVar.c;
                Map map = drq.g;
                if (dzjVar.e != -1) {
                    view.setLayerType(0, null);
                }
                if (drqVar instanceof duk) {
                    return;
                }
                I(view, dzjVar);
                if (dzjVar.b()) {
                    Rect rect = dzjVar.b;
                    int i9 = rect != null ? rect.left : 0;
                    Rect rect2 = dzjVar.b;
                    int i10 = rect2 != null ? rect2.top : 0;
                    Rect rect3 = dzjVar.b;
                    int i11 = rect3 != null ? rect3.right : 0;
                    Rect rect4 = dzjVar.b;
                    view.setPadding(i9, i10, i11, rect4 != null ? rect4.bottom : 0);
                }
                int iOrdinal = dzjVar.d.ordinal();
                if (iOrdinal == 1) {
                    i = 0;
                } else if (iOrdinal == 2) {
                    i = 1;
                }
                view.setLayoutDirection(i);
            }
        }
    }

    private static void I(View view, dzj dzjVar) {
        Drawable drawable = dzjVar.a;
        if (drawable != null) {
            view.setBackground(drawable);
        }
    }

    private final void J(elv elvVar) {
        eme emeVar = elvVar.d;
        duz duzVar = ((dvu) emeVar.b).b;
        Object obj = elvVar.a;
        dru druVarY = y(emeVar);
        emc emcVar = emd.a;
        boolean z = ema.a;
        emh emhVar = elvVar.d.b;
        drq drqVar = duzVar.c;
        if (elvVar.c) {
            K(elvVar, drqVar, obj);
        }
        if (obj instanceof duj) {
            ArrayList arrayList = new ArrayList();
            ((duj) obj).a(arrayList);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((dvz) arrayList.get(size)).y();
                }
            }
        }
        C(elvVar);
        Object obj2 = elvVar.d.c;
        drqVar.av(druVarY, obj);
    }

    private final void K(elv elvVar, drq drqVar, Object obj) {
        if (dtk.c(drqVar, obj)) {
            dtk dtkVar = this.k;
            dtkVar.c.remove(drqVar);
            Map map = dtkVar.b;
            Set<dtl> set = (Set) map.get(drqVar);
            if (set != null) {
                for (dtl dtlVar : set) {
                    if (dtlVar != null) {
                        Map map2 = dtkVar.a;
                        Set set2 = (Set) map2.get(dtlVar);
                        if (set2 != null) {
                            set2.remove(drqVar);
                            if (set2.isEmpty()) {
                                map2.remove(dtlVar);
                                dtlVar.b.remove(dtkVar);
                            }
                        }
                    }
                }
                if (obj instanceof View) {
                    View view = (View) obj;
                    if (view.getAlpha() != 1.0f) {
                        view.setAlpha(1.0f);
                    }
                    if (view.getTranslationX() != 0.0f) {
                        view.setTranslationX(0.0f);
                    }
                    if (view.getTranslationY() != 0.0f) {
                        view.setTranslationY(0.0f);
                    }
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                    if (view.getElevation() != 0.0f) {
                        view.setElevation(0.0f);
                    }
                    if (view.getBackground() != null) {
                        view.setBackground(null);
                    }
                    if (view.getRotation() != 0.0f) {
                        view.setRotation(0.0f);
                    }
                }
                map.remove(drqVar);
            }
        } else {
            int length = drq.h.length;
        }
        eme emeVar = elvVar.d;
        dru druVarY = y(emeVar);
        Object obj2 = emeVar.c;
        emc emcVar = emd.a;
        boolean z = ema.a;
        try {
            try {
                drqVar.ar(obj);
            } catch (Exception e) {
                dsq.d(druVarY, e);
            }
            emc emcVar2 = emd.a;
            elvVar.c = false;
        } catch (Throwable th) {
            emc emcVar3 = emd.a;
            throw th;
        }
    }

    private final void L(elv elvVar, wr wrVar) {
        try {
            dvz dvzVar = this.q;
            Trace.beginSection(a.q(dvzVar.getComponentTree() != null ? Integer.valueOf(dvzVar.getComponentTree().E) : "null", "MountState.unmountItem treeid="));
            long jNanoTime = System.nanoTime();
            if (elvVar != null) {
                emc emcVar = emd.a;
                boolean z = ema.a;
                eme emeVar = elvVar.d;
                long j = ((dvu) emeVar.b).a;
                Object obj = elvVar.a;
                eml emlVar = this.A;
                boolean z2 = false;
                if (emlVar != null && emlVar.m(this.l.c, elvVar)) {
                    z2 = true;
                }
                if (emeVar.a() > 0) {
                    elr elrVar = (elr) obj;
                    int iA = emeVar.a();
                    while (true) {
                        iA--;
                        if (iA < 0) {
                            break;
                        } else {
                            L((elv) this.a.e(((dvu) ((eme) emeVar.h.get(iA)).b).a), wrVar);
                        }
                    }
                    if (!z2 && elrVar.getMountItemCount() > 0) {
                        dsr.c(2, "Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState, component: " + ((dvu) elvVar.d.b).b.c.d(), eev.a(this.p));
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
                if (j == 0) {
                    J(elvVar);
                } else {
                    this.a.j(j);
                    elr elrVar2 = elvVar.b;
                    drq drqVar = ((dvu) elvVar.d.b).b.c;
                    if (drqVar.R()) {
                        wr wrVar2 = this.o;
                        int iB = xa.b(wrVar2.b, wrVar2.d, j);
                        if (iB >= 0) {
                            Object[] objArr = wrVar2.c;
                            Object obj2 = objArr[iB];
                            Object obj3 = ws.a;
                            if (obj2 != obj3) {
                                objArr[iB] = obj3;
                                wrVar2.a = true;
                            }
                        }
                    }
                    if (drqVar instanceof duk) {
                        wrVar.k(wrVar.b((ComponentHost) obj));
                    }
                    if (z2) {
                        this.A.i(this.l.c, elvVar, elrVar2);
                    } else {
                        int length = this.c.length;
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            } else if (this.c[length] == j) {
                                ((ComponentHost) elrVar2).l(length, elvVar);
                                break;
                            }
                        }
                        w(elvVar);
                    }
                    dwk dwkVar = this.s;
                    if (dwkVar.n) {
                        dwkVar.g.add(Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
                        dwkVar.b.add(drqVar.d());
                        dwkVar.k++;
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    private static void M(View view, dzj dzjVar) {
        if (dzjVar.a != null) {
            view.setBackground(null);
        }
    }

    private final boolean N(eme emeVar) {
        if (this.m == null) {
            return false;
        }
        emm emmVar = this.n;
        if (emmVar != null) {
            return emmVar.d(((dvu) emeVar.b).a);
        }
        throw new IllegalStateException("Need a state when using the TransitionsExtension.");
    }

    private static boolean O(drq drqVar, dru druVar, drq drqVar2, dru druVar2) {
        emc emcVar = emd.a;
        boolean z = ema.a;
        try {
            return drqVar.af(druVar, drqVar, druVar2, drqVar2);
        } catch (Exception e) {
            dsq.d(druVar2, e);
            return true;
        }
    }

    static drv c(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).d : (drv) view.getTag(R.id.component_context_click_listener);
    }

    static drw d(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).f : (drw) view.getTag(R.id.component_focus_change_listener);
    }

    static dsc e(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).e : (dsc) view.getTag(R.id.component_hover_enter_listener);
    }

    static dsc f(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).e : (dsc) view.getTag(R.id.component_hover_exit_listener);
    }

    static dsf g(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).c : (dsf) view.getTag(R.id.component_long_click_listener);
    }

    static dsg h(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).getComponentTouchListener() : (dsg) view.getTag(R.id.component_touch_listener);
    }

    static void t(View view, dsg dsgVar) {
        if (!(view instanceof ComponentHost)) {
            view.setOnTouchListener(dsgVar);
            view.setTag(R.id.component_touch_listener, dsgVar);
        } else {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.g = dsgVar;
            componentHost.setOnTouchListener(dsgVar);
        }
    }

    private final dru y(eme emeVar) {
        dru druVar = ((dvu) emeVar.b).c;
        return druVar == null ? this.p : druVar;
    }

    private final String z(elv elvVar) {
        long jD;
        wr wrVar = this.a;
        int iB = wrVar.b(elvVar);
        int i = -1;
        if (iB >= 0) {
            jD = wrVar.d(iB);
            int i2 = 0;
            while (true) {
                long[] jArr = this.c;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jD == jArr[i2]) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            jD = -1;
        }
        ComponentTree componentTree = this.q.getComponentTree();
        String strD = componentTree == null ? "<null_component_tree>" : componentTree.b().d();
        Object obj = elvVar.a;
        String strValueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        String strD2 = ((dvu) elvVar.d.b).b.c.d();
        elr elrVar = elvVar.b;
        String str = elrVar != null ? elrVar.getClass() : "<null_host>";
        wr wrVar2 = this.g;
        return "rootComponent=" + strD + ", index=" + i + ", mapIndex=" + iB + ", id=" + jD + ", contentType=" + strValueOf + ", component=" + strD2 + ", host=" + String.valueOf(str) + ", isRootHost=" + (wrVar2.e(0L) == elvVar.b);
    }

    @Override // defpackage.elu
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.elu
    public final int b() {
        dyd.a();
        long[] jArr = this.c;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    final elv i(int i) {
        dyd.a();
        long[] jArr = this.c;
        if (jArr != null && i < jArr.length) {
            return (elv) this.a.e(jArr[i]);
        }
        return null;
    }

    @Override // defpackage.elu
    public final elv j(int i) {
        return i(i);
    }

    @Override // defpackage.elu
    public final elv k() {
        return (elv) this.a.e(0L);
    }

    @Override // defpackage.elu
    public final Object l(long j) {
        elv elvVar = (elv) this.a.e(j);
        if (elvVar == null) {
            return null;
        }
        return elvVar.a;
    }

    public final void m() {
        if (this.m != null) {
            dzg.c(this.n);
        }
        this.v = -1;
    }

    final void n() {
        if (this.i != null) {
            eni.a(this.j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07dc A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0851 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x089b A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[Catch: all -> 0x0530, TRY_ENTER, TryCatch #0 {all -> 0x0530, blocks: (B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:506:0x0090, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0903 A[PHI: r11
  0x0903: PHI (r11v7 dww) = (r11v6 dww), (r11v8 dww) binds: [B:389:0x08fe, B:391:0x0902] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0918 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x091d A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0924 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0936 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0954 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0985 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0992 A[Catch: all -> 0x0ba4, TryCatch #1 {all -> 0x0ba4, blocks: (B:7:0x0017, B:9:0x0031, B:11:0x0039, B:13:0x003f, B:17:0x0048, B:19:0x004c, B:21:0x0050, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:28:0x0088, B:29:0x008b, B:34:0x00a3, B:137:0x038a, B:143:0x03a1, B:145:0x03a7, B:148:0x03af, B:150:0x03b3, B:152:0x03b7, B:154:0x03c9, B:156:0x03d5, B:158:0x03da, B:160:0x03de, B:162:0x03e8, B:163:0x0404, B:165:0x040a, B:180:0x048d, B:182:0x04a7, B:183:0x04af, B:185:0x04b7, B:187:0x04f2, B:186:0x04ef, B:169:0x041c, B:173:0x0427, B:174:0x043a, B:176:0x043e, B:179:0x047e, B:178:0x0463, B:188:0x0500, B:189:0x050b, B:190:0x050c, B:191:0x0517, B:192:0x0518, B:193:0x0523, B:194:0x0524, B:200:0x0540, B:202:0x0546, B:203:0x0567, B:205:0x0578, B:210:0x058b, B:211:0x0599, B:215:0x05a3, B:216:0x05a8, B:246:0x0637, B:247:0x064a, B:249:0x0652, B:252:0x0666, B:254:0x066e, B:259:0x0678, B:261:0x068b, B:256:0x0671, B:251:0x065a, B:219:0x05b9, B:220:0x05bc, B:222:0x05c1, B:224:0x05ca, B:226:0x05d0, B:229:0x05da, B:244:0x0632, B:233:0x05e7, B:234:0x05f0, B:235:0x05f5, B:237:0x05ff, B:238:0x0604, B:240:0x060e, B:242:0x061c, B:243:0x062a, B:262:0x0690, B:264:0x069f, B:265:0x06cc, B:267:0x06d1, B:269:0x06d7, B:271:0x06de, B:273:0x0721, B:452:0x0a54, B:455:0x0a5b, B:457:0x0a65, B:459:0x0a6c, B:461:0x0a74, B:490:0x0afd, B:492:0x0b01, B:493:0x0b06, B:495:0x0b0a, B:498:0x0b14, B:499:0x0b93, B:500:0x0b96, B:464:0x0a8a, B:473:0x0aa5, B:477:0x0ab9, B:481:0x0acc, B:485:0x0adf, B:487:0x0aeb, B:488:0x0af0, B:484:0x0add, B:480:0x0ac4, B:476:0x0ab1, B:472:0x0a9e, B:467:0x0a93, B:274:0x0732, B:276:0x0747, B:286:0x0784, B:298:0x07a9, B:300:0x07b4, B:310:0x07ca, B:435:0x09e9, B:313:0x07d3, B:315:0x07dc, B:318:0x07e2, B:322:0x07e9, B:324:0x07ef, B:325:0x0806, B:327:0x080c, B:332:0x0819, B:334:0x0851, B:336:0x0863, B:344:0x087d, B:346:0x0881, B:348:0x0885, B:358:0x089b, B:399:0x0914, B:401:0x0918, B:403:0x091d, B:404:0x0920, B:406:0x0924, B:408:0x0928, B:410:0x0936, B:411:0x0939, B:422:0x0985, B:424:0x098b, B:425:0x098e, B:427:0x0992, B:428:0x099c, B:431:0x09a4, B:432:0x09cc, B:414:0x0954, B:416:0x095c, B:420:0x096b, B:369:0x08b5, B:372:0x08c4, B:375:0x08cc, B:378:0x08d7, B:381:0x08e2, B:384:0x08ed, B:388:0x08fa, B:393:0x0905, B:356:0x0895, B:293:0x0794, B:295:0x079e, B:438:0x0a0c, B:440:0x0a12, B:442:0x0a23, B:444:0x0a31, B:445:0x0a34, B:446:0x0a37, B:448:0x0a40, B:450:0x0a4e, B:451:0x0a51, B:208:0x057f, B:136:0x0386, B:197:0x0531, B:198:0x0535, B:30:0x0090, B:32:0x0098, B:36:0x00b5, B:38:0x00bd, B:39:0x00c9, B:41:0x00cf, B:43:0x00e1, B:45:0x00e7, B:47:0x00ef, B:49:0x00f8, B:51:0x0101, B:53:0x0112, B:57:0x011c, B:58:0x0131, B:60:0x0137, B:63:0x0151, B:64:0x0159, B:66:0x015f, B:84:0x01eb, B:85:0x01fe, B:87:0x0204, B:89:0x0218, B:90:0x0223, B:91:0x0227, B:93:0x022d, B:94:0x0237, B:95:0x0247, B:97:0x024d, B:99:0x025f, B:101:0x026f, B:103:0x0273, B:105:0x0285, B:107:0x028f, B:109:0x02a4, B:111:0x02ae, B:112:0x02b6, B:113:0x02b9, B:114:0x02bc, B:116:0x02c7, B:117:0x02d7, B:119:0x02dd, B:121:0x02ef, B:123:0x02fa, B:124:0x0311, B:126:0x0319, B:128:0x0320, B:130:0x0330, B:134:0x0353, B:133:0x0349, B:68:0x017a, B:69:0x0187, B:71:0x018d, B:73:0x01ad, B:76:0x01b8, B:78:0x01c4, B:79:0x01ce, B:81:0x01d4, B:83:0x01e0, B:56:0x0118), top: B:508:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09d5  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [dxc, nzm] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r12v4, types: [drq] */
    /* JADX WARN: Type inference failed for: r2v37, types: [duv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r40v0, types: [dwm] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.facebook.litho.ComponentHost] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r9v34, types: [elv] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.dvd r41, android.graphics.Rect r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 2985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwm.o(dvd, android.graphics.Rect, boolean):void");
    }

    @Override // defpackage.elu
    public final void p(long j) {
        int iB;
        dvd dvdVar = this.w;
        if (dvdVar != null && (iB = dvdVar.b(j)) >= 0 && i(iB) == null) {
            eme emeVarI = this.w.i(iB);
            E(iB, emeVarI, ((dvu) emeVarI.b).b, this.w);
        }
    }

    @Override // defpackage.elu
    public final void q(long j) {
        dvd dvdVar;
        int iB;
        if (((elv) this.a.e(j)) == null || (dvdVar = this.w) == null || (iB = dvdVar.b(j)) < 0) {
            return;
        }
        x(iB, this.g);
    }

    final void r(Rect rect, boolean z) {
        if (this.i == null) {
            return;
        }
        if (z) {
            emm emmVar = this.j;
            emc emcVar = emd.a;
            boolean z2 = ema.a;
            if (eni.d(emmVar)) {
                eni.c(emmVar, ((enh) emmVar.c).e, true);
                return;
            }
            return;
        }
        emm emmVar2 = this.j;
        boolean zD = eni.d(emmVar2);
        emc emcVar2 = emd.a;
        boolean z3 = ema.a;
        if (zD) {
            eni.c(emmVar2, rect, false);
        }
    }

    public final void s() {
        dyd.a();
        if (this.c == null) {
            return;
        }
        emc emcVar = emd.a;
        boolean z = ema.a;
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            elv elvVarI = i(i);
            if (elvVarI != null && !elvVarI.c) {
                eme emeVar = elvVarI.d;
                duz duzVar = ((dvu) emeVar.b).b;
                Object obj = elvVarI.a;
                Object obj2 = emeVar.c;
                B(elvVarI, duzVar.c, dvu.a(elvVarI), (dvj) obj2, obj);
                if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                    View view = (View) obj;
                    if (view.isLayoutRequested()) {
                        int left = view.getLeft();
                        int top = view.getTop();
                        int right = view.getRight();
                        int bottom = view.getBottom();
                        dyd.a();
                        enc.a(left, top, right, bottom, view, true);
                    }
                }
            }
        }
    }

    @Override // defpackage.elu
    public final void u(eml emlVar) {
        this.A = emlVar;
    }

    public final void v() {
        dyd.a();
        if (this.c == null) {
            return;
        }
        emc emcVar = emd.a;
        boolean z = ema.a;
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            elv elvVarI = i(i);
            if (elvVarI != null && elvVarI.c) {
                duz duzVar = ((dvu) elvVarI.d.b).b;
                K(elvVarI, duzVar.c, elvVarI.a);
            }
        }
        n();
        if (this.i != null) {
            eni.a(this.j);
        }
        if (this.m != null) {
            this.n.c();
        }
    }

    @Override // defpackage.elu
    public final void w(elv elvVar) {
        J(elvVar);
        try {
            dvr dvrVarB = dvr.b(elvVar);
            Context context = this.p.a;
            drq drqVar = ((dvu) elvVar.d.b).b.c;
            if (dvrVarB.b) {
                throw new dvq("Releasing released mount content! component: " + drqVar.d() + ", previousReleaseCause: " + dvrVarB.c);
            }
            if (drqVar instanceof duk) {
                Object obj = elvVar.a;
                boolean z = ebc.a;
            } else {
                Object obj2 = elvVar.a;
                elw elwVarC = ely.c(context, drqVar);
                if (elwVarC != null) {
                    elwVarC.b(obj2);
                }
            }
            dvrVarB.b = true;
            dvrVarB.c = "unmountItem";
        } catch (dvq e) {
            throw new RuntimeException(e.getMessage() + " " + z(elvVar));
        }
    }

    public final void x(int i, wr wrVar) {
        elv elvVarI = i(i);
        if (elvVarI != null) {
            L(elvVarI, wrVar);
        }
    }
}
