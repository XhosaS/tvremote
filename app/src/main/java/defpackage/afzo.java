package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzo {
    public final String a;
    public final Map b;

    public afzo(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afzo) {
            afzo afzoVar = (afzo) obj;
            if (this.a.equals(afzoVar.a) && this.b.equals(afzoVar.b)) {
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
        yqqVarB.b("policyName", this.a);
        yqqVarB.b("rawConfigValue", this.b);
        return yqqVarB.toString();
    }
}
