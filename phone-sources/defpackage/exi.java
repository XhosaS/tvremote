package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exi {
    public static final exi a = new exi(new eba[0]);
    public static final String b = edt.Z(0);
    public final int c;
    public final ImmutableList d;
    private int e;

    /* JADX WARN: Multi-variable type inference failed */
    public exi(eba... ebaVarArr) {
        this.d = ImmutableList.copyOf(ebaVarArr);
        this.c = ebaVarArr.length;
        int i = 0;
        while (i < this.d.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.d.size(); i3++) {
                if (((eba) this.d.get(i)).equals(this.d.get(i3))) {
                    edb.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(eba ebaVar) {
        int iIndexOf = this.d.indexOf(ebaVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eba b(int i) {
        return (eba) this.d.get(i);
    }

    public final ImmutableList c() {
        return ImmutableList.copyOf((Collection) Lists.transform(this.d, new dzc(17)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            exi exiVar = (exi) obj;
            if (this.c == exiVar.c && this.d.equals(exiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.d.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.d.toString();
    }
}
