package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lru {
    public final ImmutableList a;
    public final ieg b;

    public lru() {
        throw null;
    }

    public static nwo a() {
        nwo nwoVar = new nwo();
        nwoVar.m(ImmutableList.of());
        return nwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lru) {
            lru lruVar = (lru) obj;
            if (this.a.equals(lruVar.a) && this.b.equals(lruVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.b;
        return "FetchCencLicenseResponse{licenseKeys=" + String.valueOf(this.a) + ", license=" + String.valueOf(iegVar) + "}";
    }

    public lru(ImmutableList immutableList, ieg iegVar) {
        this.a = immutableList;
        this.b = iegVar;
    }
}
