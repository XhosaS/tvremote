package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ag {
    public final ivx h;
    private final ah i;
    public int a = 0;
    private int j = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;

    public ag(ah ahVar, ivx ivxVar) {
        this.i = ahVar;
        this.h = ivxVar;
    }

    public final float a(ak akVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == akVar.a) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final float c(ak akVar) {
        int i = this.e;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            int i4 = this.b[i];
            if (i4 == akVar.a) {
                if (i == this.e) {
                    this.e = this.c[i];
                } else {
                    int[] iArr = this.c;
                    iArr[i3] = iArr[i];
                }
                ((ak[]) this.h.c)[i4].a(this.i);
                this.a--;
                this.b[i] = -1;
                if (this.g) {
                    this.f = i;
                }
                return this.d[i];
            }
            i2++;
            i3 = i;
            i = this.c[i];
        }
        return 0.0f;
    }

    final ak d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((ak[]) this.h.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(ak akVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = akVar.a;
            this.c[0] = -1;
            this.a++;
            if (this.g) {
                return;
            }
            this.f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = akVar.a;
            if (i4 == i5) {
                float[] fArr = this.d;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.e) {
                        this.e = this.c[i];
                    } else {
                        int[] iArr = this.c;
                        iArr[i2] = iArr[i];
                    }
                    ((ak[]) this.h.c)[i4].a(this.i);
                    if (this.g) {
                        this.f = i;
                    }
                    this.a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int length = this.f;
        int i6 = length + 1;
        if (this.g) {
            int[] iArr2 = this.b;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.b.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.b;
                if (i7 >= iArr3.length) {
                    break;
                }
                if (iArr3[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.b.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.g = false;
            this.f = length3 - 1;
            this.d = Arrays.copyOf(this.d, i9);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            length = length3;
        }
        int[] iArr4 = this.b;
        iArr4[length] = akVar.a;
        this.d[length] = f;
        if (i2 != -1) {
            int[] iArr5 = this.c;
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            this.c[length] = this.e;
            this.e = length;
        }
        this.a++;
        if (!this.g) {
            this.f++;
        }
        int i10 = this.f;
        int length4 = iArr4.length;
        if (i10 >= length4) {
            this.g = true;
            this.f = length4 - 1;
        }
    }

    public final void f(ak akVar, float f) {
        if (f == 0.0f) {
            c(akVar);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = akVar.a;
            this.c[0] = -1;
            this.a++;
            if (this.g) {
                return;
            }
            this.f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = akVar.a;
            if (i4 == i5) {
                this.d[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int length = this.f;
        int i6 = length + 1;
        if (this.g) {
            int[] iArr = this.b;
            if (iArr[length] != -1) {
                length = iArr.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.b.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i7 >= iArr2.length) {
                    break;
                }
                if (iArr2[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.b.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.g = false;
            this.f = length3 - 1;
            this.d = Arrays.copyOf(this.d, i9);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            length = length3;
        }
        int[] iArr3 = this.b;
        iArr3[length] = akVar.a;
        this.d[length] = f;
        if (i2 != -1) {
            int[] iArr4 = this.c;
            iArr4[length] = iArr4[i2];
            iArr4[i2] = length;
        } else {
            this.c[length] = this.e;
            this.e = length;
        }
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.g) {
            this.f++;
        }
        if (i10 >= iArr3.length) {
            this.g = true;
        }
    }

    final void g(ah ahVar, ah ahVar2) {
        int i = this.e;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.b[i];
                ak akVar = ahVar2.a;
                if (i3 == akVar.a) {
                    float f = this.d[i];
                    c(akVar);
                    ag agVar = ahVar2.d;
                    int i4 = agVar.e;
                    for (int i5 = 0; i4 != -1 && i5 < agVar.a; i5++) {
                        e(((ak[]) this.h.c)[agVar.b[i4]], agVar.d[i4] * f);
                        i4 = agVar.c[i4];
                    }
                    ahVar.b += ahVar2.b * f;
                    ahVar2.a.a(ahVar);
                    i = this.e;
                } else {
                    i = this.c[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.e;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str = strConcat.concat(" -> ") + this.d[i] + " : ";
            ak akVar = ((ak[]) this.h.c)[this.b[i]];
            Objects.toString(akVar);
            strConcat = str.concat(String.valueOf(akVar));
            i = this.c[i];
        }
        return strConcat;
    }
}
