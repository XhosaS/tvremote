package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agto implements Serializable, agsw, agtr {
    public final agsw D;

    public agto(agsw agswVar) {
        this.D = agswVar;
    }

    protected abstract Object b(Object obj);

    public agsw c(Object obj, agsw agswVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        agsw agswVar = this;
        while (true) {
            agswVar.getClass();
            agto agtoVar = (agto) agswVar;
            agsw agswVar2 = agtoVar.D;
            agswVar2.getClass();
            try {
                obj = agtoVar.b(obj);
                if (obj == agtg.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = agpl.a(th);
            }
            agtoVar.g();
            if (!(agswVar2 instanceof agto)) {
                agswVar2.e(obj);
                return;
            }
            agswVar = agswVar2;
        }
    }

    @Override // defpackage.agtr
    public agtr ft() {
        agsw agswVar = this.D;
        if (agswVar instanceof agtr) {
            return (agtr) agswVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    @Override // defpackage.agtr
    public void fu() {
    }

    protected void g() {
    }
}
