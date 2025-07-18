package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtu implements elq, dtn {
    public dui b;
    public final int c;
    public final Object[] d;

    public dtu(dui duiVar, int i, Object[] objArr) {
        this.b = duiVar;
        this.c = i;
        this.d = objArr;
    }

    @Override // defpackage.dtn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(dtu dtuVar) {
        if (this == dtuVar) {
            return true;
        }
        if (dtuVar == null) {
            return false;
        }
        if (dtuVar.getClass() != getClass() || this.c != dtuVar.c) {
            return false;
        }
        Object[] objArr = this.d;
        Object[] objArr2 = dtuVar.d;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null) {
            if (objArr.length == objArr2.length) {
                for (int i = 1; i < objArr.length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj == null) {
                        if (obj2 != null) {
                            return false;
                        }
                    } else {
                        if (!obj.equals(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void cC(Object obj) {
        this.b.n().x(this, obj);
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ void d(Object[] objArr) {
        cC(objArr[0]);
    }

    public final String toString() {
        dui duiVar = this.b;
        return (duiVar == null || duiVar == this) ? super.toString() : duiVar.toString();
    }
}
