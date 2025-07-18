package defpackage;

import android.content.AbstractThreadedSyncAdapter;
import com.google.android.apps.play.movies.common.store.sync.SyncService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbl extends AbstractThreadedSyncAdapter {
    final /* synthetic */ SyncService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbl(SyncService syncService) {
        super(syncService, false);
        this.a = syncService;
    }

    private final void a() {
        synchronized (SyncService.a) {
            mfm.a(this.a.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0114 A[PHI: r2
  0x0114: PHI (r2v12 boolean) = (r2v11 boolean), (r2v16 boolean) binds: [B:51:0x0166, B:42:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    @Override // android.content.AbstractThreadedSyncAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPerformSync(android.accounts.Account r8, android.os.Bundle r9, java.lang.String r10, android.content.ContentProviderClient r11, android.content.SyncResult r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbl.onPerformSync(android.accounts.Account, android.os.Bundle, java.lang.String, android.content.ContentProviderClient, android.content.SyncResult):void");
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onSyncCanceled() {
        super.onSyncCanceled();
        a();
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onSyncCanceled(Thread thread) {
        super.onSyncCanceled(thread);
        a();
    }
}
