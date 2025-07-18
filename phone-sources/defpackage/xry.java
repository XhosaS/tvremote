package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xry extends xrn {
    public xst b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("policy", c());
        tssVarH.d("priority", 5);
        tssVarH.f("available", true);
        return tssVarH.toString();
    }
}
