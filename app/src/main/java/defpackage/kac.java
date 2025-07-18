package defpackage;

import com.google.common.collect.Sets;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kac {
    public static final kac a = new kac(Sets.b(EnumSet.allOf(kad.class)));
    public static final kac b = new kac(zcp.b);
    public static final kac c = new kac(yyd.a(EnumSet.of(kad.ZWIEBACK, new kad[0])));
    public final yzq d;

    public kac(yzq yzqVar) {
        this.d = yzqVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kac) && this.d.equals(((kac) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
