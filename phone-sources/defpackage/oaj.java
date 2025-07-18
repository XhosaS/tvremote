package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oaj {
    public final DataHolder a;
    public int b;
    public int c;

    public oaj(DataHolder dataHolder, int i) {
        int length;
        this.a = dataHolder;
        int i2 = 0;
        a.ab(i >= 0 && i < dataHolder.h);
        this.b = i;
        a.ab(i >= 0 && i < dataHolder.h);
        while (true) {
            int[] iArr = dataHolder.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        this.c = i2 == length ? i2 - 1 : i2;
    }

    protected final String a(String str) {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public final String b() {
        return a("gaia_id");
    }

    public final String c() {
        return a("account_name");
    }

    public final String d() {
        return ols.a.a(a("avatar"));
    }

    public final String e() {
        return !TextUtils.isEmpty(a("display_name")) ? a("display_name") : c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oaj) {
            oaj oajVar = (oaj) obj;
            if (a.Q(Integer.valueOf(oajVar.b), Integer.valueOf(this.b)) && a.Q(Integer.valueOf(oajVar.c), Integer.valueOf(this.c)) && oajVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return h() ? a("family_name") : "null";
    }

    public final String g() {
        return i() ? a("given_name") : "null";
    }

    public final boolean h() {
        return !TextUtils.isEmpty(a("family_name"));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public final boolean i() {
        return !TextUtils.isEmpty(a("given_name"));
    }
}
