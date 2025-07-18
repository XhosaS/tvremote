package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrx {
    public static yyk a(acqg acqgVar, abtx abtxVar) {
        int iA;
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        if ((acqgVar.c & 4096) != 0) {
            yyfVar.g(Integer.valueOf(acqgVar.h));
        }
        abub abubVar = abtxVar.c;
        if (abubVar == null) {
            abubVar = abub.a;
        }
        int i2 = abubVar.e;
        char c = i2 != 0 ? i2 != 1 ? (char) 0 : (char) 3 : (char) 2;
        if (c != 0 && c == 3 && !acqgVar.k && ((iA = abtm.a(acqgVar.l)) == 0 || iA == 1)) {
            yyfVar.h(acqgVar.i);
        }
        return yyfVar.f();
    }
}
