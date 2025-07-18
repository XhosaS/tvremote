package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmm extends zix implements zig {
    final zih a;
    final int b;

    public zmm(zjr zjrVar) {
        int i = zjrVar.c;
        this.b = i;
        if (i == 0) {
            this.a = zmr.c(zjrVar);
        } else {
            this.a = zjo.h(zjrVar);
        }
    }

    public static zmm a(zjr zjrVar) {
        if (zjrVar == null) {
            throw new NullPointerException("'taggedObject' cannot be null");
        }
        wcq.ar(zjrVar);
        if (!zjrVar.n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        zjh zjhVarP = zjrVar.d.p();
        if (!(zjhVarP instanceof zjr)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(zjhVarP.getClass().getName())));
        }
        zjr zjrVar2 = (zjr) zjhVarP;
        if (zjrVar2 != null) {
            return new zmm(zjrVar2);
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return new zks(false, this.b, this.a);
    }

    public final String toString() {
        String str = zxr.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        if (this.b == 0) {
            wef.aa(stringBuffer, str, "fullName", this.a.toString());
        } else {
            wef.aa(stringBuffer, str, "nameRelativeToCRLIssuer", this.a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
