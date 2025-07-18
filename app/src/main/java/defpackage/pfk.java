package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfk implements pdk {
    private final pdk a = new pdk() { // from class: pfj
        @Override // defpackage.pdk
        public final /* synthetic */ yqt a(pbd pbdVar) {
            return ypv.a;
        }

        @Override // defpackage.pdk
        public final /* synthetic */ yqt b(pbd pbdVar) {
            return ypv.a;
        }

        @Override // defpackage.pdk
        public final /* synthetic */ yqt c(pbd pbdVar) {
            return ypv.a;
        }

        @Override // defpackage.pdk
        public final /* synthetic */ zyd d(pbd pbdVar, zyd zydVar) {
            return zxn.h(abwj.a);
        }

        @Override // defpackage.pdk
        public final /* synthetic */ zyd e(pbd pbdVar, zyd zydVar) {
            return zxy.a;
        }

        @Override // defpackage.pdk
        public final /* synthetic */ aece f(pbd pbdVar) {
            return aece.DEFAULT;
        }

        @Override // defpackage.pdk
        public final String g(pbd pbdVar) {
            return "";
        }

        @Override // defpackage.pdk
        public final /* synthetic */ zyd h() {
            throw null;
        }
    };
    private final pdk b;
    private final Map c;

    public pfk(pdk pdkVar, Map map) {
        this.b = pdkVar;
        this.c = map;
    }

    private final pdk i(pbd pbdVar) {
        if (!(pbdVar instanceof pdf)) {
            return this.a;
        }
        pdf pdfVar = (pdf) pbdVar;
        pcc pccVarA = pdfVar.a();
        abxc abxcVar = pfn.a;
        MessageLite messageLite = abxcVar.a;
        pcc pccVar = pcc.a;
        if (messageLite != pccVar) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = pccVarA.n;
        abxb abxbVar = abxcVar.d;
        if (!abwrVar.n(abxbVar)) {
            return this.b;
        }
        pcc pccVarA2 = pdfVar.a();
        if (messageLite != pccVar) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = pccVarA2.n.k(abxbVar);
        pdk pdkVar = (pdk) this.c.get(((pfm) (objK == null ? abxcVar.b : abxcVar.b(objK))).b);
        pdkVar.getClass();
        return pdkVar;
    }

    @Override // defpackage.pdk
    public final yqt a(pbd pbdVar) {
        return i(pbdVar).a(pbdVar);
    }

    @Override // defpackage.pdk
    public final yqt b(pbd pbdVar) {
        return i(pbdVar).b(pbdVar);
    }

    @Override // defpackage.pdk
    public final yqt c(pbd pbdVar) {
        return i(pbdVar).c(pbdVar);
    }

    @Override // defpackage.pdk
    public final zyd d(pbd pbdVar, zyd zydVar) {
        return i(pbdVar).d(pbdVar, zydVar);
    }

    @Override // defpackage.pdk
    public final zyd e(pbd pbdVar, zyd zydVar) {
        return i(pbdVar).e(pbdVar, zydVar);
    }

    @Override // defpackage.pdk
    public final aece f(pbd pbdVar) {
        return i(pbdVar).f(pbdVar);
    }

    @Override // defpackage.pdk
    public final String g(pbd pbdVar) {
        return i(pbdVar).g(pbdVar);
    }

    @Override // defpackage.pdk
    public final zyd h() {
        return zxy.a;
    }
}
