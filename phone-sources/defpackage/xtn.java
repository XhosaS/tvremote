package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtn extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final xtk a;
    public final xsm b;

    public xtn(xtk xtkVar) {
        this(xtkVar, null);
    }

    public xtn(xtk xtkVar, xsm xsmVar) {
        super(xtk.f(xtkVar), xtkVar.p);
        this.a = xtkVar;
        this.b = xsmVar;
    }
}
