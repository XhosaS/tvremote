package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebh {
    public static final ebh a = new ebh(ImmutableList.of());
    public static final String b = edt.Z(0);
    public final ImmutableList c;

    public ebh(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.c;
            if (i2 >= immutableList.size()) {
                return false;
            }
            ebg ebgVar = (ebg) immutableList.get(i2);
            boolean[] zArr = ebgVar.i;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (ebgVar.a() == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.c.equals(((ebh) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
