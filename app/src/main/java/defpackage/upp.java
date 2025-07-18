package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upp implements zxe {
    final /* synthetic */ upv a;

    public upp(upv upvVar) {
        this.a = upvVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
            return;
        }
        upv upvVar = this.a;
        synchronized (upvVar.j) {
            upvVar.e();
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
