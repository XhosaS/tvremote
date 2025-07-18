package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phq {
    public final View a;
    public final tst b;
    public final CharSequence c;
    public final View.OnClickListener d;
    public final CharSequence e;
    public final boolean f;
    public final tst g;
    public final tst h;
    public final CharSequence i;
    public final tst j;
    public final View.OnClickListener k;
    public final PopupWindow.OnDismissListener l;
    public final View.OnClickListener m;
    public final float n;
    public final int o;
    public final int p;
    public final int q;

    public phq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        CharSequence charSequence2;
        CharSequence charSequence3;
        View.OnClickListener onClickListener2;
        PopupWindow.OnDismissListener onDismissListener;
        View.OnClickListener onClickListener3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof phq) {
            phq phqVar = (phq) obj;
            if (this.a.equals(phqVar.a) && this.b.equals(phqVar.b) && ((charSequence = this.c) != null ? charSequence.equals(phqVar.c) : phqVar.c == null) && ((onClickListener = this.d) != null ? onClickListener.equals(phqVar.d) : phqVar.d == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(phqVar.e) : phqVar.e == null) && this.f == phqVar.f && this.g.equals(phqVar.g) && this.h.equals(phqVar.h) && ((charSequence3 = this.i) != null ? charSequence3.equals(phqVar.i) : phqVar.i == null) && this.j.equals(phqVar.j) && ((onClickListener2 = this.k) != null ? onClickListener2.equals(phqVar.k) : phqVar.k == null) && ((onDismissListener = this.l) != null ? onDismissListener.equals(phqVar.l) : phqVar.l == null) && ((onClickListener3 = this.m) != null ? onClickListener3.equals(phqVar.m) : phqVar.m == null)) {
                int i = this.o;
                int i2 = phqVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.p;
                    int i4 = phqVar.p;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.q;
                        int i6 = phqVar.q;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            if (Float.floatToIntBits(this.n) == Float.floatToIntBits(phqVar.n)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        CharSequence charSequence = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int iHashCode3 = (iHashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        CharSequence charSequence2 = this.e;
        int iHashCode4 = (((((((iHashCode3 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        CharSequence charSequence3 = this.i;
        int iHashCode5 = (((iHashCode4 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003;
        View.OnClickListener onClickListener2 = this.k;
        int iHashCode6 = (iHashCode5 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        PopupWindow.OnDismissListener onDismissListener = this.l;
        int iHashCode7 = (iHashCode6 ^ (onDismissListener == null ? 0 : onDismissListener.hashCode())) * 1000003;
        View.OnClickListener onClickListener3 = this.m;
        int iHashCode8 = onClickListener3 != null ? onClickListener3.hashCode() : 0;
        int i = this.o;
        a.bl(i);
        int i2 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ i) * 1000003;
        int i3 = this.p;
        a.bl(i3);
        int i4 = (i2 ^ i3) * 1000003;
        int i5 = this.q;
        a.bl(i5);
        return ((i4 ^ i5) * 1000003) ^ Float.floatToIntBits(this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phq.toString():java.lang.String");
    }

    public phq(View view, tst tstVar, CharSequence charSequence, View.OnClickListener onClickListener, CharSequence charSequence2, boolean z, tst tstVar2, tst tstVar3, CharSequence charSequence3, tst tstVar4, View.OnClickListener onClickListener2, PopupWindow.OnDismissListener onDismissListener, View.OnClickListener onClickListener3, int i, int i2, int i3, float f) {
        this.a = view;
        this.b = tstVar;
        this.c = charSequence;
        this.d = onClickListener;
        this.e = charSequence2;
        this.f = z;
        this.g = tstVar2;
        this.h = tstVar3;
        this.i = charSequence3;
        this.j = tstVar4;
        this.k = onClickListener2;
        this.l = onDismissListener;
        this.m = onClickListener3;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.n = f;
    }
}
