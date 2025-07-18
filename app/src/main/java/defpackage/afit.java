package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afit {
    public final afjw a;
    public final afeh b;
    public final afip c;

    public afit(afjw afjwVar, afeh afehVar, afip afipVar) {
        this.a = afjwVar;
        afehVar.getClass();
        this.b = afehVar;
        this.c = afipVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afit)) {
            return false;
        }
        afit afitVar = (afit) obj;
        return yqs.a(this.a, afitVar.a) && yqs.a(this.b, afitVar.b) && yqs.a(this.c, afitVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("addressesOrError", this.a.toString());
        yqqVarB.b("attributes", this.b);
        yqqVarB.b("serviceConfigOrError", this.c);
        return yqqVarB.toString();
    }
}
