package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buu implements bui {
    private final bxb a;
    private final but b;
    private final bxb c;
    private final but d;
    private final bwl e;
    private final bwl f;
    private final /* synthetic */ int g;
    private final Object h;

    public buu(String str, int i) {
        this.g = i;
        this.h = str;
        this.e = new bwm(str.concat(" source"), 0);
        this.f = new bwm(str.concat(" target"), 0);
        this.a = new bxb();
        this.b = new but();
        this.c = new bxb();
        this.d = new but();
    }

    @Override // defpackage.bui
    public final bwl a() {
        return this.g != 0 ? this.e : this.e;
    }

    @Override // defpackage.bui
    public final bwl b() {
        return this.g != 0 ? this.f : this.f;
    }

    @Override // defpackage.bwl
    public final bxb c() {
        return this.g != 0 ? this.a : this.a;
    }

    @Override // defpackage.bwl
    public final bxb d() {
        return this.g != 0 ? this.c : this.c;
    }

    @Override // defpackage.bwl
    public final but e() {
        return this.g != 0 ? this.d : this.d;
    }

    @Override // defpackage.bwl
    public final but f() {
        return this.g != 0 ? this.b : this.b;
    }

    public final String toString() throws IOException {
        if (this.g != 0) {
            return (String) this.h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "InnerInsetsRulers(");
        int i = 0;
        int i2 = 0;
        while (true) {
            bwl[] bwlVarArr = (bwl[]) this.h;
            if (i >= bwlVarArr.length) {
                sb.append((CharSequence) ")");
                return sb.toString();
            }
            bwl bwlVar = bwlVarArr[i];
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            a.E(sb, bwlVar, null);
            i++;
        }
    }

    public buu(bwl[] bwlVarArr, int i) {
        this.g = i;
        this.h = bwlVarArr;
        int length = bwlVarArr.length;
        bxb[] bxbVarArr = new bxb[length];
        for (int i2 = 0; i2 < length; i2++) {
            bxbVarArr[i2] = ((bwl[]) this.h)[i2].c();
        }
        this.a = new bxb(new bkl(bxbVarArr, 8));
        int length2 = ((bwl[]) this.h).length;
        but[] butVarArr = new but[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            butVarArr[i3] = ((bwl[]) this.h)[i3].f();
        }
        this.b = new but(new bkl(butVarArr, 3));
        int length3 = ((bwl[]) this.h).length;
        bxb[] bxbVarArr2 = new bxb[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            bxbVarArr2[i4] = ((bwl[]) this.h)[i4].d();
        }
        this.c = new bxb(new bkl(bxbVarArr2, 9));
        int length4 = ((bwl[]) this.h).length;
        but[] butVarArr2 = new but[length4];
        for (int i5 = 0; i5 < length4; i5++) {
            butVarArr2[i5] = ((bwl[]) this.h)[i5].e();
        }
        this.d = new but(new bkl(butVarArr2, 4));
        toString();
        String strConcat = toString().concat(" source");
        int length5 = ((bwl[]) this.h).length;
        bwl[] bwlVarArr2 = new bwl[length5];
        for (int i6 = 0; i6 < length5; i6++) {
            bwl bwlVarA = ((bwl[]) this.h)[i6];
            if (bwlVarA instanceof bui) {
                bwlVarA = ((bui) bwlVarA).a();
            }
            bwlVarArr2[i6] = bwlVarA;
        }
        this.e = new bwm(strConcat, 1, null);
        toString();
        String strConcat2 = toString().concat(" target");
        int length6 = ((bwl[]) this.h).length;
        bwl[] bwlVarArr3 = new bwl[length6];
        for (int i7 = 0; i7 < length6; i7++) {
            bwl bwlVarB = ((bwl[]) this.h)[i7];
            if (bwlVarB instanceof bui) {
                bwlVarB = ((bui) bwlVarB).b();
            }
            bwlVarArr3[i7] = bwlVarB;
        }
        this.f = new bwm(strConcat2, 1, null);
    }
}
