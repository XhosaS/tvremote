package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyj implements gyi {
    private final File a;

    public gyj(File file) {
        this.a = file;
    }

    @Override // defpackage.gyi
    public final Object a(yih yihVar) {
        String str = zhe.a;
        File file = this.a;
        return new gyo(fki.am(wcq.aA(file), zgr.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(wef.u(file)), 3);
    }
}
