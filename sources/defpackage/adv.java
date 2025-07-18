package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv {
    public static final adv a;
    public static final adv b;
    public static final adv c;
    public final cab d;

    static {
        cab cabVarH;
        EnumSet enumSetAllOf = EnumSet.allOf(adw.class);
        if (enumSetAllOf instanceof Collection) {
            cabVarH = enumSetAllOf.isEmpty() ? cbd.a : bzn.h(EnumSet.copyOf((Collection) enumSetAllOf));
        } else {
            Iterator it = enumSetAllOf.iterator();
            if (it.hasNext()) {
                EnumSet enumSetOf = EnumSet.of((Enum) it.next());
                biu.i(enumSetOf, it);
                cabVarH = bzn.h(enumSetOf);
            } else {
                cabVarH = cbd.a;
            }
        }
        a = new adv(cabVarH);
        b = new adv(cbd.a);
        c = new adv(bzn.h(EnumSet.of(adw.ZWIEBACK, new adw[0])));
    }

    public adv(cab cabVar) {
        this.d = cabVar;
    }

    public final boolean a(adw adwVar) {
        return this.d.contains(adwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adv) && this.d.equals(((adv) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
