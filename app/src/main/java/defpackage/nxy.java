package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nxy {
    private static final Map a = new HashMap();

    public static int a(Context context, String str, String str2) {
        int iIntValue;
        Map map = a;
        synchronized (map) {
            String str3 = str + str2;
            Integer num = (Integer) map.get(str3);
            if (num == null) {
                iIntValue = context.getResources().getIdentifier(str2, str, context.getPackageName());
                map.put(str3, Integer.valueOf(iIntValue));
            } else {
                iIntValue = num.intValue();
            }
        }
        return iIntValue;
    }

    public static int b(Context context, njs njsVar) {
        njw njwVarD = d(njsVar);
        if (njwVarD != null) {
            return c(context, njwVarD);
        }
        return 0;
    }

    public static int c(Context context, njw njwVar) {
        if (njwVar.m() && njwVar.i().i()) {
            return a(context, "drawable", njwVar.i().h());
        }
        return 0;
    }

    public static njw d(njs njsVar) {
        for (int i = 0; i < njsVar.g(); i++) {
            njw njwVarI = njsVar.i(i);
            if (njwVarI.m() && njwVarI.i().i()) {
                return njwVarI;
            }
        }
        return null;
    }

    public static boolean e(Context context, njs njsVar) throws Resources.NotFoundException {
        Drawable drawable;
        try {
            drawable = context.getResources().getDrawable(b(context, njsVar), null);
        } catch (Resources.NotFoundException unused) {
        }
        return (drawable == null || (drawable instanceof BitmapDrawable) || (drawable instanceof NinePatchDrawable)) ? false : true;
    }
}
