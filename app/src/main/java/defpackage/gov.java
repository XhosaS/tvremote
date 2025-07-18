package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gov {
    public final ymg a(String str, String str2, boolean z, String str3) {
        yiu yiuVar = yiu.a;
        yiv yivVar = new yiv(new yit());
        yivVar.d(2);
        yivVar.e();
        yil yilVar = yil.a;
        yhy yhyVar = new yhy(new yig());
        yig yigVar = yhyVar.a;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar2 = (yil) yigVar.b;
        yilVar2.b |= 1;
        yilVar2.d = str2;
        yil yilVarA = yhyVar.a();
        yit yitVar = yivVar.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar2 = (yiu) yitVar.b;
        yiuVar2.f = yilVarA;
        yiuVar2.b |= 32;
        if (z) {
            yivVar.c(fcz.b(str3));
        }
        yiu yiuVarA = yivVar.a();
        ymg ymgVar = ymg.a;
        ymf ymfVar = new ymf();
        yip yipVar = yip.a;
        yio yioVar = new yio();
        yioVar.a(yiuVarA);
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        yip yipVar2 = (yip) yioVar.v();
        yipVar2.getClass();
        ymgVar2.h = yipVar2;
        ymgVar2.b |= 32;
        if (str.length() > 0) {
            ylf ylfVar = ylf.a;
            yle yleVar = new yle();
            ykz ykzVar = ykz.a;
            yky ykyVar = new yky();
            if ((ykyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ykyVar.y();
            }
            ykz ykzVar2 = (ykz) ykyVar.b;
            ykzVar2.b |= 1;
            ykzVar2.c = str;
            if ((ykyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ykyVar.y();
            }
            ykz ykzVar3 = (ykz) ykyVar.b;
            abxs abxsVar = ykzVar3.d;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                ykzVar3.d = abxsVar.d(size + size);
            }
            ykzVar3.d.add(str2);
            if ((yleVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yleVar.y();
            }
            ylf ylfVar2 = (ylf) yleVar.b;
            ykz ykzVar4 = (ykz) ykyVar.v();
            ykzVar4.getClass();
            abxs abxsVar2 = ylfVar2.b;
            if (!abxsVar2.c()) {
                int size2 = abxsVar2.size();
                ylfVar2.b = abxsVar2.d(size2 + size2);
            }
            ylfVar2.b.add(ykzVar4);
            if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymfVar.y();
            }
            ymg ymgVar3 = (ymg) ymfVar.b;
            ylf ylfVar3 = (ylf) yleVar.v();
            ylfVar3.getClass();
            ymgVar3.g = ylfVar3;
            ymgVar3.b |= 16;
        }
        abxd abxdVarV = ymfVar.v();
        abxdVarV.getClass();
        return (ymg) abxdVarV;
    }
}
