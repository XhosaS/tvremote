package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfr extends rfp {
    private final tst a;

    public rfr() {
        throw null;
    }

    @Override // defpackage.rfp
    public final tst a() {
        return trk.a;
    }

    @Override // defpackage.rfp
    public final ImmutableList b() {
        return ImmutableList.of();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfr) {
            return this.a.equals(((rfr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=" + String.valueOf(this.a) + "}";
    }

    public rfr(tst tstVar) {
        this.a = tstVar;
    }

    @Override // defpackage.rfp
    public final void c() {
    }

    @Override // defpackage.rfp
    public final void d() {
    }
}
