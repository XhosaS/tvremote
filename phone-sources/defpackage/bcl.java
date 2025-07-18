package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcl {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final yft e;
    public final jc f;

    public bcl(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            bcm.a("Invalid start index");
        }
        this.d = new ArrayList();
        jc jcVar = new jc((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            tqp tqpVar = (tqp) this.a.get(i3);
            jcVar.f(tqpVar.c, new odn(i3, i2, tqpVar.a));
            i2 += tqpVar.a;
        }
        this.f = jcVar;
        this.e = new yga(new bck(this, 0));
    }

    public final boolean a(int i, int i2) {
        int i3;
        int i4;
        jc jcVar = this.f;
        odn odnVar = (odn) jcVar.a(i);
        if (odnVar == null) {
            return false;
        }
        int i5 = odnVar.b;
        int i6 = i2 - odnVar.a;
        odnVar.a = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = jcVar.c;
        long[] jArr = jcVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        odn odnVar2 = (odn) objArr[(i7 << 3) + i9];
                        if (odnVar2.b >= i5 && !yks.e(odnVar2, odnVar) && (i4 = odnVar2.b + i6) >= 0) {
                            odnVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final int b(tqp tqpVar) {
        odn odnVar = (odn) this.f.a(tqpVar.c);
        if (odnVar != null) {
            return odnVar.b;
        }
        return -1;
    }

    public final int c(tqp tqpVar) {
        odn odnVar = (odn) this.f.a(tqpVar.c);
        return odnVar != null ? odnVar.a : tqpVar.a;
    }

    public final void d(tqp tqpVar, int i) {
        this.f.f(tqpVar.c, new odn(-1, i, 0));
    }

    public final void e(tqp tqpVar) {
        this.d.add(tqpVar);
    }
}
