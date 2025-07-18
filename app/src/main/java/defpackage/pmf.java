package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pmf implements plh {
    public final qjr a;
    private final Context b;
    private final ueg c;

    public pmf(Context context, qjr qjrVar, ueg uegVar) {
        this.b = context;
        this.a = qjrVar;
        this.c = uegVar;
    }

    @Override // defpackage.plh
    public final zyd a(final plg plgVar) {
        plb plbVar = (plb) plgVar;
        Uri uri = plbVar.a;
        final String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            final File parentFile = ufb.a(uri, new uen(this.b, null), ufa.a).getParentFile();
            parentFile.getClass();
            try {
                final ugx ugxVar = (ugx) this.c.c(((plb) plgVar).a, new ugy());
                return xt.a(new xq() { // from class: pme
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        plr plrVar = new plr(xoVar);
                        plb plbVar2 = (plb) plgVar;
                        final pmf pmfVar = this.a;
                        qjr qjrVar = pmfVar.a;
                        String str = plbVar2.b;
                        ugx ugxVar2 = ugxVar;
                        final File file = parentFile;
                        final String str2 = lastPathSegment;
                        qjg qjgVar = new qjg(qjrVar, str, file, str2, plrVar, ugxVar2);
                        qjgVar.i = null;
                        if (ple.c == plbVar2.c) {
                            qjgVar.f(qjf.WIFI_OR_CELLULAR);
                        } else {
                            qjgVar.f(qjf.WIFI_ONLY);
                        }
                        int i = plbVar2.d;
                        if (i > 0) {
                            qjgVar.j = i;
                        }
                        yyk yykVar = plbVar2.e;
                        for (int i2 = 0; i2 < ((zcg) yykVar).d; i2++) {
                            Pair pair = (Pair) yykVar.get(i2);
                            qjgVar.e.l((String) pair.first, (String) pair.second);
                        }
                        xoVar.a(new Runnable() { // from class: pmd
                            @Override // java.lang.Runnable
                            public final void run() {
                                pmfVar.a.d(file, str2);
                            }
                        }, zwk.a);
                        boolean zK = qjgVar.d.k(qjgVar);
                        int i3 = qce.a;
                        if (!zK) {
                            pha phaVarA = phc.a();
                            phaVarA.a = phb.DUPLICATE_REQUEST_ERROR;
                            phaVarA.b = "Duplicate request for: ".concat(str);
                            xoVar.d(phaVarA.a());
                        }
                        return "Data download scheduled for file ".concat(str);
                    }
                });
            } catch (IOException e) {
                qce.g(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", plbVar.a);
                pha phaVarA = phc.a();
                phaVarA.a = phb.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                phaVarA.c = e;
                return zxn.g(phaVarA.a());
            }
        } catch (IOException e2) {
            qce.d("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", plbVar.a);
            pha phaVarA2 = phc.a();
            phaVarA2.a = phb.MALFORMED_FILE_URI_ERROR;
            phaVarA2.c = e2;
            return zxn.g(phaVarA2.a());
        }
    }
}
