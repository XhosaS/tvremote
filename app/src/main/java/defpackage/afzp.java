package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzp {
    final afhn a;
    final Object b;

    public afzp(afhn afhnVar, Object obj) {
        this.a = afhnVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afzp afzpVar = (afzp) obj;
            if (yqs.a(this.a, afzpVar.a) && yqs.a(this.b, afzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("provider", this.a);
        yqqVarB.b("config", this.b);
        return yqqVarB.toString();
    }
}
