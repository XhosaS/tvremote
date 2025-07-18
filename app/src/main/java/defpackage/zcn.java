package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zcn implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public zcn(zbp zbpVar) {
        int size = zbpVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (zbo zboVar : zbpVar.j()) {
            this.a[i] = zboVar.b();
            this.b[i] = zboVar.a();
            i++;
        }
    }

    Object readResolve() {
        Object[] objArr = this.a;
        yzg yzgVar = new yzg(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            yzgVar.f(objArr[i], this.b[i]);
        }
        return yzgVar.a();
    }
}
