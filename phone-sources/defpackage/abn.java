package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abn {
    final /* synthetic */ bhi a;
    private final int b;
    private final int c;
    private final abl d;
    private final abr e;
    private final bhi f;

    public abn(bhi bhiVar, int i, int i2, abl ablVar, abr abrVar) {
        this.a = bhiVar;
        this.f = bhiVar;
        this.b = i;
        this.c = i2;
        this.d = ablVar;
        this.e = abrVar;
    }

    public final int a(int i) {
        abr abrVar = this.e;
        int i2 = abrVar.h;
        ybo yboVar = abrVar.a.b;
        abq abqVar = abq.a;
        gb gbVarP = yboVar.p(i);
        ((aay) gbVarP.c).a.a(abqVar, Integer.valueOf(i - gbVarP.a));
        return 1;
    }

    public final long b(int i, int i2) {
        return clw.p(ykn.j(((int[]) this.f.a)[i], 0));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final abm c(int i) {
        int i2;
        zuw zuwVarC = this.e.c(i);
        ?? r5 = zuwVarC.b;
        int size = r5.size();
        int i3 = 0;
        if (size != 0) {
            i2 = zuwVarC.a + size == this.b ? 0 : this.c;
        } else {
            size = 0;
            i2 = 0;
        }
        abk[] abkVarArr = new abk[size];
        int i4 = 0;
        while (i3 < size) {
            long j = ((aat) r5.get(i3)).a;
            int i5 = i2;
            abk abkVarC = this.d.c(zuwVarC.a + i3, b(i4, 1), i4, 1, i5);
            i4++;
            abkVarArr[i3] = abkVarC;
            i3++;
            i2 = i5;
        }
        return new abm(i, abkVarArr, this.a, r5, i2);
    }
}
