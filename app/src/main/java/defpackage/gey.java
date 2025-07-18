package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gey {
    public final gfl a(gfi gfiVar, gez gezVar) {
        String str = gezVar.c;
        gfl gflVarA = gfiVar.a(str);
        gflVarA.h(str);
        abxk abxkVar = ahrs.a;
        ahrq ahrqVar = new ahrq();
        ahta.c(str, ahrqVar);
        ahrc ahrcVar = ahrc.a;
        ahqy ahqyVar = new ahqy();
        String str2 = gezVar.b.ah.a;
        str2.getClass();
        if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqyVar.y();
        }
        ahrc ahrcVar2 = (ahrc) ahqyVar.b;
        ahrcVar2.b |= 1;
        ahrcVar2.c = str2;
        ahqj.b(gezVar.d, ahqyVar);
        ahrc ahrcVarA = ahqj.a(ahqyVar);
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        ahrsVar.g = ahrcVarA;
        ahrsVar.f = 8;
        gflVarA.g(ahta.a(ahrqVar));
        return gflVarA;
    }

    public final boolean b(gez gezVar, agow agowVar, agow agowVar2) {
        int i = gezVar.d - 1;
        if (i == 0) {
            return false;
        }
        if (i == 1 || i == 2 || i == 8) {
            return ((Boolean) agowVar.a()).booleanValue() || ((Boolean) agowVar2.a()).booleanValue();
        }
        Object objA = agowVar2.a();
        objA.getClass();
        return ((Boolean) objA).booleanValue();
    }

    public final boolean c(gez gezVar, agow agowVar) {
        int i = gezVar.d - 1;
        if (i != 1 && i != 2 && i != 8) {
            return false;
        }
        Object objA = agowVar.a();
        objA.getClass();
        return ((Boolean) objA).booleanValue();
    }

    public final gfg d(gfd gfdVar, gez gezVar, int i, int i2) {
        String str = gezVar.c;
        gfg gfgVarA = gfdVar.a(str);
        gfgVarA.g(str);
        abxk abxkVar = ahrs.a;
        ahrq ahrqVar = new ahrq();
        ahta.c(str, ahrqVar);
        ahrc ahrcVar = ahrc.a;
        ahqy ahqyVar = new ahqy();
        String str2 = gezVar.b.ah.a;
        str2.getClass();
        if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqyVar.y();
        }
        ahrc ahrcVar2 = (ahrc) ahqyVar.b;
        ahrcVar2.b |= 1;
        ahrcVar2.c = str2;
        ahqj.b(gezVar.d, ahqyVar);
        ahra ahraVar = ahra.a;
        ahqz ahqzVar = new ahqz();
        if (i != 0) {
            if ((ahqzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqzVar.y();
            }
            ahra ahraVar2 = (ahra) ahqzVar.b;
            if (i == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            ahraVar2.c = i - 2;
            ahraVar2.b |= 1;
        }
        if (i2 != 0) {
            if ((ahqzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqzVar.y();
            }
            ahra ahraVar3 = (ahra) ahqzVar.b;
            if (i2 == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            ahraVar3.d = i2 - 2;
            ahraVar3.b |= 2;
        }
        abxd abxdVarV = ahqzVar.v();
        abxdVarV.getClass();
        ahra ahraVar4 = (ahra) abxdVarV;
        if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqyVar.y();
        }
        ahrc ahrcVar3 = (ahrc) ahqyVar.b;
        ahrcVar3.e = ahraVar4;
        ahrcVar3.b |= 4;
        ahrc ahrcVarA = ahqj.a(ahqyVar);
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        ahrsVar.g = ahrcVarA;
        ahrsVar.f = 8;
        gfgVarA.f(ahta.a(ahrqVar));
        return gfgVarA;
    }
}
