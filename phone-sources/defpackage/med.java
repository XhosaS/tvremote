package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class med implements Serializable {
    private static final long serialVersionUID = 1;
    public byte[] a;

    private Object readResolve() {
        return new mee(this.a);
    }
}
