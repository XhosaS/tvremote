package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uft extends ufr {
    @Override // defpackage.ufr
    public final int a(ufu ufuVar) {
        int i;
        synchronized (ufuVar) {
            i = ufuVar.remainingField - 1;
            ufuVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.ufr
    public final void b(ufu ufuVar, Set set) {
        synchronized (ufuVar) {
            if (ufuVar.seenExceptionsField == null) {
                ufuVar.seenExceptionsField = set;
            }
        }
    }
}
