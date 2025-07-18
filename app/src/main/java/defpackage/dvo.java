package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvo implements dvn {
    private final List b = new ArrayList(4);
    public dvm a = dvm.HINT_VISIBLE;

    @Override // defpackage.dvn
    public final dvm a() {
        return this.a;
    }

    @Override // defpackage.dvn
    public final synchronized void b(dvl dvlVar) {
        this.b.add(dvlVar);
    }

    @Override // defpackage.dvn
    public final synchronized void c(dvl dvlVar) {
        this.b.remove(dvlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.dvm r7) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvo.d(dvm):void");
    }
}
