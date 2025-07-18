package defpackage;

import com.google.common.collect.Sets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhk {
    public static final rhk a = new rhk(zcq.d);
    public final yzw b;

    public rhk(yzw yzwVar) {
        this.b = yzwVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rhk) {
            return this.b.equals(((rhk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Sets.a(this.b);
    }
}
