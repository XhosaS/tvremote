package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeis implements aeiz {
    private final Service a;
    private Object b;

    public aeis(Service service) {
        this.a = service;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        if (this.b == null) {
            Service service = this.a;
            Application application = service.getApplication();
            aejb.a(application instanceof aeiz, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            etk etkVarHA = ((aeir) aehg.a(application, aeir.class)).hA();
            etkVarHA.b = service;
            aejk.a(etkVarHA.b, Service.class);
            this.b = new etn(etkVarHA.a, etkVarHA.b);
        }
        return this.b;
    }
}
