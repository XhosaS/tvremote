package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzi implements Serializable {
    final yzj a;

    public yzi(yzj yzjVar) {
        this.a = yzjVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
