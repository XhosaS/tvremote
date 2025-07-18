package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aheb extends agsq implements ahdl {
    public static final aheb a = new aheb();

    private aheb() {
        super(ahdl.c);
    }

    @Override // defpackage.ahdl
    public final ahcn fA(boolean z, boolean z2, agux aguxVar) {
        return ahec.a;
    }

    @Override // defpackage.ahdl
    public final boolean fB() {
        return false;
    }

    @Override // defpackage.ahdl
    public final Object fz(agsw agswVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ahdl
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ahdl
    public final agxs p() {
        throw null;
    }

    @Override // defpackage.ahdl
    public final ahaw q(ahay ahayVar) {
        return ahec.a;
    }

    @Override // defpackage.ahdl
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ahdl
    public final boolean v() {
        return false;
    }

    @Override // defpackage.ahdl
    public final void x() {
    }

    @Override // defpackage.ahdl
    public final void s(CancellationException cancellationException) {
    }

    @Override // defpackage.ahdl
    public final void w(agux aguxVar) {
    }
}
