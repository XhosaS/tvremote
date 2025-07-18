package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxn {
    public final bzs a;
    public final bzs b;
    public final UUID c;
    public final long d;

    public bxn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxn) {
            bxn bxnVar = (bxn) obj;
            if (biu.h(this.a, bxnVar.a) && biu.h(this.b, bxnVar.b) && this.c.equals(bxnVar.c) && this.d == bxnVar.d) {
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

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }

    public bxn(bzs bzsVar, bzs bzsVar2, UUID uuid) {
        this.a = bzsVar;
        this.b = bzsVar2;
        this.c = uuid;
        this.d = -1L;
    }
}
