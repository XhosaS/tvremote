package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrt {
    public final List a;
    public final xpv b;
    public final Object c;

    public xrt(List list, xpv xpvVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        xpvVar.getClass();
        this.b = xpvVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xrt)) {
            return false;
        }
        xrt xrtVar = (xrt) obj;
        return a.Q(this.a, xrtVar.a) && a.Q(this.b, xrtVar.b) && a.Q(this.c, xrtVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("addresses", this.a);
        tssVarH.b("attributes", this.b);
        tssVarH.b("loadBalancingPolicyConfig", this.c);
        return tssVarH.toString();
    }
}
