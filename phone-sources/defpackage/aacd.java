package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aacd extends aacn implements Cloneable, Serializable, aacg {
    private static final long serialVersionUID = 2852608688135209575L;

    public aacd() {
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public aacd(aabs aabsVar) {
        super(0L, aadl.Q(aabsVar));
    }
}
