package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aei {
    private static volatile aei b;
    public final Object a;
    private int c;

    public aei(ImageView imageView) {
        this.c = 0;
        this.a = imageView;
    }

    public static aei b() {
        if (b == null) {
            synchronized (aei.class) {
                if (b == null) {
                    b = new aei();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized ady a() {
        ArrayList arrayList;
        ?? r0 = this.a;
        arrayList = new ArrayList(r0.values());
        int i = this.c;
        if (i > 0) {
            arrayList.add(new aej("UNKNOWN", 1002, i));
            this.c = 0;
        }
        r0.clear();
        return new ady(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(aej aejVar) {
        oz ozVar = new oz(aejVar.a, Integer.valueOf(aejVar.b));
        ?? r1 = this.a;
        aej aejVar2 = (aej) r1.get(ozVar);
        if (aejVar2 != null) {
            aejVar2.c = qm.X(aejVar2.c, aejVar.c);
        } else if (((mi) r1).f >= 100) {
            this.c = qm.X(this.c, aejVar.c);
        } else {
            r1.put(ozVar, aejVar);
        }
    }

    public final void d() {
        ImageView imageView = (ImageView) this.a;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.c);
        }
    }

    public final void e() {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        if (drawable != null) {
            hb.a(drawable);
        }
    }

    public final void f(AttributeSet attributeSet, int i) {
        int iG;
        Object obj = this.a;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = cu.f;
        aps apsVarR = aps.r(context, attributeSet, iArr, i, 0);
        qv.k((View) obj, imageView.getContext(), iArr, attributeSet, (TypedArray) apsVarR.a, i, 0);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (iG = apsVarR.g(1, -1)) != -1 && (drawable = ii.J(((ImageView) obj).getContext(), iG)) != null) {
                ((ImageView) obj).setImageDrawable(drawable);
            }
            if (drawable != null) {
                hb.a(drawable);
            }
            if (apsVarR.o(2)) {
                ((ImageView) obj).setImageTintList(apsVarR.h(2));
            }
            if (apsVarR.o(3)) {
                int iD = apsVarR.d(3, -1);
                int i2 = hb.a;
                ((ImageView) obj).setImageTintMode(ii.V(iD, null));
            }
        } finally {
            apsVarR.m();
        }
    }

    public final void g(Drawable drawable) {
        this.c = drawable.getLevel();
    }

    public final void h(int i) {
        if (i != 0) {
            ImageView imageView = (ImageView) this.a;
            Drawable drawableJ = ii.J(imageView.getContext(), i);
            if (drawableJ != null) {
                hb.a(drawableJ);
            }
            imageView.setImageDrawable(drawableJ);
        } else {
            ((ImageView) this.a).setImageDrawable(null);
        }
        e();
    }

    public final boolean i() {
        return !(((ImageView) this.a).getBackground() instanceof RippleDrawable);
    }

    public final String j() {
        int i = this.c;
        if (i == -1) {
            return null;
        }
        String str = (String) this.a;
        int iIndexOf = str.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = str.substring(this.c);
            this.c = -1;
            return strSubstring;
        }
        String strSubstring2 = str.substring(this.c, iIndexOf);
        this.c = iIndexOf + 1;
        return strSubstring2;
    }

    public final boolean k() {
        return this.c != -1;
    }

    public final void l(Object obj) {
        int i;
        if (obj == null) {
            obj = cvs.a;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (dnx.aB(((cvg) obj2).a, obj)) {
                return;
            }
            ((cvg) obj2).b(obj);
            int i2 = this.c;
            if ((i2 & 1) != 0) {
                this.c = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.c = i3;
            while (true) {
                synchronized (this) {
                    i = this.c;
                    if (i == i3) {
                        this.c = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }

    public aei(String str) {
        this.a = str;
        this.c = 0;
    }

    private aei() {
        this.c = 0;
        this.a = new lz();
    }

    public aei(Object obj) {
        this.a = new cvg(obj, cvh.a);
    }
}
