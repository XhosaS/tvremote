package defpackage;

import android.content.Context;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jal implements jaf {
    public static final jah a = new jah();
    public final Context b;
    public final agte c;
    public final agow d;
    public final yrx e;
    public final int f;
    public final int g;
    private final wke h;

    public jal(Context context, agte agteVar, wke wkeVar, agow agowVar, yrx yrxVar) {
        context.getClass();
        agteVar.getClass();
        wkeVar.getClass();
        agowVar.getClass();
        this.b = context;
        this.c = agteVar;
        this.h = wkeVar;
        this.d = agowVar;
        this.e = yrxVar;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_constant_height);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_image_landscape_4_3_width);
    }

    @Override // defpackage.jaf
    public final Object a(jba jbaVar, String str, boolean z, boolean z2, agsw agswVar) {
        return ahal.a(this.c.plus(new ahbs(jbaVar.i() + "[" + str + "]")), new jak(this, jbaVar, str, z, z2, null), agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.htg r9, defpackage.yrn r10, defpackage.agsw r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jal.b(htg, yrn, agsw):java.lang.Object");
    }
}
