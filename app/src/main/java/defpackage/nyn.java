package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyn {
    public static Drawable a(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static njw b(njs njsVar) {
        for (int i = 0; i < njsVar.g(); i++) {
            njw njwVarI = njsVar.i(i);
            if (njwVarI.n()) {
                return njwVarI;
            }
        }
        return null;
    }

    public static yqt c(njs njsVar) {
        njw njwVarB = b(njsVar);
        return njwVarB == null ? ypv.a : d(njwVarB);
    }

    public static yqt d(njw njwVar) {
        if (!njwVar.n()) {
            return ypv.a;
        }
        byte[] bArr = new byte[njwVar.l().remaining()];
        njwVar.l().get(bArr);
        return yqt.i(bArr);
    }
}
