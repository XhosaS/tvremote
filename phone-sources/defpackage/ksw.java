package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksw {
    public final String a;
    public final String b;
    public final tst c;
    public final kys d;
    public final ImmutableList e;
    public final tst f;
    public final tst g;
    public final ImmutableList h;

    public ksw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksw) {
            ksw kswVar = (ksw) obj;
            if (this.a.equals(kswVar.a) && this.b.equals(kswVar.b) && this.c.equals(kswVar.c) && this.d.equals(kswVar.d) && this.e.equals(kswVar.e) && this.f.equals(kswVar.f) && this.g.equals(kswVar.g) && this.h.equals(kswVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.h;
        tst tstVar = this.g;
        tst tstVar2 = this.f;
        ImmutableList immutableList2 = this.e;
        kys kysVar = this.d;
        return "AssetContainerCollection{collectionId=" + this.a + ", title=" + this.b + ", subtitle=" + String.valueOf(this.c) + ", serverCookie=" + String.valueOf(kysVar) + ", assets=" + String.valueOf(immutableList2) + ", paginationToken=" + String.valueOf(tstVar2) + ", moduleBackground=" + String.valueOf(tstVar) + ", images=" + String.valueOf(immutableList) + "}";
    }

    public ksw(String str, String str2, tst tstVar, kys kysVar, ImmutableList immutableList, tst tstVar2, tst tstVar3, ImmutableList immutableList2) {
        this.a = str;
        this.b = str2;
        this.c = tstVar;
        this.d = kysVar;
        this.e = immutableList;
        this.f = tstVar2;
        this.g = tstVar3;
        this.h = immutableList2;
    }
}
