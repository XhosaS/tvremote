package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxw extends dwt {
    public final String a;
    public dxc b;
    private final String c = "SaveableStateHolder_BackStackEntryKey";

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public fxw(dwi dwiVar) {
        String string = (String) dwiVar.b("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            List list = dxg.a;
            if (string != null) {
                List list2 = dxg.a;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(string)) {
                        }
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + string.getClass() + " into saved state");
            }
            Object obj = dwiVar.a.get("SaveableStateHolder_BackStackEntryKey");
            dvv dvvVar = obj instanceof dvv ? (dvv) obj : null;
            if (dvvVar != null) {
                dvvVar.k(string);
            }
            ((gag) dwiVar.b).c("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.a = string;
    }

    public final dxc a() {
        dxc dxcVar = this.b;
        if (dxcVar != null) {
            return dxcVar;
        }
        yks.c("saveableStateHolderRef");
        return null;
    }

    @Override // defpackage.dwt
    protected final void d() {
        bib bibVar = (bib) ((WeakReference) a().a).get();
        if (bibVar != null) {
            bibVar.d(this.a);
        }
        ((WeakReference) a().a).clear();
    }
}
