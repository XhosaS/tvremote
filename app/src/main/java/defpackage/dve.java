package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dve {
    public final ComponentTree a;
    public dvd b;
    public dxy c;
    public dsz i;
    public dsz j;
    private dsl k;
    public boolean d = false;
    public boolean e = false;
    public final List g = new LinkedList();
    public final List h = new LinkedList();
    public final String f = Thread.currentThread().getName();

    public dve(dvd dvdVar, dxy dxyVar, ComponentTree componentTree, dsl dslVar, dsz dszVar) {
        this.b = dvdVar;
        this.k = dslVar;
        this.a = componentTree;
        this.i = dszVar;
        this.c = dxyVar;
    }

    final void a() {
        this.b = null;
        this.c = null;
        this.k = null;
        this.i = null;
        this.g.add(Thread.currentThread().getName());
    }

    final boolean b() {
        dsl dslVar = this.k;
        boolean z = (dslVar == null || dyd.b() || !dslVar.i) ? false : true;
        dvd dvdVar = this.b;
        return dvdVar != null && dvdVar.G && z;
    }

    public final boolean c() {
        dsl dslVar = this.k;
        return dslVar != null && dslVar.l;
    }
}
