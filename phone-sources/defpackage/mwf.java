package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwf {
    public final CharSequence a;
    public final boolean b;
    private final tst c;

    public mwf() {
        throw null;
    }

    public static reo a() {
        reo reoVar = new reo(null, null);
        reoVar.e("");
        reoVar.d(true);
        reoVar.a = trk.a;
        return reoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwf) {
            mwf mwfVar = (mwf) obj;
            if (this.a.equals(mwfVar.a) && this.b == mwfVar.b && this.c.equals(mwfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.c;
        return "WelcomeCardActionViewModel{text=" + String.valueOf(this.a) + ", isPrimary=" + this.b + ", actionNode=" + String.valueOf(tstVar) + "}";
    }

    public mwf(CharSequence charSequence, boolean z, tst tstVar) {
        this.a = charSequence;
        this.b = z;
        this.c = tstVar;
    }
}
