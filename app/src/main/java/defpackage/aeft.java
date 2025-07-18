package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeft extends aarv {
    public static int g(aart aartVar, int i) {
        aartVar.o(1);
        aartVar.t(0, i);
        return aartVar.d();
    }

    public static int h(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public final int i() {
        int iA = a(4);
        if (iA != 0) {
            return c(iA);
        }
        return 0;
    }

    public final aefs j(aefs aefsVar, int i) {
        int iA = a(4);
        if (iA == 0) {
            return null;
        }
        int iB = b(iA) + (i * 4);
        aefsVar.e(iB + this.b.getInt(iB), this.b);
        return aefsVar;
    }
}
