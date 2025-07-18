package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtk {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public static boolean c(drq drqVar, Object obj) {
        return drqVar.S() && (obj instanceof View);
    }

    public final void a(dtl dtlVar, drq drqVar) {
        if (dtlVar == null) {
            return;
        }
        Map map = this.a;
        Set hashSet = (Set) map.get(dtlVar);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(dtlVar, hashSet);
            dtlVar.b.add(this);
        }
        hashSet.add(drqVar);
    }

    public final void b(int i, dtl dtlVar, View view) {
        switch (i) {
            case 1:
                view.setAlpha(((Float) dtlVar.a).floatValue());
                break;
            case 2:
                view.setTranslationX(((Float) dtlVar.a).floatValue());
                break;
            case 3:
                view.setTranslationY(((Float) dtlVar.a).floatValue());
                break;
            case 4:
                view.setScaleX(((Float) dtlVar.a).floatValue());
                break;
            case 5:
                view.setScaleY(((Float) dtlVar.a).floatValue());
                break;
            case 6:
                view.setElevation(((Float) dtlVar.a).floatValue());
                break;
            case 7:
                view.setBackgroundColor(((Integer) dtlVar.a).intValue());
                break;
            case 8:
                view.setRotation(((Float) dtlVar.a).floatValue());
                break;
            case 9:
                view.setBackground((Drawable) dtlVar.a);
                break;
            case 10:
                view.setForeground(new eby(((Integer) dtlVar.a).intValue()));
                break;
        }
    }
}
