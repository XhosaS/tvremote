package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tye implements tyf {
    @Override // defpackage.tyf
    public final void a(adkf adkfVar, twb twbVar) {
        String str;
        abxc abxcVar = advh.b;
        MessageLite messageLite = abxcVar.a;
        adkf adkfVar2 = adkf.a;
        if (messageLite != adkfVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = adkfVar.n;
        abxb abxbVar = abxcVar.d;
        if (abwrVar.n(abxbVar)) {
            if (messageLite != adkfVar2) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = adkfVar.n.k(abxbVar);
            advh advhVar = (advh) (objK == null ? abxcVar.b : abxcVar.b(objK));
            if (advhVar.c == 1) {
                adik adikVar = (adik) advhVar.d;
                int iA = adij.a(adikVar.c);
                if (!(iA == 0 || iA == 1) || (adikVar.b & 8) == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                adhz adhzVar = adikVar.e;
                if (adhzVar == null) {
                    adhzVar = adhz.a;
                }
                loop0: while (true) {
                    boolean z = false;
                    for (adhx adhxVar : adhzVar.b) {
                        if ((adhxVar.b & 1) != 0) {
                            str = adhxVar.c;
                            double d = adhxVar.d;
                            if (z || d < 0.9d) {
                                sb.append(str);
                                z = true;
                            }
                        }
                    }
                    sb2.append(str);
                }
                tuw tuwVar = tuw.a;
                tuv tuvVar = new tuv();
                String string = sb2.toString();
                if ((tuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    tuvVar.y();
                }
                tuw tuwVar2 = (tuw) tuvVar.b;
                tuwVar2.b = 1 | tuwVar2.b;
                tuwVar2.c = string;
                String string2 = sb.toString();
                if ((tuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    tuvVar.y();
                }
                tuw tuwVar3 = (tuw) tuvVar.b;
                tuwVar3.b |= 2;
                tuwVar3.d = string2;
                twbVar.h((tuw) tuvVar.v());
            }
        }
    }
}
