package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbp {
    public static final zbp a = new zbp(yfm.aq(new ArrayList()), null);
    public final Set b;
    public final zgb c;

    public zbp(Set set, zgb zgbVar) {
        this.b = set;
        this.c = zgbVar;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbp)) {
            return false;
        }
        zbp zbpVar = (zbp) obj;
        return yks.e(zbpVar.b, this.b) && yks.e(zbpVar.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() + 1517;
        zgb zgbVar = this.c;
        return (iHashCode * 41) + (zgbVar != null ? zgbVar.hashCode() : 0);
    }
}
