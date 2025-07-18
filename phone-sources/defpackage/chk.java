package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chk {
    public final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;

    public chk(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iT = ylh.T(this.a.getText(), '\n', length, 4);
            length = iT < 0 ? this.a.getText().length() : iT + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    private final float g(int i, boolean z) {
        Layout layout = this.a;
        int iK = ykn.k(i, layout.getLineEnd(layout.getLineForOffset(i)));
        return z ? layout.getPrimaryHorizontal(iK) : layout.getSecondaryHorizontal(iK);
    }

    public final float a(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iD = i;
        if (!z2) {
            return g(i, z);
        }
        Layout layout = this.a;
        int iL = ccf.L(layout, iD);
        int lineStart = layout.getLineStart(iL);
        int lineEnd = layout.getLineEnd(iL);
        if (iD != lineStart && iD != lineEnd) {
            return g(i, z);
        }
        if (iD == 0 || iD == layout.getText().length()) {
            return g(i, z);
        }
        boolean z3 = true;
        int iB = b(iD, true);
        boolean zF = f(iB);
        int iD2 = d(lineEnd, lineStart);
        int iC = c(iB);
        int i4 = lineStart - iC;
        int i5 = iD2 - iC;
        Bidi bidiE = e(iB);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (!z && zF != zIsRtlCharAt) {
                z3 = zF;
            } else if (zF) {
                z3 = false;
            }
            return (iD != lineStart ? z3 : !z3) ? layout.getLineRight(iL) : layout.getLineLeft(iL);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        chj[] chjVarArr = new chj[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            chjVarArr[i6] = new chj(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, chjVarArr, 0, runCount);
        if (iD == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (chjVarArr[i8].a == iD) {
                    break;
                }
                i8++;
            }
            chj chjVar = chjVarArr[i8];
            if (z || zF == chjVar.c) {
                zF = !zF;
            }
            if (i8 != 0) {
                i3 = i8;
            } else {
                if (zF) {
                    return layout.getLineLeft(iL);
                }
                i3 = 0;
            }
            return (i3 != yfm.aM(chjVarArr) || zF) ? zF ? layout.getPrimaryHorizontal(chjVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(chjVarArr[i3 + 1].a) : layout.getLineRight(iL);
        }
        if (iD > iD2) {
            iD = d(iD, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i9 = -1;
                break;
            }
            if (chjVarArr[i9].b == iD) {
                break;
            }
            i9++;
        }
        chj chjVar2 = chjVarArr[i9];
        if (!z && zF != chjVar2.c) {
            zF = !zF;
        }
        if (i9 != 0) {
            i2 = i9;
        } else {
            if (zF) {
                return layout.getLineLeft(iL);
            }
            i2 = 0;
        }
        return (i2 != yfm.aM(chjVarArr) || zF) ? zF ? layout.getPrimaryHorizontal(chjVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(chjVarArr[i2 + 1].b) : layout.getLineRight(iL);
    }

    public final int b(int i, boolean z) {
        List list = this.b;
        int iX = yfm.x(list, Integer.valueOf(i));
        int i2 = iX < 0 ? -(iX + 1) : iX + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) list.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int d(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char cCharAt = this.a.getText().charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (yks.a(cCharAt, 8192) >= 0 && yks.a(cCharAt, 8202) <= 0) {
                    if (cCharAt == 8199) {
                        cCharAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (cCharAt != 8287 && cCharAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi e(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.d
            boolean r1 = r0[r12]
            if (r1 == 0) goto Lf
            java.util.List r0 = r11.c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r1 = 0
            if (r12 != 0) goto L14
            r2 = r1
            goto L22
        L14:
            java.util.List r2 = r11.b
            int r3 = r12 + (-1)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L22:
            java.util.List r3 = r11.b
            java.lang.Object r3 = r3.get(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r9 = r3 - r2
            char[] r4 = r11.e
            if (r4 == 0) goto L37
            int r5 = r4.length
            if (r5 >= r9) goto L39
        L37:
            char[] r4 = new char[r9]
        L39:
            r5 = r4
            android.text.Layout r4 = r11.a
            java.lang.CharSequence r4 = r4.getText()
            android.text.TextUtils.getChars(r4, r2, r3, r5, r1)
            boolean r1 = java.text.Bidi.requiresBidi(r5, r1, r9)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L5d
            boolean r10 = r11.f(r12)
            java.text.Bidi r4 = new java.text.Bidi
            r7 = 0
            r8 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r1 = r4.getRunCount()
            if (r1 != r2) goto L5e
        L5d:
            r4 = r3
        L5e:
            java.util.List r1 = r11.c
            r1.set(r12, r4)
            r0[r12] = r2
            if (r4 == 0) goto L6e
            char[] r12 = r11.e
            if (r5 != r12) goto L6d
            r5 = r3
            goto L6e
        L6d:
            r5 = r12
        L6e:
            r11.e = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chk.e(int):java.text.Bidi");
    }

    public final boolean f(int i) {
        Layout layout = this.a;
        return layout.getParagraphDirection(layout.getLineForOffset(c(i))) == -1;
    }
}
