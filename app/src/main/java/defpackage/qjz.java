package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qjz extends dny {
    final /* synthetic */ qlz a;

    public qjz(qlz qlzVar) {
        this.a = qlzVar;
    }

    @Override // defpackage.dny, defpackage.doa
    public final void c(Context context, cyg cygVar, cyt cytVar) {
        qka qkaVar = new qka(context, this.a);
        dhi dhiVar = cytVar.a;
        dhiVar.c(qkg.class, Bitmap.class, qkaVar);
        dhiVar.c(qkg.class, Bitmap.class, new qkc(new qke(context)));
        dhiVar.c(qkg.class, InputStream.class, new qkb());
    }
}
