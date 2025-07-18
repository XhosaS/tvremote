package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqn implements eqw {
    public final eqw a;
    public final String b;

    public eqn() {
        this.a = f;
        this.b = "return";
    }

    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return new eqn(this.b, this.a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqn)) {
            return false;
        }
        eqn eqnVar = (eqn) obj;
        return this.b.equals(eqnVar.b) && this.a.equals(eqnVar.a);
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.eqw
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.eqw
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return null;
    }

    public eqn(String str) {
        this.a = f;
        this.b = str;
    }

    public eqn(String str, eqw eqwVar) {
        this.a = eqwVar;
        this.b = str;
    }
}
