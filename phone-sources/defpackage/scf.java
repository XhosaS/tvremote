package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class scf {
    public long E = sci.a.addAndGet(-1);
    private final Set a = new LinkedHashSet();

    private static final long b(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long jCharAt = -3750763034362895579L;
        for (int i = 0; i < charSequence.length(); i++) {
            jCharAt = (jCharAt ^ charSequence.charAt(i)) * 1099511628211L;
        }
        return jCharAt;
    }

    public final /* synthetic */ sca D(View view) {
        view.getClass();
        Object tag = view.getTag(-2147483647);
        if (tag == null) {
            sca scaVarF = f();
            scaVarF.x = view;
            view.setTag(-2147483647, scaVarF);
            scaVarF.h();
            scaVarF.z();
            return scaVarF;
        }
        if (!(tag instanceof sca)) {
            Objects.toString(tag);
            throw new IllegalArgumentException("Expected a bindable to be associated with view tag, but found ".concat(tag.toString()));
        }
        sca scaVar = (sca) tag;
        if (yks.e(g(), scaVar.g())) {
            return scaVar;
        }
        throw new IllegalArgumentException("Bindable type associated with the view is not of expected type. ".concat("Expected " + g() + ", found " + scaVar.g()));
    }

    public final void E(sce sceVar) {
        this.a.add(sceVar);
    }

    public final void F(String str, String... strArr) {
        str.getClass();
        this.E = b(str);
    }

    public final void G(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sce) it.next()).c(i);
        }
    }

    public final void H(sce sceVar) {
        this.a.remove(sceVar);
    }

    public int a() {
        throw null;
    }

    protected abstract long e(scf scfVar);

    public final boolean equals(Object obj) {
        return obj != null && hashCode() == obj.hashCode();
    }

    protected abstract sca f();

    public abstract String g();

    public abstract void h(sca scaVar, long j);

    public abstract void i(View view);

    public abstract void j(View view);

    public Object[] o() {
        throw null;
    }
}
