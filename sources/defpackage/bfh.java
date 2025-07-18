package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh implements bem {
    public dcq[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [bfi, java.lang.Object] */
    @Override // defpackage.bem
    public final /* bridge */ /* synthetic */ Object a(cmt cmtVar) {
        List listC = cmtVar.c(cmtVar.c.j((Uri) cmtVar.d));
        dcq[] dcqVarArr = this.a;
        if (dcqVarArr != null) {
            dcqVarArr[0].a(listC);
        }
        return (OutputStream) listC.get(0);
    }
}
