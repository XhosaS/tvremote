package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faw implements ezr {
    private final pku a;

    public faw(pku pkuVar) {
        this.a = pkuVar;
    }

    @Override // defpackage.ezr
    /* renamed from: do */
    public final aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        this.a.o(iOException);
        return ezw.e;
    }

    @Override // defpackage.ezr
    public final void du(ezt eztVar, long j, long j2) {
        if (fay.b()) {
            this.a.p();
        } else {
            this.a.o(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
    }

    @Override // defpackage.ezr
    public final void ds(ezt eztVar, long j, long j2, boolean z) {
    }
}
