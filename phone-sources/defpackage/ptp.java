package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptp implements qeq {
    private static final tvn a = tvn.n("GnpSdk");
    private final pvg b;
    private final unc c;

    public ptp(pvg pvgVar, unc uncVar) {
        pvgVar.getClass();
        this.b = pvgVar;
        this.c = uncVar;
    }

    @Override // defpackage.qeq
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r7, defpackage.qdo r8, long r9, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptp.b(android.content.Intent, qdo, long, yih):java.lang.Object");
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        ykr.n(yim.a, new dsk(this, intent, qdoVar, j, (yih) null, 2));
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return false;
        }
        int iHashCode = action.hashCode();
        return iHashCode != 452039370 ? iHashCode != 806551504 ? iHashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED") : action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED") : action.equals("android.app.action.APP_BLOCK_STATE_CHANGED");
    }
}
