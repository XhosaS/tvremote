package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybl {
    public final String a;
    public final Map b;

    public ybl(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybl) {
            ybl yblVar = (ybl) obj;
            if (this.a.equals(yblVar.a) && this.b.equals(yblVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("policyName", this.a);
        tssVarH.b("rawConfigValue", this.b);
        return tssVarH.toString();
    }
}
