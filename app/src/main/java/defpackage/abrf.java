package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrf {
    public static abrr a(abtq abtqVar) {
        abxc abxcVar = abrh.b;
        MessageLite messageLite = abxcVar.a;
        abtq abtqVar2 = abtq.a;
        if (messageLite != abtqVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = abtqVar.n;
        abxb abxbVar = abxcVar.d;
        if (abwrVar.n(abxbVar)) {
            if (messageLite != abtqVar2) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = abtqVar.n.k(abxbVar);
            return (abrr) (objK == null ? abxcVar.b : abxcVar.b(objK));
        }
        abxc abxcVar2 = abrl.b;
        MessageLite messageLite2 = abxcVar2.a;
        if (messageLite2 != abtqVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar2 = abtqVar.n;
        abxb abxbVar2 = abxcVar2.d;
        if (!abwrVar2.n(abxbVar2)) {
            throw new IllegalArgumentException("Malformed pToken: pToken version is not recognized.");
        }
        abrr abrrVar = abrr.a;
        abro abroVar = new abro();
        abrq abrqVar = abrq.a;
        abrp abrpVar = new abrp();
        if (messageLite2 != abtqVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK2 = abtqVar.n.k(abxbVar2);
        abrn abrnVar = (abrn) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2));
        if ((abrpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abrpVar.y();
        }
        abrq abrqVar2 = (abrq) abrpVar.b;
        abrnVar.getClass();
        abrqVar2.c = abrnVar;
        abrqVar2.b = 1;
        if ((abroVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abroVar.y();
        }
        abrr abrrVar2 = (abrr) abroVar.b;
        abrq abrqVar3 = (abrq) abrpVar.v();
        abrqVar3.getClass();
        abxs abxsVar = abrrVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abrrVar2.b = abxsVar.d(size + size);
        }
        abrrVar2.b.add(abrqVar3);
        return (abrr) abroVar.v();
    }
}
