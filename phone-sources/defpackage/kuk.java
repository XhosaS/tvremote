package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuk {
    public static final kuk a = new kuk(ImmutableMap.of(), ImmutableSet.of(), false);
    public final ImmutableMap b;
    public final ImmutableSet c;
    public final boolean d;

    public kuk() {
        throw null;
    }

    public final kuj a(ksy ksyVar) {
        kuj kujVar = (kuj) this.b.get(ksyVar);
        return kujVar != null ? kujVar : kuj.a;
    }

    public final ImmutableList b() {
        ImmutableList.Builder builder = ImmutableList.builder();
        UnmodifiableIterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ksy ksyVar = (ksy) entry.getKey();
            if (((kuj) entry.getValue()).f()) {
                builder.add((ImmutableList.Builder) ksyVar);
            }
        }
        return builder.build();
    }

    public final ImmutableList c(int i) {
        ImmutableList.Builder builder = ImmutableList.builder();
        UnmodifiableIterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ksy ksyVar = (ksy) entry.getKey();
            kuj kujVar = (kuj) entry.getValue();
            if (ksyVar.a == i && (kujVar.f() || kujVar.h() || kujVar.k())) {
                builder.add((ImmutableList.Builder) ksyVar);
            }
        }
        return builder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuk) {
            kuk kukVar = (kuk) obj;
            if (this.b.equals(kukVar.b) && this.c.equals(kukVar.c) && this.d == kukVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        ImmutableSet immutableSet = this.c;
        return "Downloads{downloadStatuses=" + this.b.toString() + ", showsWithDownloadedItems=" + immutableSet.toString() + ", downloadInProgress=" + this.d + "}";
    }

    public kuk(ImmutableMap immutableMap, ImmutableSet immutableSet, boolean z) {
        if (immutableMap == null) {
            throw new NullPointerException("Null downloadStatuses");
        }
        this.b = immutableMap;
        if (immutableSet == null) {
            throw new NullPointerException("Null showsWithDownloadedItems");
        }
        this.c = immutableSet;
        this.d = z;
    }
}
