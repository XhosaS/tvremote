package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sks implements sjp {
    public uri[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, skt] */
    @Override // defpackage.sjp
    public final /* bridge */ /* synthetic */ Object a(unc uncVar) {
        List listD = uncVar.d(uncVar.a.d((Uri) uncVar.c));
        uri[] uriVarArr = this.a;
        if (uriVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                uriVarArr[i].c(listD);
            }
        }
        return (OutputStream) listD.get(0);
    }
}
