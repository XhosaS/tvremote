package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzp {
    public final mul a;
    public final String b;
    public final ImmutableList c;
    public final tst d;
    public final kys e;
    public final tst f;

    public mzp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzp) {
            mzp mzpVar = (mzp) obj;
            if (this.a.equals(mzpVar.a) && this.b.equals(mzpVar.b) && this.c.equals(mzpVar.c) && this.d.equals(mzpVar.d) && this.e.equals(mzpVar.e) && this.f.equals(mzpVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        tst tstVar = this.f;
        kys kysVar = this.e;
        tst tstVar2 = this.d;
        ImmutableList immutableList = this.c;
        return "AssetCardRowViewModel{header=" + String.valueOf(this.a) + ", rowId=" + this.b + ", similarAssets=" + String.valueOf(immutableList) + ", paginationToken=" + String.valueOf(tstVar2) + ", serverCookie=" + String.valueOf(kysVar) + ", moduleBackground=" + String.valueOf(tstVar) + "}";
    }

    public mzp(mul mulVar, String str, ImmutableList immutableList, tst tstVar, kys kysVar, tst tstVar2) {
        this.a = mulVar;
        this.b = str;
        this.c = immutableList;
        this.d = tstVar;
        this.e = kysVar;
        this.f = tstVar2;
    }
}
