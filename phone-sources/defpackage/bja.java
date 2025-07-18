package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bja implements Iterable, yli {
    public static final bja a = new bja(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private bja(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final bja a(bja bjaVar) {
        bja bjaVar2 = a;
        if (bjaVar == bjaVar2) {
            return this;
        }
        if (this == bjaVar2) {
            return bjaVar2;
        }
        long j = bjaVar.d;
        long j2 = this.d;
        if (j == j2) {
            long[] jArr = bjaVar.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new bja((~bjaVar.b) & this.b, this.c & (~bjaVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = bjaVar.e;
        bja bjaVarB = this;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                bjaVarB = bjaVarB.b(j3);
            }
        }
        long j4 = bjaVar.c;
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    bjaVarB = bjaVarB.b(i + j);
                }
            }
        }
        long j5 = bjaVar.b;
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    bjaVarB = bjaVarB.b(i2 + j + 64);
                }
            }
        }
        return bjaVarB;
    }

    public final bja b(long j) {
        long[] jArr;
        int iS;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (yks.b(j3, 0L) >= 0 && yks.b(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new bja(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (yks.b(j3, 64L) >= 0 && yks.b(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new bja((~j6) & j7, this.c, j2, this.e);
            }
        } else if (yks.b(j3, 0L) < 0 && (jArr = this.e) != null && (iS = bcm.s(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iS > 0) {
                    yfm.bi(jArr, jArr3, 0, 0, iS);
                }
                if (iS < i) {
                    yfm.bi(jArr, jArr3, iS, iS + 1, length);
                }
                jArr2 = jArr3;
            }
            return new bja(j8, j9, j2, jArr2);
        }
        return this;
    }

    public final bja c(bja bjaVar) {
        bja bjaVarD = bjaVar;
        bja bjaVar2 = a;
        if (bjaVarD == bjaVar2) {
            return this;
        }
        if (this == bjaVar2) {
            return bjaVarD;
        }
        long j = bjaVarD.d;
        long j2 = this.d;
        if (j == j2) {
            long[] jArr = bjaVarD.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new bja(bjaVarD.b | this.b, bjaVarD.c | this.c, j2, jArr2);
            }
        }
        long j3 = 1;
        int i = 0;
        if (this.e == null) {
            long j4 = this.c;
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        bjaVarD = bjaVarD.d(i2 + j2);
                    }
                }
            }
            long j5 = this.b;
            if (j5 != 0) {
                while (i < 64) {
                    if (((1 << i) & j5) != 0) {
                        bjaVarD = bjaVarD.d(i + j2 + 64);
                    }
                    i++;
                }
            }
            return bjaVarD;
        }
        long[] jArr3 = bjaVarD.e;
        bja bjaVarD2 = this;
        if (jArr3 != null) {
            for (long j6 : jArr3) {
                bjaVarD2 = bjaVarD2.d(j6);
            }
        }
        long j7 = bjaVarD.c;
        if (j7 != 0) {
            int i3 = 0;
            while (i3 < 64) {
                long j8 = j3;
                if ((j7 & (j3 << i3)) != 0) {
                    bjaVarD2 = bjaVarD2.d(i3 + j);
                }
                i3++;
                j3 = j8;
            }
        }
        long j9 = j3;
        long j10 = bjaVarD.b;
        if (j10 != 0) {
            while (i < 64) {
                if (((j9 << i) & j10) != 0) {
                    bjaVarD2 = bjaVarD2.d(i + j + 64);
                }
                i++;
            }
        }
        return bjaVarD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bja d(long r31) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bja.d(long):bja");
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (yks.b(j2, 0L) < 0 || yks.b(j2, 64L) >= 0) {
            if (yks.b(j2, 64L) < 0 || yks.b(j2, 128L) >= 0) {
                if (yks.b(j2, 0L) <= 0 && (jArr = this.e) != null && bcm.s(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j2)) & this.c) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new cxb(new biz(this, null), 3).a();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(yfm.z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
