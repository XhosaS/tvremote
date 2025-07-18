package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfm {
    public final Drawable a;
    public final int b;
    private final int c;
    private final String d;
    private final int e;
    private final View.OnClickListener f;
    private final dvv g;
    private final tst h;

    public rfm() {
        throw null;
    }

    public static rfl b() {
        rfl rflVar = new rfl(null);
        rflVar.a = R.id.og_ai_custom_action;
        rflVar.d = 90541;
        rflVar.c = -1;
        rflVar.g = (byte) 7;
        rflVar.f = new dvv();
        return rflVar;
    }

    public final rfc a() {
        rfa rfaVarA = rfc.a();
        rfaVarA.e(this.c);
        rfaVarA.d = this.a;
        rfaVarA.d(this.b);
        rfaVarA.f(this.d);
        rfaVarA.h(this.e);
        rfaVarA.g(this.f);
        rfaVarA.f = this.g;
        rfaVarA.c(this.h);
        return rfaVarA.a();
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfm) {
            rfm rfmVar = (rfm) obj;
            if (this.c == rfmVar.c && ((drawable = this.a) != null ? drawable.equals(rfmVar.a) : rfmVar.a == null) && this.b == rfmVar.b && this.d.equals(rfmVar.d) && this.e == rfmVar.e && this.f.equals(rfmVar.f) && this.g.equals(rfmVar.g) && this.h.equals(rfmVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return (((((((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.b) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * (-721379959)) ^ this.g.hashCode()) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.h;
        dvv dvvVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "CustomActionSpec{id=" + this.c + ", icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", visibilityHandler=null, trailingTextLiveData=" + String.valueOf(dvvVar) + ", highlightTextRetriever=null, availabilityChecker=" + String.valueOf(tstVar) + "}";
    }

    public rfm(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, dvv dvvVar, tst tstVar) {
        this.c = i;
        this.a = drawable;
        this.b = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = dvvVar;
        this.h = tstVar;
    }
}
