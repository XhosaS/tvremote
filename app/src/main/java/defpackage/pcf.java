package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcf implements paw {
    private final par a;

    public pcf(par parVar) {
        this.a = parVar;
    }

    @Override // defpackage.paw
    public final zyd a(pbd pbdVar) {
        if (pbdVar instanceof pdf) {
            pdf pdfVar = (pdf) pbdVar;
            pcc pccVarA = pdfVar.a();
            abxc abxcVar = pck.a;
            MessageLite messageLite = abxcVar.a;
            pcc pccVar = pcc.a;
            if (messageLite != pccVar) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            abwr abwrVar = pccVarA.n;
            abxb abxbVar = abxcVar.d;
            if (abwrVar.n(abxbVar)) {
                pcc pccVarA2 = pdfVar.a();
                if (messageLite != pccVar) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                Object objK = pccVarA2.n.k(abxbVar);
                pcj pcjVar = (pcj) (objK == null ? abxcVar.b : abxcVar.b(objK));
                int iA = pci.a(pcjVar.d);
                if (iA == 0) {
                    iA = 1;
                }
                int i = iA - 1;
                if (i == 1) {
                    if ((pcjVar.b & 1) == 0) {
                        throw new IllegalArgumentException("GAIA type must have a name");
                    }
                    String str = pcjVar.c;
                    str.getClass();
                    return zxn.h(new par(1, str));
                }
                if (i == 2) {
                    return zxn.h(new par(3, null));
                }
                if (i == 3) {
                    return zxn.h(new par(2, null));
                }
                if (i == 4) {
                    return zxn.h(this.a);
                }
                throw new IllegalArgumentException("Unknown type");
            }
        }
        return zxy.a;
    }
}
