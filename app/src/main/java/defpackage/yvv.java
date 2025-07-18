package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvv extends zca implements Serializable {
    private static final long serialVersionUID = 0;
    final yqi a;
    final zca b;

    public yvv(yqi yqiVar, zca zcaVar) {
        this.a = yqiVar;
        this.b = zcaVar;
    }

    @Override // defpackage.zca, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yqi yqiVar = this.a;
        return this.b.compare(yqiVar.apply(obj), yqiVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yvv) {
            yvv yvvVar = (yvv) obj;
            if (this.a.equals(yvvVar.a) && this.b.equals(yvvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        yqi yqiVar = this.a;
        return this.b.toString() + ".onResultOf(" + yqiVar.toString() + ")";
    }
}
