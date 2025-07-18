package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agtu extends agtq implements agvu {
    private final int a;

    public agtu(int i, agsw agswVar) {
        super(agswVar);
        this.a = i;
    }

    @Override // defpackage.agvu
    public final int i() {
        return this.a;
    }

    @Override // defpackage.agto
    public final String toString() {
        if (this.D != null) {
            return super.toString();
        }
        String strA = agwi.a.a(this);
        strA.getClass();
        return strA;
    }
}
