package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yys implements Serializable {
    private static final long serialVersionUID = 0;
    final yyr a;

    public yys(yyr yyrVar) {
        this.a = yyrVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
