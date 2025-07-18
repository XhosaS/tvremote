package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjn {
    public final ExperimentTokens a;
    public final String b;

    public rjn(ExperimentTokens experimentTokens, String str) {
        str.getClass();
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjn)) {
            return false;
        }
        rjn rjnVar = (rjn) obj;
        return agvy.c(this.a, rjnVar.a) && agvy.c(this.b, rjnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
