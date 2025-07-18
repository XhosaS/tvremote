package defpackage;

import com.google.android.libraries.notifications.platform.entrypoints.firebase.FirebaseMessagingServiceImpl;
import com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mhb implements qjk {
    private final mif a;
    private final /* synthetic */ int b;

    public mhb(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.qjk
    public final /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            ((GnpWorker) obj).a = (qez) this.a.FQ.b();
            return;
        }
        mif mifVar = this.a;
        FirebaseMessagingServiceImpl firebaseMessagingServiceImpl = (FirebaseMessagingServiceImpl) obj;
        firebaseMessagingServiceImpl.a = (qei) mifVar.ig.b();
        firebaseMessagingServiceImpl.c = new aafi((osk) mifVar.bT.b(), (qfk) qfd.a(mifVar.AI, mifVar.AH, mifVar.jm), (qpr) new qps());
        firebaseMessagingServiceImpl.b = (ntp) mifVar.ik.b();
        firebaseMessagingServiceImpl.d = new osk();
    }
}
