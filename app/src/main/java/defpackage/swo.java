package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swo implements swq {
    public swo(sws swsVar) {
        swsVar.getClass();
    }

    @Override // defpackage.swq
    public final swl a(swp swpVar) {
        swl swlVar = swl.a;
        swk swkVar = new swk();
        rua ruaVar = swpVar.a;
        if ((ruaVar.b & 32) != 0) {
            int i = ruaVar.h;
            if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                swkVar.y();
            }
            swl swlVar2 = (swl) swkVar.b;
            swlVar2.b |= 16;
            swlVar2.g = i;
            sgo sgoVar = ruaVar.g;
            if (sgoVar == null) {
                sgoVar = sgo.a;
            }
            if (sgoVar.b == 41) {
                if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    swkVar.y();
                }
                swl swlVar3 = (swl) swkVar.b;
                swlVar3.b |= 32;
                swlVar3.h = 1;
            }
        } else {
            int i2 = ruaVar.d;
            if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                swkVar.y();
            }
            swl swlVar4 = (swl) swkVar.b;
            swlVar4.b |= 8;
            swlVar4.f = i2;
        }
        int i3 = ruaVar.c;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar5 = (swl) swkVar.b;
        swlVar5.b = 1 | swlVar5.b;
        swlVar5.c = i3;
        boolean z = ruaVar.e;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar6 = (swl) swkVar.b;
        swlVar6.b |= 2;
        swlVar6.d = z;
        boolean z2 = ruaVar.f;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar7 = (swl) swkVar.b;
        swlVar7.b |= 4;
        swlVar7.e = z2;
        abxd abxdVarV = swkVar.v();
        abxdVarV.getClass();
        return (swl) abxdVarV;
    }
}
