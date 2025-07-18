package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yif implements Serializable {
    private static final long serialVersionUID = 0;
    private final yil[] a;

    public yif(yil[] yilVarArr) {
        this.a = yilVarArr;
    }

    private final Object readResolve() {
        yil yilVarPlus = yim.a;
        int i = 0;
        while (true) {
            yil[] yilVarArr = this.a;
            if (i >= yilVarArr.length) {
                return yilVarPlus;
            }
            yilVarPlus = yilVarPlus.plus(yilVarArr[i]);
            i++;
        }
    }
}
