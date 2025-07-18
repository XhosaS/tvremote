package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pll implements plh {
    private final yyr a;

    public pll(plk plkVar) {
        this.a = yyr.j(plkVar.a);
    }

    @Override // defpackage.plh
    public final zyd a(plg plgVar) {
        try {
            return b(((plb) plgVar).b).a(plgVar);
        } catch (phc e) {
            return zxn.g(e);
        }
    }

    final plh b(String str) throws MalformedURLException, phc {
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                throw new MalformedURLException("Could not parse URL.");
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                throw new MalformedURLException("URL contained no scheme.");
            }
            plh plhVar = (plh) this.a.get(scheme);
            if (plhVar != null) {
                return plhVar;
            }
            qce.d("%s: No registered downloader supports the download url scheme, scheme = %s", "MultiSchemeFileDownloader", scheme);
            pha phaVarA = phc.a();
            phaVarA.a = phb.UNSUPPORTED_DOWNLOAD_URL_SCHEME;
            throw phaVarA.a();
        } catch (MalformedURLException e) {
            qce.d("%s: The download url is malformed, url = %s", "MultiSchemeFileDownloader", str);
            pha phaVarA2 = phc.a();
            phaVarA2.a = phb.MALFORMED_DOWNLOAD_URL;
            phaVarA2.c = e;
            throw phaVarA2.a();
        }
    }
}
