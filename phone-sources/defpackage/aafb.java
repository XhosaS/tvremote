package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafb {
    public final aabk a;
    public final Locale b;
    public aabs c;
    public Integer d;
    public aaez[] e;
    public int f;
    public boolean g;
    private final aabs h;
    private Object i;

    public aafb(aabk aabkVar) {
        aabk aabkVarC = aabp.c(aabkVar);
        aabs aabsVarZ = aabkVarC.z();
        this.h = aabsVarZ;
        this.a = aabkVarC.a();
        this.b = Locale.getDefault();
        this.c = aabsVarZ;
        this.e = new aaez[8];
    }

    static int a(aabu aabuVar, aabu aabuVar2) {
        if (aabuVar == null || !aabuVar.h()) {
            return (aabuVar2 == null || !aabuVar2.h()) ? 0 : -1;
        }
        if (aabuVar2 == null || !aabuVar2.h()) {
            return 1;
        }
        return -aabuVar.compareTo(aabuVar2);
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new aafa(this);
        }
        return this.i;
    }

    public final aaez c() {
        aaez[] aaezVarArr = this.e;
        int i = this.f;
        int length = aaezVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            aaez[] aaezVarArr2 = new aaez[length];
            System.arraycopy(aaezVarArr, 0, aaezVarArr2, 0, i);
            this.e = aaezVarArr2;
            this.g = false;
            aaezVarArr = aaezVarArr2;
        }
        this.i = null;
        aaez aaezVar = aaezVarArr[i];
        if (aaezVar == null) {
            aaezVar = new aaez();
            aaezVarArr[i] = aaezVar;
        }
        this.f = i + 1;
        return aaezVar;
    }

    public final void d(aabo aaboVar, int i) {
        c().c(aaboVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(aabs aabsVar) {
        this.i = null;
        this.c = aabsVar;
    }

    public final long g(CharSequence charSequence) {
        aaez[] aaezVarArr = this.e;
        int i = this.f;
        if (this.g) {
            aaezVarArr = (aaez[]) aaezVarArr.clone();
            this.e = aaezVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(aaezVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (aaezVarArr[i4].compareTo(aaezVarArr[i3]) > 0) {
                        aaez aaezVar = aaezVarArr[i3];
                        aaezVarArr[i3] = aaezVarArr[i4];
                        aaezVarArr[i4] = aaezVar;
                        i3 = i4;
                    }
                }
            }
        }
        long jB = 0;
        if (i > 0) {
            aabk aabkVar = this.a;
            aabu aabuVarA = aabw.e.a(aabkVar);
            aabu aabuVarA2 = aabw.g.a(aabkVar);
            aabu aabuVarS = aaezVarArr[0].a.s();
            if (a(aabuVarS, aabuVarA) >= 0 && a(aabuVarS, aabuVarA2) <= 0) {
                d(aabo.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                jB = aaezVarArr[i5].b(jB, true);
            } catch (aabx e) {
                if (charSequence != null) {
                    String strCg = a.cg((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = strCg;
                    } else {
                        e.a = a.cq(str, strCg, ": ");
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            aaezVarArr[i6].a.x();
            jB = aaezVarArr[i6].b(jB, i6 == i + (-1));
            i6++;
        }
        if (this.d != null) {
            return jB - r0.intValue();
        }
        aabs aabsVar = this.c;
        if (aabsVar != null) {
            int i7 = aabsVar.i(jB);
            jB -= i7;
            if (i7 != this.c.a(jB)) {
                String strCz = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    strCz = a.cz(strCz, (String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new aaby(strCz);
            }
        }
        return jB;
    }

    public final void h(Object obj) {
        if (obj instanceof aafa) {
            aafa aafaVar = (aafa) obj;
            if (this != aafaVar.e) {
                return;
            }
            this.c = aafaVar.a;
            this.d = aafaVar.b;
            this.e = aafaVar.c;
            int i = aafaVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.i = obj;
        }
    }
}
