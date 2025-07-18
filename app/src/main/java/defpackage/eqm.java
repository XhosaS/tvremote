package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqm implements eqw {
    private final boolean a;

    public eqm(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        if ("toString".equals(str)) {
            return new era(Boolean.toString(this.a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.a), str));
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return new eqm(Boolean.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqm) && this.a == ((eqm) obj).a;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.eqw
    public final Double h() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.eqw
    public final String i() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
