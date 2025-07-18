package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lwa implements idf {
    private final lzh a;
    private final long b;
    private final idf c;

    public lwa(lzh lzhVar, long j, idf idfVar) {
        this.a = lzhVar;
        this.b = j;
        this.c = idfVar;
    }

    private final void a(cui cuiVar) {
        ieg iegVarE = this.a.e(cuiVar);
        if (iegVarE.k()) {
            Object obj = cuiVar.a;
            krd.d("Error deleting file " + ((String) obj) + " from storage " + String.valueOf(cuiVar.b), iegVarE.i());
        }
    }

    private final ieg c(qza qzaVar, boolean z, lxb lxbVar, Throwable th) {
        boolean z2 = false;
        lxb lxbVar2 = null;
        if (z) {
            if (lxbVar == null) {
                throw th;
            }
            try {
                if (!(th instanceof mfr) || ((mfr) th).a != 304) {
                    throw th;
                }
                z2 = true;
                lxbVar2 = lxbVar;
            } catch (Throwable th2) {
                th = th2;
            }
            th = th2;
        }
        String strB = qzaVar.b();
        int i = qzaVar.a;
        cui cuiVar = new cui(strB, Integer.valueOf(i));
        if (z2) {
            ieg iegVarF = this.a.f(cuiVar);
            if (iegVarF.k()) {
                krd.d(a.cy(i, strB, "Error touching stored response for ", " on storage "), iegVarF.i());
            }
            return ieg.a(lxbVar2);
        }
        if (!(th instanceof mfr) || ((mfr) th).a / 100 != 4) {
            return z ? ieg.a(lxbVar) : ieg.b(th);
        }
        a(cuiVar);
        return ieg.b(th);
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws mfh {
        lxb lxbVar;
        qza qzaVar = (qza) obj;
        String strB = qzaVar.b();
        int i = qzaVar.a;
        cui cuiVar = new cui(strB, Integer.valueOf(i));
        ieg iegVarA = this.a.a(cuiVar);
        boolean z = false;
        lxb lxbVar2 = null;
        if (iegVarA.m()) {
            lxa lxaVar = (lxa) iegVarA.g();
            try {
                String language = lxaVar.c;
                if (TextUtils.isEmpty(language)) {
                    Object obj2 = qzaVar.c;
                    if (obj2 == null) {
                        throw new mfh("No locale in request and Content-Language not set in response.");
                    }
                    language = ((Locale) obj2).getLanguage();
                    krd.f(a.cr(language, "Server not returning Content-Language; assuming "));
                }
                if (lxaVar.a) {
                    lxbVar = null;
                } else {
                    byte[] bArr = lxaVar.d;
                    Object obj3 = qzaVar.e;
                    lxb lxbVar3 = new lxb(lxb.b(bArr, (String) obj3, language), i, (String) obj3, (String) qzaVar.f, (Locale) qzaVar.c);
                    lxbVar3.d();
                    lxbVar = lxbVar3;
                }
                z = true;
            } catch (IOException | ClassCastException | mfh e) {
                krd.d("Error reconstructing stored knowledge component ".concat(strB), e);
                a(cuiVar);
            }
        } else {
            lxbVar = null;
        }
        if (z) {
            ieg iegVarB = this.a.b(cuiVar);
            if (!iegVarB.m()) {
                krd.d("Error getting last modified timestamp of file " + strB + " from storage " + qzaVar.a, iegVarB.i());
            } else if (System.currentTimeMillis() < ((Long) iegVarB.g()).longValue() + this.b) {
                return ieg.a(lxbVar);
            }
        }
        ieg iegVar = (ieg) this.c.b(new lwy((String) qzaVar.d, ((Uri) qzaVar.b).toString(), iegVarA.k() ? null : ((lxa) iegVarA.g()).b));
        if (!iegVar.m()) {
            return c(qzaVar, z, lxbVar, iegVar.i());
        }
        lxa lxaVar2 = (lxa) iegVar.g();
        try {
            String language2 = lxaVar2.c;
            if (TextUtils.isEmpty(language2)) {
                Object obj4 = qzaVar.c;
                if (obj4 == null) {
                    throw new mfh("No locale in request and Content-Language not set in response.");
                }
                language2 = ((Locale) obj4).getLanguage();
                krd.f(a.cr(language2, "Server not returning Content-Language; assuming "));
            }
            if (!lxaVar2.a) {
                byte[] bArr2 = lxaVar2.d;
                Object obj5 = qzaVar.e;
                lxb lxbVar4 = new lxb(lxb.b(bArr2, (String) obj5, language2), qzaVar.a, (String) obj5, (String) qzaVar.f, (Locale) qzaVar.c);
                lxbVar4.d();
                lxbVar2 = lxbVar4;
            }
            lzh lzhVar = this.a;
            lzhVar.e(cuiVar);
            ieg iegVarC = lzhVar.c(cuiVar, lxaVar2);
            if (!iegVarC.k()) {
                return ieg.a(lxbVar2);
            }
            krd.d("Error saving response for " + strB + " on storage " + qzaVar.a, iegVarC.i());
            iegVarC.p();
            return iegVarC;
        } catch (IOException | mfh e2) {
            return c(qzaVar, z, lxbVar, e2);
        }
    }
}
