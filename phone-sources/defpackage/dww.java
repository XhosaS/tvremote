package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dww extends dwy {
    public static dww a;
    public static final dxi b = new dwm();
    private final Application d;

    public dww(Application application) {
        this.d = application;
    }

    private static final dwt d(Class cls, Application application) {
        if (!dur.class.isAssignableFrom(cls)) {
            return dhf.f(cls);
        }
        try {
            dwt dwtVar = (dwt) cls.getConstructor(Application.class).newInstance(application);
            dwtVar.getClass();
            return dwtVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.dwy, defpackage.dwx
    public final dwt a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.dwy, defpackage.dwx
    public final dwt b(Class cls, dxj dxjVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) dxjVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (dur.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return dhf.f(cls);
    }

    public dww() {
        this(null);
    }
}
