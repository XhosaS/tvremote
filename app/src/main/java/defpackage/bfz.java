package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfz {
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final float n;
    public final int o;
    public final float p;

    static {
        bfy bfyVar = new bfy();
        bfyVar.a = "";
        bfyVar.a();
        int i = bgf.a;
        Integer.toString(0, 36);
        Integer.toString(17, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(18, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(19, 36);
    }

    public bfz(CharSequence charSequence, float f, int i, int i2, float f2, int i3, int i4, float f3) {
        charSequence.getClass();
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else {
            this.a = charSequence.toString();
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = -3.4028235E38f;
        this.i = Integer.MIN_VALUE;
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
        this.l = false;
        this.m = i4;
        this.n = f3;
        this.o = Integer.MIN_VALUE;
        this.p = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bfz bfzVar = (bfz) obj;
            if (TextUtils.equals(this.a, bfzVar.a) && this.m == bfzVar.m && this.n == bfzVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        Float fValueOf = Float.valueOf(-3.4028235E38f);
        return Objects.hash(charSequence, null, null, null, fValueOf, Integer.MIN_VALUE, Integer.MIN_VALUE, fValueOf, Integer.MIN_VALUE, fValueOf, fValueOf, false, -16777216, Integer.valueOf(this.m), Float.valueOf(this.n), Integer.MIN_VALUE, Float.valueOf(0.0f), 0);
    }
}
