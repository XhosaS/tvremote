package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ird {
    public static ymg a(int i, boolean z, String str) {
        yiu yiuVar = yiu.a;
        yit yitVar = new yit();
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar2 = (yiu) yitVar.b;
        yiuVar2.d = 7;
        yiuVar2.b |= 2;
        yil yilVar = yil.a;
        yig yigVar = new yig();
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar2 = (yil) yigVar.b;
        yilVar2.m = i - 1;
        yilVar2.c |= 262144;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar3 = (yiu) yitVar.b;
        yil yilVar3 = (yil) yigVar.v();
        yilVar3.getClass();
        yiuVar3.f = yilVar3;
        yiuVar3.b |= 32;
        if (z) {
            String strB = fcz.b(str);
            if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yitVar.y();
            }
            yiu yiuVar4 = (yiu) yitVar.b;
            yiuVar4.b |= 1;
            yiuVar4.c = strB;
        }
        ymg ymgVar = ymg.a;
        ymf ymfVar = new ymf();
        yip yipVar = yip.a;
        yio yioVar = new yio();
        yioVar.a((yiu) yitVar.v());
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        yip yipVar2 = (yip) yioVar.v();
        yipVar2.getClass();
        ymgVar2.h = yipVar2;
        ymgVar2.b |= 32;
        return (ymg) ymfVar.v();
    }

    public static ymg b(boolean z, Optional optional, boolean z2, String str, int i) {
        int i2 = z ? (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) ? 4 : 2 : 3;
        yiu yiuVar = yiu.a;
        yit yitVar = new yit();
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar2 = (yiu) yitVar.b;
        yiuVar2.d = 7;
        yiuVar2.b |= 2;
        yil yilVar = yil.a;
        yig yigVar = new yig();
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar2 = (yil) yigVar.b;
        yilVar2.e = i2 - 1;
        yilVar2.b |= 2;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar3 = (yil) yigVar.b;
        yilVar3.n = i - 1;
        yilVar3.c |= 524288;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar3 = (yiu) yitVar.b;
        yil yilVar4 = (yil) yigVar.v();
        yilVar4.getClass();
        yiuVar3.f = yilVar4;
        yiuVar3.b |= 32;
        if (z2) {
            String strB = fcz.b(str);
            if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yitVar.y();
            }
            yiu yiuVar4 = (yiu) yitVar.b;
            yiuVar4.b |= 1;
            yiuVar4.c = strB;
        }
        ymg ymgVar = ymg.a;
        ymf ymfVar = new ymf();
        yip yipVar = yip.a;
        yio yioVar = new yio();
        yioVar.a((yiu) yitVar.v());
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        yip yipVar2 = (yip) yioVar.v();
        yipVar2.getClass();
        ymgVar2.h = yipVar2;
        ymgVar2.b |= 32;
        return (ymg) ymfVar.v();
    }
}
