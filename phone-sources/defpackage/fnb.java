package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnb {
    public static final /* synthetic */ int e = 0;
    public final fqw a;
    public final int b;
    public final uei c;
    public final boolean d;

    static {
        edt.Z(0);
        edt.Z(1);
        edt.Z(2);
        edt.Z(3);
        edt.Z(4);
        edt.Z(5);
        edt.Z(6);
        edt.Z(7);
        edt.Z(8);
    }

    static ImmutableList a(List list) {
        if (list.isEmpty()) {
            return ImmutableList.of();
        }
        for (int i = 0; i < list.size(); i++) {
            boolean z = ((fnb) list.get(i)).d;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            boolean z2 = ((fnb) list.get(i2)).d;
        }
        return builder.build();
    }

    static void b(List list) {
        if (list.size() <= 0) {
            return;
        }
        uei ueiVar = ((fnb) list.get(0)).c;
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
