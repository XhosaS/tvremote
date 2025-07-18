package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnm implements idp {
    private final /* synthetic */ int d;
    public static final idp b = new mnm(2);
    public static final mnm c = new mnm(1);
    public static final mnm a = new mnm(0);

    private mnm(int i) {
        this.d = i;
    }

    @Override // defpackage.idp
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            kuk kukVar = (kuk) obj2;
            Iterator it = ((List) obj).iterator();
            long j = 0;
            long j2 = 0;
            while (it.hasNext()) {
                kuj kujVarA = kukVar.a(((kst) it.next()).o());
                j += kujVarA.d;
                j2 += kujVarA.e;
            }
            return new mnl(j, j2);
        }
        if (i != 1) {
            kva kvaVar = (kva) obj;
            ksy ksyVar = (ksy) obj2;
            if (!ksy.y(ksyVar)) {
                return ieg.a((kvc) kvaVar.b.get(ksyVar.c));
            }
            krd.b("Attempting to get library item for non-purchasable asset. Please use showLibraryItemForShow() instead");
            return ieg.f(kvc.a);
        }
        lxa lxaVar = (lxa) obj;
        qza qzaVar = (qza) obj2;
        if (lxaVar.a) {
            return ieg.b(new RuntimeException("Cannot find parser"));
        }
        String language = lxaVar.c;
        if (TextUtils.isEmpty(language)) {
            Object obj3 = qzaVar.c;
            if (obj3 == null) {
                return ieg.b(new mfh("No locale in request and Content-Language not set in response."));
            }
            language = ((Locale) obj3).getLanguage();
            krd.f("Server not returning Content-Language; assuming ".concat(String.valueOf(language)));
        }
        try {
            byte[] bArr = lxaVar.d;
            Object obj4 = qzaVar.e;
            lxb lxbVar = new lxb(lxb.b(bArr, (String) obj4, language), qzaVar.a, (String) obj4, (String) qzaVar.f, (Locale) qzaVar.c);
            lxbVar.d();
            return ieg.f(lxbVar);
        } catch (IOException | mfh e) {
            return ieg.b(e);
        }
    }
}
