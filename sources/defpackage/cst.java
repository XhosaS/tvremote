package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cst implements Serializable {
    private static final long serialVersionUID = 0;
    private final cta[] a;

    public cst(cta[] ctaVarArr) {
        this.a = ctaVarArr;
    }

    private final Object readResolve() {
        cta ctaVarPlus = ctb.a;
        int i = 0;
        while (true) {
            cta[] ctaVarArr = this.a;
            if (i >= ctaVarArr.length) {
                return ctaVarPlus;
            }
            ctaVarPlus = ctaVarPlus.plus(ctaVarArr[i]);
            i++;
        }
    }
}
