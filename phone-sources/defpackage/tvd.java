package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tvd {
    public static final tvd c = new tuz();
    public static final tvd d = new tuz();

    protected tvd() {
    }

    static tvd b(tvd tvdVar, tvd tvdVar2) {
        tvd tvdVar3;
        tvd tvdVar4;
        if (tvdVar != null) {
            if (tvdVar2 == null || tvdVar == (tvdVar3 = c) || tvdVar2 == (tvdVar4 = d)) {
                return tvdVar;
            }
            if (tvdVar2 != tvdVar3 && tvdVar != tvdVar4) {
                return new tva(tvdVar, tvdVar2);
            }
        }
        return tvdVar2;
    }

    protected abstract void a();
}
