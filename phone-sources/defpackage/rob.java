package defpackage;

import android.support.v7.widget.ActivityChooserView;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rob implements roc {
    private final boolean a;
    private final Instant b;
    private final /* synthetic */ int c;
    private final vuc d;

    private rob(vuc vucVar, boolean z, Instant instant, int i) {
        this.c = i;
        this.d = vucVar;
        this.a = z;
        this.b = instant;
    }

    public static rob c(zbh zbhVar) {
        Instant instant = Instant.EPOCH;
        vwe vweVar = zbhVar.c;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        Instant instantD = vxr.d(vweVar);
        boolean z = false;
        for (zbg zbgVar : zbhVar.b) {
            vtl vtlVar = zbgVar.c;
            if (vtlVar == null) {
                vtlVar = vtl.a;
            }
            Instant instantPlus = instantD.plus(vxr.c(vtlVar));
            vtl vtlVar2 = zbgVar.d;
            if (vtlVar2 == null) {
                vtlVar2 = vtl.a;
            }
            Instant instantPlus2 = instantPlus.plus(vxr.c(vtlVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((zbgVar.b & 16) != 0);
        }
        return new rob(zbhVar, z, instant, 0);
    }

    public static rob d(zaa zaaVar) {
        Instant instant = Instant.EPOCH;
        vwe vweVar = zaaVar.b;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        Instant instantD = vxr.d(vweVar);
        HashSet hashSet = new HashSet();
        for (zae zaeVar : zaaVar.c) {
            vtl vtlVar = zaeVar.d;
            if (vtlVar == null) {
                vtlVar = vtl.a;
            }
            Instant instantPlus = instantD.plus(vxr.c(vtlVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = zaeVar.b;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(zaeVar.c));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(zaeVar.c));
            }
        }
        return new rob(zaaVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.roc
    public final long a() {
        int iK;
        int iK2;
        if (this.c != 0) {
            vuc vucVar = this.d;
            if (vucVar.A()) {
                iK2 = vucVar.k(null);
                if (iK2 < 0) {
                    throw new IllegalStateException(a.cf(iK2, "serialized size must be non-negative, was "));
                }
            } else {
                int i = vucVar.O & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (i != Integer.MAX_VALUE) {
                    iK2 = i;
                } else {
                    int iK3 = vucVar.k(null);
                    if (iK3 < 0) {
                        throw new IllegalStateException(a.cf(iK3, "serialized size must be non-negative, was "));
                    }
                    vucVar.O = (Integer.MIN_VALUE & vucVar.O) | iK3;
                    iK2 = iK3;
                }
            }
            return iK2;
        }
        vuc vucVar2 = this.d;
        if (vucVar2.A()) {
            iK = vucVar2.k(null);
            if (iK < 0) {
                throw new IllegalStateException(a.cf(iK, "serialized size must be non-negative, was "));
            }
        } else {
            int i2 = vucVar2.O & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (i2 != Integer.MAX_VALUE) {
                iK = i2;
            } else {
                int iK4 = vucVar2.k(null);
                if (iK4 < 0) {
                    throw new IllegalStateException(a.cf(iK4, "serialized size must be non-negative, was "));
                }
                vucVar2.O = (Integer.MIN_VALUE & vucVar2.O) | iK4;
                iK = iK4;
            }
        }
        return iK;
    }

    @Override // defpackage.roc
    public final /* synthetic */ Object b() {
        return this.c != 0 ? this.d : this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            rob robVar = (rob) obj;
            boolean z = robVar.a;
            boolean z2 = this.a;
            return z2 != z ? !z2 ? 1 : -1 : robVar.b.compareTo(this.b);
        }
        rob robVar2 = (rob) obj;
        boolean z3 = robVar2.a;
        boolean z4 = this.a;
        return z4 != z3 ? !z4 ? 1 : -1 : robVar2.b.compareTo(this.b);
    }
}
