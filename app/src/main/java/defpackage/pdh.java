package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdh implements pdf {
    public final List a;
    public final int b;
    private final int c;

    public pdh(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            yqw.A(i2 == -1);
        } else {
            yqw.A(i2 != -1);
        }
    }

    @Override // defpackage.pdf
    public final /* synthetic */ pcc a() {
        return pde.a(this);
    }

    @Override // defpackage.pdf
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        yqw.L(z);
        return this.c;
    }
}
