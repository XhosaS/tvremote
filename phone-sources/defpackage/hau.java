package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hau implements yjv {
    public final yoe a;
    private final zdc b;

    public hau(zdc zdcVar, yoe yoeVar) {
        this.b = zdcVar;
        this.a = yoeVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            this.b.g();
        } catch (Throwable unused) {
        }
        return ygi.a;
    }

    public final void b(zdc zdcVar, IOException iOException) {
        if (zdcVar.l) {
            return;
        }
        this.a.resumeWith(ybn.e(iOException));
    }
}
