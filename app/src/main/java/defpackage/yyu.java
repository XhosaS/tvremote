package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyu implements Serializable {
    private static final long serialVersionUID = 0;
    final yyr a;

    public yyu(yyr yyrVar) {
        this.a = yyrVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
