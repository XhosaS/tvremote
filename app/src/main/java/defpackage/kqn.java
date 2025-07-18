package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class kqn extends kqi {
    final /* synthetic */ lvj a;

    public kqn(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.kqj
    public final void a(Status status, SyncResult syncResult) {
        kid.b(status, status.c() ? syncResult.a : null, this.a);
    }
}
