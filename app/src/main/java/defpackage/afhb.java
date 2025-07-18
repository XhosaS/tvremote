package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhb {
    public final List a;
    public final afeh b;
    public final Object[][] c;

    public afhb(List list, afeh afehVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        afehVar.getClass();
        this.b = afehVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("addrs", this.a);
        yqqVarB.b("attrs", this.b);
        yqqVarB.b("customOptions", Arrays.deepToString(this.c));
        return yqqVarB.toString();
    }
}
