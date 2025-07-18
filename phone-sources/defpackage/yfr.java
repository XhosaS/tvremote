package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfr implements Serializable, yft {
    private final Object a;

    public yfr(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.yft
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.yft
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
