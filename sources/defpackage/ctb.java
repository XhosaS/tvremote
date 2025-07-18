package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctb implements Serializable, cta {
    public static final ctb a = new ctb();
    private static final long serialVersionUID = 0;

    private ctb() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.cta
    public final csy get(csz cszVar) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.cta
    public final cta minusKey(csz cszVar) {
        cszVar.getClass();
        return this;
    }

    @Override // defpackage.cta
    public final cta plus(cta ctaVar) {
        ctaVar.getClass();
        return ctaVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.cta
    public final Object fold(Object obj, cty ctyVar) {
        return obj;
    }
}
