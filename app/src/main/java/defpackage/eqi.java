package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqi {
    public eqh a;
    public eqh b;
    public final List c;

    public eqi() {
        this.a = new eqh("", 0L, null);
        this.b = new eqh("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        eqi eqiVar = new eqi(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            eqiVar.c.add(((eqh) it.next()).clone());
        }
        return eqiVar;
    }

    public eqi(eqh eqhVar) {
        this.a = eqhVar;
        this.b = eqhVar.clone();
        this.c = new ArrayList();
    }
}
