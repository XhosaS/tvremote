package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class edk extends hz {
    private final List a;
    private final List b;
    private final ecr c;
    private final dtu d;
    private final dtu e;

    public edk(ecr ecrVar, List list, List list2) {
        this.c = ecrVar;
        int i = edj.s;
        this.d = ecrVar.p() == null ? null : ((edj) ecrVar.p()).p;
        this.e = ecrVar.p() != null ? ((edj) ecrVar.p()).o : null;
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.hz
    public final int a() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.hz
    public final int b() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.hz
    public final boolean c(int i, int i2) {
        List list;
        List list2 = this.a;
        if (list2 == null || (list = this.b) == null) {
            return false;
        }
        Object obj = list2.get(i);
        Object obj2 = list.get(i2);
        if (obj == obj2) {
            return true;
        }
        dtu dtuVar = this.e;
        if (dtuVar == null) {
            return obj.equals(obj2);
        }
        int i3 = edj.s;
        edo edoVar = new edo();
        edoVar.a = obj;
        edoVar.b = obj2;
        return ((Boolean) dtuVar.b.n().x(dtuVar, edoVar)).booleanValue();
    }

    @Override // defpackage.hz
    public final boolean d(int i, int i2) {
        List list;
        List list2 = this.a;
        if (list2 == null || (list = this.b) == null) {
            return false;
        }
        return f(list2.get(i), list.get(i2));
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        dtu dtuVar = this.d;
        if (dtuVar == null) {
            return obj.equals(obj2);
        }
        int i = edj.s;
        edp edpVar = new edp();
        edpVar.a = obj;
        edpVar.b = obj2;
        return ((Boolean) dtuVar.b.n().x(dtuVar, edpVar)).booleanValue();
    }
}
