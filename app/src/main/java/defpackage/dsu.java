package defpackage;

import android.graphics.Rect;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsu {
    public static final /* synthetic */ int c = 0;
    public dvk a;
    public dvs b;
    private int d;

    static {
        new HashMap();
    }

    private dsu() {
    }

    static synchronized dsu c(dvk dvkVar, int i) {
        dsu dsuVar = new dsu();
        dvs dvsVarJ = dvkVar.j();
        if (i >= dvsVarJ.b()) {
            return null;
        }
        dru druVar = dvkVar.b;
        dvsVarJ.k(i).b.i();
        System.identityHashCode(druVar.h);
        dsuVar.a = dvkVar;
        dsuVar.b = dvkVar.j();
        dsuVar.d = i;
        if (dvsVarJ.x == null) {
            dvsVarJ.x = new HashSet();
        }
        dvsVarJ.x.add(dsuVar);
        return dsuVar;
    }

    public static dsu d(ComponentTree componentTree) {
        dvd dvdVar = componentTree == null ? null : componentTree.B;
        dvk dvkVar = dvdVar == null ? null : dvdVar.p;
        if (dvkVar == null) {
            return null;
        }
        return c(dvkVar, Math.max(0, dvkVar.j().b() - 1));
    }

    private static int i(dvk dvkVar) {
        if (dvkVar == null) {
            return 0;
        }
        return ((int) dvkVar.e.c()) + i(dvkVar.f);
    }

    private static int j(dvk dvkVar) {
        if (dvkVar == null) {
            return 0;
        }
        return ((int) dvkVar.e.d()) + j(dvkVar.f);
    }

    public final Rect a() {
        if (this.d == 0) {
            dvk dvkVar = this.a;
            if (dvkVar.f == null) {
                return new Rect(0, 0, (int) dvkVar.e.b(), (int) this.a.e.a());
            }
        }
        int i = i(this.a);
        int iJ = j(this.a);
        return new Rect(i, iJ, ((int) this.a.e.b()) + i, ((int) this.a.e.a()) + iJ);
    }

    public final drq b() {
        return this.b.k(this.d).a;
    }

    public final dsx e() {
        if (h()) {
            return new dsx(this.a);
        }
        return null;
    }

    public final dvz f() {
        ComponentTree componentTree = this.a.b.h;
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    public final List g() {
        if (!h()) {
            dsu dsuVarC = c(this.a, this.d - 1);
            return dsuVarC != null ? Collections.singletonList(dsuVarC) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int iH = this.a.h();
        for (int i = 0; i < iH; i++) {
            dsu dsuVarC2 = c(this.a.i(i), Math.max(0, r4.j().b() - 1));
            if (dsuVarC2 != null) {
                arrayList.add(dsuVarC2);
            }
        }
        dvk dvkVar = this.a;
        dvk dvkVar2 = dvkVar instanceof dwo ? ((dwo) dvkVar).n : null;
        if (dvkVar2 != null) {
            int iH2 = dvkVar2.h();
            for (int i2 = 0; i2 < iH2; i2++) {
                dsu dsuVarC3 = c(dvkVar2.i(i2), Math.max(0, r5.j().b() - 1));
                if (dsuVarC3 != null) {
                    arrayList.add(dsuVarC3);
                }
            }
        }
        return arrayList;
    }

    public final boolean h() {
        return this.d == 0;
    }
}
