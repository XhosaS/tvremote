package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yru {
    public static yrp a(yrp yrpVar) {
        return ((yrpVar instanceof yrs) || (yrpVar instanceof yrq)) ? yrpVar : yrpVar instanceof Serializable ? new yrq(yrpVar) : new yrs(yrpVar);
    }
}
