package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwh {
    public final CharSequence a;
    public final CharSequence b;
    public final tst c;
    public final tst d;
    public final tst e;

    public mwh() {
        throw null;
    }

    public static uje a() {
        uje ujeVar = new uje(null, null);
        ujeVar.f("");
        ujeVar.e("");
        trk trkVar = trk.a;
        ujeVar.a = trkVar;
        ujeVar.b = trkVar;
        ujeVar.c = trkVar;
        return ujeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwh) {
            mwh mwhVar = (mwh) obj;
            if (this.a.equals(mwhVar.a) && this.b.equals(mwhVar.b) && this.c.equals(mwhVar.c) && this.d.equals(mwhVar.d) && this.e.equals(mwhVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        tst tstVar = this.e;
        tst tstVar2 = this.d;
        tst tstVar3 = this.c;
        CharSequence charSequence = this.b;
        return "WelcomeCardViewModel{title=" + String.valueOf(this.a) + ", detailContent=" + String.valueOf(charSequence) + ", imageResId=" + String.valueOf(tstVar3) + ", primaryAction=" + String.valueOf(tstVar2) + ", secondaryAction=" + String.valueOf(tstVar) + "}";
    }

    public mwh(CharSequence charSequence, CharSequence charSequence2, tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = tstVar;
        this.d = tstVar2;
        this.e = tstVar3;
    }
}
