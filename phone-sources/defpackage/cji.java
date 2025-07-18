package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cji implements Comparable {
    public static final cji a;
    public static final cji b;
    public static final cji c;
    public static final cji d;
    public static final cji e;
    public static final cji f;
    public static final cji g;
    private static final cji i;
    private static final cji j;
    private static final cji k;
    private static final cji l;
    private static final cji m;
    private static final cji n;
    public final int h;

    static {
        cji cjiVar = new cji(100);
        i = cjiVar;
        cji cjiVar2 = new cji(200);
        j = cjiVar2;
        cji cjiVar3 = new cji(kwx.JSON3);
        k = cjiVar3;
        cji cjiVar4 = new cji(400);
        a = cjiVar4;
        cji cjiVar5 = new cji(500);
        b = cjiVar5;
        cji cjiVar6 = new cji(600);
        c = cjiVar6;
        cji cjiVar7 = new cji(700);
        l = cjiVar7;
        cji cjiVar8 = new cji(800);
        m = cjiVar8;
        cji cjiVar9 = new cji(900);
        n = cjiVar9;
        d = cjiVar3;
        e = cjiVar4;
        f = cjiVar5;
        g = cjiVar7;
        yfm.s(cjiVar, cjiVar2, cjiVar3, cjiVar4, cjiVar5, cjiVar6, cjiVar7, cjiVar8, cjiVar9);
    }

    public cji(int i2) {
        this.h = i2;
        if (i2 <= 0 || i2 >= 1001) {
            cko.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cji cjiVar) {
        return yks.a(this.h, cjiVar.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cji) && this.h == ((cji) obj).h;
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.h + ')';
    }
}
