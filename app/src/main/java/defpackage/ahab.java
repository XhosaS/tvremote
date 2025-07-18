package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahab extends ahdv implements ahdl, agsw, ahbt {
    public final agte a;

    public ahab(agte agteVar, boolean z) {
        super(z);
        I((ahdl) agteVar.get(ahdl.c));
        this.a = agteVar.plus(this);
    }

    @Override // defpackage.ahdv
    protected final String b() {
        return String.valueOf(getClass().getSimpleName()).concat(" was cancelled");
    }

    @Override // defpackage.agsw
    public final void e(Object obj) throws Throwable {
        Object objB = B(ahbe.b(obj));
        if (objB == ahdw.b) {
            return;
        }
        fw(objB);
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return this.a;
    }

    @Override // defpackage.ahbt
    public final agte fs() {
        return this.a;
    }

    @Override // defpackage.ahdv
    public String fv() {
        String str = null;
        if (ahbx.a) {
            agte agteVar = this.a;
            ahbq ahbqVar = (ahbq) agteVar.get(ahbq.a);
            if (ahbqVar != null) {
                ahbs ahbsVar = (ahbs) agteVar.get(ahbs.a);
                str = (ahbsVar != null ? ahbsVar.b : "coroutine") + "#" + ahbqVar.b;
            }
        }
        if (str == null) {
            return getClass().getSimpleName();
        }
        return "\"" + str + "\":" + getClass().getSimpleName();
    }

    protected void fw(Object obj) {
        f(obj);
    }

    @Override // defpackage.ahdv
    public final void fx(Throwable th) {
        ahbo.b(this.a, th);
    }

    @Override // defpackage.ahdv
    protected final void l(Object obj) {
        if (!(obj instanceof ahbc)) {
            k(obj);
        } else {
            ahbc ahbcVar = (ahbc) obj;
            j(ahbcVar.b, ahbcVar.c.b());
        }
    }

    protected void k(Object obj) {
    }

    protected void j(Throwable th, boolean z) {
    }
}
