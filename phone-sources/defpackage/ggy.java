package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggy implements dvi {
    private final ghe a;

    public ggy(ghe gheVar) {
        this.a = gheVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (dvcVar != dvc.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        dvkVar.getLifecycle().d(this);
        ghe gheVar = this.a;
        Bundle bundleA = gheVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, ggy.class.getClassLoader()).asSubclass(gha.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((gha) objNewInstance).a(gheVar);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.cg(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
