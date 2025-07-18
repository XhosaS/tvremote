package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erb implements eqw {
    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return eqw.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof erb;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return false;
    }

    @Override // defpackage.eqw
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.eqw
    public final String i() {
        return "undefined";
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return null;
    }
}
