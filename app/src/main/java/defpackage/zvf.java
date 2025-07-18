package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvf extends zvd {
    @Override // defpackage.zvd
    public final int a(zvg zvgVar) {
        int i;
        synchronized (zvgVar) {
            i = zvgVar.remainingField - 1;
            zvgVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.zvd
    public final void b(zvg zvgVar, Set set) {
        synchronized (zvgVar) {
            if (zvgVar.seenExceptionsField == null) {
                zvgVar.seenExceptionsField = set;
            }
        }
    }
}
