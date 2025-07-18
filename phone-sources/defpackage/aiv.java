package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiv implements aix {
    public final akb a;
    public final bfz b = new bfz(new yjv[16], 0);
    private int c;

    public aiv(akb akbVar) {
        this.a = akbVar;
    }

    @Override // defpackage.aix
    public final void a(yjv yjvVar) {
        throw null;
    }

    public final boolean b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            bfz bfzVar = this.b;
            if (bfzVar.b != 0) {
                akb akbVar = this.a;
                aid aidVar = akbVar.a;
                ahu ahuVar = akbVar.b;
                aidVar.a.b().c();
                ahw ahwVar = aidVar.a;
                Object[] objArr = bfzVar.a;
                int i2 = bfzVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((yjv) objArr[i3]).a(ahwVar);
                }
                akbVar.m(ahwVar);
                aid.h(aidVar, false, 1);
                bfzVar.h();
            }
        }
        return this.c > 0;
    }

    public final void c() {
        this.c++;
    }
}
