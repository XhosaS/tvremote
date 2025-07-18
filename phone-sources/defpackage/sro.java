package defpackage;

import android.opengl.GLES20;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sro {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public sro(feo feoVar, dhq dhqVar, byte[] bArr, shy[] shyVarArr, int i) {
        this.e = feoVar;
        this.d = dhqVar;
        this.b = bArr;
        this.c = shyVarArr;
        this.a = i;
    }

    public static int e(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static void h(int i, int i2, String str) throws ect {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        clw.S(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        clw.R();
    }

    public final int a() {
        return b() + (((srm[]) this.e).length * 16);
    }

    public final int b() {
        return (((int[]) this.d).length * 4) + 84;
    }

    public final boolean c(int i) {
        return ((ekf[]) this.d)[i] != null;
    }

    public final int d(String str) throws ect {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        clw.R();
        return iGlGetAttribLocation;
    }

    public final int f(String str) {
        return GLES20.glGetUniformLocation(this.a, str);
    }

    public final boolean g(sro sroVar, int i) {
        return sroVar != null && Objects.equals(((ekf[]) this.d)[i], ((ekf[]) sroVar.d)[i]) && Objects.equals(((ezf[]) this.e)[i], ((ezf[]) sroVar.e)[i]);
    }

    public sro(int i, List list, String str, Locale locale, String str2) {
        list.getClass();
        this.b = list;
        this.a = i;
        this.d = str;
        this.c = locale;
        this.e = str2;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
    public sro(String str, String str2) throws ect {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        clw.R();
        h(iGlCreateProgram, 35633, str);
        h(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        clw.S(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram))));
        GLES20.glUseProgram(iGlCreateProgram);
        this.b = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.d = new dhq[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, e(bArr));
            GLES20.glGetAttribLocation(i2, str3);
            dhq dhqVar = new dhq(str3);
            ((dhq[]) this.d)[i] = dhqVar;
            this.b.put(dhqVar.a, dhqVar);
        }
        this.c = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.e = new dhq[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            String str4 = new String(bArr2, 0, e(bArr2));
            GLES20.glGetUniformLocation(i5, str4);
            dhq dhqVar2 = new dhq(str4);
            ((dhq[]) this.e)[i4] = dhqVar2;
            this.c.put(dhqVar2.a, dhqVar2);
        }
        clw.R();
    }

    public sro(List list, Set set, int i) {
        byte[] bArr = new byte[64];
        this.c = bArr;
        this.a = i;
        bArr[0] = 64;
        this.e = new srm[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((srm[]) this.e)[i2] = new srm(i2, ((srk) list.get(i2)).e);
        }
        this.d = new int[i];
        int i3 = 0;
        for (short s = 0; s < i; s = (short) (s + 1)) {
            if (set.contains(Short.valueOf(s))) {
                ((int[]) this.d)[s] = i3;
                i3 += 16;
            } else {
                ((int[]) this.d)[s] = -1;
            }
        }
        this.b = new srl((short) 513, (short) 84, a());
    }

    public sro(ekf[] ekfVarArr, ezf[] ezfVarArr, ebh ebhVar, Object obj) {
        int length = ekfVarArr.length;
        a.H(length == ezfVarArr.length);
        this.d = ekfVarArr;
        this.e = (ezf[]) ezfVarArr.clone();
        this.b = ebhVar;
        this.c = obj;
        this.a = length;
    }
}
