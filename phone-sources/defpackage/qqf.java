package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqf implements qqc {
    private final Multimap a;
    private final Map b;

    public qqf(Multimap multimap, byte[] bArr) {
        this.a = multimap;
        this.b = null;
    }

    @Override // defpackage.qqc
    public final /* synthetic */ Map a() {
        return qtl.s(this);
    }

    @Override // defpackage.qqc
    public final void b(ImmutableMap.Builder builder) {
        Multimap multimap = this.a;
        if (multimap.isEmpty()) {
            return;
        }
        for (Object obj : multimap.keySet()) {
            obj.getClass();
            String str = (String) obj;
            qpz qpzVar = new qpz(str);
            Collection collection = multimap.get(str);
            collection.getClass();
            builder.put(qpzVar, new qpu(yfm.aq(collection)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqf)) {
            return false;
        }
        qqf qqfVar = (qqf) obj;
        if (!yks.e(this.a, qqfVar.a)) {
            return false;
        }
        Map map = qqfVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "GnpSignedInRegistrationData(gaiaAccounts=" + this.a + ", delegatedGaiaAccounts=null)";
    }

    public /* synthetic */ qqf(Multimap multimap) {
        this(multimap, null);
    }
}
