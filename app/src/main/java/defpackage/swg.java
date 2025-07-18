package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swg implements swq {
    public swg(sws swsVar) {
        swsVar.getClass();
    }

    @Override // defpackage.swq
    public final swl a(swp swpVar) {
        rua ruaVar = swpVar.a;
        boolean z = ruaVar.e;
        boolean z2 = ruaVar.f;
        sur surVar = ruaVar.i;
        if (surVar == null) {
            surVar = sur.a;
        }
        if (surVar.b == 2) {
            sur surVar2 = ruaVar.i;
            if (surVar2 == null) {
                surVar2 = sur.a;
            }
            if ((surVar2.b == 2 ? (svr) surVar2.c : svr.a).b) {
                z = false;
                z2 = false;
            }
        }
        int i = (ruaVar.b & 32) != 0 ? ruaVar.h : 16;
        swl swlVar = swl.a;
        swk swkVar = new swk();
        int i2 = ruaVar.c;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar2 = (swl) swkVar.b;
        swlVar2.b |= 1;
        swlVar2.c = i2;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar3 = (swl) swkVar.b;
        swlVar3.b = 2 | swlVar3.b;
        swlVar3.d = z;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar4 = (swl) swkVar.b;
        swlVar4.b |= 4;
        swlVar4.e = z2;
        if ((swkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            swkVar.y();
        }
        swl swlVar5 = (swl) swkVar.b;
        swlVar5.b |= 16;
        swlVar5.g = i;
        swm.b(swkVar);
        return swm.a(swkVar);
    }
}
