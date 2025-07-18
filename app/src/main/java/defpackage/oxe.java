package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class oxe extends beb {
    private static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/OperationsViewModel");
    private final Map b = new we();
    private final List c = new ArrayList();

    private final oxd e(String str, Class cls) {
        oxd oxdVar = (oxd) this.b.get(str);
        if (oxdVar == null) {
            return null;
        }
        if (oxdVar.b.equals(cls)) {
            return oxdVar;
        }
        ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/OperationsViewModel", "getExistingEvent", 138, "OperationsViewModel.java")).u("Type mismatch for live event");
        return null;
    }

    public final owj a(String str, Class cls) {
        final oxd oxdVarE = e(str, cls);
        if (oxdVarE == null) {
            ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/OperationsViewModel", "createHomeGraphCallback", 96, "OperationsViewModel.java")).u("Register the observer before calling this.");
            oxdVarE = b(str, cls);
        }
        return new owj() { // from class: oxb
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                oxdVarE.a.g(new oxc(status, obj));
            }
        };
    }

    public final oxd b(String str, Class cls) {
        oxd oxdVarE = e(str, cls);
        if (oxdVarE != null) {
            return oxdVarE;
        }
        oxd oxdVar = new oxd(new oue(), cls);
        this.b.put(str, oxdVar);
        return oxdVar;
    }

    @Override // defpackage.beb
    protected final void c() {
        List<owv> list = this.c;
        for (owv owvVar : list) {
            if (owvVar != null) {
                owvVar.a();
            }
        }
        list.clear();
    }

    public final void d(owv owvVar) {
        this.c.add(owvVar);
    }
}
