package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyb implements tyf {
    @Override // defpackage.tyf
    public final void a(adkf adkfVar, twb twbVar) {
        int iA;
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
            if (advhVar.c == 2) {
                adhr adhrVar = (adhr) advhVar.d;
                if ((adhrVar.b & 1) != 0) {
                    int i = adhrVar.c;
                    int iA2 = adhq.a(i);
                    if (iA2 == 0 || iA2 == 1) {
                        twbVar.l();
                        return;
                    }
                    int iA3 = adhq.a(i);
                    if ((iA3 != 0 && iA3 == 2) || ((iA = adhq.a(i)) != 0 && iA == 4)) {
                        twbVar.b();
                    }
                }
            }
        }
    }
}
