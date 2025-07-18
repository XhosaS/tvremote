package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvn implements lhf {
    public final Map a;
    public final ieg b;

    public mvn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvn) {
            mvn mvnVar = (mvn) obj;
            if (this.a.equals(mvnVar.a) && this.b.equals(mvnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.b;
        return "OptionsEvent{optionChoicesMap=" + this.a.toString() + ", getAssetId=" + iegVar.toString() + "}";
    }

    public mvn(Map map, ieg iegVar) {
        this.a = map;
        if (iegVar == null) {
            throw new NullPointerException("Null getAssetId");
        }
        this.b = iegVar;
    }
}
