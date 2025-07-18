package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ynw extends yql implements yqe, yih, yow, ypc {
    public final yil a;

    public ynw(yil yilVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            I((yqe) yilVar.get(yqe.c));
        }
        this.a = yilVar.plus(this);
    }

    @Override // defpackage.yow
    public final yil c() {
        return this.a;
    }

    protected void eM(Object obj) {
        eR(obj);
    }

    @Override // defpackage.yql
    public final void eN(Throwable th) {
        yks.k(this.a, th);
    }

    @Override // defpackage.yql
    protected final void eO(Object obj) {
        if (!(obj instanceof yon)) {
            l(obj);
        } else {
            yon yonVar = (yon) obj;
            k(yonVar.b, yonVar.c.a());
        }
    }

    @Override // defpackage.yql
    protected final String g() {
        return String.valueOf(yoz.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.a;
    }

    @Override // defpackage.yql
    public String h() {
        String str = null;
        if (yoy.a) {
            yil yilVar = this.a;
            you youVar = (you) yilVar.get(you.b);
            if (youVar != null) {
                yov yovVar = (yov) yilVar.get(yov.b);
                str = (yovVar != null ? yovVar.a : "coroutine") + "#" + youVar.a;
            }
        }
        if (str == null) {
            return yoz.a(this);
        }
        return "\"" + str + "\":" + yoz.a(this);
    }

    @Override // defpackage.ypc
    public final Object n(yih yihVar) {
        return z(yihVar);
    }

    @Override // defpackage.ypc
    public final Object o() {
        return eP();
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) throws Throwable {
        Object objD = D(yks.m(obj));
        if (objD == yqm.b) {
            return;
        }
        eM(objD);
    }

    public ynw(yil yilVar, boolean z) {
        this(yilVar, true, z);
    }

    protected void l(Object obj) {
    }

    protected void k(Throwable th, boolean z) {
    }
}
