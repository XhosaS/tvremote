package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tya implements tyf {
    @Override // defpackage.tyf
    public final void a(adkf adkfVar, twb twbVar) {
        abxc abxcVar = adkj.b;
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
            twbVar.a(((adkj) (objK == null ? abxcVar.b : abxcVar.b(objK))).c);
        }
    }
}
