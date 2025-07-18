package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rif {
    public final rih a;
    public final rih b;
    public final ImmutableList c;
    private final rrx d;

    public rif() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rif) {
            rif rifVar = (rif) obj;
            if (this.a.equals(rifVar.a) && this.b.equals(rifVar.b) && this.d.equals(rifVar.d)) {
                ImmutableList immutableList = this.c;
                ImmutableList immutableList2 = rifVar.c;
                if (immutableList != null ? immutableList.equals(immutableList2) : immutableList2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        ImmutableList immutableList = this.c;
        return (iHashCode * 1000003) ^ (immutableList == null ? 0 : immutableList.hashCode());
    }

    public final String toString() {
        ImmutableList immutableList = this.c;
        rrx rrxVar = this.d;
        rih rihVar = this.b;
        return "ImageModelLoader{imageRetriever=" + String.valueOf(this.a) + ", secondaryImageRetriever=" + String.valueOf(rihVar) + ", defaultImageRetriever=" + String.valueOf(rrxVar) + ", postProcessors=" + String.valueOf(immutableList) + "}";
    }

    public rif(rih rihVar, rih rihVar2, rrx rrxVar, ImmutableList immutableList) {
        this.a = rihVar;
        this.b = rihVar2;
        this.d = rrxVar;
        this.c = immutableList;
    }
}
