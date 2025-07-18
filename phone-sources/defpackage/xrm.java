package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrm {
    public final List a;
    public final xpv b;
    public final Object[][] c;

    public xrm(List list, xpv xpvVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        xpvVar.getClass();
        this.b = xpvVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("addrs", this.a);
        tssVarH.b("attrs", this.b);
        tssVarH.b("customOptions", Arrays.deepToString(this.c));
        return tssVarH.toString();
    }
}
