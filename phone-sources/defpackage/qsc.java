package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsc implements qsa {
    private static final tvn a = tvn.n("GnpSdk");
    private final qse b;
    private final cb c;

    public qsc(qse qseVar, cb cbVar) {
        this.b = qseVar;
        this.c = cbVar;
    }

    @Override // defpackage.qsa
    public final synchronized psy a(String str) {
        return b(str, vmd.COLLABORATOR_API_CALL);
    }

    public final synchronized psy b(String str, vmd vmdVar) {
        sjl.b();
        try {
            this.c.O(1);
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/registration/impl/ChimeRegistrationApiImpl", "registerAccountForPushNotifications", 'Y', "ChimeRegistrationApiImpl.java")).s("Failed setting last used registration API to Chime");
        }
        return this.b.a(str, false, vmdVar);
    }
}
