package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvz implements idf {
    private final lzh a;
    private final long b;
    private final idf c;
    private final len d;

    public lvz(lzh lzhVar, long j, idf idfVar, len lenVar) {
        this.a = lzhVar;
        this.b = j;
        this.c = idfVar;
        this.d = lenVar;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws mfh {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2;
        ieg iegVarC;
        tju tjuVar = (tju) obj;
        Object obj2 = tjuVar.f;
        Object obj3 = tjuVar.c;
        String str = ((String) obj2) + ".1." + ((String) obj3) + "." + String.valueOf(tjuVar.b) + ".res." + ((String) tjuVar.d);
        cui cuiVar = new cui(str, Integer.valueOf(tjuVar.a));
        ieg iegVarA = this.a.a(cuiVar);
        if (iegVarA.m()) {
            try {
                ieg iegVarB = this.d.b((mee) iegVarA.g());
                if (iegVarB.k()) {
                    Throwable thI = iegVarB.i();
                    if (thI instanceof mfh) {
                        throw ((mfh) thI);
                    }
                    throw new mfh(thI);
                }
                z = true;
                bitmap = (Bitmap) iegVarB.g();
            } catch (mfh e) {
                krd.d("Error reconstructing stored knowledge component ".concat(str), e);
                int i = tjuVar.a;
                ieg iegVarD = this.a.d(cuiVar);
                if (iegVarD.k()) {
                    krd.d(a.cy(i, str, "Error deleting file ", " from storage "), iegVarD.i());
                }
            }
        } else {
            bitmap = null;
            z = false;
        }
        if (z) {
            ieg iegVarB2 = this.a.b(cuiVar);
            if (iegVarB2.m()) {
                bitmap2 = bitmap;
                if (System.currentTimeMillis() < ((Long) iegVarB2.g()).longValue() + this.b) {
                    return ieg.a(bitmap2);
                }
            } else {
                bitmap2 = bitmap;
                krd.d("Error getting last modified timestamp of file " + str + " from storage " + tjuVar.a, iegVarB2.i());
            }
        } else {
            bitmap2 = bitmap;
        }
        mee meeVar = (mee) iegVarA.c;
        ieg iegVar = (ieg) this.c.b(Uri.parse((String) tjuVar.g));
        if (!iegVar.m()) {
            Throwable thI2 = iegVar.i();
            if (!(thI2 instanceof mfr) || ((mfr) thI2).a / 100 != 4) {
                return z ? ieg.a(bitmap2) : ieg.b(thI2);
            }
            int i2 = tjuVar.a;
            ieg iegVarD2 = this.a.d(new cui(str, Integer.valueOf(i2)));
            if (iegVarD2.k()) {
                krd.d(a.cy(i2, str, "Error deleting file ", " from storage "), iegVarD2.i());
            }
            return ieg.b(thI2);
        }
        mee meeVar2 = (mee) iegVar.g();
        try {
            ieg iegVarB3 = this.d.b(meeVar2);
            if (iegVarB3.k()) {
                Throwable thI3 = iegVarB3.i();
                if (thI3 instanceof mfh) {
                    throw ((mfh) thI3);
                }
                throw new mfh(thI3);
            }
            Bitmap bitmap3 = (Bitmap) iegVarB3.g();
            if (!z) {
                iegVarC = this.a.c(cuiVar, meeVar2);
                break;
            }
            if (meeVar != meeVar2) {
                if (meeVar.c == meeVar2.c) {
                    for (int i3 = 0; i3 < meeVar.c; i3++) {
                        if (meeVar.b[i3] == meeVar2.b[i3]) {
                        }
                    }
                }
                iegVarC = this.a.c(cuiVar, meeVar2);
                break;
            }
            iegVarC = this.a.f(cuiVar);
            if (!iegVarC.k()) {
                return ieg.a(bitmap3);
            }
            krd.d("Error saving response for " + str + " on storage " + tjuVar.a, iegVarC.i());
            iegVarC.p();
            return iegVarC;
        } catch (mfh e2) {
            return z ? ieg.a(bitmap2) : ieg.b(e2);
        }
    }
}
