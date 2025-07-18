package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxu {
    public static final Logger a = Logger.getLogger(xxu.class.getName());

    private xxu() {
    }

    public static Object a(uvm uvmVar) throws IOException, NumberFormatException {
        String strF;
        String string;
        double d;
        sij.x(uvmVar.i(), "unexpected end of JSON");
        int iJ = uvmVar.j() - 1;
        boolean z = true;
        if (iJ == 0) {
            int iA = uvmVar.c;
            if (iA == 0) {
                iA = uvmVar.a();
            }
            if (iA != 3) {
                throw uvmVar.c("BEGIN_ARRAY");
            }
            uvmVar.h(1);
            uvmVar.i[uvmVar.g - 1] = 0;
            uvmVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (uvmVar.i()) {
                arrayList.add(a(uvmVar));
            }
            sij.x(uvmVar.j() == 2, "Bad token: ".concat(uvmVar.d()));
            int iA2 = uvmVar.c;
            if (iA2 == 0) {
                iA2 = uvmVar.a();
            }
            if (iA2 != 4) {
                throw uvmVar.c("END_ARRAY");
            }
            int i = uvmVar.g;
            uvmVar.g = i - 1;
            int[] iArr = uvmVar.i;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            uvmVar.c = 0;
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iJ == 2) {
            int iA3 = uvmVar.c;
            if (iA3 == 0) {
                iA3 = uvmVar.a();
            }
            if (iA3 != 1) {
                throw uvmVar.c("BEGIN_OBJECT");
            }
            uvmVar.h(3);
            uvmVar.c = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (uvmVar.i()) {
                int iA4 = uvmVar.c;
                if (iA4 == 0) {
                    iA4 = uvmVar.a();
                }
                if (iA4 == 14) {
                    strF = uvmVar.g();
                } else if (iA4 == 12) {
                    strF = uvmVar.f('\'');
                } else {
                    if (iA4 != 13) {
                        throw uvmVar.c("a name");
                    }
                    strF = uvmVar.f('\"');
                }
                uvmVar.c = 0;
                uvmVar.h[uvmVar.g - 1] = strF;
                sij.s(!linkedHashMap.containsKey(strF), "Duplicate key found: %s", strF);
                linkedHashMap.put(strF, a(uvmVar));
            }
            sij.x(uvmVar.j() == 4, "Bad token: ".concat(uvmVar.d()));
            int iA5 = uvmVar.c;
            if (iA5 == 0) {
                iA5 = uvmVar.a();
            }
            if (iA5 != 2) {
                throw uvmVar.c("END_OBJECT");
            }
            int i3 = uvmVar.g;
            int i4 = i3 - 1;
            uvmVar.g = i4;
            uvmVar.h[i4] = null;
            int[] iArr2 = uvmVar.i;
            int i5 = i3 - 2;
            iArr2[i5] = iArr2[i5] + 1;
            uvmVar.c = 0;
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iJ == 5) {
            int iA6 = uvmVar.c;
            if (iA6 == 0) {
                iA6 = uvmVar.a();
            }
            if (iA6 == 10) {
                string = uvmVar.g();
            } else if (iA6 == 8) {
                string = uvmVar.f('\'');
            } else if (iA6 == 9) {
                string = uvmVar.f('\"');
            } else if (iA6 == 11) {
                string = uvmVar.f;
                uvmVar.f = null;
            } else if (iA6 == 15) {
                string = Long.toString(uvmVar.d);
            } else {
                if (iA6 != 16) {
                    throw uvmVar.c("a string");
                }
                String str = new String(uvmVar.a, uvmVar.b, uvmVar.e);
                uvmVar.b += uvmVar.e;
                string = str;
            }
            uvmVar.c = 0;
            int[] iArr3 = uvmVar.i;
            int i6 = uvmVar.g - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return string;
        }
        if (iJ != 6) {
            if (iJ != 7) {
                if (iJ != 8) {
                    throw new IllegalStateException("Bad token: ".concat(uvmVar.d()));
                }
                int iA7 = uvmVar.c;
                if (iA7 == 0) {
                    iA7 = uvmVar.a();
                }
                if (iA7 != 7) {
                    throw uvmVar.c("null");
                }
                uvmVar.c = 0;
                int[] iArr4 = uvmVar.i;
                int i7 = uvmVar.g - 1;
                iArr4[i7] = iArr4[i7] + 1;
                return null;
            }
            int iA8 = uvmVar.c;
            if (iA8 == 0) {
                iA8 = uvmVar.a();
            }
            if (iA8 == 5) {
                uvmVar.c = 0;
                int[] iArr5 = uvmVar.i;
                int i8 = uvmVar.g - 1;
                iArr5[i8] = iArr5[i8] + 1;
            } else {
                if (iA8 != 6) {
                    throw uvmVar.c("a boolean");
                }
                uvmVar.c = 0;
                int[] iArr6 = uvmVar.i;
                int i9 = uvmVar.g - 1;
                iArr6[i9] = iArr6[i9] + 1;
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int iA9 = uvmVar.c;
        if (iA9 == 0) {
            iA9 = uvmVar.a();
        }
        if (iA9 == 15) {
            uvmVar.c = 0;
            int[] iArr7 = uvmVar.i;
            int i10 = uvmVar.g - 1;
            iArr7[i10] = iArr7[i10] + 1;
            d = uvmVar.d;
        } else {
            if (iA9 == 16) {
                char[] cArr = uvmVar.a;
                int i11 = uvmVar.b;
                int i12 = uvmVar.e;
                uvmVar.f = new String(cArr, i11, i12);
                uvmVar.b = i11 + i12;
            } else if (iA9 == 8 || iA9 == 9) {
                uvmVar.f = uvmVar.f(iA9 == 8 ? '\'' : '\"');
            } else if (iA9 == 10) {
                uvmVar.f = uvmVar.g();
            } else if (iA9 != 11) {
                throw uvmVar.c("a double");
            }
            uvmVar.c = 11;
            d = Double.parseDouble(uvmVar.f);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw uvmVar.b("JSON forbids NaN and infinities: " + d);
            }
            uvmVar.f = null;
            uvmVar.c = 0;
            int[] iArr8 = uvmVar.i;
            int i13 = uvmVar.g - 1;
            iArr8[i13] = iArr8[i13] + 1;
        }
        return Double.valueOf(d);
    }
}
