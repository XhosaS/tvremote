package defpackage;

import com.google.android.libraries.elements.interfaces.MaterializationResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlb extends mpp {
    private final nid a;
    private final MaterializationResult b;
    private final nxl c = null;

    public mlb(nid nidVar, MaterializationResult materializationResult, nxl nxlVar) {
        this.a = nidVar;
        this.b = materializationResult;
    }

    @Override // defpackage.mpp
    public final nid a() {
        return this.a;
    }

    @Override // defpackage.mpp
    public final nxl b() {
        return null;
    }

    @Override // defpackage.mpp
    public final MaterializationResult c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        MaterializationResult materializationResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mpp) {
            mpp mppVar = (mpp) obj;
            if (this.a.equals(mppVar.a()) && ((materializationResult = this.b) != null ? materializationResult.equals(mppVar.c()) : mppVar.c() == null)) {
                mppVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        MaterializationResult materializationResult = this.b;
        return ((iHashCode * 1000003) ^ (materializationResult == null ? 0 : materializationResult.hashCode())) * 1000003;
    }

    public final String toString() {
        MaterializationResult materializationResult = this.b;
        return "ResolvedElement{element=" + this.a.toString() + ", materializationResult=" + String.valueOf(materializationResult) + ", debuggerInfo=null}";
    }
}
