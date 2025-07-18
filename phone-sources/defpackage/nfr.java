package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfr extends nez {
    @Override // defpackage.nez
    public final void b() {
        this.b.g("rate");
    }

    @Override // defpackage.nez
    public final void j(ekl eklVar, eai eaiVar, boolean z) {
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(eklVar.a);
        sbE.append(String.format(Locale.US, "%.3f", Float.valueOf(eaiVar.d)));
        nfaVar.f("rate", sbE.toString());
    }
}
