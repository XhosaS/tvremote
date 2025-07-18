package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfc {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final dvs g;
    public final boolean h;
    public final rez i;
    public final tst j;
    public final tst k;
    public final rin l;

    public rfc() {
        throw null;
    }

    public static rfa a() {
        rfa rfaVar = new rfa((byte[]) null);
        rfaVar.e(R.id.og_ai_custom_action);
        rfaVar.i(false);
        rfaVar.h(90541);
        rfaVar.d(-1);
        rfaVar.b(rez.CUSTOM);
        return rfaVar;
    }

    public final rfc b(View.OnClickListener onClickListener) {
        rfa rfaVar = new rfa(this);
        rfaVar.g(onClickListener);
        return rfaVar.a();
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfc) {
            rfc rfcVar = (rfc) obj;
            if (this.a == rfcVar.a && ((drawable = this.b) != null ? drawable.equals(rfcVar.b) : rfcVar.b == null) && this.c == rfcVar.c && this.d.equals(rfcVar.d) && this.e == rfcVar.e && this.f.equals(rfcVar.f)) {
                rin rinVar = rfcVar.l;
                dvs dvsVar = this.g;
                if (dvsVar != null ? dvsVar.equals(rfcVar.g) : rfcVar.g == null) {
                    if (this.h == rfcVar.h && this.i.equals(rfcVar.i) && this.j.equals(rfcVar.j) && this.k.equals(rfcVar.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        int iHashCode = (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        dvs dvsVar = this.g;
        return (((((((((iHashCode * (-721379959)) ^ (dvsVar != null ? dvsVar.hashCode() : 0)) * (-721379959)) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.k;
        tst tstVar2 = this.j;
        rez rezVar = this.i;
        dvs dvsVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "ActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", visibilityHandler=null, trailingTextContentLiveData=" + String.valueOf(dvsVar) + ", highlightTextRetriever=null, visibleOnIncognito=" + this.h + ", actionType=" + String.valueOf(rezVar) + ", availabilityChecker=" + String.valueOf(tstVar2) + ", customLabelContentDescription=" + String.valueOf(tstVar) + "}";
    }

    public rfc(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, dvs dvsVar, boolean z, rez rezVar, tst tstVar, tst tstVar2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.l = null;
        this.g = dvsVar;
        this.h = z;
        this.i = rezVar;
        this.j = tstVar;
        this.k = tstVar2;
    }
}
