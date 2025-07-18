package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsb {
    public static TextContent a(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextView ? new dry(obj) : obj instanceof TextContent ? (TextContent) obj : TextContent.b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextView) {
                arrayList.add(((TextView) obj2).getText());
            }
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new drz(arrayList);
    }

    public static List b(wy wyVar) {
        int iC = wyVar.c();
        if (iC == 1) {
            return Collections.singletonList(((elv) wyVar.d(0)).a);
        }
        ArrayList arrayList = new ArrayList(iC);
        for (int i = 0; i < iC; i++) {
            arrayList.add(((elv) wyVar.d(i)).a);
        }
        return arrayList;
    }

    public static void c(View view, Drawable drawable, int i, dww dwwVar) {
        if (((dwwVar == null || !dwwVar.G()) && !duz.b(i)) || !drawable.isStateful()) {
            return;
        }
        drawable.setState(view.getDrawableState());
    }

    public static void d(int i, int i2, wy wyVar, wy wyVar2) {
        Object objA;
        if (g(i, wyVar2)) {
            objA = wz.a(wyVar2, i);
            wz.b(wyVar2, i);
        } else {
            objA = wz.a(wyVar, i);
            wz.b(wyVar, i);
        }
        wyVar.f(i2, objA);
    }

    public static void e(int i, wy wyVar, wy wyVar2) {
        if (g(i, wyVar2)) {
            wz.b(wyVar2, i);
        } else {
            wz.b(wyVar, i);
        }
    }

    public static void f(int i, wy wyVar, wy wyVar2) {
        Object objA;
        if (wyVar == null || wyVar2 == null || (objA = wz.a(wyVar, i)) == null) {
            return;
        }
        wyVar2.f(i, objA);
    }

    static boolean g(int i, wy wyVar) {
        return (wyVar == null || wz.a(wyVar, i) == null) ? false : true;
    }
}
