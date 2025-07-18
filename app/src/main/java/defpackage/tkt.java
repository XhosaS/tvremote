package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkt {
    public static final adcp a(acxt acxtVar) {
        abxc abxcVar = adcr.b;
        MessageLite messageLite = abxcVar.a;
        acxt acxtVar2 = acxt.a;
        if (messageLite != acxtVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = acxtVar.n;
        abxb abxbVar = abxcVar.d;
        if (!abwrVar.n(abxbVar)) {
            return null;
        }
        if (messageLite != acxtVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = acxtVar.n.k(abxbVar);
        return (adcp) (objK == null ? abxcVar.b : abxcVar.b(objK));
    }

    public static final addu b(acxt acxtVar) {
        abxc abxcVar = addu.b;
        MessageLite messageLite = abxcVar.a;
        acxt acxtVar2 = acxt.a;
        if (messageLite != acxtVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = acxtVar.n;
        abxb abxbVar = abxcVar.d;
        if (!abwrVar.n(abxbVar)) {
            return null;
        }
        if (messageLite != acxtVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = acxtVar.n.k(abxbVar);
        return (addu) (objK == null ? abxcVar.b : abxcVar.b(objK));
    }
}
