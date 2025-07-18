package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjc {
    public final lin a;
    public final lin b;
    public final lin c;
    public final lin d;
    public final lin e;
    public final lin f;
    private final lin[] g;

    public mjc(lin linVar, lin linVar2, lin linVar3, lin linVar4, lin linVar5, lin linVar6, lin linVar7, lin linVar8) {
        this.g = new lin[]{linVar, linVar2, linVar3, linVar4, linVar5, linVar6, linVar7, linVar8};
        this.d = linVar;
        this.c = linVar3;
        this.a = linVar4;
        this.b = linVar5;
        this.e = linVar7;
        this.f = linVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mjc) {
            return Arrays.equals(this.g, ((mjc) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g);
    }
}
