package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bca implements bqm {
    @Override // defpackage.bqm
    public final void a(bqs bqsVar) throws NoSuchMethodException, SecurityException {
        if (!(bqsVar instanceof bem)) {
            Objects.toString(bqsVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(bqsVar.toString()));
        }
        bel belVarEl = ((bem) bqsVar).el();
        bqo bqoVarEn = bqsVar.en();
        Iterator it = belVarEl.b().iterator();
        while (it.hasNext()) {
            beb bebVarA = belVarEl.a((String) it.next());
            if (bebVarA != null) {
                bcc.a(bebVarA, bqoVarEn, bqsVar.ek());
            }
        }
        if (belVarEl.b().isEmpty()) {
            return;
        }
        bqoVarEn.b(bca.class);
    }
}
