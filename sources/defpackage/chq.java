package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chq extends cho {
    @Override // defpackage.cho
    public final int a(chr chrVar) {
        int i;
        synchronized (chrVar) {
            i = chrVar.remainingField - 1;
            chrVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.cho
    public final void b(chr chrVar, Set set) {
        synchronized (chrVar) {
            if (chrVar.seenExceptionsField == null) {
                chrVar.seenExceptionsField = set;
            }
        }
    }
}
