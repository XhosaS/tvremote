package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dva implements gha {
    @Override // defpackage.gha
    public final void a(ghe gheVar) throws NoSuchMethodException, SecurityException {
        if (!(gheVar instanceof dxd)) {
            Objects.toString(gheVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(gheVar.toString()));
        }
        dxc viewModelStore = ((dxd) gheVar).getViewModelStore();
        ghc savedStateRegistry = gheVar.getSavedStateRegistry();
        Iterator it = viewModelStore.b().iterator();
        while (it.hasNext()) {
            dwt dwtVarA = viewModelStore.a((String) it.next());
            if (dwtVarA != null) {
                czu.o(dwtVarA, savedStateRegistry, gheVar.getLifecycle());
            }
        }
        if (viewModelStore.b().isEmpty()) {
            return;
        }
        savedStateRegistry.c(dva.class);
    }
}
