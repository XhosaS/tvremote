package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enc implements ezy {
    final /* synthetic */ enf a;

    public enc(enf enfVar) {
        this.a = enfVar;
    }

    @Override // defpackage.ezy
    public final void a() throws IOException {
        enf enfVar = this.a;
        enfVar.c.a();
        IOException iOException = enfVar.d;
        if (iOException != null) {
            throw iOException;
        }
    }
}
