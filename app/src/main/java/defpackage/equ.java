package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class equ implements eqw {
    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return eqw.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof equ;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return false;
    }

    @Override // defpackage.eqw
    public final Double h() {
        return Double.valueOf(0.0d);
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.eqw
    public final String i() {
        return "null";
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return null;
    }
}
