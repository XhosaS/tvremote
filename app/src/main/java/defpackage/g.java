package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class g {
    public final i b;
    private final h i;
    public int a = 0;
    private int j = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;

    public g(h hVar, i iVar) {
        this.i = hVar;
        this.b = iVar;
    }

    public final float a(m mVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == mVar.a) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float c(m mVar) {
        int i = this.f;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            int i4 = this.c[i];
            if (i4 == mVar.a) {
                if (i == this.f) {
                    this.f = this.d[i];
                } else {
                    int[] iArr = this.d;
                    iArr[i3] = iArr[i];
                }
                this.b.a[i4].a(this.i);
                this.a--;
                this.c[i] = -1;
                if (this.h) {
                    this.g = i;
                }
                return this.e[i];
            }
            i2++;
            i3 = i;
            i = this.d[i];
        }
        return 0.0f;
    }

    final m d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(m mVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = mVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = mVar.a;
            if (i4 == i5) {
                float[] fArr = this.e;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i2] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    if (this.h) {
                        this.g = i;
                    }
                    this.a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int length = this.g;
        int i6 = length + 1;
        if (this.h) {
            int[] iArr2 = this.c;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.c.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.c;
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
        int length3 = this.c.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i9);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            length = length3;
        }
        int[] iArr4 = this.c;
        iArr4[length] = mVar.a;
        this.e[length] = f;
        if (i2 != -1) {
            int[] iArr5 = this.d;
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            this.d[length] = this.f;
            this.f = length;
        }
        this.a++;
        if (!this.h) {
            this.g++;
        }
        int i10 = this.g;
        int length4 = iArr4.length;
        if (i10 >= length4) {
            this.h = true;
            this.g = length4 - 1;
        }
    }

    public final void f(m mVar, float f) {
        if (f == 0.0f) {
            c(mVar);
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = mVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = mVar.a;
            if (i4 == i5) {
                this.e[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int length = this.g;
        int i6 = length + 1;
        if (this.h) {
            int[] iArr = this.c;
            if (iArr[length] != -1) {
                length = iArr.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.c.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr2 = this.c;
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
        int length3 = this.c.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i9);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            length = length3;
        }
        int[] iArr3 = this.c;
        iArr3[length] = mVar.a;
        this.e[length] = f;
        if (i2 != -1) {
            int[] iArr4 = this.d;
            iArr4[length] = iArr4[i2];
            iArr4[i2] = length;
        } else {
            this.d[length] = this.f;
            this.f = length;
        }
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.h) {
            this.g++;
        }
        if (i10 >= iArr3.length) {
            this.h = true;
        }
    }

    final void g(h hVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            m mVar = this.b.a[this.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = mVar.g;
                if (i3 >= i4) {
                    h[] hVarArr = mVar.f;
                    int length = hVarArr.length;
                    if (i4 >= length) {
                        mVar.f = (h[]) Arrays.copyOf(hVarArr, length + length);
                    }
                    h[] hVarArr2 = mVar.f;
                    int i5 = mVar.g;
                    hVarArr2[i5] = hVar;
                    mVar.g = i5 + 1;
                } else if (mVar.f[i3] == hVar) {
                    break;
                } else {
                    i3++;
                }
            }
            i = this.d[i];
        }
    }

    public final void h(h hVar, h hVar2) {
        int i = this.f;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.c[i];
                m mVar = hVar2.a;
                if (i3 == mVar.a) {
                    float f = this.e[i];
                    c(mVar);
                    g gVar = hVar2.d;
                    int i4 = gVar.f;
                    for (int i5 = 0; i4 != -1 && i5 < gVar.a; i5++) {
                        e(this.b.a[gVar.c[i4]], gVar.e[i4] * f);
                        i4 = gVar.d[i4];
                    }
                    hVar.b += hVar2.b * f;
                    hVar2.a.a(hVar);
                    i = this.f;
                } else {
                    i = this.d[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.f;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str = strConcat.concat(" -> ") + this.e[i] + " : ";
            m mVar = this.b.a[this.c[i]];
            Objects.toString(mVar);
            strConcat = str.concat(String.valueOf(mVar));
            i = this.d[i];
        }
        return strConcat;
    }
}
