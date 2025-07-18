package defpackage;

import com.google.android.apps.tvsearch.fcm.KatnissFcmService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fyl extends FirebaseMessagingService implements aeja {
    private volatile aeis a;
    private final Object c = new Object();
    private boolean d = false;

    @Override // defpackage.aeja
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeis cO() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = new aeis(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.d) {
            this.d = true;
            ((KatnissFcmService) this).a = ((etn) cO().dN()).a();
        }
        super.onCreate();
    }
}
