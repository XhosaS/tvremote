package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwq extends dwz implements dwx {
    private Application a;
    private final dwx b;
    private Bundle c;
    private dve d;
    private ghc e;

    public dwq() {
        this.b = new dww();
    }

    @Override // defpackage.dwx
    public final dwt a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.dwx
    public final dwt b(Class cls, dxj dxjVar) {
        String str = (String) dxjVar.a(dxa.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (dxjVar.a(dwn.a) == null || dxjVar.a(dwn.b) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) dxjVar.a(dww.b);
        boolean zIsAssignableFrom = dur.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? dwr.b(cls, dwr.b) : dwr.b(cls, dwr.a);
        return constructorB == null ? this.b.b(cls, dxjVar) : (!zIsAssignableFrom || application == null) ? dwr.a(cls, constructorB, dwn.a(dxjVar)) : dwr.a(cls, constructorB, application, dwn.a(dxjVar));
    }

    @Override // defpackage.dwx
    public final dwt c(ymh ymhVar, dxj dxjVar) {
        return b(wef.o(ymhVar), dxjVar);
    }

    public final dwt d(String str, Class cls) throws Exception {
        Application application;
        dve dveVar = this.d;
        if (dveVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = dur.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || this.a == null) ? dwr.b(cls, dwr.b) : dwr.b(cls, dwr.a);
        if (constructorB == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (dwy.c == null) {
                dwy.c = new dwy();
            }
            dwy.c.getClass();
            return dhf.f(cls);
        }
        ghc ghcVar = this.e;
        ghcVar.getClass();
        dwk dwkVar = new dwk(str, dwf.b(ghcVar.a(str), this.c));
        dwkVar.b(ghcVar, dveVar);
        czu.p(ghcVar, dveVar);
        dwt dwtVarA = (!zIsAssignableFrom || (application = this.a) == null) ? dwr.a(cls, constructorB, dwkVar.a) : dwr.a(cls, constructorB, application, dwkVar.a);
        dwtVarA.t("androidx.lifecycle.savedstate.vm.tag", dwkVar);
        return dwtVarA;
    }

    @Override // defpackage.dwz
    public final void e(dwt dwtVar) throws NoSuchMethodException, SecurityException {
        dve dveVar = this.d;
        if (dveVar != null) {
            ghc ghcVar = this.e;
            ghcVar.getClass();
            czu.o(dwtVar, ghcVar, dveVar);
        }
    }

    public dwq(Application application, ghe gheVar, Bundle bundle) {
        dww dwwVar;
        gheVar.getClass();
        this.e = gheVar.getSavedStateRegistry();
        this.d = gheVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (dww.a == null) {
                dww.a = new dww(application);
            }
            dwwVar = dww.a;
            dwwVar.getClass();
        } else {
            dwwVar = new dww();
        }
        this.b = dwwVar;
    }
}
