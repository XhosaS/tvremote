package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyy implements Serializable {
    private static final long serialVersionUID = 0;
    final yyr a;

    public yyy(yyr yyrVar) {
        this.a = yyrVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
