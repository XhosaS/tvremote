package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.videos.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soq {
    public final sop a;
    public final sop b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    final int k;
    public int l;

    public soq(Context context, sop sopVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetE;
        int styleAttribute;
        sop sopVar2 = new sop();
        this.b = sopVar2;
        sopVar = sopVar == null ? new sop() : sopVar;
        int i = sopVar.a;
        if (i != 0) {
            attributeSetE = ssr.e(context, i, "badge");
            styleAttribute = attributeSetE.getStyleAttribute();
        } else {
            attributeSetE = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayA = suy.a(context, attributeSetE, sor.a, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayA.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayA.getDimensionPixelSize(15, -1);
        this.e = typedArrayA.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayA.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayA.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayA.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayA.getInt(25, 1);
        this.l = typedArrayA.getInt(2, 0);
        int i2 = sopVar.i;
        sopVar2.i = i2 == -2 ? 255 : i2;
        int i3 = sopVar.k;
        if (i3 != -2) {
            sopVar2.k = i3;
        } else if (typedArrayA.hasValue(24)) {
            sopVar2.k = typedArrayA.getInt(24, 0);
        } else {
            sopVar2.k = -1;
        }
        String str = sopVar.j;
        if (str != null) {
            sopVar2.j = str;
        } else if (typedArrayA.hasValue(8)) {
            sopVar2.j = typedArrayA.getString(8);
        }
        sopVar2.o = sopVar.o;
        CharSequence charSequence = sopVar.p;
        sopVar2.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i4 = sopVar.q;
        sopVar2.q = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = sopVar.r;
        sopVar2.r = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = sopVar.t;
        sopVar2.t = Boolean.valueOf(bool == null || bool.booleanValue());
        int i6 = sopVar.l;
        sopVar2.l = i6 == -2 ? typedArrayA.getInt(22, -2) : i6;
        int i7 = sopVar.m;
        sopVar2.m = i7 == -2 ? typedArrayA.getInt(23, -2) : i7;
        Integer num = sopVar.e;
        sopVar2.e = Integer.valueOf(num == null ? typedArrayA.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        Integer num2 = sopVar.f;
        sopVar2.f = Integer.valueOf(num2 == null ? typedArrayA.getResourceId(7, 0) : num2.intValue());
        Integer num3 = sopVar.g;
        sopVar2.g = Integer.valueOf(num3 == null ? typedArrayA.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        Integer num4 = sopVar.h;
        sopVar2.h = Integer.valueOf(num4 == null ? typedArrayA.getResourceId(17, 0) : num4.intValue());
        Integer num5 = sopVar.b;
        sopVar2.b = Integer.valueOf(num5 == null ? l(context, typedArrayA, 1) : num5.intValue());
        Integer num6 = sopVar.d;
        sopVar2.d = Integer.valueOf(num6 == null ? typedArrayA.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = sopVar.c;
        if (num7 != null) {
            sopVar2.c = num7;
        } else if (typedArrayA.hasValue(10)) {
            sopVar2.c = Integer.valueOf(l(context, typedArrayA, 10));
        } else {
            sopVar2.c = Integer.valueOf(new syh(context, sopVar2.d.intValue()).k.getDefaultColor());
        }
        Integer num8 = sopVar.s;
        sopVar2.s = Integer.valueOf(num8 == null ? typedArrayA.getInt(3, 8388661) : num8.intValue());
        Integer num9 = sopVar.u;
        sopVar2.u = Integer.valueOf(num9 == null ? typedArrayA.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        Integer num10 = sopVar.v;
        sopVar2.v = Integer.valueOf(num10 == null ? typedArrayA.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        Integer num11 = sopVar.w;
        sopVar2.w = Integer.valueOf(num11 == null ? typedArrayA.getDimensionPixelOffset(19, 0) : num11.intValue());
        Integer num12 = sopVar.x;
        sopVar2.x = Integer.valueOf(num12 == null ? typedArrayA.getDimensionPixelOffset(26, 0) : num12.intValue());
        Integer num13 = sopVar.y;
        sopVar2.y = Integer.valueOf(num13 == null ? typedArrayA.getDimensionPixelOffset(20, sopVar2.w.intValue()) : num13.intValue());
        Integer num14 = sopVar.z;
        sopVar2.z = Integer.valueOf(num14 == null ? typedArrayA.getDimensionPixelOffset(27, sopVar2.x.intValue()) : num14.intValue());
        Integer num15 = sopVar.C;
        sopVar2.C = Integer.valueOf(num15 == null ? typedArrayA.getDimensionPixelOffset(21, 0) : num15.intValue());
        Integer num16 = sopVar.A;
        sopVar2.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        Integer num17 = sopVar.B;
        sopVar2.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        Boolean bool2 = sopVar.D;
        sopVar2.D = Boolean.valueOf(bool2 == null ? typedArrayA.getBoolean(0, false) : bool2.booleanValue());
        typedArrayA.recycle();
        Locale locale = sopVar.n;
        sopVar2.n = locale == null ? Locale.getDefault(Locale.Category.FORMAT) : locale;
        this.a = sopVar;
    }

    private static int l(Context context, TypedArray typedArray, int i) {
        return sin.h(context, typedArray, i).getDefaultColor();
    }

    public final int a() {
        return this.b.s.intValue();
    }

    final int b() {
        return this.b.f.intValue();
    }

    final int c() {
        return this.b.e.intValue();
    }

    final int d() {
        return this.b.h.intValue();
    }

    final int e() {
        return this.b.g.intValue();
    }

    public final int f() {
        return this.b.q;
    }

    public final int g() {
        return this.b.w.intValue();
    }

    public final int h() {
        return this.b.k;
    }

    final Locale i() {
        return this.b.n;
    }

    final boolean j() {
        return this.b.k != -1;
    }

    final boolean k() {
        return this.b.j != null;
    }
}
