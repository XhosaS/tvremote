package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebb {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public final eba c;
    public final ImmutableList d;

    public ebb(eba ebaVar, int i) {
        this(ebaVar, ImmutableList.of(Integer.valueOf(i)));
    }

    public final int a() {
        return this.c.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ebb ebbVar = (ebb) obj;
            if (this.c.equals(ebbVar.c) && this.d.equals(ebbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d.hashCode() * 31);
    }

    public ebb(eba ebaVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= ebaVar.c)) {
            throw new IndexOutOfBoundsException();
        }
        this.c = ebaVar;
        this.d = ImmutableList.copyOf((Collection) list);
    }
}
