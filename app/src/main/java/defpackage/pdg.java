package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdg {
    public static MessageLite a(pbd pbdVar, abwk abwkVar) {
        if (!(pbdVar instanceof pdf)) {
            return (MessageLite) ((abxc) abwkVar).b;
        }
        pcc pccVarA = ((pdf) pbdVar).a();
        abxc abxcVar = (abxc) abwkVar;
        if (abxcVar.a != pcc.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = pccVarA.n.k(abxcVar.d);
        return (MessageLite) (objK == null ? abxcVar.b : abxcVar.b(objK));
    }
}
