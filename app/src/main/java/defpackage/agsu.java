package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agsu implements Serializable {
    private static final long serialVersionUID = 0;
    private final agte[] a;

    public agsu(agte[] agteVarArr) {
        this.a = agteVarArr;
    }

    private final Object readResolve() {
        agte agteVarPlus = agtf.a;
        int i = 0;
        while (true) {
            agte[] agteVarArr = this.a;
            if (i >= agteVarArr.length) {
                return agteVarPlus;
            }
            agteVarPlus = agteVarPlus.plus(agteVarArr[i]);
            i++;
        }
    }
}
