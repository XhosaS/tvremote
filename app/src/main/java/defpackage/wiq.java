package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiq extends bco {
    private wsz d;

    public wiq(bw bwVar) {
        super(bwVar);
    }

    @Override // defpackage.bco
    public final void e(bce bceVar) {
        super.d("getObserverCount");
        if (this.b.e <= 0) {
            super.e(bceVar);
            return;
        }
        wsz wszVar = this.d;
        int iOrdinal = bceVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                wwc wwcVar = wwb.a;
                wwcVar.getClass();
                wszVar.s("Lifecycle.Started", wwcVar);
            } else if (iOrdinal == 2) {
                wwc wwcVar2 = wwb.a;
                wwcVar2.getClass();
                wszVar.s("Lifecycle.Resumed", wwcVar2);
            } else if (iOrdinal == 3) {
                wwc wwcVar3 = wwb.a;
                wwcVar3.getClass();
                wszVar.s("Lifecycle.Paused", wwcVar3);
            } else if (iOrdinal == 4) {
                wwc wwcVar4 = wwb.a;
                wwcVar4.getClass();
                wszVar.s("Lifecycle.Stopped", wwcVar4);
            } else {
                if (iOrdinal != 5) {
                    Objects.toString(bceVar);
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(bceVar.toString()));
                }
                wwc wwcVar5 = wwb.a;
                wwcVar5.getClass();
                wszVar.s("Lifecycle.Destroyed", wwcVar5);
            }
        } else if (wszVar.e == null) {
            wwc wwcVar6 = wwb.a;
            wwcVar6.getClass();
            wszVar.s("Lifecycle.Created", wwcVar6);
            wszVar.d = true;
        }
        try {
            super.e(bceVar);
        } finally {
            this.d.q(bceVar);
        }
    }

    public final void g(wsz wszVar) {
        yqw.M(this.d == null, "Activity was already created");
        this.d = wszVar;
    }
}
