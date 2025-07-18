package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mak {
    private static final idf a = new ltu(19);

    /* JADX WARN: Multi-variable type inference failed */
    public static ieg a(maj majVar, idf idfVar) {
        Object obj = majVar.d;
        return (ieg) idfVar.b(Uri.parse((String) ((lck) obj).j.get(majVar.a)));
    }

    public static idf b(lzh lzhVar, mma mmaVar) {
        idh idhVarD = idh.d();
        idhVarD.e(new lbj(lzhVar, 12));
        return new lei(idhVarD.b(new jxt(new len(mmaVar), 8)), mmaVar, a);
    }

    public static idf c(lzh lzhVar, idf idfVar, mma mmaVar) {
        idh idhVarD = idh.d();
        idhVarD.e(krf.d(new lbj(lzhVar, 12), new lxt(idfVar, 14)));
        return new lei(idhVarD.b(new jxt(new len(mmaVar), 8)), mmaVar, a);
    }
}
