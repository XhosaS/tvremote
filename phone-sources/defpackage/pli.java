package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pli implements plh {
    public final List a;
    public final int b;
    private final int c;

    public pli(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            a.H(i2 == -1);
        } else {
            a.H(i2 != -1);
        }
    }

    @Override // defpackage.plh
    public final /* synthetic */ pka a() {
        return qtl.aq(this);
    }

    @Override // defpackage.plh
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        a.ab(z);
        return this.c;
    }
}
