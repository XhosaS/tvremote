package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahdq extends ahlv implements ahcn, ahdg {
    public ahdv d;

    @Override // defpackage.ahdg
    public final ahea a() {
        return null;
    }

    public abstract void b(Throwable th);

    public abstract boolean c();

    public final ahdv f() {
        ahdv ahdvVar = this.d;
        if (ahdvVar != null) {
            return ahdvVar;
        }
        agvy.b("job");
        return null;
    }

    @Override // defpackage.ahcn
    public final void fn() {
        agzy agzyVar;
        Object obj;
        agzy agzyVar2;
        Object obj2;
        ahlv ahlvVar;
        ahma ahmaVar;
        ahdv ahdvVarF = f();
        do {
            agzyVar = ahdvVarF.d;
            obj = agzyVar.a;
            if (!(obj instanceof ahdq)) {
                if (!(obj instanceof ahdg) || ((ahdg) obj).a() == null) {
                    return;
                }
                do {
                    agzyVar2 = this.e;
                    obj2 = agzyVar2.a;
                    if (obj2 instanceof ahma) {
                        ahlv ahlvVar2 = ((ahma) obj2).a;
                        return;
                    }
                    if (obj2 == this) {
                        return;
                    }
                    obj2.getClass();
                    ahlvVar = (ahlv) obj2;
                    agzy agzyVar3 = ahlvVar.g;
                    ahmaVar = (ahma) agzyVar3.a;
                    if (ahmaVar == null) {
                        ahmaVar = new ahma(ahlvVar);
                        agzyVar3.b(ahmaVar);
                    }
                } while (!agzyVar2.d(obj2, ahmaVar));
                ahlvVar.g();
                return;
            }
            if (obj != this) {
                return;
            }
        } while (!agzyVar.d(obj, ahdw.g));
    }

    @Override // defpackage.ahdg
    public final boolean fo() {
        return true;
    }

    @Override // defpackage.ahlv
    public final String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this)) + "[job@" + Integer.toHexString(System.identityHashCode(f())) + "]";
    }
}
