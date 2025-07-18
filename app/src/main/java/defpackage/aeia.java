package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aeia implements aeib, aeiz {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final aeiz d;

    public aeia(Activity activity) {
        this.a = activity;
        this.d = new aeig((tt) activity);
    }

    @Override // defpackage.aeib
    public final aehj a() {
        return ((aeig) this.d).dN();
    }

    protected Object b() {
        Activity activity = this.a;
        if (!(activity.getApplication() instanceof aeiz)) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(activity.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(activity.getApplication().getClass())))));
        }
        esz eszVarB = ((aehz) aehg.a(this.d, aehz.class)).b();
        eszVarB.a = activity;
        return eszVarB.a();
    }

    public final aeiq c() {
        aeig aeigVar = (aeig) this.d;
        bek bekVarA = aeigVar.a(aeigVar.a, aeigVar.b);
        agwj agwjVar = agwi.a;
        return ((aeie) bekVarA.a(new agvq(aeie.class))).b;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = b();
                }
            }
        }
        return this.b;
    }
}
