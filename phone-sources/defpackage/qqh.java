package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqh implements qqc {
    private qqh() {
    }

    @Override // defpackage.qqc
    public final /* synthetic */ Map a() {
        return qtl.s(this);
    }

    @Override // defpackage.qqc
    public final void b(ImmutableMap.Builder builder) {
        builder.put(qqn.a, new qpu(wcq.aj(qqj.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqh)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -14934830;
    }

    public final String toString() {
        return "GnpZwiebackInAppRegistrationData";
    }
}
