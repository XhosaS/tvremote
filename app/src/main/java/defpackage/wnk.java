package defpackage;

import com.google.common.collect.Sets;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnk extends wnp {
    public final long a;
    public final long b;
    public final Map c;

    public wnk(long j, long j2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = map;
    }

    @Override // defpackage.wnp
    public final long a() {
        return this.a;
    }

    @Override // defpackage.wnp
    public final long b() {
        return this.b;
    }

    @Override // defpackage.wnp
    public final Map c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnp) {
            wnp wnpVar = (wnp) obj;
            if (this.a == wnpVar.a() && this.b == wnpVar.b() && zbk.e(this.c, wnpVar.c())) {
                wnpVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = Sets.a(((yyr) this.c).entrySet());
        long j = this.b;
        long j2 = this.a;
        return ((iA ^ ((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + zbk.c(this.c) + ", allowMultiprocess=false}";
    }

    @Override // defpackage.wnp
    public final void d() {
    }
}
