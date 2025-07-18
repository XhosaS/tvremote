package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtl extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final xtk a;
    public final xsm b;

    public xtl(xtk xtkVar) {
        this(xtkVar, null);
    }

    public xtl(xtk xtkVar, xsm xsmVar) {
        super(xtk.f(xtkVar), xtkVar.p);
        this.a = xtkVar;
        this.b = xsmVar;
    }
}
