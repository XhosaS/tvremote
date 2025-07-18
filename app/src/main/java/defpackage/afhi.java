package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhi {
    public final List a;
    public final afeh b;
    public final Object c;

    public afhi(List list, afeh afehVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        afehVar.getClass();
        this.b = afehVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afhi)) {
            return false;
        }
        afhi afhiVar = (afhi) obj;
        return yqs.a(this.a, afhiVar.a) && yqs.a(this.b, afhiVar.b) && yqs.a(this.c, afhiVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("addresses", this.a);
        yqqVarB.b("attributes", this.b);
        yqqVarB.b("loadBalancingPolicyConfig", this.c);
        return yqqVarB.toString();
    }
}
