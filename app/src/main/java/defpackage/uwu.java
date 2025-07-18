package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.GridLayoutManager;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwu {
    public static int a(float f, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static eiz b(dru druVar, oal oalVar, adey adeyVar, uws uwsVar, List list) {
        oej oejVar;
        tll tllVar;
        eis eisVar = new eis();
        eisVar.a = adeyVar.c;
        eisVar.g = oalVar.U();
        eisVar.b = uwsVar;
        ocj ocjVar = ((nyx) oalVar).q;
        if (ocjVar != null && (oejVar = ((nza) ocjVar).g) != null && (tllVar = ((nzc) oejVar).b) != null) {
            eisVar.p = tllVar;
        }
        eiz eizVarA = eisVar.a(druVar);
        for (int i = 0; i < list.size(); i++) {
            uwo uwoVar = new uwo(druVar, new uwp());
            drq drqVar = (drq) list.get(i);
            uwp uwpVar = uwoVar.a;
            uwpVar.c = drqVar == null ? null : drqVar.l();
            BitSet bitSet = uwoVar.d;
            bitSet.set(2);
            uwpVar.b = uwsVar;
            bitSet.set(1);
            uwpVar.a = i;
            bitSet.set(0);
            uwp uwpVarB = uwoVar.a();
            efi efiVar = new efi();
            efiVar.b = uwpVarB;
            eizVarA.A(i, new efk(efiVar));
        }
        eizVarA.I(true, new uwv());
        return eizVarA;
    }

    public static void c(ViewGroup viewGroup, List list) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof dvz) {
                list.add((dvz) childAt);
            }
        }
    }

    public static void d(dru druVar, uws uwsVar, awj awjVar, adey adeyVar) {
        uwsVar.c = awjVar;
        GridLayoutManager gridLayoutManager = uwsVar.a;
        awjVar.ai(gridLayoutManager);
        gridLayoutManager.ab(adeyVar.d, adeyVar.e);
        DisplayMetrics displayMetrics = druVar.a.getResources().getDisplayMetrics();
        if ((adeyVar.b & 8) != 0) {
            acvi acviVar = adeyVar.f;
            if (acviVar == null) {
                acviVar = acvi.a;
            }
            acvk acvkVar = acviVar.g;
            if (acvkVar == null) {
                acvkVar = acvk.a;
            }
            int iA = a(acvkVar.c, displayMetrics);
            acvk acvkVar2 = acviVar.c;
            if (acvkVar2 == null) {
                acvkVar2 = acvk.a;
            }
            int iA2 = a(acvkVar2.c, displayMetrics);
            acvk acvkVar3 = acviVar.h;
            if (acvkVar3 == null) {
                acvkVar3 = acvk.a;
            }
            int iA3 = a(acvkVar3.c, displayMetrics);
            acvk acvkVar4 = acviVar.e;
            if (acvkVar4 == null) {
                acvkVar4 = acvk.a;
            }
            awjVar.setPaddingRelative(iA, iA2, iA3, a(acvkVar4.c, displayMetrics));
        }
        awjVar.setClipToPadding(adeyVar.g);
        if ((adeyVar.b & 32) != 0) {
            acvk acvkVar5 = adeyVar.h;
            if (acvkVar5 == null) {
                acvkVar5 = acvk.a;
            }
            awjVar.setItemSpacing(a(acvkVar5.c, displayMetrics));
        }
    }

    public static void e(uws uwsVar, awj awjVar) {
        uwsVar.d = awjVar.getSelectedPosition();
        awjVar.setPaddingRelative(0, 0, 0, 0);
        awjVar.setClipToPadding(true);
        awjVar.setItemSpacing(0);
        uwsVar.c = null;
    }

    public static void f(awj awjVar, uws uwsVar) {
        awjVar.af(new uwt(awjVar, uwsVar));
    }
}
