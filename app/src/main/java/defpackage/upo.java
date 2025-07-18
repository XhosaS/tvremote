package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upo implements zxe {
    final /* synthetic */ upv a;

    public upo(upv upvVar) {
        this.a = upvVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        new File(this.a.b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
