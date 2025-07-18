package defpackage;

import com.google.common.collect.ImmutableSet;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eki {
    public static final eki a = new eki(new dxc((byte[]) null, (byte[]) null));
    public final ImmutableSet b;
    public final Double c = null;
    public final Double d = null;
    public final boolean e = true;
    public final boolean f = false;
    public final boolean g = true;
    public final boolean h = true;

    private eki(dxc dxcVar) {
        this.b = (ImmutableSet) dxcVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eki)) {
            return false;
        }
        eki ekiVar = (eki) obj;
        if (!this.b.equals(ekiVar.b)) {
            return false;
        }
        boolean z = ekiVar.f;
        Double d = ekiVar.c;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = ekiVar.d;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z2 = ekiVar.e;
        boolean z3 = ekiVar.g;
        boolean z4 = ekiVar.h;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, null, null, true, false, true, true);
    }
}
