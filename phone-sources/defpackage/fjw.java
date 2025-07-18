package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjw implements fix {
    private final List a;

    public fjw(List list) {
        this.a = list;
    }

    @Override // defpackage.fix
    public final int a() {
        return 1;
    }

    @Override // defpackage.fix
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.fix
    public final long c(int i) {
        a.H(i == 0);
        return 0L;
    }

    @Override // defpackage.fix
    public final List e(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }
}
