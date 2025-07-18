package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywv extends yvj {
    final /* synthetic */ ywx a;
    private final Object b;
    private int c;

    public ywv(ywx ywxVar, int i) {
        this.a = ywxVar;
        Object[] objArr = ywxVar.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            ywx ywxVar = this.a;
            if (i < ywxVar.size()) {
                Object obj = this.b;
                int i2 = this.c;
                Object[] objArr = ywxVar.d;
                objArr.getClass();
                if (yqs.a(obj, objArr[i2])) {
                    return;
                }
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.yvj, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.yvj, java.util.Map.Entry
    public final Object getValue() {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        if (mapG != null) {
            return mapG.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = ywxVar.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // defpackage.yvj, java.util.Map.Entry
    public final Object setValue(Object obj) {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        if (mapG != null) {
            return mapG.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            ywxVar.put(this.b, obj);
            return null;
        }
        Object[] objArr = ywxVar.e;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr.getClass();
        objArr[i] = obj;
        return obj2;
    }
}
