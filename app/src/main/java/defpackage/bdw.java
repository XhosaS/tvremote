package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdw extends bei implements beg {
    private Application a;
    private final beg b;
    private Bundle c;
    private bcg d;
    private bqo e;

    public bdw() {
        this.b = new bee(null);
    }

    @Override // defpackage.beg
    public final beb a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.beg
    public final beb b(Class cls, bet betVar) {
        String str = (String) betVar.a(bek.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (betVar.a(bds.a) == null || betVar.a(bds.b) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) betVar.a(bee.b);
        boolean zIsAssignableFrom = bbq.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? bdx.b(cls, bdx.b) : bdx.b(cls, bdx.a);
        return constructorB == null ? this.b.b(cls, betVar) : (!zIsAssignableFrom || application == null) ? bdx.a(cls, constructorB, bds.a(betVar)) : bdx.a(cls, constructorB, application, bds.a(betVar));
    }

    @Override // defpackage.beg
    public final beb c(agxd agxdVar, bet betVar) {
        return b(aguk.a(agxdVar), betVar);
    }

    public final beb d(String str, Class cls) throws Exception {
        AutoCloseable autoCloseable;
        Application application;
        bcg bcgVar = this.d;
        if (bcgVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = bbq.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || this.a == null) ? bdx.b(cls, bdx.b) : bdx.b(cls, bdx.a);
        if (constructorB == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (beh.c == null) {
                beh.c = new beh();
            }
            beh.c.getClass();
            return bex.a.a(cls);
        }
        bqo bqoVar = this.e;
        bqoVar.getClass();
        bdn bdnVar = new bdn(str, bdl.a.a(bqoVar.a.a(str), this.c));
        bdnVar.b(bqoVar, bcgVar);
        bcc.a.b(bqoVar, bcgVar);
        beb bebVarA = (!zIsAssignableFrom || (application = this.a) == null) ? bdx.a(cls, constructorB, bdnVar.a) : bdx.a(cls, constructorB, application, bdnVar.a);
        bez bezVar = bebVarA.h;
        if (bezVar.d) {
            bezVar.a(bdnVar);
            return bebVarA;
        }
        synchronized (bezVar.a) {
            autoCloseable = (AutoCloseable) bezVar.b.put("androidx.lifecycle.savedstate.vm.tag", bdnVar);
        }
        bezVar.a(autoCloseable);
        return bebVarA;
    }

    @Override // defpackage.bei
    public final void e(beb bebVar) throws NoSuchMethodException, SecurityException {
        bcg bcgVar = this.d;
        if (bcgVar != null) {
            bqo bqoVar = this.e;
            bqoVar.getClass();
            bcc.a(bebVar, bqoVar, bcgVar);
        }
    }

    public bdw(Application application, bqs bqsVar, Bundle bundle) {
        bee beeVar;
        this.e = bqsVar.en();
        this.d = bqsVar.ek();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (bee.a == null) {
                bee.a = new bee(application);
            }
            beeVar = bee.a;
            beeVar.getClass();
        } else {
            beeVar = new bee(null);
        }
        this.b = beeVar;
    }
}
