package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import com.google.android.videos.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muj {
    public final lio a;
    public final kys b;
    public final ksy c;
    public final Uri d;
    public final ieg e;
    public final SpannableStringBuilder f;
    public final String g;
    public final ieh h;
    public final float i;
    public final ieg j;
    public final Optional k;
    public final Optional l;

    public muj() {
        throw null;
    }

    public static muj a(Resources resources, lio lioVar, kys kysVar, ksy ksyVar, Uri uri, ieg iegVar, ieg iegVar2, String str, int i, ieh iehVar, float f, int i2, String str2, ieg iegVar3, Optional optional, Optional optional2) throws Resources.NotFoundException {
        SpannableStringBuilder spannableStringBuilderValueOf;
        String string;
        kys kysVar2;
        ksy ksyVar2;
        Uri uri2;
        ieg iegVar4;
        ieh iehVar2;
        float f2;
        ieg iegVar5;
        Optional optional3;
        Optional optional4;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        lio lioVar2;
        if (b(i)) {
            boolean z = (i & 8) != 0;
            if (!TextUtils.isEmpty(str) || z) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (z) {
                    spannableStringBuilder2.append((CharSequence) "  ");
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    spannableStringBuilder2.setSpan(new ImageSpan(drawable), 0, 1, 33);
                }
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilderValueOf = spannableStringBuilder2;
            } else {
                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
            }
        } else if (!c(i)) {
            spannableStringBuilderValueOf = d(i) ? SpannableStringBuilder.valueOf(resources.getString(R.string.in_library)) : SpannableStringBuilder.valueOf("");
        } else if (iegVar2.m()) {
            String string2 = ((kvo) iegVar2.g()).d() ? resources.getString(R.string.free) : ((kvo) iegVar2.g()).j;
            String str4 = ((kvo) iegVar2.g()).k;
            SpannableString spannableString = new SpannableString(a.cq(string2, str4, " "));
            spannableString.setSpan(new StrikethroughSpan(), 0, str4.length(), 33);
            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(spannableString);
        } else {
            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
        }
        boolean zB = b(i);
        boolean zC = c(i);
        boolean zD = d(i);
        if (!zB) {
            if (zC) {
                if (iegVar2.m()) {
                    String string3 = ((kvo) iegVar2.g()).d() ? resources.getString(R.string.free) : ((kvo) iegVar2.g()).j;
                    String str5 = ((kvo) iegVar2.g()).k;
                    if (TextUtils.isEmpty(str5)) {
                        ksyVar2 = ksyVar;
                        uri2 = uri;
                        iegVar4 = iegVar;
                        iehVar2 = iehVar;
                        f2 = f;
                        iegVar5 = iegVar3;
                        optional3 = optional;
                        optional4 = optional2;
                        spannableStringBuilder = spannableStringBuilderValueOf;
                        str3 = string3;
                        lioVar2 = lioVar;
                        kysVar2 = kysVar;
                    } else {
                        string = resources.getString(R.string.guide_card_with_striked_price_content_description, string3, str5);
                        str3 = string;
                        kysVar2 = kysVar;
                        ksyVar2 = ksyVar;
                        uri2 = uri;
                        iegVar4 = iegVar;
                        iehVar2 = iehVar;
                        f2 = f;
                    }
                }
                kysVar2 = kysVar;
                ksyVar2 = ksyVar;
                uri2 = uri;
                iegVar4 = iegVar;
                iehVar2 = iehVar;
                f2 = f;
                iegVar5 = iegVar3;
                optional3 = optional;
                optional4 = optional2;
                str3 = "";
                spannableStringBuilder = spannableStringBuilderValueOf;
                lioVar2 = lioVar;
            } else {
                if (zD) {
                    string = resources.getString(R.string.in_library);
                    str3 = string;
                    kysVar2 = kysVar;
                    ksyVar2 = ksyVar;
                    uri2 = uri;
                    iegVar4 = iegVar;
                    iehVar2 = iehVar;
                    f2 = f;
                }
                kysVar2 = kysVar;
                ksyVar2 = ksyVar;
                uri2 = uri;
                iegVar4 = iegVar;
                iehVar2 = iehVar;
                f2 = f;
                iegVar5 = iegVar3;
                optional3 = optional;
                optional4 = optional2;
                str3 = "";
                spannableStringBuilder = spannableStringBuilderValueOf;
                lioVar2 = lioVar;
            }
            return new muj(lioVar2, kysVar2, ksyVar2, uri2, iegVar4, spannableStringBuilder, str3, iehVar2, f2, iegVar5, optional3, optional4);
        }
        kysVar2 = kysVar;
        ksyVar2 = ksyVar;
        uri2 = uri;
        iegVar4 = iegVar;
        iehVar2 = iehVar;
        f2 = f;
        str3 = str2;
        iegVar5 = iegVar3;
        optional3 = optional;
        optional4 = optional2;
        spannableStringBuilder = spannableStringBuilderValueOf;
        lioVar2 = lioVar;
        return new muj(lioVar2, kysVar2, ksyVar2, uri2, iegVar4, spannableStringBuilder, str3, iehVar2, f2, iegVar5, optional3, optional4);
    }

    public static boolean b(int i) {
        return (i & 1) != 0;
    }

    public static boolean c(int i) {
        return (i & 4) != 0;
    }

    public static boolean d(int i) {
        return (i & 2) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muj) {
            muj mujVar = (muj) obj;
            if (((lif) this.a).e(mujVar.a) && this.b.equals(mujVar.b) && this.c.equals(mujVar.c) && this.d.equals(mujVar.d) && this.e.equals(mujVar.e) && this.f.equals(mujVar.f) && this.g.equals(mujVar.g) && this.h.equals(mujVar.h)) {
                if (Float.floatToIntBits(this.i) == Float.floatToIntBits(mujVar.i) && this.j.equals(mujVar.j) && this.k.equals(mujVar.k) && this.l.equals(mujVar.l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((lif) this.a).a() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        Optional optional = this.l;
        Optional optional2 = this.k;
        ieg iegVar = this.j;
        ieh iehVar = this.h;
        ieg iegVar2 = this.e;
        Uri uri = this.d;
        ksy ksyVar = this.c;
        kys kysVar = this.b;
        return "AssetCardViewModel{uiElementNode=" + this.a.toString() + ", serverCookie=" + kysVar.toString() + ", assetId=" + ksyVar.toString() + ", posterUri=" + uri.toString() + ", title=" + iegVar2.toString() + ", subtitle=" + this.f.toString() + ", subtitleContentDescription=" + this.g + ", width=" + iehVar.toString() + ", thumbnailAspectRatio=" + this.i + ", detailsPageSelection=" + iegVar.toString() + ", visualElements=" + optional2.toString() + ", interactionLogger=" + optional.toString() + "}";
    }

    public muj(lio lioVar, kys kysVar, ksy ksyVar, Uri uri, ieg iegVar, SpannableStringBuilder spannableStringBuilder, String str, ieh iehVar, float f, ieg iegVar2, Optional optional, Optional optional2) {
        this.a = lioVar;
        if (kysVar == null) {
            throw new NullPointerException("Null serverCookie");
        }
        this.b = kysVar;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.c = ksyVar;
        if (uri == null) {
            throw new NullPointerException("Null posterUri");
        }
        this.d = uri;
        if (iegVar == null) {
            throw new NullPointerException("Null title");
        }
        this.e = iegVar;
        if (spannableStringBuilder == null) {
            throw new NullPointerException("Null subtitle");
        }
        this.f = spannableStringBuilder;
        if (str == null) {
            throw new NullPointerException("Null subtitleContentDescription");
        }
        this.g = str;
        this.h = iehVar;
        this.i = f;
        if (iegVar2 == null) {
            throw new NullPointerException("Null detailsPageSelection");
        }
        this.j = iegVar2;
        this.k = optional;
        this.l = optional2;
    }
}
