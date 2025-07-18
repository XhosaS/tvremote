package defpackage;

import com.google.common.collect.Lists;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wta extends wxm {
    private final yyk a;
    private final yyk b;
    private final UUID c;
    private final long d;

    public wta(yyk yykVar, yyk yykVar2, UUID uuid, long j) {
        this.a = yykVar;
        this.b = yykVar2;
        this.c = uuid;
        this.d = j;
    }

    @Override // defpackage.wxm
    public final long a() {
        return this.d;
    }

    @Override // defpackage.wxm
    public final yyk b() {
        return this.b;
    }

    @Override // defpackage.wxm
    public final yyk c() {
        return this.a;
    }

    @Override // defpackage.wxm
    public final UUID d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wxm) {
            wxm wxmVar = (wxm) obj;
            if (Lists.d(this.a, wxmVar.c()) && Lists.d(this.b, wxmVar.b()) && this.c.equals(wxmVar.d()) && this.d == wxmVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
