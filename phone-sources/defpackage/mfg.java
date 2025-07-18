package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfg implements mfb {
    private final Collection a;

    private mfg(Collection collection) {
        this.a = collection;
    }

    public static mfb b(mfb... mfbVarArr) {
        return new mfg(Arrays.asList(mfbVarArr));
    }

    @Override // defpackage.mfb
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mfb) it.next()).a();
        }
    }
}
