package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agwb extends agwd implements agxh {
    public agwb(Object obj, Class cls) {
        super(obj, cls);
    }

    @Override // defpackage.agum
    public final Object a() {
        return g();
    }

    @Override // defpackage.agvo
    protected final void e() {
        agwj agwjVar = agwi.a;
    }

    @Override // defpackage.agxh
    public final agxg f() {
        agxc agxcVarB = b();
        if (agxcVarB != this) {
            return ((agxh) ((agxi) agxcVarB)).f();
        }
        throw new agul();
    }
}
