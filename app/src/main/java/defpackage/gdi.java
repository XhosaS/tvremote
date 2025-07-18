package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/led/player/animation/AnimationParser");

    public static Color a(String str) {
        return Color.valueOf(Integer.parseInt(str, 16) | (-16777216));
    }

    public static List b(String str) {
        List listG = yrl.b(new ypz(' ')).g(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next()));
        }
        return arrayList;
    }
}
