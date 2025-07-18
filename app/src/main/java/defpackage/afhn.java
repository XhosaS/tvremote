package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afhn extends afhc {
    public afip b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("policy", c());
        yqqVarB.c("priority", "5");
        yqqVarB.c("available", "true");
        return yqqVarB.toString();
    }
}
