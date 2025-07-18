package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqw {
    public final ImmutableList a;
    public final ImmutableList b;
    public final UUID c;
    public final long d;

    public tqw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqw) {
            tqw tqwVar = (tqw) obj;
            if (this.a.equals(tqwVar.a) && this.b.equals(tqwVar.b) && this.c.equals(tqwVar.c) && this.d == tqwVar.d) {
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

    public tqw(ImmutableList immutableList, ImmutableList immutableList2, UUID uuid) {
        this.a = immutableList;
        this.b = immutableList2;
        this.c = uuid;
        this.d = -1L;
    }
}
