package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdm implements bcj {
    private final bdu a;

    public bdm(bdu bduVar) {
        this.a = bduVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        if (bceVar != bce.ON_CREATE) {
            Objects.toString(bceVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(bceVar.toString()));
        }
        bclVar.ek().c(this);
        this.a.b();
    }
}
