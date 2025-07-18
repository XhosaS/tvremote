package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqx implements eqw {
    public final String a;
    public final ArrayList b;

    public eqx(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqx)) {
            return false;
        }
        eqx eqxVar = (eqx) obj;
        String str = this.a;
        if (str == null ? eqxVar.a == null : str.equals(eqxVar.a)) {
            return this.b.equals(eqxVar.b);
        }
        return false;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.eqw
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // defpackage.eqw
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return null;
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return this;
    }
}
