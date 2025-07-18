package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpa implements Serializable, agpc {
    private final Object a;

    public agpa(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.agpc
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.agpc
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
