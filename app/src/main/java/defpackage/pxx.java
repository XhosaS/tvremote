package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pxx {
    public static pjf a(phu phuVar, int i) {
        pjf pjfVar = pjf.a;
        pje pjeVar = new pje();
        String str = phuVar.d;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar2 = (pjf) pjeVar.b;
        str.getClass();
        pjfVar2.b |= 1;
        pjfVar2.c = str;
        long j = phuVar.e;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar3 = (pjf) pjeVar.b;
        pjfVar3.b |= 2;
        pjfVar3.d = j;
        String strE = qeg.e(phuVar);
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar4 = (pjf) pjeVar.b;
        strE.getClass();
        pjfVar4.b |= 4;
        pjfVar4.e = strE;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar5 = (pjf) pjeVar.b;
        pjfVar5.f = i - 1;
        pjfVar5.b |= 8;
        if ((phuVar.b & 32) != 0) {
            adwd adwdVar = phuVar.h;
            if (adwdVar == null) {
                adwdVar = adwd.a;
            }
            if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pjeVar.y();
            }
            pjf pjfVar6 = (pjf) pjeVar.b;
            adwdVar.getClass();
            pjfVar6.g = adwdVar;
            pjfVar6.b |= 16;
        }
        return (pjf) pjeVar.v();
    }
}
