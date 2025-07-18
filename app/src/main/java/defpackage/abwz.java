package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abwz extends abxd implements abxa {
    public abwr n = abwr.a;

    @Override // defpackage.abxa
    public final Object c(abwk abwkVar) {
        abxc abxcVar = (abxc) abwkVar;
        if (abxcVar.a != ((abxd) cM(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = this.n.k(abxcVar.d);
        return objK == null ? abxcVar.b : abxcVar.b(objK);
    }
}
