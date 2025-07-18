package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwu {
    public final mwv a;
    public final tst b;
    public final boolean c;
    public final boolean d;
    public final tst e;

    public mwu() {
        throw null;
    }

    public static qsl a() {
        qsl qslVar = new qsl(null, null);
        qslVar.b = mwv.a().d();
        trk trkVar = trk.a;
        qslVar.c = trkVar;
        qslVar.e(false);
        qslVar.f(false);
        qslVar.a = trkVar;
        return qslVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwu) {
            mwu mwuVar = (mwu) obj;
            if (this.a.equals(mwuVar.a) && this.b.equals(mwuVar.b) && this.c == mwuVar.c && this.d == mwuVar.d && this.e.equals(mwuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        tst tstVar = this.e;
        tst tstVar2 = this.b;
        return "ActionPanelViewModel{primaryAction=" + String.valueOf(this.a) + ", secondaryAction=" + String.valueOf(tstVar2) + ", discountsAvailable=" + this.c + ", watchOnGpmRibbon=" + this.d + ", interactionLogger=" + String.valueOf(tstVar) + "}";
    }

    public mwu(mwv mwvVar, tst tstVar, boolean z, boolean z2, tst tstVar2) {
        this.a = mwvVar;
        this.b = tstVar;
        this.c = z;
        this.d = z2;
        this.e = tstVar2;
    }
}
