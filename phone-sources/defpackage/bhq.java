package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhq implements yjz, yka, ykb, ykc, ykd, yke, ykf, ykg, yjl, yjm, yjo, yjp, yjq, yjr, yjs, yjt, yju, yjw, yjx {
    public final boolean a;
    public Object b;
    public List c;
    public bcr d;
    private final int e;

    public bhq(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void f(bao baoVar) {
        bcr bcrVarQ;
        if (!this.a || (bcrVarQ = ((bas) baoVar).Q()) == null) {
            return;
        }
        bcrVarQ.n();
        if (bga.j(this.d, bcrVarQ)) {
            this.d = bcrVarQ;
            return;
        }
        List list = this.c;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(bcrVarQ);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (bga.j((bcr) list.get(i), bcrVarQ)) {
                list.set(i, bcrVarQ);
                return;
            }
        }
        list.add(bcrVarQ);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((bao) obj, ((Number) obj2).intValue());
    }

    public final Object b(bao baoVar, int i) {
        bao baoVarD = baoVar.d(this.e);
        f(baoVarD);
        int iH = i | (baoVarD.F(this) ? bga.h(0) : bga.i(0));
        Object obj = this.b;
        obj.getClass();
        ylh.d(obj, 2);
        Object objA = ((yjz) obj).a(baoVarD, Integer.valueOf(iH));
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bhp(this, 0);
        }
        return objA;
    }

    public final Object c(Object obj, bao baoVar, int i) {
        bao baoVarD = baoVar.d(this.e);
        f(baoVarD);
        int iH = baoVarD.F(this) ? bga.h(1) : bga.i(1);
        Object obj2 = this.b;
        obj2.getClass();
        ylh.d(obj2, 3);
        Object objA = ((yka) obj2).a(obj, baoVarD, Integer.valueOf(iH | i));
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(this, obj, i, 0);
        }
        return objA;
    }

    public final Object d(Object obj, Object obj2, bao baoVar, int i) {
        bao baoVarD = baoVar.d(this.e);
        f(baoVarD);
        int iH = baoVarD.F(this) ? bga.h(2) : bga.i(2);
        Object obj3 = this.b;
        obj3.getClass();
        ylh.d(obj3, 4);
        Object objA = ((ykb) obj3).a(obj, obj2, baoVarD, Integer.valueOf(iH | i));
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, obj, obj2, i, 10);
        }
        return objA;
    }

    public final Object e(Object obj, Object obj2, Object obj3, bao baoVar, int i) {
        bao baoVarD = baoVar.d(this.e);
        f(baoVarD);
        int iH = baoVarD.F(this) ? bga.h(3) : bga.i(3);
        Object obj4 = this.b;
        obj4.getClass();
        ylh.d(obj4, 5);
        Object objA = ((ykc) obj4).a(obj, obj2, obj3, baoVarD, Integer.valueOf(iH | i));
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, obj, obj2, obj3, i, 3, (char[]) null);
        }
        return objA;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (bao) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (bao) obj3, ((Number) obj4).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ykc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, obj4, ((Number) obj5).intValue());
    }
}
